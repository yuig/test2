package m1;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85463r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85464s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f85465t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s3 f85466u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f85467v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, s3 s3Var, e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f85465t = oVar;
        this.f85466u = s3Var;
        this.f85467v = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        n nVar = new n(this.f85465t, this.f85466u, this.f85467v, cVar);
        nVar.f85464s = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85463r;
        o oVar = this.f85465t;
        try {
            try {
                if (i13 == 0) {
                    ue.c.H(obj);
                    ao2.o1 z13 = ao2.m0.z(((ao2.j0) this.f85464s).getCoroutineContext());
                    oVar.f85487w = true;
                    o2 o2Var = oVar.f85479o;
                    k1.v1 v1Var = k1.v1.Default;
                    m mVar = new m(this.f85466u, oVar, this.f85467v, z13, null);
                    this.f85463r = 1;
                    if (o2Var.e(v1Var, mVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                }
                oVar.f85482r.b();
                oVar.f85487w = false;
                oVar.f85482r.a(null);
                oVar.f85485u = false;
                return Unit.f80348a;
            } catch (CancellationException e13) {
                throw e13;
            }
        } catch (Throwable th3) {
            oVar.f85487w = false;
            oVar.f85482r.a(null);
            oVar.f85485u = false;
            throw th3;
        }
    }
}
