package backend.Services;


import java.io.BufferedReader;
import java.io.Reader;

public interface DataSerializer{
    Object deserialize(Reader src, Class clazz);
    Object serialize(Object src);
}
