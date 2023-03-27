pipeline {
    agent none

    stages {
        stage('Run on Master') {
            steps {
                // insert your build steps here
                sh 'echo "Build started"'
                sh 'sleep 5'
                sh 'echo "Build finished"'
            }
        }
    }
}
