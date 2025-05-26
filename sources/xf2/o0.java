package xf2;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final Map f134882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(String viewName) {
        super(a0.f134846d, "screen-view");
        Intrinsics.checkNotNullParameter(viewName, "viewName");
        this.f134882d = y0.b(new Pair("view.name", viewName));
    }

    @Override // xf2.q0
    public final Map a() {
        return this.f134882d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(qg2.k networkStatus) {
        super(s.f134893e, "network-status");
        Intrinsics.checkNotNullParameter(networkStatus, "networkStatus");
        this.f134882d = kg.p.e0(y0.b(new Pair("network", networkStatus.getValue())));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(s0 attributes, int i13) {
        super(o.f134881e);
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            super(j.f134867e);
            this.f134882d = attributes.c();
        } else if (i13 == 2) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            super(q.f134886e);
            this.f134882d = attributes.c();
        } else if (i13 != 4) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.f134882d = attributes.c();
        } else {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            super(v.f134900e);
            this.f134882d = attributes.c();
        }
    }
}
