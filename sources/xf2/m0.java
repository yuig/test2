package xf2;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final Map f134878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String url, int i13) {
        super(i.f134864e, "breadcrumb");
        if (i13 != 6) {
            Intrinsics.checkNotNullParameter(url, "message");
            this.f134878d = y0.b(new Pair("message", url));
        } else {
            Intrinsics.checkNotNullParameter(url, "url");
            super(b0.f134849d, "web-view");
            this.f134878d = kg.p.e0(y0.b(new Pair(sj2.f.f113036a.f108404b, url)));
        }
    }

    @Override // xf2.q0
    public final Map a() {
        return this.f134878d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(s0 attributes) {
        super(m.f134875e);
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f134878d = attributes.c();
    }

    public m0() {
        super(d.f134854d, "memory-warning");
        this.f134878d = z0.d();
    }

    public m0(int i13) {
        super(f.f134859d, "thermal-state");
        this.f134878d = y0.b(new Pair("status", String.valueOf(i13)));
    }
}
