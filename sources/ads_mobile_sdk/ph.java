package ads_mobile_sdk;

import a.wc;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ph extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh f9677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ln0 f9678c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a.b5 f9679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(qh qhVar, ln0 ln0Var, a.b5 b5Var, bl2.c cVar) {
        super(2, cVar);
        this.f9677b = qhVar;
        this.f9678c = ln0Var;
        this.f9679d = b5Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ph(this.f9677b, this.f9678c, this.f9679d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ph) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9676a;
        if (i13 == 0) {
            ue.c.H(obj);
            qh qhVar = this.f9677b;
            ln0 ln0Var = this.f9678c;
            r0 r0Var = qhVar.f12268f;
            y60 y60Var = (y60) ((a10) this.f9679d).M.get();
            this.f9676a = 1;
            if (wc.a(qhVar, ln0Var, r0Var, y60Var, this) == aVar) {
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
