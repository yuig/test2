package rq;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109271i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j2 f109272j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(j2 j2Var, int i13) {
        super(1);
        this.f109271i = i13;
        this.f109272j = j2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        oq.q0 q0Var;
        int i13 = this.f109271i;
        j2 j2Var = this.f109272j;
        switch (i13) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, kotlin.collections.e0.b(j2Var.isTabletLandscapeMode() ? vn1.b.START : vn1.b.CENTER_HORIZONTAL), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097147);
            default:
                is1.g0 g0Var = (is1.g0) obj;
                oq.p0 p0Var = null;
                if (g0Var instanceof is1.b0) {
                    i92.k kVar = j2Var.f109288c;
                    if (kVar == null) {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                    kVar.i(j2Var.getResources().getString(m60.x0.generic_error));
                    Throwable th3 = ((is1.b0) g0Var).f73576b;
                    p0Var = oq.p0.SHOW_TRANSLATION;
                } else if (g0Var instanceof is1.c0) {
                    j2Var.updateView();
                    p0Var = oq.p0.SHOW_TRANSLATION;
                } else if (g0Var instanceof is1.e0) {
                    j2Var.updateView();
                    p0Var = oq.p0.SHOW_ORIGINAL;
                }
                if (p0Var != null && (q0Var = j2Var.f109293h) != null) {
                    q0Var.a(p0Var);
                }
                return Unit.f80348a;
        }
    }
}
