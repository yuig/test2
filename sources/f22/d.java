package f22;

import com.pinterest.api.model.wy0;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.o;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\u00020\f2\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H'¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H'¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH'¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0016\u001a\u00020\f2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0002H'¢\u0006\u0004\b\u0019\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lf22/d;", "", "Luj2/b0;", "Lf22/e;", "h", "()Luj2/b0;", "", "", "parameters", "Lcom/pinterest/api/model/wy0;", "f", "(Ljava/util/Map;)Luj2/b0;", "Luj2/b;", "c", "(Ljava/util/Map;)Luj2/b;", "Lrq0/a;", "a", "e", "()Luj2/b;", "d", "reason", "explanation", "b", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "Lf22/b;", "g", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface d {
    @f("partners/me/deactivation/permission/")
    @NotNull
    b0<rq0.a> a();

    @o("users/me/")
    @NotNull
    uj2.b b(@t("self_deactivation_reason") String reason, @t("self_deactivation_explanation") String explanation);

    @o("users/settings/")
    @NotNull
    @sq2.e
    uj2.b c(@sq2.d @NotNull Map<String, String> parameters);

    @o("users/request_delete/")
    @NotNull
    uj2.b d();

    @sq2.b("partners/me/")
    @NotNull
    uj2.b e();

    @o("users/settings/")
    @NotNull
    @sq2.e
    b0<wy0> f(@sq2.d @NotNull Map<String, String> parameters);

    @f("partners/me/deactivation/permission/")
    @NotNull
    b0<b> g();

    @f("connect/etsy_request_temporary_credentials")
    @NotNull
    b0<e> h();
}
