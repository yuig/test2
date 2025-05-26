package o20;

import com.pinterest.api.model.kv;
import com.pinterest.api.model.tu;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.c;
import sq2.e;
import sq2.f;
import sq2.o;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b0\u00062\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lo20/a;", "", "", "type", "", "rotation", "Luj2/b0;", "Lcom/pinterest/api/model/tu;", "b", "(Ljava/lang/String;I)Luj2/b0;", "uploadIds", "", "Lcom/pinterest/api/model/kv;", "a", "(Ljava/lang/String;)Luj2/b0;", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @f("media/uploads/")
    @NotNull
    b0<Map<String, kv>> a(@t("upload_ids") @NotNull String uploadIds);

    @o("media/uploads/register/")
    @NotNull
    @e
    b0<tu> b(@c("type") @NotNull String type, @c("rotation") int rotation);
}
