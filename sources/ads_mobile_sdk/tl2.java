package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class tl2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f11589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aj.t f11590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jj2 f11591c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj.r f11592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl2(aj.t tVar, jj2 jj2Var, aj.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f11590b = tVar;
        this.f11591c = jj2Var;
        this.f11592d = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new tl2(this.f11590b, this.f11591c, this.f11592d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tl2) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11589a;
        if (i13 == 0) {
            ue.c.H(obj);
            aj.t tVar = this.f11590b;
            jj2 jj2Var = this.f11591c;
            aj.r rVar = this.f11592d;
            this.f11589a = 1;
            if (tVar.a(jj2Var, rVar, this) == aVar) {
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
