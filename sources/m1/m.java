package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85447r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85448s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s3 f85449t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o f85450u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f85451v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ao2.o1 f85452w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s3 s3Var, o oVar, e eVar, ao2.o1 o1Var, bl2.c cVar) {
        super(2, cVar);
        this.f85449t = s3Var;
        this.f85450u = oVar;
        this.f85451v = eVar;
        this.f85452w = o1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m mVar = new m(this.f85449t, this.f85450u, this.f85451v, this.f85452w, cVar);
        mVar.f85448s = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((l2) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85447r;
        if (i13 == 0) {
            ue.c.H(obj);
            l2 l2Var = (l2) this.f85448s;
            o oVar = this.f85450u;
            e eVar = this.f85451v;
            float M0 = o.M0(oVar, eVar);
            s3 s3Var = this.f85449t;
            s3Var.f85576e = M0;
            o oVar2 = this.f85450u;
            k kVar = new k(oVar2, s3Var, this.f85452w, l2Var, 0);
            l lVar = new l(oVar2, s3Var, eVar);
            this.f85447r = 1;
            if (s3Var.a(kVar, lVar, this) == aVar) {
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
