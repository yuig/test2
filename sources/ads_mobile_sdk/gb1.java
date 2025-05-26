package ads_mobile_sdk;

import android.os.SystemClock;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gb1 extends cs2 {

    /* renamed from: g, reason: collision with root package name */
    public final jw1 f5498g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb1(il0 cuiName, List tags, UUID rootTraceId, ss2 traceMetaSet, int i13, int i14, cs2 cs2Var, boolean z13) {
        super(cuiName, traceMetaSet, cs2Var, dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS), z13, 0);
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(rootTraceId, "rootTraceId");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        zn2.a aVar = zn2.b.f142311b;
        this.f5498g = new jw1(i14, traceMetaSet, cuiName, tags, rootTraceId, cs2Var != null ? cs2Var.d() : -1, i13, zn2.b.e(b()), null, 268435200);
    }

    @Override // ads_mobile_sdk.cs2
    public final cs2 a(il0 cuiName, List tags, boolean z13) {
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        jw1 jw1Var = this.f5498g;
        return new gb1(cuiName, tags, jw1Var.f6983e, this.f4018a, jw1Var.f6985g + 1, jw1Var.f6979a + 1, this, z13);
    }

    @Override // ads_mobile_sdk.cs2
    public final jw1 f() {
        return this.f5498g;
    }

    @Override // ads_mobile_sdk.cs2
    public final void h() {
        jw1 jw1Var = this.f5498g;
        zn2.a aVar = zn2.b.f142311b;
        jw1Var.f6991m = zn2.b.j(dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS), this.f4020c);
    }
}
