package k81;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.o4;
import lh0.z3;

/* loaded from: classes5.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78596i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f78597j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(l lVar, int i13) {
        super(0);
        this.f78596i = i13;
        this.f78597j = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f78596i) {
            case 0:
                o4 o4Var = this.f78597j.f78645t;
                o4Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) o4Var.f83453a;
                break;
            case 1:
                m168invoke();
                break;
            default:
                m168invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m168invoke() {
        int i13 = this.f78596i;
        l lVar = this.f78597j;
        switch (i13) {
            case 1:
                lVar.f78648u0 = false;
                break;
            default:
                i81.d dVar = (i81.d) lVar.getViewIfBound();
                if (dVar != null) {
                    f91.b bVar = ((l81.l) dVar).E1;
                    o80.j A = bVar != null ? bVar.A() : null;
                    if (A != null) {
                        A.o(true);
                    }
                }
                i81.d dVar2 = (i81.d) lVar.getViewIfBound();
                if (dVar2 != null) {
                    ((l81.l) dVar2).N9(true);
                    break;
                }
                break;
        }
    }
}
