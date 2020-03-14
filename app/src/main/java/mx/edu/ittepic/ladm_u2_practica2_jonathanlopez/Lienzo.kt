package mx.edu.ittepic.ladm_u2_practica2_jonathanlopez

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class Lienzo (p:MainActivity) : View(p){
    var b1 = Burbuja(200,200,150)
    var b2 =Burbuja(400,500,100)
    var b3 =Burbuja(800,700,125)
    var b4 =Burbuja(200,1000,75)
    var b5 =Burbuja(400,1000,125)
    var b6 =Burbuja(300,500,50)
    var b7 =Burbuja(200,1200,25)
    var b8 =Burbuja(400,1000,200)
    var b9 =Burbuja(400,200,175)
    var b10 =Burbuja(200,1200,25)




    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        var p =Paint()


        p.color= Color.rgb(250,133,200)
        b1.pintar(c,p)
        p.color= Color.rgb(197,252,71)
        b2.pintar(c,p)
        p.color= Color.rgb(12,169,242)
        b3.pintar(c,p)
        p.color= Color.rgb(254,169,24)
        b4.pintar(c,p)
        p.color= Color.rgb(254,5,24)
        b5.pintar(c,p)
        p.color= Color.rgb(225,220,142)
        b6.pintar(c,p)
        p.color= Color.rgb(28,138,142)
        b7.pintar(c,p)
        p.color= Color.rgb(207,207,187)
        b8.pintar(c,p)
        p.color= Color.rgb(207,142,187)
        b9.pintar(c,p)
        p.color= Color.rgb(254,142,119)
        b10.pintar(c,p)
        p.color= Color.rgb(11,251,235)

    }



    fun animarBurbuja(){

        b1.rebote(width,height)
        b2.rebote(width,height)
        b3.rebote(width,height)
        b4.rebote(width,height)
        b5.rebote(width,height)
        b6.rebote(width,height)
        b7.rebote(width,height)
        b8.rebote(width,height)
        b9.rebote(width,height)
        b10.rebote(width,height)


        invalidate()
    }

}