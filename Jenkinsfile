pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Descarga el código de la rama configurada en Jenkins
                checkout scm
            }
        }

        stage('Run Cucumber Tests') {
            steps {
                // Ejecuta tu comando específico de Gradle
                // Se usa ./gradlew (el wrapper) para asegurar la versión correcta
                gradle test -D "cucumber.filter.tags=@Plans"
            }
        }
    }

    post {
        always {
            // Opcional: Publica los reportes de Cucumber/JUnit si los generas
            junit '**/build/test-results/**/*.xml'
        }
    }
}