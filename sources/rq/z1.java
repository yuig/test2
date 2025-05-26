package rq;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109682i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a2 f109683j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(a2 a2Var, int i13) {
        super(1);
        this.f109682i = i13;
        this.f109683j = a2Var;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f109682i;
        a2 a2Var = this.f109683j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, a2Var.f109091h, null, null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097133);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, a2Var.f109093j, null, kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097125);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, a2Var.f109091h, null, null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097133);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2("·"), a2Var.f109098o, null, null, null, 0, a2Var.f109096m ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f109682i) {
        }
        return b((rn1.a) obj);
    }
}
