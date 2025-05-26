package o12;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.fi0;
import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.l;
import sq2.o;
import sq2.p;
import sq2.q;
import sq2.s;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\bf\u0018\u00002\u00020\u0001J8\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJB\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0012\u0010\tJ6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001b\u0010\u0018J+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d2\b\b\u0001\u0010\u001c\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010 \u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b$\u0010%J@\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010&\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b'\u0010%JJ\u0010+\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010(\u001a\u00020\u00022\b\b\u0001\u0010*\u001a\u00020)2\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b+\u0010,JJ\u00100\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010-\u001a\u00020)2\b\b\u0001\u0010/\u001a\u00020.2\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b0\u00101J6\u00102\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b2\u0010\tJ6\u00103\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b3\u0010\tJV\u00106\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u00104\u001a\u00020.2\b\b\u0001\u0010/\u001a\u00020.2\b\b\u0001\u00105\u001a\u00020.2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010!\u001a\u00020)2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b6\u00107JL\u0010:\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u00108\u001a\u00020\u00022\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b:\u0010;JT\u0010?\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010<\u001a\u00020\u00022\b\b\u0001\u0010=\u001a\u00020.2\b\b\u0001\u0010>\u001a\u00020.2\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b?\u0010@JJ\u0010A\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010>\u001a\u00020.2\b\b\u0001\u0010-\u001a\u00020)2\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bA\u0010BJJ\u0010E\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010C\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010D\u001a\u00020\u0002H§@¢\u0006\u0004\bE\u0010;ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006FÀ\u0006\u0001"}, d2 = {"Lo12/a;", "", "", "draftId", "sourceId", "fields", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "Lcom/pinterest/api/model/fi0;", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "", "q", "(Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "Lokhttp3/RequestBody;", "cutoutMask", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Lbl2/c;)Ljava/lang/Object;", "shuffleAssetId", "n", "Lokhttp3/MultipartBody$Part;", "image", "h", "(Lokhttp3/MultipartBody$Part;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "r", "(Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "o", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Lbl2/c;)Ljava/lang/Object;", "l", "id", "Luj2/b0;", "k", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "canvasPins", "pageSize", "bookmark", "Lo12/b;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "pinIds", "a", "query", "", "objectType", "f", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "feedType", "", "transformToPins", "c", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "s", "g", "forceAll", "isDraft", "i", "(ZZZLjava/lang/String;ILjava/lang/String;Lbl2/c;)Ljava/lang/Object;", "filter", "sort", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "boardId", "filterSectionPins", "filterStories", "t", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "m", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "assetId", "excludedPinId", "b", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface a {
    @f("shuffles/composer/related/pins/")
    Object a(@t("pin_ids") @NotNull String str, @t("fields") @NotNull String str2, @t("page_size") @NotNull String str3, @t("bookmark") String str4, @NotNull bl2.c<? super NetworkResponse<b>> cVar);

    @f("/v3/shuffles/assets/{ASSET_ID}/related/modules/")
    Object b(@s("ASSET_ID") @NotNull String str, @t("fields") @NotNull String str2, @t("page_size") @NotNull String str3, @t("bookmark") String str4, @t("exclude_pins") @NotNull String str5, @NotNull bl2.c<? super NetworkResponse<b>> cVar);

    @f("users/me/shuffles/recommended/assets/")
    Object c(@t("feed_type") int i13, @t("transform_to_pins") boolean z13, @t("fields") @NotNull String str, @t("page_size") @NotNull String str2, @t("bookmark") String str3, @NotNull bl2.c<? super NetworkResponse<b>> cVar);

    @f("collages/composer/homefeed/")
    Object d(@t("canvas_pins") @NotNull String str, @t("fields") @NotNull String str2, @t("page_size") @NotNull String str3, @t("bookmark") String str4, @NotNull bl2.c<? super NetworkResponse<b>> cVar);

    @l
    @p("shuffles/{shuffle}/")
    Object e(@s("shuffle") @NotNull String str, @t("pin") String str2, @t("fields") String str3, @NotNull @q("bitmap_mask") RequestBody requestBody, @NotNull bl2.c<? super NetworkResponse<? extends fi0>> cVar);

    @f("search/shuffles/objects/")
    Object f(@t("query") @NotNull String str, @t("object_type") int i13, @t("fields") @NotNull String str2, @t("page_size") @NotNull String str3, @t("bookmark") String str4, @NotNull bl2.c<? super NetworkResponse<b>> cVar);

    @f("users/me/shuffles/composer/pins/")
    Object g(@t("fields") @NotNull String str, @t("page_size") @NotNull String str2, @t("bookmark") String str3, @NotNull bl2.c<? super NetworkResponse<b>> cVar);

    @l
    @p("shuffles/{shuffle}/")
    Object h(@NotNull @q MultipartBody.Part part, @s("shuffle") @NotNull String str, @t("fields") String str2, @NotNull bl2.c<? super NetworkResponse<? extends fi0>> cVar);

    @f("users/me/shuffles/")
    Object i(@t("force_all") boolean z13, @t("transform_to_pins") boolean z14, @t("is_draft") boolean z15, @t("fields") String str, @t("page_size") int i13, @t("bookmark") String str2, @NotNull bl2.c<? super NetworkResponse<b>> cVar);

    @p("shuffles/{shuffle}/")
    Object j(@s("shuffle") @NotNull String str, @t("pin") String str2, @t("fields") String str3, @NotNull bl2.c<? super NetworkResponse<? extends fi0>> cVar);

    @f("shuffles/{shuffle}/")
    @NotNull
    b0<fi0> k(@s("shuffle") @NotNull String id3, @t("fields") String fields);

    @o("shuffles/")
    Object l(@t("asset") String str, @t("fields") String str2, @NotNull bl2.c<? super NetworkResponse<? extends fi0>> cVar);

    @f("shuffles/remixes/pins/")
    Object m(@t("filter_stories") boolean z13, @t("feed_type") int i13, @t("fields") @NotNull String str, @t("page_size") @NotNull String str2, @t("bookmark") String str3, @NotNull bl2.c<? super NetworkResponse<b>> cVar);

    @p("shuffles/{shuffle}/")
    Object n(@s("shuffle") @NotNull String str, @t("asset") String str2, @t("fields") String str3, @NotNull bl2.c<? super NetworkResponse<? extends fi0>> cVar);

    @l
    @o("shuffles/")
    Object o(@t("pin") String str, @t("fields") String str2, @NotNull @q("bitmap_mask") RequestBody requestBody, @NotNull bl2.c<? super NetworkResponse<? extends fi0>> cVar);

    @f("users/me/boards/")
    Object p(@t("filter") @NotNull String str, @t("sort") String str2, @t("fields") @NotNull String str3, @t("page_size") @NotNull String str4, @t("bookmark") String str5, @NotNull bl2.c<? super NetworkResponse<b>> cVar);

    @sq2.b("shuffles/{shuffle}/")
    Object q(@s("shuffle") @NotNull String str, @NotNull bl2.c<? super NetworkResponse<Unit>> cVar);

    @o("shuffles/")
    Object r(@t("pin") String str, @t("fields") String str2, @NotNull bl2.c<? super NetworkResponse<? extends fi0>> cVar);

    @f("users/me/shuffles/favorited/assets/pins/")
    Object s(@t("fields") @NotNull String str, @t("page_size") @NotNull String str2, @t("bookmark") String str3, @NotNull bl2.c<? super NetworkResponse<b>> cVar);

    @f("boards/{boardId}/pins/")
    Object t(@s("boardId") @NotNull String str, @t("filter_section_pins") boolean z13, @t("filter_stories") boolean z14, @t("fields") @NotNull String str2, @t("page_size") @NotNull String str3, @t("bookmark") String str4, @NotNull bl2.c<? super NetworkResponse<b>> cVar);
}
