package a92;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.j1;
import com.pinterest.api.model.n1;
import com.pinterest.api.model.z;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.o;
import sq2.t;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\u0010\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"La92/b;", "", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "Lcom/pinterest/api/model/j1;", "getApiKey", "(Lbl2/c;)Ljava/lang/Object;", "Lcom/pinterest/api/model/n1;", "getToken", "Lvd0/c;", "unlinkToken", "", "code", "b", "(Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "visitorId", "Lcom/pinterest/api/model/z;", "a", "targetHandshakeLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface b {
    @sq2.f("/v3/target/login_url/")
    Object a(@t("visitor_id") String str, @NotNull bl2.c<? super NetworkResponse<? extends z>> cVar);

    @o("/v3/connect/target/")
    @sq2.e
    Object b(@sq2.c("code") @NotNull String str, @NotNull bl2.c<? super NetworkResponse<? extends n1>> cVar);

    @sq2.f("/v3/target/api_key/")
    Object getApiKey(@NotNull bl2.c<? super NetworkResponse<? extends j1>> cVar);

    @sq2.f("/v3/target/token/")
    Object getToken(@NotNull bl2.c<? super NetworkResponse<? extends n1>> cVar);

    @sq2.b("/v3/connect/target/")
    Object unlinkToken(@NotNull bl2.c<? super NetworkResponse<? extends vd0.c>> cVar);
}
