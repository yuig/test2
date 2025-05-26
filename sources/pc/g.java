package pc;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f99551a;

    /* renamed from: b, reason: collision with root package name */
    public UUID f99552b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f99553c;

    /* renamed from: d, reason: collision with root package name */
    public f0 f99554d;

    /* renamed from: e, reason: collision with root package name */
    public List f99555e;

    /* renamed from: f, reason: collision with root package name */
    public Map f99556f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f99557g;

    public g(o0 operation, UUID requestUuid, n0 n0Var) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
        this.f99551a = operation;
        this.f99552b = requestUuid;
        this.f99553c = n0Var;
        this.f99554d = y.f99612b;
    }

    public final void a(f0 executionContext) {
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        this.f99554d = this.f99554d.c(executionContext);
    }

    public final h b() {
        UUID uuid = this.f99552b;
        f0 f0Var = this.f99554d;
        Map map = this.f99556f;
        if (map == null) {
            map = z0.d();
        }
        List list = this.f99555e;
        boolean z13 = this.f99557g;
        return new h(uuid, this.f99551a, this.f99553c, list, map, f0Var, z13);
    }
}
