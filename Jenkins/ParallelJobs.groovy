def branches = ['master','dev']

branches.each { branch ->
  job(branch){
    description('This is job for branches')
    scm{
      github('sonal0409/JavaWebCalculator', branch)
  }
  }
}
  
