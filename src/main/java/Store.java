import java.util.List;

/**
 * Store interface
 * @author Kirill Asmanov
 * @since 13.07.2020
 */
public interface Store {
    void save(Post post);
    List<Post> getAll();
}
