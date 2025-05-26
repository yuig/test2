package ti1;

import ao2.j0;
import kotlin.jvm.functions.Function0;
import ni1.t2;
import qa2.d0;
import so.ba;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117725i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f117726j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i13) {
        super(0);
        this.f117725i = i13;
        this.f117726j = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f117725i;
        o oVar = this.f117726j;
        switch (i13) {
            case 0:
                d0 d0Var = oVar.f117733g;
                j0 j0Var = oVar.f117729c;
                t2 t2Var = oVar.f117738l;
                return d0Var != null ? t2.a(t2Var, j0Var, new zw.a(d0Var), 6) : t2.a(t2Var, j0Var, null, 14);
            default:
                return ((ba) oVar.f117737k).a(oVar.f117730d, new g(oVar, 1), new h(oVar, 1));
        }
    }
}
