package c82;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.o;
import sq2.p;
import sq2.s;
import sq2.u;
import uj2.b0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH'¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lc82/e;", "", "", "", "params", "Luj2/b;", "b", "(Ljava/util/Map;)Luj2/b;", "Luj2/b0;", "a", "()Luj2/b0;", "pinId", "c", "(Ljava/lang/String;Ljava/util/Map;)Luj2/b;", "siteApi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface e {
    @o("users/me/create_web_session/")
    @NotNull
    b0<String> a();

    @f("offsite/")
    @NotNull
    uj2.b b(@NotNull @u Map<String, String> params);

    @p("pins/{pinId}/report_link/")
    @NotNull
    uj2.b c(@s("pinId") @NotNull String pinId, @NotNull @u Map<String, String> params);
}
