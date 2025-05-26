package pb;

import android.net.NetworkRequest;
import co2.y;
import co2.z;
import k1.v0;
import kb.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f99410r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f99411s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kb.g f99412t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f99413u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kb.g gVar, g gVar2, bl2.c cVar) {
        super(2, cVar);
        this.f99412t = gVar;
        this.f99413u = gVar2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f99412t, this.f99413u, cVar);
        fVar.f99411s = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f99410r;
        if (i13 == 0) {
            ue.c.H(obj);
            z zVar = (z) this.f99411s;
            NetworkRequest d2 = this.f99412t.d();
            if (d2 == null) {
                y yVar = (y) zVar;
                yVar.getClass();
                yVar.r(null);
                return Unit.f80348a;
            }
            g gVar = this.f99413u;
            e eVar = new e(kotlin.jvm.internal.j.z(zVar, null, null, new d(gVar, zVar, null), 3), zVar);
            b0.e().a(m.f99427a, "NetworkRequestConstraintController register callback");
            gVar.f99414a.registerNetworkCallback(d2, eVar);
            v0 v0Var = new v0(20, gVar, eVar);
            this.f99410r = 1;
            if (dl2.b.w(zVar, v0Var, this) == aVar) {
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
