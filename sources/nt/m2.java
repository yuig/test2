package nt;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92102i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p1 f92103j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2(p1 p1Var, int i13) {
        super(1);
        this.f92102i = i13;
        this.f92103j = p1Var;
    }

    public final rn1.a b(rn1.a state) {
        int i13 = this.f92102i;
        p1 p1Var = this.f92103j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, bs1.c.j2(new String[0], p1Var.f92134b), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, bs1.c.j2(new String[0], p1Var.f92134b), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f92102i) {
            case 0:
                an1.l it = (an1.l) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return b((rn1.a) obj);
    }
}
