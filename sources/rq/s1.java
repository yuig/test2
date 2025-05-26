package rq;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109538i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u1 f109539j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(u1 u1Var, int i13) {
        super(1);
        this.f109538i = i13;
        this.f109539j = u1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f109538i;
        u1 u1Var = this.f109539j;
        switch (i13) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, u1Var.f109578k ? vn1.g.UI_300 : vn1.g.HEADING_400, 1, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096975);
            default:
                is1.g0 g0Var = (is1.g0) obj;
                if ((g0Var instanceof is1.f0) || (g0Var instanceof is1.d0)) {
                    if (u1Var.f109577j) {
                        u1Var.b();
                    }
                    u1Var.e();
                }
                return Unit.f80348a;
        }
    }
}
