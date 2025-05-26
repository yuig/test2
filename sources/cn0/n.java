package cn0;

import ao2.j0;
import co2.b0;
import co2.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f28083r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f28084s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b0 f28085t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ z f28086u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u uVar, b0 b0Var, z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f28084s = uVar;
        this.f28085t = b0Var;
        this.f28086u = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f28084s, this.f28085t, this.f28086u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f28083r;
        u uVar = this.f28084s;
        if (i13 == 0) {
            ue.c.H(obj);
            i iVar = uVar.f28108a;
            this.f28083r = 1;
            iVar.getClass();
            obj = l0.j0(new pb.k(new d(iVar, this.f28085t, null)), iVar.f28077j);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        o1.f fVar = new o1.f(14, uVar, this.f28086u);
        this.f28083r = 2;
        if (((do2.i) obj).collect(fVar, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
