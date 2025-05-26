package qm0;

import com.pinterest.feature.board.detail.floatingtoolbar.FloatingToolbarView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f104297r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p0 f104298s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p0 p0Var, bl2.c cVar) {
        super(2, cVar);
        this.f104298s = p0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        l0 l0Var = new l0(this.f104298s, cVar);
        l0Var.f104297r = obj;
        return l0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f104297r;
        int i13 = p0.f104322d1;
        p0 p0Var = this.f104298s;
        p0Var.getClass();
        p0Var.f104323a1 = bVar.f104245e;
        p0Var.Z0.setValue(bVar.f104241a);
        FloatingToolbarView floatingToolbarView = p0Var.S0;
        if (floatingToolbarView == null) {
            Intrinsics.r("boardTools");
            throw null;
        }
        floatingToolbarView.x(bVar.f104244d.f113049a, new n0(p0Var, 7), new n0(p0Var, 8));
        wm0.f fVar = p0Var.T0;
        if (fVar != null) {
            fVar.a(bVar.f104243c);
        }
        return Unit.f80348a;
    }
}
