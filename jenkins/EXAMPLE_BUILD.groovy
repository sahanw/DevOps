pipeline {
    agent any 
    options 
        {
            ansiColor('xterm')
        }
    
    stages {

        stage('Checkout SCM') 
        {
            steps {
                checkout scm
            }
        }

        stage('SWIFT build') 
        { 
            steps {
                script {
                    echo "Hello, building SWIFT Alliance Access..."
                }
            }
        }

        stage('Copying to the Artifactory') 
        { 
            steps {
                sh "date"
                echo "Copying Completed" 
            }
        }
    }
}