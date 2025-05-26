package b2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import w1.y1;

/* loaded from: classes2.dex */
public final class w extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public int f21250s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f21251t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f21252u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ bn0.a f21253v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y1 f21254w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(k kVar, bn0.a aVar, y1 y1Var, bl2.c cVar) {
        super(2, cVar);
        this.f21252u = kVar;
        this.f21253v = aVar;
        this.f21254w = y1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        w wVar = new w(this.f21252u, this.f21253v, this.f21254w, cVar);
        wVar.f21251t = obj;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((n3.l0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        n3.l0 l0Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f21250s;
        if (i13 == 0) {
            ue.c.H(obj);
            l0Var = (n3.l0) this.f21251t;
            this.f21251t = l0Var;
            this.f21250s = 1;
            obj = f0.h.h(l0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2 && i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            l0Var = (n3.l0) this.f21251t;
            ue.c.H(obj);
        }
        n3.j jVar = (n3.j) obj;
        if (f0.h.d0(jVar) && (jVar.f89072c & 33) != 0) {
            int size = jVar.f89070a.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (!((n3.q) r5.get(i14)).m()) {
                }
            }
            this.f21251t = null;
            this.f21250s = 2;
            if (f0.h.i(l0Var, this.f21252u, this.f21253v, jVar, this) == aVar) {
                return aVar;
            }
            return Unit.f80348a;
        }
        if (!f0.h.d0(jVar)) {
            this.f21251t = null;
            this.f21250s = 3;
            if (f0.h.j(l0Var, this.f21254w, jVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
