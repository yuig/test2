package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nm.s;

/* loaded from: classes2.dex */
public final class zi1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dj1 f14793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f14794c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f14795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi1(dj1 dj1Var, s sVar, boolean z13, bl2.c cVar) {
        super(2, cVar);
        this.f14793b = dj1Var;
        this.f14794c = sVar;
        this.f14795d = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new zi1(this.f14793b, this.f14794c, this.f14795d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zi1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f14792a;
        if (i13 == 0) {
            ue.c.H(obj);
            dj1 dj1Var = this.f14793b;
            nm.u a13 = k41.a(this.f14794c);
            boolean z13 = this.f14795d;
            this.f14792a = 1;
            int i14 = dj1.f4303h;
            obj = dj1Var.a(a13, z13, this);
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
