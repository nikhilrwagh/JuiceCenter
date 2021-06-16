pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Build Started"'
                sh 'mvn clean install'
                sh 'echo "Build Ended"'

            }
        }
    }
}