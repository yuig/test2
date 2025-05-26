package n31;

import k22.m;
import kotlin.jvm.internal.Intrinsics;
import nr0.j;
import tk2.e;
import uj2.q;
import yk1.v;

/* loaded from: classes5.dex */
public final class c extends xk1.c implements j {

    /* renamed from: k, reason: collision with root package name */
    public final m f89160k;

    /* renamed from: l, reason: collision with root package name */
    public final v f89161l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m userService, v resources, a cta) {
        super(null);
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(cta, "cta");
        this.f89160k = userService;
        this.f89161l = resources;
        o(7654320, new yi0.a(11, this, cta));
    }

    @Override // nr0.g
    public final boolean c3(int i13) {
        return true;
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 7654320;
    }

    @Override // xk1.c
    public final q k() {
        q u13 = this.f89160k.L(n00.b.a(n00.c.BOARD_METADATA_FIELDS)).k(new wv0.a(27, b.f89159i)).r(e.f118017c).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }
}
