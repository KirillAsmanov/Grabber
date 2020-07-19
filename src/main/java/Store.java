import java.util.List;

/**
 * Store interface
 * @author Kirill Asmanov
 * @since 13.07.2020
 */
public interface Store {
    void save(Post post);
    void saveAll(List<Post> posts);
    List<Post> getAll();
}
