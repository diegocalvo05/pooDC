
package com.mycompany.artistas;

public class Artista {
    private String descripcion;
    private String audio;
    private String imagen;
    
    public Artista(){}
    
    public Artista(String descripcion, String audio, String imagen){
        this.descripcion = descripcion;
        this.audio = audio;
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
