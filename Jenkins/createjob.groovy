def jobname = 'firstjob'

job(jobname){
  description('First DSL Job')
  parameters {
        booleanParam('FLAG', true)
        choiceParam('SelectTool', ['Jenkins (default)', 'GIT', 'Maven'])
        stringParam('Name', defaultValue='JenkisnServer', description = 'Learning jenkins')
    scm {
        github('sonal0409/DevOpsCodeDemo', master)
      
    }
        
    }
}
