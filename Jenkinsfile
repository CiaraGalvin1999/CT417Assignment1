pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('clean') {
            steps {
                sh './gradlew clean'
            }
        }
        stage('build') {
            steps {
                sh './gradlew build'
            }
        }
        stage('test'){
            steps {
                sh './gradlew test'
            }
        }
    }
}