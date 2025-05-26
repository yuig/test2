package cr1;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.p;
import sq2.s;
import sq2.t;
import sq2.u;
import uj2.b0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcr1/e;", "", "", "handlerPath", "", "params", "Luj2/b0;", "Lvd0/c;", "b", "(Ljava/lang/String;Ljava/util/Map;)Luj2/b0;", "fields", "a", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface e {
    @sq2.f("feed_ingestion/feeds/{handler}/")
    @NotNull
    b0<vd0.c> a(@s(encoded = true, value = "handler") @NotNull String handlerPath, @t("fields") String fields);

    @p("feed_ingestion/feeds/{handler}/")
    @NotNull
    b0<vd0.c> b(@s(encoded = true, value = "handler") @NotNull String handlerPath, @NotNull @u Map<String, String> params);
}
