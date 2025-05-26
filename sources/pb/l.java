package pb;

import ao2.j0;
import i2.a2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tb.s;

/* loaded from: classes.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f99423r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a2 f99424s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f99425t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f99426u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a2 a2Var, s sVar, i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f99424s = a2Var;
        this.f99425t = sVar;
        this.f99426u = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f99424s, this.f99425t, this.f99426u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f99423r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            a2 a2Var = this.f99424s;
            s sVar = this.f99425t;
            do2.i j13 = a2Var.j(sVar);
            l5.c cVar = new l5.c(i14, this.f99426u, sVar);
            this.f99423r = 1;
            if (j13.collect(cVar, this) == aVar) {
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
