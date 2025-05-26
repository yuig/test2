package mq;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import x02.i2;
import zp.n0;

/* loaded from: classes3.dex */
public final class r implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f88014a;

    public r(u uVar) {
        this.f88014a = uVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull is1.w event) {
        uj2.q qVar;
        Intrinsics.checkNotNullParameter(event, "event");
        u uVar = this.f88014a;
        se2.a aVar = uVar.f88036x0;
        if (aVar == null) {
            Intrinsics.r("mediaGalleryUtils");
            throw null;
        }
        ((rw0.f) ((bf2.b) aVar).get()).getClass();
        if (rw0.f.h().containsKey(event.f73653b)) {
            return;
        }
        se2.a aVar2 = uVar.f88036x0;
        if (aVar2 == null) {
            Intrinsics.r("mediaGalleryUtils");
            throw null;
        }
        ((rw0.f) ((bf2.b) aVar2).get()).getClass();
        rw0.f.b(event.f73653b);
        String str = event.f73652a;
        Intrinsics.checkNotNullExpressionValue(str, "getPath(...)");
        if (str.length() > 0) {
            if (uVar.h8()) {
                androidx.lifecycle.z viewLifecycleOwner = uVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new p(uVar, null), 3);
                return;
            }
            String f83 = uVar.f8();
            if (f83.length() > 0) {
                i2 i2Var = uVar.f88035w0;
                if (i2Var == null) {
                    Intrinsics.r("pinRepository");
                    throw null;
                }
                qVar = i2Var.P(f83);
            } else {
                qVar = jk2.h0.f76488a;
                Intrinsics.checkNotNullExpressionValue(qVar, "empty(...)");
            }
            uVar.f88033u0.a(qVar.H(tk2.e.f118017c).A(wj2.c.a()).F(new n0(19, new q(uVar, 0)), new n0(20, d.f87964l), ck2.i.f27923c, ck2.i.f27924d));
        }
    }
}
