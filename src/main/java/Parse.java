import java.util.List;

/**
 * Parse interface
 * @author Kirill Asmanov
 * @since 13.07.2020
 */
public interface Parse {
    List<Post> list(String link);
    Post detail(String link);
}
