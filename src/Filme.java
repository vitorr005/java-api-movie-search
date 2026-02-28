import com.google.gson.annotations.SerializedName;


public class Filme {
    @SerializedName("Title")
    private String titulo;
    @SerializedName("Year")
    private String ano;
    @SerializedName("Genre")
    private String genero;
    @SerializedName("Director")
    private String diretor;
    @SerializedName("imdbRating")
    private String notaImdb;



    @Override
    public String toString() {
        return "\n🎬 Filme" +
                "\nTítulo: " + titulo +
                "\nAno: " + ano +
                "\nGênero: " + genero +
                "\nDiretor: " + diretor +
                "\nNota IMDb: " + notaImdb +
                "\n---------------------------";
    }
}


