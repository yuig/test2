package pm0;

import ao2.j0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes5.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f100671r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f100672s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f100673t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f100674u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u50.r f100675v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f100673t = jVar;
        this.f100674u = str;
        this.f100675v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f100673t, this.f100674u, this.f100675v, cVar);
        iVar.f100672s = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        wy0 f13;
        l lVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f100671r;
        int i14 = 2;
        bl2.c cVar = null;
        u50.r rVar = this.f100675v;
        j jVar = this.f100673t;
        if (i13 == 0) {
            ue.c.H(obj);
            f13 = ((b60.d) jVar.f100677b).f();
            if (f13 == null) {
                rVar.a(new v(new IllegalStateException("No active (logged-in) user available")));
                return Unit.f80348a;
            }
            do2.j0 j0Var = new do2.j0(ve.h.z(jVar.f100678c, this.f100674u), new d(jVar, rVar, cVar, i14));
            this.f100672s = f13;
            this.f100671r = 1;
            obj = l0.h0(j0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 == 2) {
                    ue.c.H(obj);
                    lVar = (l) obj;
                    rVar.a(new w(lVar));
                    return Unit.f80348a;
                }
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                lVar = (l) obj;
                rVar.a(new w(lVar));
                return Unit.f80348a;
            }
            f13 = (wy0) this.f100672s;
            ue.c.H(obj);
        }
        v7 v7Var = (v7) obj;
        if (v7Var == null) {
            return Unit.f80348a;
        }
        String id3 = f13.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        r rVar2 = new r(id3, v7Var);
        wy0 k13 = v7Var.k1();
        String id4 = k13 != null ? k13.getId() : null;
        if (id4 == null) {
            id4 = "";
        }
        if (dl2.b.S1(f13, id4)) {
            this.f100672s = null;
            this.f100671r = 2;
            obj = j.k(jVar, rVar2, rVar, this);
            if (obj == aVar) {
                return aVar;
            }
            lVar = (l) obj;
            rVar.a(new w(lVar));
            return Unit.f80348a;
        }
        this.f100672s = null;
        this.f100671r = 3;
        obj = j.j(jVar, rVar2, rVar, this);
        if (obj == aVar) {
            return aVar;
        }
        lVar = (l) obj;
        rVar.a(new w(lVar));
        return Unit.f80348a;
    }
}
