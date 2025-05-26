package e12;

import com.pinterest.api.model.BoardFeed;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.l;
import sq2.o;
import sq2.q;
import sq2.s;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J=\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJI\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJS\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u00142\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000eH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00072\b\b\u0001\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00072\b\b\u0001\u0010#\u001a\u00020\u0002H'¢\u0006\u0004\b$\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Le12/e;", "", "", "filter", "sortOption", "fields", "pageSize", "Luj2/b0;", "Lcom/pinterest/api/model/BoardFeed;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "userUid", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "", "filterStories", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Luj2/b0;", "g", "(Ljava/lang/String;)Luj2/b0;", "", "count", "a", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Luj2/b0;", "pinId", "maxNumSuggestions", "link", "suggestionsOnly", "c", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Luj2/b0;", "Lokhttp3/MultipartBody$Part;", "image", "Lvd0/c;", "b", "(Lokhttp3/MultipartBody$Part;)Luj2/b0;", "trackingId", "h", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface e {
    @f("users/{userUid}/boards/feed/")
    @NotNull
    b0<BoardFeed> a(@s("userUid") @NotNull String userUid, @t("sort") @NotNull String sortOption, @t("count") int count, @t("fields") @NotNull String fields);

    @l
    @o("users/settings/")
    @NotNull
    b0<vd0.c> b(@NotNull @q MultipartBody.Part image);

    @f("users/boards/board_picker_shortlist/")
    @NotNull
    b0<BoardFeed> c(@t("pin") String pinId, @t("max_num_suggestions") int maxNumSuggestions, @t("count") int count, @t("link_url") String link, @t("fields") @NotNull String fields, @t("suggestions_only") Boolean suggestionsOnly);

    @f("users/{userUid}/boards/feed/")
    @NotNull
    b0<BoardFeed> d(@s("userUid") @NotNull String userUid, @t("sort") String sortOption, @t("privacy_filter") @NotNull String filter, @t("filter_stories") boolean filterStories, @t("fields") @NotNull String fields, @t("page_size") @NotNull String pageSize);

    @f("users/me/boards/")
    @NotNull
    b0<BoardFeed> e(@t("filter") @NotNull String filter, @t("sort") @NotNull String sortOption, @t("fields") @NotNull String fields, @t("page_size") @NotNull String pageSize);

    @f("users/{userUid}/boards/feed/")
    @NotNull
    b0<BoardFeed> f(@s("userUid") @NotNull String userUid, @t("sort") String sortOption, @t("privacy_filter") @NotNull String filter, @t("fields") @NotNull String fields, @t("page_size") @NotNull String pageSize);

    @f("users/me/boards/archived/")
    @NotNull
    b0<BoardFeed> g(@t("fields") @NotNull String fields);

    @f("images/upload/status/")
    @NotNull
    b0<vd0.c> h(@t("tracking_id") @NotNull String trackingId);
}
