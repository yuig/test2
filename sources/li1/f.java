package li1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f83543r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f83544s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f83545t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f83544s = rVar;
        this.f83545t = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f83544s, this.f83545t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f83543r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.i d2 = this.f83544s.f83581a.d();
            e eVar = new e(this.f83545t, null);
            this.f83543r = 1;
            if (l0.I(d2, eVar, this) == aVar) {
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
