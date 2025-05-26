package o20;

import com.pinterest.api.model.cv;
import com.pinterest.api.model.gv;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.c;
import sq2.e;
import sq2.o;
import uj2.b0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lo20/b;", "", "", "type", "", "rotation", "Luj2/b0;", "Lcom/pinterest/api/model/gv;", "b", "(Ljava/lang/String;I)Luj2/b0;", "Lxw0/b;", "auxData", "a", "(Lxw0/b;)Luj2/b0;", "uploadKey", "keySignature", "Lcom/pinterest/api/model/cv;", "c", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface b {
    @o("media/upload/credentials/")
    @NotNull
    b0<gv> a(@NotNull @sq2.a xw0.b auxData);

    @o("media/upload/credentials/")
    @NotNull
    @e
    b0<gv> b(@c("type") @NotNull String type, @c("rotation") int rotation);

    @o("media/upload/credentials/refresh/")
    @NotNull
    @e
    b0<cv> c(@c("upload_key") @NotNull String uploadKey, @c("key_signature") @NotNull String keySignature);
}
