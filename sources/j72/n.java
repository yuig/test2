package j72;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import r72.u1;

/* loaded from: classes4.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f74893r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f74894s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f74895t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u1 f74896u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, u1 u1Var, bl2.c cVar) {
        super(2, cVar);
        this.f74895t = sVar;
        this.f74896u = u1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        n nVar = new n(this.f74895t, this.f74896u, cVar);
        nVar.f74894s = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((Throwable) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74893r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            boolean z13 = ((Throwable) this.f74894s) instanceof IOException;
            Boolean valueOf = Boolean.valueOf(z13);
            if (!z13) {
                return valueOf;
            }
            this.f74895t.f74911d.a(new j(this.f74896u, i14));
            this.f74894s = valueOf;
            this.f74893r = 1;
            if (l0.S(1000L, this) == aVar) {
                return aVar;
            }
            bool = valueOf;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bool = (Boolean) this.f74894s;
            ue.c.H(obj);
        }
        return bool;
    }
}
