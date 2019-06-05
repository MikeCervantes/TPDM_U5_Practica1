package ittepic.edu.tpdm_u5_practica1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {

    public BaseDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE CHISTES(IDCHISTE INTEGER PRIMARY KEY AUTOINCREMENT,CHISTE VARCHAR(200))");
        db.execSQL("INSERT INTO CHISTES (CHISTE) VALUES ('- Cariño, tengo dos noticias, una buena y otra mala. He dejado las drogas, pero no sé donde.')," +

                "('- Mamá, mamá, hay un pobre hombre que no para de gritar. ¿Me das algo para él?\n" +
                "- Bueno, toma. ¿Y qué dice?\n" +
                "- ¡Helados, helados!')," +

                "('- Doctor, vengo a que me osculte.\n" +
                "- Ráspido, en el armario.')," +

                "('- Mamá mamá, todos me llaman Rihanna.\n" +
                "- ¿Dónde, hija?\n" +
                "- En la escuela ela ela ela...')," +

                "('*Toc toc*\n" +
                "- Quien es?\n" +
                "- Lola.\n" +
                "- Lola qué?\n" +
                "- Loladrones.\n" +
                "- Esperadme que estoy con lame.\n" +
                "- Lame qué?\n" +
                "- Lametralladora.\n" +
                "Jajajaja')," +

                "('- Cariño, creo que estás obsesionado con el fútbol y me haces falta.\n" +
                "- ¡¿Qué falta?! ¡¿Qué falta?! ¡¡Si no te he tocado!!')," +

                "('- Mamá, mamá, los spaguetti se están pegando.\n" +
                "- Déjalos que se maten.')," +

                "('- A las 10 te pito y bajas.\n" +
                "- ¿Te has comprado un coche?\n" +
                "- No, un pito.')," +

                "('Yo no soy supersticioso. Da mala suerte.')," +

                "('- ¿Sabes que el otro día se cayó mi madre por el balcón y ahora está en el cielo?.\n" +
                "- Pues, ¡cómo rebota tu vieja!.')," +

                "('- Quiero decirle que estoy enamorado de su hija, y no es por el dinero.\n" +
                "- ¿Y de cuál de las cuatro?\n" +
                "- Ah pues... de cualquiera.')," +

                "('¿Que hace una abeja en un gimnasio? !zumba!!!')," +

                "('En un baile un chico dice:\n" +
                "¿Bailas?.\n" +
                "La chica contesta:\n" +
                "¡¡Sí!!.\n" +
                "- Buenísimo, entonces puedo usar la silla.')," +

                "('- Oye, ¿a cuánto vendes el piso?\n" +
                "- Alquilo.\n" +
                "- ¿Y cuanto pesa?')," +

                "('Un abuelo va un día a la tienda de móviles y se compra un iphone. Al día siguiente vuelve y dice:\n" +
                "- Oiga, cámbieme el móvil que está roto.\n" +
                "- ¿Y cómo es eso, señor?\n" +
                "- Pues oiga que puse el modo avión y no vuela...')," +

                "('Si car es carro y men es hombre, entonces Carmen es un transformer...')," +

                "('¿Por qué los diabéticos no pueden vengarse?\n" +
                "Porque la venganza es dulce...')," +

                "('- Papa hoy hice el amor por primera vez\n" +
                "- Haber Jorgito siéntate y Cuéntame\n" +
                "- No puedo,me duele!!!')," +

                "('- ¿Nivel de inglés?\n" +
                "- Alto\n" +
                "- Diga \"impresionante metal\"\n" +
                "- Amazinc\n" +
                "- Contratado')," +

                "('- Me tienes harta Miguel ...¡solo piensas en comer!\n" +
                "- ¿A qué te refieres croquetamente?')," +

                "('En el mecánico:\n" +
                "- Buenos días, jefe. Mi coche no arranca.\n" +
                "- Eso es una bici.\n" +
                "- Claro lumbreras... Es que mi coche no arranca.')," +

                "('- Oye, después de tantos años juntos, ¿tu mujer, todavía te excita?.\n" +
                "- ¿Que si me excita?. Me pone de los nerviosssssssssss')," +

                "('Le dice una mujer a su marido:\n" +
                "- Si un león me atacara a mí y a mi madre, ¿a quién salvarías primero?\n" +
                "- Pues, ¡al león!')," +

                "('La esclavitud no se abolió, se cambió a 8 horas diarias.')," +

                "('- Oye, ¿y tú eres de los que ayuda con las tareas de la casa o te haces el loco?\n" +
                "- Qué dices, a mí me encanta colaborar.\n" +
                "- ¿Ah, sí?\n" +
                "- Sí, levanto los pies cuando barren por ejemplo...')," +

                "('Endoscopio: me preparo para todos los exámenes excepto para dos.')," +

                "('- Papá, ¿me ayudas con la tarea de inglés?\n" +
                "- Claro.\n" +
                "- ¿Cómo se dice vendedor de puertas?\n" +
                "- Vende-door.\n" +
                "- Gracias papi.\n" +
                "- Of nothing.')," +

                "('- ¿Cuál es el colmo de un vidriero?\n" +
                "- Que su negocio quiebre.')," +

                "('¿Que le dice una iguana a otra iguana? Somos iguanitas!!')," +

                "('- Mamá, mamá; papá quiere tirarse de la azotea.\n" +
                "- Dile a tu padre que lo que le he puesto son dos cuernos, no dos alas.')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
