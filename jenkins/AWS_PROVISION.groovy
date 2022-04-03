node {
    stage('Checkout') {
        checkout scm
    }

    stage('Testing Stage') {
        sh '''
        sleep 10;
        pwd
        cp scripts/test.sh .
        cat test.sh
        aws ec2 describe-instances
        '''
        print "Hello World!\n"
        print "What is your name? "    
    }

    stage("Clean Workspace"){
        cleanWs()
    }
}