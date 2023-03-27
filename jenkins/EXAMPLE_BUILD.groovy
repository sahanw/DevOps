pipeline {
    agent none
    stages {
        stage('Checkout SCM') 
        {
            steps {
                checkout scm
            }
        }
        stage('Copying the Artifacts') {
            steps {
                echo "Copying Completed"
            }
        }
        stage('Backing Up Existing Configs') 
        { 
            steps {
                sh "date"
                sh "echo Backup Completed"
                sh "sleep 10" 
            }
        }
        stage('Build SWIFT Alliance Access') 
        { 
            steps {
                sh "date"
                sh "sleep 10"
                sh "echo Building Completed" 
            }
        }
        stage('Restart SWIFT Alliance Access') 
        { 
            steps {
                sh "df -h"
                sh "sleep 10"
                sh "echo Restarting Completed" 
            }
        }
    }

}
