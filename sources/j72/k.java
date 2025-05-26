package j72;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import r72.u1;

/* loaded from: classes4.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f74880r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f74881s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f74882t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u1 f74883u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s sVar, u1 u1Var, bl2.c cVar) {
        super(2, cVar);
        this.f74882t = sVar;
        this.f74883u = u1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k kVar = new k(this.f74882t, this.f74883u, cVar);
        kVar.f74881s = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((Throwable) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74880r;
        if (i13 == 0) {
            ue.c.H(obj);
            Throwable th3 = (Throwable) this.f74881s;
            s sVar = this.f74882t;
            n72.m mVar = sVar.f74911d;
            u1 u1Var = this.f74883u;
            mVar.b("Error uploading image: " + u1Var.f106669a, n72.l.VERBOSE);
            boolean z13 = th3 instanceof IOException;
            Boolean valueOf = Boolean.valueOf(z13);
            if (!z13) {
                return valueOf;
            }
            sVar.f74911d.a(new j(u1Var, 0));
            this.f74881s = valueOf;
            this.f74880r = 1;
            if (l0.S(1000L, this) == aVar) {
                return aVar;
            }
            bool = valueOf;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bool = (Boolean) this.f74881s;
            ue.c.H(obj);
        }
        return bool;
    }
}
