
node {
	/* mymaven need to be configured in Jenkins Configurations*/	
    withMaven(maven:'mymaven') {

        stage('Checkout') {
            git url: 'http://172.18.2.18/repoName/project-name.git', credentialsId: 'AbcdCredentials', branch: 'master'
        }
		
        stage('Build') {
		  bat label: 'Maven Build status', script: 'mvn clean install -DskipTests'
        }
		
        stage('Test') {
		  bat label: 'Maven Test', returnStatus: true, script: 'mvn test'
        }
		
		stage('Docker Image') {
            bat label: 'Docker Image',script: 'Docker -H=172.18.2.50:2375 build --tag=proj-name-gateway-image:latest --rm=true .'
        }
		
        stage('Stop And Delete If Container Exists') {
            /*stop and remove if container exists or already running. 
			 Returning true to avoid failure if not exists or running */
            bat label: 'Stop/Remove if container exists', returnStatus: true, script: 'Docker -H=172.18.2.50:2375 stop proj-name-gateway-container && Docker -H=172.18.2.50:2375 rm proj-name-gateway-container'
        }		
		
		stage('Docker Run') {
            bat label: 'Maven Build status', returnStatus: true, script: 'Docker -H=172.18.2.50:2375 run -d --name=proj-name-gateway-container   --network=psd-feedback-app-network --publish=5421:5421 proj-name-gateway-image:latest'
        }
       
    }
}
