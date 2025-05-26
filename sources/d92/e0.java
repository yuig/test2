package d92;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class e0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f54138r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f0 f54139s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f54140t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f54139s = f0Var;
        this.f54140t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e0(this.f54139s, this.f54140t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f54138r;
        if (i13 == 0) {
            ue.c.H(obj);
            z82.b bVar = this.f54139s.f54142a;
            this.f54138r = 1;
            obj = ((z82.j) bVar).a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        u50.r rVar = this.f54140t;
        if (obj != null) {
            rVar.a(x.f54196a);
        } else {
            rVar.a(r.f54184a);
        }
        return Unit.f80348a;
    }
}
