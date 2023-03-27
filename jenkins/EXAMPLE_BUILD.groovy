pipeline {
    agent none

    stages {
        stage('Run on Master') {
            agent { label 'master' }
            steps {
                // insert your build steps here
                sh 'echo "Build started"'
                sh 'sleep 5'
                sh 'echo "Build finished"'
            }
        }
    }
}
