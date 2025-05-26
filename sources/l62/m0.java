package l62;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import r72.u1;

/* loaded from: classes4.dex */
public final class m0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f81662r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n0 f81663s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u1 f81664t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f81665u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, u1 u1Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f81663s = n0Var;
        this.f81664t = u1Var;
        this.f81665u = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m0(this.f81663s, this.f81664t, this.f81665u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f81662r;
        n0 n0Var = this.f81663s;
        if (i13 == 0) {
            ue.c.H(obj);
            t72.j jVar = n0Var.f81669c;
            this.f81662r = 1;
            obj = jVar.m(this.f81664t, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        n72.k kVar = (n72.k) obj;
        boolean z13 = kVar instanceof n72.j;
        String str = this.f81665u;
        if (z13) {
            n0Var.f81667a.k(str, false, new s12.a(kVar, 18));
        } else if (kVar instanceof n72.i) {
            n0Var.f81667a.k(str, false, f0.f81636n);
        }
        return Unit.f80348a;
    }
}
