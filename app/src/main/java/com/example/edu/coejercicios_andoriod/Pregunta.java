package com.example.edu.coejercicios_andoriod;

    public class Pregunta {
        private String enunciado;
        private String[] opciones;
        private int respuestaCorrecta;

        public Pregunta(String enunciado, String[] opciones, int respuestaCorrecta) {
            this.enunciado = enunciado;
            this.opciones = opciones;
            this.respuestaCorrecta = respuestaCorrecta;
        }

        public String getEnunciado() {
            return enunciado;
        }

        public String[] getOpciones() {
            return opciones;
        }

        public int getRespuestaCorrecta() {
            return respuestaCorrecta;
        }
    }



