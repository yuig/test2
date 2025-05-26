package k72;

import e72.d0;
import java.util.List;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import sq2.l;
import sq2.o;
import sq2.q;
import sq2.t;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lk72/b;", "", "", "", "pins", "Ld72/c;", "Le72/d0;", "b", "(Ljava/util/List;Lbl2/c;)Ljava/lang/Object;", "Lokhttp3/MultipartBody$Part;", "image", "a", "(Lokhttp3/MultipartBody$Part;Lbl2/c;)Ljava/lang/Object;", "shuffles-cutout-editor_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface b {
    @l
    @o("camera/segmented_objects/?fields=pin.{id,image_signature,title,link,cacheable_id,grid_title,rich_summary(),rich_metadata(),pinner(),native_creator(),origin_pinner(),link_domain(),images[345x,736x,750x]},domain.{id,official_user()}")
    Object a(@NotNull @q MultipartBody.Part part, @NotNull bl2.c<? super d72.c<List<d0>>> cVar);

    @sq2.f("pins/segmented_objects/?fields=pin.{id,image_signature,title,link,cacheable_id,grid_title,rich_summary(),rich_metadata(),pinner(),native_creator(),origin_pinner(),link_domain(),images[345x,736x,750x]},domain.{id,official_user()}")
    Object b(@t("pins") @NotNull List<String> list, @NotNull bl2.c<? super d72.c<List<d0>>> cVar);
}
