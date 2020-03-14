package mx.edu.ittepic.ladm_u2_practica2_jonathanlopez

import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent
import kotlin.math.sin
import kotlin.math.sqrt

class Burbuja(){

    var x = 0f
    var y=0f
    var r=0f
    var ancho=0f
    var incX=5f
    var incY=5f

    var alto =0f

    constructor(x:Int,y:Int,r:Int) : this(){
        this.x=x.toFloat()
        this.y=y.toFloat()
        this.r=r.toFloat()
        ancho=this.r*2
        alto=this.r*2
        this.incX= (230f-r)/10
        this.incY= (230f-r)/10
    }

    fun pintar(c:Canvas, p:Paint){
        c.drawCircle(x+r,y+r,r,p)


    }

    fun rebote(anchoPantalla:Int, altoPantalla:Int){

            x+= incX
            y+= incY

        if(x<=0 || x>=anchoPantalla-ancho){
            incX *= -1
        }
        if(y<=0 || y>=altoPantalla-alto){
            incY *= -1
        }
    }


}

