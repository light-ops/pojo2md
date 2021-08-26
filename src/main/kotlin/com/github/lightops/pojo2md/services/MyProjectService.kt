package com.github.lightops.pojo2md.services

import com.github.lightops.pojo2md.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
