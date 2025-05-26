package fa1;

import com.pinterest.api.model.v7;
import ea1.c1;
import ea1.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import p91.y;
import u50.r;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61547i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c1 f61548j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r f61549k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f61550l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c1 c1Var, n nVar, r rVar) {
        super(1);
        this.f61548j = c1Var;
        this.f61550l = nVar;
        this.f61549k = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        int i13 = this.f61547i;
        n nVar = this.f61550l;
        r rVar = this.f61549k;
        c1 c1Var = this.f61548j;
        switch (i13) {
            case 0:
                v7 v7Var = (v7) obj;
                if (c1Var.f58040b != null) {
                    Intrinsics.f(v7Var);
                    nVar.getClass();
                    String str = c1Var.f58040b;
                    if (str != null) {
                        ek2.j jVar = nVar.f61586g;
                        if (jVar != null && !jVar.isDisposed()) {
                            bk2.c.dispose(jVar);
                        }
                        nVar.f61586g = (ek2.j) nVar.f61584e.L(str).H(tk2.e.f118017c).A(wj2.c.a()).F(new y(24, new da1.b(rVar, v7Var, 2)), new y(25, new rx0.f(c1Var, rVar, v7Var, 21)), ck2.i.f27923c, ck2.i.f27924d);
                    }
                    unit = Unit.f80348a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    Intrinsics.f(v7Var);
                    rVar.a(new ea1.j(v7Var, null));
                }
                break;
            default:
                Throwable th3 = (Throwable) obj;
                if (c1Var.f58041c) {
                    e82.f fVar = nVar.f61582c;
                    rVar.a(new ea1.i(fVar.f57841k, fVar.f57842l, fVar.f57843m));
                } else {
                    Intrinsics.f(th3);
                    rVar.a(new q(th3));
                }
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c1 c1Var, r rVar, n nVar) {
        super(1);
        this.f61548j = c1Var;
        this.f61549k = rVar;
        this.f61550l = nVar;
    }
}
