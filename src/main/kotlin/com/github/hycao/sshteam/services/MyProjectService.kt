package com.github.hycao.sshteam.services

import com.intellij.openapi.project.Project
import com.github.hycao.sshteam.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
