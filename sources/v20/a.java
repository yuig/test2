package v20;

import com.pinterest.api.model.kr;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import pq2.i;
import sq2.l;
import sq2.p;
import sq2.q;
import sq2.t;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lv20/a;", "", "Lokhttp3/MultipartBody$Part;", "image", "Lpq2/i;", "Ltt1/a;", "Lcom/pinterest/api/model/kr;", "b", "(Lokhttp3/MultipartBody$Part;)Lpq2/i;", "metadata", "", "metadataErrorMessage", "a", "(Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Ljava/lang/String;)Lpq2/i;", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @l
    @NotNull
    @rz.a
    @p("storypins/image/upload/")
    i<tt1.a<kr>> a(@NotNull @q MultipartBody.Part image, @NotNull @q MultipartBody.Part metadata, @t("error_message") String metadataErrorMessage);

    @l
    @NotNull
    @rz.a
    @p("storypins/image/upload/")
    i<tt1.a<kr>> b(@NotNull @q MultipartBody.Part image);
}
