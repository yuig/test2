package j72;

import ao2.j0;
import do2.p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import r72.b1;
import r72.u1;

/* loaded from: classes4.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f74884r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f74885s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f74886t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u1 f74887u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar, u1 u1Var, bl2.c cVar) {
        super(2, cVar);
        this.f74886t = sVar;
        this.f74887u = u1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        l lVar = new l(this.f74886t, this.f74887u, cVar);
        lVar.f74885s = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74884r;
        u1 u1Var = this.f74887u;
        s sVar = this.f74886t;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f74885s;
            p0 e13 = l0.e1(new pb.k(new i(sVar, u1Var, null)), new k(sVar, u1Var, null));
            this.f74885s = j0Var;
            this.f74884r = 1;
            obj = l0.h0(e13, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        b1 b1Var = (b1) obj;
        if (b1Var != null) {
            return b1Var;
        }
        sVar.f74911d.b("Failed to upload image for " + u1Var.f106669a, n72.l.VERBOSE);
        throw new IllegalStateException("Failed to upload image for " + u1Var.f106669a);
    }
}
