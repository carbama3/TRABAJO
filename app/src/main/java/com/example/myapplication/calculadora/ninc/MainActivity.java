package com.example.myapplication.calculadora.ninc;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.myapplication.calculadora.ninc.R.id.cuadropantalla;



public class MainActivity extends AppCompatActivity {
    public EditText pantalla;
    public double operando1, operando2, resultado;
     int operacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla = (EditText)findViewById(cuadropantalla);

        Button bot1 = (Button) findViewById(R.id.bot1);
        bot1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String captura = pantalla.getText().toString();
                captura = captura + "1";
                pantalla.setText(captura);
            }
        } );

        Button bot2 = (Button) findViewById(R.id.bot2);
        bot2.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String captura = pantalla.getText().toString();
                captura = captura + "2";
                pantalla.setText(captura);
            }
        } );
        Button bot3 = (Button) findViewById(R.id.bot3);
        bot3.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String captura = pantalla.getText().toString();
                captura = captura + "3";
                pantalla.setText(captura);
            }
        } );
        Button bot4 = (Button) findViewById(R.id.bot4);
        bot4.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String captura = pantalla.getText().toString();
                captura = captura + "4";
                pantalla.setText(captura);
            }
        } );

        Button bot5 = (Button) findViewById(R.id.bot5);
        bot5.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String captura = pantalla.getText().toString();
                captura = captura + "5";
                pantalla.setText(captura);
            }
        } );

        Button bot6 = (Button) findViewById(R.id.bot6);
        bot6.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String captura = pantalla.getText().toString();
                captura = captura + "6";
                pantalla.setText(captura);
            }
        } );
        Button bot7 = (Button) findViewById(R.id.bot7);
        bot7.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String captura = pantalla.getText().toString();
                captura = captura + "7";
                pantalla.setText(captura);
            }
        } );
        Button bot8 = (Button) findViewById(R.id.bot8);
        bot8.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String captura = pantalla.getText().toString();
                captura = captura + "8";
                pantalla.setText(captura);
            }
        } );
        Button bot9 = (Button) findViewById(R.id.bot9);
        bot9.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String captura = pantalla.getText().toString();
                captura = captura + "9";
                pantalla.setText(captura);
            }
        } );
        Button bot0 = (Button) findViewById(R.id.bot0);
        bot0.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String captura = pantalla.getText().toString();
                captura = captura + "0";
                pantalla.setText(captura);
            }
        } );


        Button punto= (Button) findViewById(R.id.punto);
        punto.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String captura = pantalla.getText().toString();
                captura = captura + ".";
                pantalla.setText(captura);
            }
        } );

  //FUNCIONES
        Button mas = (Button) findViewById(R.id.mas);
            mas.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String aux1 = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux1);

                    pantalla.setText("");
                    operacion = 1;
                }
            });
        Button igual = (Button) findViewById(R.id.igual);
        igual.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux2 = pantalla.getText().toString();
                operando2 = Double.parseDouble(aux2);




             if (operacion == 1) {
                resultado = operando1 + operando2;

            } else if (operacion == 2) {
                resultado = operando1 - operando2;

            } else if (operacion == 3) {
                resultado = operando1 * operando2;

            } else if (operacion == 4) {
                if (operando2 == 0) {
                    pantalla.setText("Numero no se puede dividir para 0");
                } else {
                    resultado = operando1 / operando2;
                }

            } else if (operacion == 5) {
                resultado =(operando1 / 100);


            } else if (operacion == 6) {
                resultado = Math.sqrt (operando1);
            }else if (operacion==7){

             }

        pantalla.setText(" " + resultado);
            operando1 = resultado;
        }
        });



        Button restar = (Button) findViewById(R.id.restar);
        restar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();
                operando1 = Double.parseDouble(aux1);

                pantalla.setText("");
                operacion = 2;
            }
        });


        Button multiplicar = (Button) findViewById(R.id.multiplicar);
        multiplicar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();
                operando1 = Double.parseDouble(aux1);

                pantalla.setText("");
                operacion = 3;
            }
        });

        Button dividir = (Button) findViewById(R.id.dividir);
        dividir.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();

                operando1 = Double.parseDouble(aux1);

                pantalla.setText("");
                operacion = 4;
            }
        });

        Button porcentaje= (Button) findViewById(R.id.porcentaje);
        porcentaje.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();
                if(!aux1.isEmpty()){

                    operando1 =  Double.parseDouble(aux1);
                    resultado=operando1/100;
                    pantalla.setText(""+resultado);

                } else{
                    Toast.makeText(MainActivity.this, "Tienes que poner primero el número", Toast.LENGTH_SHORT).show();
                }


            }
        });

        Button raiz = (Button) findViewById(R.id.raiz);
        raiz.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String aux1 = pantalla.getText().toString();

                if(!aux1.isEmpty()){
                    operando1 = Double.parseDouble(aux1);
                    resultado=Math.sqrt(operando1);
                    pantalla.setText(""+resultado);
                } else{
                    Toast.makeText(MainActivity.this, "Tienes que poner primero el número", Toast.LENGTH_SHORT).show();
                }



            }
        });


        Button seno = (Button) findViewById(R.id.seno);
        seno.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();
                operando1 =  Double.parseDouble(aux1);
               // pantalla.setText("Sin (" +operando1+")");
                double resopera=Math.toRadians(operando1);
                resultado= (Math.sin(resopera));
                pantalla.setText(""+resultado);



            }
        });
        Button coseno = (Button) findViewById(R.id.coseno);
        coseno.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();
                operando1 =  Double.parseDouble(aux1);
               // pantalla.setText("Sin (" +operando1+")");
                double resopera=Math.toRadians(operando1);
                resultado= (Math.cos(resopera));
                pantalla.setText(""+resultado);




            }
        });
        Button tangente = (Button) findViewById(R.id.tangente);
        tangente.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();
                operando1 =  Double.parseDouble(aux1);
                // pantalla.setText("Sin (" +operando1+")");
                double resopera=Math.toRadians(operando1);
                resultado= (Math.tan(resopera));
                pantalla.setText(""+resultado);

            }
        });

        Button factorial = (Button) findViewById(R.id.factorial);
        factorial.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();
                operando1 =  Double.parseDouble(aux1);
                // pantalla.setText("Sin (" +operando1+")");
                resultado=1;
                for(double i=operando1; i>=1; i--){
                    resultado=resultado*i;
                }
                pantalla.setText(""+resultado);
            }
        });
        Button arcsen = (Button) findViewById(R.id.arcsen);
        arcsen.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();
                operando1 =  Double.parseDouble(aux1);
                // pantalla.setText("Sin (" +operando1+")");

                //double resopera=Math.toRadians(operando1);
                resultado=(Math.asin(operando1));
                resultado= Math.toDegrees(resultado);
                pantalla.setText(""+resultado);



            }
        });
        Button arccoseno = (Button) findViewById(R.id.arccoseno);
        arccoseno.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();
                operando1 =  Double.parseDouble(aux1);
                // pantalla.setText("Sin (" +operando1+")");
               // double resopera=Math.toRadians(operando1);
                resultado=(Math.acos(operando1));
                resultado= Math.toDegrees(resultado);
                pantalla.setText(""+resultado);



            }
        });
        Button Arctangente = (Button) findViewById(R.id.Arctangente);
        Arctangente.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();
                operando1 =  Double.parseDouble(aux1);
                // pantalla.setText("Sin (" +operando1+")");
                //double resopera=Math.toRadians(operando1);
                resultado=(Math.atan(operando1));
                resultado= Math.toDegrees(resultado);
                pantalla.setText(""+resultado);



            }
        });
        Button inversa= (Button) findViewById(R.id.inversa);
        inversa.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();
                operando1 =  Double.parseDouble(aux1);
                resultado=1/operando1;
                pantalla.setText(""+resultado);
                /*operacion = 5;

                 */
            }
        });

        Button secante = (Button) findViewById(R.id.secante);
        secante.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();
                operando1 =  Double.parseDouble(aux1);
                double resopera = (Math.toRadians(operando1));
                resultado= 1/(Math.cos(resopera));
                pantalla.setText(""+resultado);



            }
        });


        Button cosecante = (Button) findViewById(R.id.cosecante);
        cosecante.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();
                operando1 =  Double.parseDouble(aux1);
                double resopera = (Math.toRadians(operando1));
                resultado= 1/(Math.sin(resopera));
                pantalla.setText(""+resultado);



            }
        });

        Button cotangente = (Button) findViewById(R.id.cotangente);
        cotangente.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1 = pantalla.getText().toString();
                operando1 =  Double.parseDouble(aux1);
                double resopera = (Math.toRadians(operando1));
                resultado= 1/(Math.tan(resopera));
                pantalla.setText(""+resultado);



            }
        });

        Button pi = (Button) findViewById(R.id.pi);
        pi.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String captura = pantalla.getText().toString();
                captura = captura + Math.PI;
                pantalla.setText(captura);
            }
        } );

                Button clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText("");
                operando1 = 0;
                operando2=0;
                operacion = 0;
            }
        });
}

/*
    public void igual(View v) {
        Button igual= (Button) findViewById(R.id.igual);
        igual.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux2 = pantalla.getText().toString();
                operando2 = Double.parseDouble(aux2);
                pantalla.setText("");




      /*
        try {
            String aux2 = pantalla.getText().toString();
            operando2 = Double.parseDouble(aux2);
        } catch (NumberFormatException nfe) {
        }
        ;
        pantalla.setText("");
*/
/*
        if (operacion == 1) {
            resultado = operando1 + operando2;

        } else if (operacion == 2) {
            resultado = operando1 - operando2;

        } else if (operacion == 3) {
            resultado = operando1 * operando2;

        } else if (operacion == 4) {
            if (operando2 == 0) {
                pantalla.setText("Numero no se puede dividir para 0");
            } else {
                resultado = operando1 / operando2;
            }

        } else if (operacion == 5) {
            resultado = operando2 * (operando1 / 100.0);

        } else if (operacion == 6) {
            resultado = Math.sqrt(operando1);
        }

        pantalla.setText(" " + resultado);
        operando1 = resultado;
    }

/*
    public void sumar(View v) {
        try {
            Button mas= (Button) findViewById(R.id.mas);
            mas.setOnClickListener( new View.OnClickListener(){
                @Override
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {

        }

        pantalla.setText("");
        operacion = 1;
    }
*/

  /*  public void restar(View v) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }

        pantalla.setText("");
        operacion = 2;
    }


    public void multiplicar(View v) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }

        pantalla.setText("");
        operacion = 3;
    }

    public void dividir(View v) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }

        pantalla.setText("");
        operacion = 4;
    }


    public void porcentaje(View v) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }

        pantalla.setText("");
        operacion = 5;
    }

    public void raiz(View v) {
        try {
            String aux1 = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }

        pantalla.setText(" v(" + operando1 + ")");
        operacion = 6;
    }
*/
/*
    public void sin (View v){
        try{ String aux1= pantalla.getText().toString();
            operando1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Sin (" +operan1+")");
        ope=8;
    }

    public void cos (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Cos (" +operan1+")");
        ope=9;
    }

    public void tan (View v){
        try{ String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Tan (" +operan1+")");
        ope=10;

    }

    public void csc (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Csc (" +operan1+")");
        ope=11;
    }

    public void sec (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Sec (" +operan1+")");
        ope=12;
    }

    public void ctg (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Ctg (" +operan1+")");
        ope=13;
    }

    public void factorial (View v) {
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=14;
    }
*/
/*

    public void igual(View v) {
        try {
            String aux2 = pantalla.getText().toString();
            operando2 = Double.parseDouble(aux2);
        } catch (NumberFormatException nfe) {
        }
        ;
        pantalla.setText("");

        if (operacion == 1) {
            resultado = operando1 + operando2;

        } else if (operacion == 2) {
            resultado = operando1 - operando2;

        } else if (operacion == 3) {
            resultado = operando1 * operando2;

        } else if (operacion == 4) {
            if (operando2 == 0) {
                pantalla.setText("Numero no se puede dividir para 0");
            } else {
                resultado = operando1 / operando2;
            }

        } else if (operacion == 5) {
            resultado = operando2 * (operando1 / 100.0);

        } else if (operacion == 6) {
            resultado = Math.sqrt(operando1);
        }

        pantalla.setText(" " + resultado);
        operando1 = resultado;
    })
        /*
        }else if(ope==8){
            double rad=Math.toRadians(operan1);
            res= (Math.sin(rad));

        }else if(ope==9){
            double rad=Math.toRadians(operan1);
            res= (Math.cos(rad));

        }else if(ope==10){
            double rad=Math.toRadians(operan1);
            res= (Math.tan(rad));

        }else if(ope==11){
            double angulo = (Math.asin(operan1));
            res=Math.toDegrees(angulo);

        }else if(ope==12){
            double angulo = (Math.acos(operan1));
            res=Math.toDegrees(angulo);

        }else if(ope==13){
            double angulo = (Math.atan(operan1));
            res=Math.toDegrees(angulo);

        }else if (ope==14){
            res=1;
            for(double i=operan1; i>=1; i--){
                res=res*i;
            }
        }




        public void clear(View v){
            pantalla.setText(" ");
            operando1 = 0;
            operando2 = 0;
            resultado = 0;
        }
*/

    }



