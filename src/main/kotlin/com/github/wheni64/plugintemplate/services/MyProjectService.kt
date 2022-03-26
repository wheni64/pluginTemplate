package com.github.wheni64.plugintemplate.services

import com.intellij.openapi.project.Project
import com.github.wheni64.plugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
