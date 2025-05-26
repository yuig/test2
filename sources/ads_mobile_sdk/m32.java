package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class m32 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.j8 f8072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.ld f8073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m32(a.j8 j8Var, a.ld ldVar, bl2.c cVar) {
        super(2, cVar);
        this.f8072b = j8Var;
        this.f8073c = ldVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m32(this.f8072b, this.f8073c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new m32(this.f8072b, this.f8073c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f8071a;
        if (i13 == 0) {
            ue.c.H(obj);
            a.j8 j8Var = this.f8072b;
            a.x5 x5Var = (a.x5) ((t32) this.f8073c).f11387a;
            this.f8071a = 1;
            if (j8Var.a(x5Var, this) == aVar) {
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
