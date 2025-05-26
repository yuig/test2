package l1;

import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n3.w;

/* loaded from: classes2.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f81322r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f81323s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f81324t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, bl2.c cVar) {
        super(2, cVar);
        this.f81324t = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e eVar = new e(this.f81324t, cVar);
        eVar.f81323s = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f81322r;
        if (i13 == 0) {
            ue.c.H(obj);
            w wVar = (w) this.f81323s;
            q0.e eVar = new q0.e(this.f81324t, 8);
            this.f81322r = 1;
            Object w13 = u2.w(wVar, new f(eVar, null), this);
            if (w13 != obj2) {
                w13 = Unit.f80348a;
            }
            if (w13 == obj2) {
                return obj2;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
