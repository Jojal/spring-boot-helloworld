pipeline {
    agent any
    def container
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'whoami'
                sh 'docker container ps'
                script {
                    image = docker.build("jojal/spring-example:latest")
                    //docker.image('jojal/spring-example:latest').withRun('-p 8081:8080') {c ->
                        //sh "curl -i http://${hostIp(c)}:8080/"
                    //}

                    container = image.run('-p 8081:8080')
                }
            }
        }

        stage('Validation') {

            try {
                input message: "Is it ok ? ", ok : 'Good'
            }
            finally {

                container.stop
            }
        }
    }
}