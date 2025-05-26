package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class r1 extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f10411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f10412b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var, bl2.c cVar) {
        super(1, cVar);
        this.f10412b = s1Var;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new r1(this.f10412b, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new r1(this.f10412b, (bl2.c) obj).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f10411a;
        if (i13 == 0) {
            ue.c.H(obj);
            zr zrVar = this.f10412b.f10901b;
            this.f10411a = 1;
            obj = zrVar.k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
