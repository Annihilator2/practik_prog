package org.example;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        try {
            URL url = new URL("https://pokeapi.co/api/v2/pokemon");
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            PokemonList list = mapper.readValue(url, PokemonList.class);
            System.out.println(list.getPokemon(0).getName());
            HashMap<Integer, Integer> map = new HashMap<>();
            for (PokemonShort pokemon: list.getResults()) {
                System.out.println(pokemon.getName());
            }
        }
        catch (Exception ignored) {
            System.out.println(ignored.getMessage());
        }
        //System.out.println( "Hello World!" );

    }
}

