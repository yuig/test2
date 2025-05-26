package c30;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import sq2.c;
import sq2.e;
import sq2.f;
import sq2.p;
import sq2.s;
import uj2.b;
import uj2.b0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lc30/a;", "", "", AnimatedTarget.PROPERTY_STATE, "Luj2/b0;", "Lokhttp3/ResponseBody;", "a", "(Ljava/lang/String;)Luj2/b0;", "", "value", "Luj2/b;", "c", "(Ljava/lang/String;I)Luj2/b;", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "", "Lcom/pinterest/api/adapter/coroutine/CompletedResponse;", "b", "(Ljava/lang/String;ILbl2/c;)Ljava/lang/Object;", "commentsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @f("users/state/{state}/")
    @NotNull
    b0<ResponseBody> a(@s("state") @NotNull String state);

    @p("users/state/{state}/")
    @e
    Object b(@s("state") @NotNull String str, @c("value") int i13, @NotNull bl2.c<? super NetworkResponse<Unit>> cVar);

    @p("users/state/{state}/")
    @NotNull
    @e
    b c(@s("state") @NotNull String state, @c("value") int value);
}
