pipeline {
    agent any
    stages {
        stage('clean') {
            steps {
                bat './gradlew clean'
            }
        }
        stage('build') {
            steps {
                bat './gradlew build'
            }
        }
        stage('test'){
            steps {
                bat './gradlew test'
            }
        }
    }
    post {
        always {
            junit 'build/test-results/test/*.xml'
        }
    }
}