package org.example;

import java.util.List;

class PokemonList{
    public PokemonList(){}

    public String getCount(){
        return count;
    }

    public void setCount(String count){
        this.count = count;
    }

    public List<PokemonShort> getResults(){
        return results;
    }

    public void setResults(List<PokemonShort> results){
        this.results=results;
    }
    private String count;
    private List<PokemonShort> results;

    public PokemonShort getPokemon(int idx) {
        return results.get(idx);
    }


}

class PokemonShort {
    private String name;
    private String url;

    public PokemonShort(){}
    public String getName(){
        return name;
    }

    public String getUrl(){
        return url;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setUrl(String url){
        this.url = url;
    }
}
