package l62;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;
import r72.l1;

/* loaded from: classes4.dex */
public final class x implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f81693a;

    public x(a0 a0Var) {
        this.f81693a = a0Var;
    }

    @Override // l62.d
    public final void E(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81693a.f81618d.invoke(new n(id3));
    }

    @Override // l62.d
    public final void H(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81693a.f81618d.invoke(new o(id3));
    }

    @Override // l62.d
    public final void L(int i13, String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81693a.f81618d.invoke(new q(id3, i13));
    }

    @Override // l62.d
    public final void N() {
        this.f81693a.f81618d.invoke(g.f81638a);
    }

    @Override // l62.d
    public final void d(int i13, String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81693a.f81618d.invoke(new p(id3, i13));
    }

    @Override // l62.d
    public final void i(PointF location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f81693a.f81618d.invoke(new h(location));
    }

    @Override // l62.d
    public final void o(int i13, String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81693a.f81618d.invoke(new r(id3, i13));
    }

    @Override // l62.d
    public final void s(String id3, l1 offset, double d2, double d13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.f81693a.f81618d.invoke(new l(id3, offset, d2, d13));
    }

    @Override // l62.d
    public final void v(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81693a.f81618d.invoke(new m(id3));
    }
}
