pipeline {
    agent any
    tools {
        jdk 'JDK-21'
    }
    parameters{
        //Define Parameter Tag (Use String or choice - in the way we add something like Regression, Smoke, Production)
        string (name: "CUCUMBER_TAGS", defaultValue: "@Navigation", description: "Tags de cucumber a ejecutar")
    }
    stages{
        stage('Execution'){
            steps{
               echo 'Executing feature Tests...'
                        // Using -PbuildDir for this branch use its own compilation folder
                         bat "gradlew.bat runCucumber -Ptags=${params.CUCUMBER_TAGS} --no-daemon" 
            }

        }
    }
    post {
        always{
            // Genera el reporte visual usando el plugin "Cucumber reports"
            cucumber buildStatus: 'NULL',
                     fileIncludePattern: '**/cucumber-report.json',
                     jsonReportDirectory: 'build/'
        }
    }
}