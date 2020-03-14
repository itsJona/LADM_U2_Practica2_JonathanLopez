package mx.edu.ittepic.ladm_u2_practica2_jonathanlopez

class HiloAnimacion (p:MainActivity):Thread() {
    var puntero = p

    override fun run() {
        super.run()

        while (true) {
            sleep(20)
            puntero.runOnUiThread {
                puntero.lienzo!!.animarBurbuja()
            }
        }
    }
}
