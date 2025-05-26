package y90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138130r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f138131s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, bl2.c cVar) {
        super(2, cVar);
        this.f138131s = d0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b0 b0Var = new b0(this.f138131s, cVar);
        b0Var.f138130r = obj;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((d) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        d dVar = (d) this.f138130r;
        d0 d0Var = this.f138131s;
        d0Var.f138164t0.setValue(dVar);
        d0Var.f138165u0 = dVar.f138143b;
        androidx.appcompat.widget.c2 c2Var = d0Var.f138151g0;
        if (c2Var == null) {
            Intrinsics.r("effectsViewHelper");
            throw null;
        }
        m62.s sVar = dVar.f138144c;
        c2Var.B(sVar);
        n62.g gVar = d0Var.f138154j0;
        if (gVar == null) {
            Intrinsics.r("effectsPanelViewHelper");
            throw null;
        }
        gVar.c(sVar);
        m62.f0 f0Var = dVar.f138145d;
        if (f0Var != null) {
            n62.g gVar2 = d0Var.f138154j0;
            if (gVar2 == null) {
                Intrinsics.r("effectsPanelViewHelper");
                throw null;
            }
            gVar2.a(f0Var);
            d0Var.a8(new m(f0Var));
        }
        androidx.appcompat.widget.c2 c2Var2 = d0Var.f138157m0;
        if (c2Var2 != null) {
            c2Var2.B(sVar);
            return Unit.f80348a;
        }
        Intrinsics.r("effectsTextEditorViewHelper");
        throw null;
    }
}
