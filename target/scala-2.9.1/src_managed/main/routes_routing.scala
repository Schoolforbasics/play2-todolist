// @SOURCE:/Users/luismiranda/todolist/conf/routes
// @HASH:4b02b1da29e20e6151c5ba62d4154dd4fbfd694f
// @DATE:Sun Nov 03 18:57:59 WET 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:12
val controllers_Application_tasks2 = Route("GET", PathPattern(List(StaticPart("/tasks"))))
                    

// @LINE:13
val controllers_Application_newTask3 = Route("POST", PathPattern(List(StaticPart("/tasks"))))
                    

// @LINE:14
val controllers_Application_deleteTask4 = Route("POST", PathPattern(List(StaticPart("/tasks/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/tasks""","""controllers.Application.tasks"""),("""POST""","""/tasks""","""controllers.Application.newTask"""),("""POST""","""/tasks/$id<[^/]+>/delete""","""controllers.Application.deleteTask(id:Long)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:12
case controllers_Application_tasks2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.tasks, HandlerDef(this, "controllers.Application", "tasks", Nil))
   }
}
                    

// @LINE:13
case controllers_Application_newTask3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.newTask, HandlerDef(this, "controllers.Application", "newTask", Nil))
   }
}
                    

// @LINE:14
case controllers_Application_deleteTask4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteTask(id), HandlerDef(this, "controllers.Application", "deleteTask", Seq(classOf[Long])))
   }
}
                    
}
    
}
                