pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
            withMaven{
                bat 'echo "Build Started"'
                bat 'mvn clean install'
                bat 'echo "Build Ended"'
                    }
            }
        }
    }
}