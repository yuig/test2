package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes2.dex */
public final class a72 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public mo2.a f2298a;

    /* renamed from: b, reason: collision with root package name */
    public c72 f2299b;

    /* renamed from: c, reason: collision with root package name */
    public int f2300c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c72 f2302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a72(long j13, c72 c72Var, bl2.c cVar) {
        super(2, cVar);
        this.f2301d = j13;
        this.f2302e = c72Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a72(this.f2301d, this.f2302e, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a72(this.f2301d, this.f2302e, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        c72 c72Var;
        Object obj2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f2300c;
        if (i13 == 0) {
            ue.c.H(obj);
            long j13 = this.f2301d;
            this.f2300c = 1;
            if (l0.T(j13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c72Var = this.f2299b;
                Object obj3 = this.f2298a;
                ue.c.H(obj);
                obj2 = obj3;
                try {
                    ao2.x xVar = c72Var.f3798g;
                    ((mo2.c) obj2).i(null);
                    ((ao2.p1) xVar).e0();
                    return Unit.f80348a;
                } catch (Throwable th3) {
                    ((mo2.c) obj2).i(null);
                    throw th3;
                }
            }
            ue.c.H(obj);
        }
        c72 c72Var2 = this.f2302e;
        mo2.a aVar2 = c72Var2.f3796e;
        this.f2298a = aVar2;
        this.f2299b = c72Var2;
        this.f2300c = 2;
        mo2.c cVar = (mo2.c) aVar2;
        if (cVar.f(null, this) == aVar) {
            return aVar;
        }
        c72Var = c72Var2;
        obj2 = cVar;
        ao2.x xVar2 = c72Var.f3798g;
        ((mo2.c) obj2).i(null);
        ((ao2.p1) xVar2).e0();
        return Unit.f80348a;
    }
}
