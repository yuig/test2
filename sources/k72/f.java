package k72;

import f72.m0;
import f72.u;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import sq2.l;
import sq2.o;
import sq2.q;
import sq2.t;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JJ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e0\t2\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lk72/f;", "", "", "assetId", "source", "isStandalone", "attribution", "Lokhttp3/MultipartBody$Part;", "image", "Ld72/c;", "Lf72/m0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lbl2/c;)Ljava/lang/Object;", "trackingIds", "", "Lf72/u;", "b", "(Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "shuffles-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface f {
    @l
    @o("shuffles/items/images/?fields=shuffleitemimage.{id,asset_id,images[70x,345x,736x,750x],attribution,user(),source,community_available,mask,image_tracking_id}")
    Object a(@t("asset_id") @NotNull String str, @t("source") @NotNull String str2, @t("is_standalone") @NotNull String str3, @t("attribution") String str4, @NotNull @q MultipartBody.Part part, @NotNull bl2.c<? super d72.c<m0>> cVar);

    @sq2.f("media/uploads/")
    Object b(@t("upload_ids") @NotNull String str, @NotNull bl2.c<? super d72.c<Map<String, u>>> cVar);
}
