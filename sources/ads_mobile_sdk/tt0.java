package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class tt0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f11684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ku0 f11685b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt0(ku0 ku0Var, bl2.c cVar) {
        super(2, cVar);
        this.f11685b = ku0Var;
    }

    public static final void a(wi.g gVar) {
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new tt0(this.f11685b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new tt0(this.f11685b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11684a;
        if (i13 == 0) {
            ue.c.H(obj);
            ku0 ku0Var = this.f11685b;
            gt0 gt0Var = gt0.f5685c;
            a.hd hdVar = new a.hd(0);
            this.f11684a = 1;
            if (ku0Var.a(gt0Var, hdVar, this) == aVar) {
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
