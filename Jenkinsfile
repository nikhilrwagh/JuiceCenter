pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'echo "Build Started"'
                bat 'mvn clean install'
                bat 'echo "Build Ended"'

            }
        }
    }
}