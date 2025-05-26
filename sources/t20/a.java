package t20;

import com.pinterest.api.model.f30;
import com.pinterest.repository.pin.PinService;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import sq2.l;
import sq2.p;
import sq2.q;
import sq2.r;
import uj2.b0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J=\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lt20/a;", "", "", "", "Lokhttp3/RequestBody;", "params", "Lokhttp3/MultipartBody$Part;", "image", "Luj2/b0;", "Ltt1/a;", "Lcom/pinterest/api/model/f30;", "a", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)Luj2/b0;", "serviceLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @l
    @p(PinService.PINS_URL)
    @NotNull
    b0<tt1.a<f30>> a(@r @NotNull Map<String, RequestBody> params, @q MultipartBody.Part image);
}
