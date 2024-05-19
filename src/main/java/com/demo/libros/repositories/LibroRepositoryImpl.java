package com.demo.libros.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.libros.models.Libro;

@Repository
public class LibroRepositoryImpl implements LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryImpl() {
        libros.add(new Libro(1, "Luna de Pluton", "Dross", "Ediciones Temas de Hoy", 2015));
        libros.add(new Libro(2, "Odisea", "HOMERO", "Librería y Casa Editorial Hernando", 001));
        libros.add(new Libro(3, "El código Da Vinci", "Dan Brown", "Doubleday Transworld Publishers Bantam Books Qanun", 2006));
        libros.add(new Libro(4, "Diez negritos", "Agatha Christie", "Collins Crime Club+", 1939));
        libros.add(new Libro(5, "El Hobbit", "J.R.R. Tolkien", "American", 1937));
    }

    public Libro getLibro(int id) {
        System.out.println("Conectado a base de datos ORACLE CORRECTAMENTE");
        for (Libro libro : libros) {
            if (id == libro.getId())
                return libro;

        }

        return null;
    }

    public List<Libro> getLibros() {
        System.out.println("Conectado a base de datos ORACLE");
        return libros;
    }

    @Override
    public Libro nuevLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }

}
