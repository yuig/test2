package hn0;

import ao2.j0;
import co2.b0;
import dl2.j;
import do2.f0;
import ed.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f69612r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f69613s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b0 f69614t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, b0 b0Var, bl2.c cVar) {
        super(2, cVar);
        this.f69613s = eVar;
        this.f69614t = b0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f69613s, this.f69614t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f69612r;
        if (i13 == 0) {
            ue.c.H(obj);
            e eVar = this.f69613s;
            eVar.f69618a.f62614a.seekTo(0L, 0);
            f0 f0Var = new f0(l0.D(new d(eVar, null)), new l(3, null));
            b bVar = new b(new g(eVar.f69618a, this.f69614t, eVar.f69619b), 0);
            this.f69612r = 1;
            if (f0Var.collect(bVar, this) == aVar) {
                return aVar;
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
