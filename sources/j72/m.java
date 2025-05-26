package j72;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import r72.a2;
import r72.u1;

/* loaded from: classes4.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public a2 f74888r;

    /* renamed from: s, reason: collision with root package name */
    public int f74889s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f74890t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u1 f74891u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s f74892v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, u1 u1Var, bl2.c cVar) {
        super(2, cVar);
        this.f74891u = u1Var;
        this.f74892v = sVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m mVar = new m(this.f74892v, this.f74891u, cVar);
        mVar.f74890t = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        do2.j jVar;
        a2 a2Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74889s;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.j jVar2 = (do2.j) this.f74890t;
            u1 u1Var = this.f74891u;
            a2 a2Var2 = new a2(u1Var.f106669a);
            this.f74890t = jVar2;
            this.f74888r = a2Var2;
            this.f74889s = 1;
            s sVar = this.f74892v;
            Object M = kotlin.jvm.internal.j.M(this, sVar.f74910c.f89707c, new h(sVar, u1Var, null));
            if (M == aVar) {
                return aVar;
            }
            jVar = jVar2;
            obj = M;
            a2Var = a2Var2;
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            a2Var = this.f74888r;
            jVar = (do2.j) this.f74890t;
            ue.c.H(obj);
        }
        Pair pair = new Pair(a2Var, obj);
        this.f74890t = null;
        this.f74888r = null;
        this.f74889s = 2;
        if (jVar.emit(pair, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
