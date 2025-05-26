package aa1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class u extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x f1676r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f1677s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p70.e f1678t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f1679u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, j0 j0Var, p70.e eVar, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f1676r = xVar;
        this.f1677s = j0Var;
        this.f1678t = eVar;
        this.f1679u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u(this.f1676r, this.f1677s, this.f1678t, this.f1679u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        x xVar = this.f1676r;
        boolean z13 = xVar instanceof w;
        j0 j0Var = this.f1677s;
        p70.e eVar = this.f1678t;
        if (z13) {
            kotlin.jvm.internal.j.z(j0Var, null, null, new s(eVar, this.f1679u, null), 3);
        } else if (xVar instanceof v) {
            kotlin.jvm.internal.j.z(j0Var, null, null, new t(eVar, null), 3);
        }
        return Unit.f80348a;
    }
}
