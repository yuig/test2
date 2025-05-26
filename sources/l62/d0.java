package l62;

import do2.t2;
import do2.y1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import r72.f2;
import r72.q1;

/* loaded from: classes4.dex */
public final class d0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f81626r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ vh.a f81627s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(vh.a aVar, bl2.c cVar) {
        super(2, cVar);
        this.f81627s = aVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d0 d0Var = new d0(this.f81627s, cVar);
        d0Var.f81626r = obj;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((f2) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        t2 t2Var;
        Object value;
        List list;
        q1 q1Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        f2 f2Var = (f2) this.f81626r;
        y1 y1Var = (y1) this.f81627s.f125803e;
        do {
            t2Var = (t2) y1Var;
            value = t2Var.getValue();
            list = f2Var.f106470b;
            q1Var = f2Var.f106476h;
        } while (!t2Var.h(value, a.a((a) value, list, false, false, q1Var.f106626a, false, q1Var.f106628c, 22)));
        return Unit.f80348a;
    }
}
