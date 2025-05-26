package tw0;

import com.pinterest.api.model.uv;
import com.pinterest.api.model.vv;
import com.pinterest.feature.metrics.exceptions.EmptyConnectionMetricsCollectionException;
import fk2.f0;
import java.util.List;
import kk2.t;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.s;
import uj2.q;

/* loaded from: classes.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119599i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f119600j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j0 f119601k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(g gVar, j0 j0Var, int i13) {
        super(1);
        this.f119599i = i13;
        this.f119600j = gVar;
        this.f119601k = j0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long absoluteTimeout;
        int i13 = this.f119599i;
        j0 j0Var = this.f119601k;
        g gVar = this.f119600j;
        switch (i13) {
            case 0:
                vv config = (vv) obj;
                Intrinsics.checkNotNullParameter(config, "it");
                j0Var.f80434a = config;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(config, "config");
                uv uvVar = new uv(null, null, 3, null);
                vv.b timeout = config.getTimeout();
                long longValue = (timeout == null || (absoluteTimeout = timeout.getAbsoluteTimeout()) == null) ? 5000L : absoluteTimeout.longValue();
                List endpoints = config.getEndpoints();
                if (endpoints == null) {
                    endpoints = q0.f80391a;
                }
                t r13 = new f0(q.w(endpoints).t(new wv0.a(5, new d(config, gVar, longValue))), uvVar, new ep.g(14, e.f119608i)).r(tk2.e.f118017c);
                Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
                return r13;
            default:
                uv metricsCollection = (uv) obj;
                Intrinsics.checkNotNullParameter(metricsCollection, "metricsCollection");
                if (metricsCollection.getMetrics().size() <= 0) {
                    return uj2.b.g(new EmptyConnectionMetricsCollectionException());
                }
                p20.a aVar = gVar.f119612a;
                Object obj2 = j0Var.f80434a;
                if (obj2 == null) {
                    Intrinsics.r("configuration");
                    throw null;
                }
                String adapterEndpoint = ((vv) obj2).getAdapterEndpoint();
                if (adapterEndpoint == null) {
                    adapterEndpoint = "";
                }
                return aVar.b(adapterEndpoint, metricsCollection).l(tk2.e.f118017c);
        }
    }
}
