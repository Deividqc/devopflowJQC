pipeline {
    agent any 
    stages 
    {
        stage('Checkout') 
        {
            steps 
            {
                echo 'Downloading code from current branch'
                git branch: 'feat/config-gradle', 
                credentialsId: '544c3656-dbeb-4d03-89e7-69784d10f289', 
                url: 'https://github.com/Deividqc/devopflowJQC.git'
            }
        }
        stage('Parallel executions') 
        {
            parallel 
            {
                stage('Courses feature') 
                {
                    steps 
                    {
                        echo 'Executing Courses feature Test...'
                        // Using -PbuildDir for this branch use its own compilation folder
                        bat 'call gradlew.bat clean test -D"cucumber.filter.tags=@Courses" -PbuildDir=build_courses --no-daemon --no-configuration-cache'
                    }
                }
                stage('Plans feature') 
                {
                    steps 
                    {
                        echo 'Executing Planes feature Test ...'
                        // Using -PbuildDir for this branch use its own compilation folder       
                        bat 'call gradlew.bat clean test -D"cucumber.filter.tags=@Plans" -PbuildDir=build_plans --no-daemon --no-configuration-cache'
                    }
                }
            }
        }
        
    }

    post 
        {
            always 
            {
              echo 'Publishing results...'
             //junit allowEmptyResults: true, testResults: '**/build/test-results/test/*.xml'
            }
        }
}
