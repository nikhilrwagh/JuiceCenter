pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "HelloWorld"'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''
            }
        }
    }
}