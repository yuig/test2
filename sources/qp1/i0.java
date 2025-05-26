package qp1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class i0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f104792r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0 f104793s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f104794t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f104793s = l0Var;
        this.f104794t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i0(this.f104793s, this.f104794t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f104792r;
        if (i13 == 0) {
            ue.c.H(obj);
            np1.j jVar = this.f104793s.f104803a;
            this.f104792r = 1;
            obj = ((np1.i) jVar).a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        u50.r rVar = this.f104794t;
        if (obj != null) {
            rVar.a(a0.f104749a);
        } else {
            rVar.a(u.f104844a);
        }
        return Unit.f80348a;
    }
}
