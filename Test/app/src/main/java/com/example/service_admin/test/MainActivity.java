package com.example.service_admin.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    boolean validapunto =false;

    private double valor1=0.0;
    private  double valor2=0.0;
    private int action=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddButtonActions();

    }

    public void AddButtonActions() {
        final  EditText resultado =findViewById(R.id.val2);
       
        Button numero2=findViewById(R.id.Num2);
        Button numero3=findViewById(R.id.Num3);
        Button numero4=findViewById(R.id.Num4);
        Button numero5=findViewById(R.id.Num5);
        Button numero6=findViewById(R.id.Num6);
        Button numero7=findViewById(R.id.Num7);
        Button numero8=findViewById(R.id.Num8);
        Button numero9=findViewById(R.id.Num9);
        Button numero0=findViewById(R.id.num0);
        Button numerop=findViewById(R.id.nump);
        Button numerox=findViewById(R.id.numx);

        numero1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"1");
            }
        });
        numero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"2");
            }
        });
        numero3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"3");
            }
        });
        numero4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"4");
            }
        });
        numero5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"5");
            }
        });
        numero6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"6");
            }
        });
        numero7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"7");
            }
        });
        numero8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"8");
            }
        });
        numero9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"9");
            }
        });
        numero0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"0");
            }
        });
        numerop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            if (!validapunto){
                if ( resultado.getText().toString().equals("")){
                    resultado.setText(resultado.getText()+"0.");
                } else {
                resultado.setText(resultado.getText()+".");
            }

            }
            validapunto=true;
            }

        });




        AddClearAction(resultado);
        actionsuma(resultado);
        actionigual(resultado);
        actionresta(resultado);
        actionmulti(resultado);
        actiondiv(resultado);
        actionrsiduo(resultado);

    }


    public void AddClearAction (final EditText resultado){
        Button boton =findViewById(R.id.CE);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText("");
                validapunto=false;
                valor1=0.0;
                valor2=0.0;
                action=-1;
            }
        });

    }

    public void actionsuma (final EditText resultado){
        Button boton =findViewById(R.id.numsum);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1=Double.parseDouble(resultado.getText().toString());
                action=0;
                resultado.setText("");
            }
        });
    }
    public void actionresta (final EditText resultado){
        Button boton =findViewById(R.id.numres);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1=Double.parseDouble(resultado.getText().toString());
                action=1;
                resultado.setText("");
            }
        });
    }

    public void actionmulti (final EditText resultado){
        Button boton =findViewById(R.id.numx);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1=Double.parseDouble(resultado.getText().toString());
                action=2;
                resultado.setText("");
            }
        });
    }
    public void actiondiv (final EditText resultado){
        Button boton =findViewById(R.id.numdi);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1=Double.parseDouble(resultado.getText().toString());
                action=3;
                resultado.setText("");
            }
        });
    }

    public void actionrsiduo (final EditText resultado){
        Button boton =findViewById(R.id.numresi);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1=Double.parseDouble(resultado.getText().toString());
                action=4;
                resultado.setText("");
            }
        });
    }

    public void actionigual (final EditText resultado){
        Button boton =findViewById(R.id.numigual);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (action!=-1){
                    if (resultado.getText().toString().equals("")){
                        valor2=0.0;
                    } else {
                        valor2=Double.parseDouble(resultado.getText().toString());
                    }
                }
                switch (action){
                    case 0:
                        double resultadoOperacion =valor1+valor2;
                        resultado.setText(String.valueOf(resultadoOperacion));
                        break;
                    case 1:
                        double resultadoOperacion1 =valor1-valor2;
                        resultado.setText(String.valueOf(resultadoOperacion1));
                        break;
                    case 2:
                        double resultadoOperacion2 =valor1*valor2;
                        resultado.setText(String.valueOf(resultadoOperacion2));
                    case 3:
                        if (valor2==0) {
                            break;
                    } else {
                            double resultadoOperacion3 =valor1/valor2;
                            resultado.setText(String.valueOf(resultadoOperacion3));
                        }
                        break;
                    case 4:
                        if (valor2==0) {
                            break;
                        } else {
                            double resultadoOperacion4 =valor1%valor2;
                            resultado.setText(String.valueOf(resultadoOperacion4));
                        }
                         break;
                }

            }
        });
    }


}
