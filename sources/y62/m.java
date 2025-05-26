package y62;

import do2.t2;
import do2.y1;
import kg.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import r72.i1;
import r72.j1;
import u62.u;
import v.d3;

/* loaded from: classes4.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f137949r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d3 f137950s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d3 d3Var, bl2.c cVar) {
        super(2, cVar);
        this.f137950s = d3Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m mVar = new m(this.f137950s, cVar);
        mVar.f137949r = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((u62.c) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        t2 t2Var;
        Object value;
        g gVar;
        u uVar;
        j1 j1Var;
        j1 j1Var2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        u62.c cVar = (u62.c) this.f137949r;
        d3 d3Var = this.f137950s;
        y1 y1Var = (y1) d3Var.f123429e;
        do {
            t2Var = (t2) y1Var;
            value = t2Var.getValue();
            gVar = (g) value;
            uVar = cVar.f120828a;
            if (d3Var.f123426b) {
                d3Var.f123426b = false;
                j1Var = gVar.f137937d;
            } else {
                i1 i1Var = uVar.f120899b;
                j1 j1Var3 = j1.f106505f;
                if (i1Var != null) {
                    i1 i1Var2 = o.f137954a;
                    r72.a aVar2 = i1Var.f106499b;
                    if (aVar2 == null || (j1Var2 = aVar2.f106431a) == null) {
                        String str = i1Var.f106498a;
                        if (str != null) {
                            j1Var3 = p.v(str);
                        }
                    } else {
                        j1Var3 = j1Var2;
                    }
                }
                j1Var = j1Var3;
            }
        } while (!t2Var.h(value, g.a(gVar, uVar, null, null, j1Var, 6)));
        return Unit.f80348a;
    }
}
