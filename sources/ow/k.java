package ow;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public ww.g f97814r;

    /* renamed from: s, reason: collision with root package name */
    public int f97815s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p0 f97816t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f97817u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p0 p0Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f97816t = p0Var;
        this.f97817u = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f97816t, this.f97817u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        ww.g gVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f97815s;
        p0 p0Var = this.f97816t;
        if (i13 == 0) {
            ue.c.H(obj);
            ww.g gVar2 = (ww.g) p0Var.f97871m.get(this.f97817u);
            fn.i iVar = gVar2 != null ? gVar2.f131165c : null;
            pw.a aVar2 = p0Var.f97861c;
            if (iVar == null || gVar2.f131166d == null) {
                ((pw.c) aVar2).c(gVar2 != null ? gVar2.f131164b : null, new Throwable("Attempting to mark creative loaded event for ad session or ad events that do not exist."));
                return Unit.f80348a;
            }
            if (gVar2.f131169g) {
                ((pw.c) aVar2).getClass();
                Intrinsics.checkNotNullParameter("Deduplicated creative loaded event for ad session.", "message");
                return Unit.f80348a;
            }
            gVar2.f131169g = true;
            j jVar = new j(p0Var, gVar2, null);
            this.f97814r = gVar2;
            this.f97815s = 1;
            Object M = kotlin.jvm.internal.j.M(this, p0Var.f97870l, jVar);
            if (M == aVar) {
                return aVar;
            }
            gVar = gVar2;
            obj = M;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = this.f97814r;
            ue.c.H(obj);
        }
        ww.f fVar = (ww.f) obj;
        if (fVar instanceof ww.e) {
            pw.a aVar3 = p0Var.f97861c;
            f30 f30Var = gVar.f131164b;
            pw.c cVar = (pw.c) aVar3;
            cVar.getClass();
            Intrinsics.checkNotNullParameter("[CREATIVE LOADED] Success", "message");
            rw.a aVar4 = rw.a.AD_LOADED;
            ((sw.b) cVar.f101492a).c(aVar4, f30Var, null);
            qw.a.a(cVar.f101493b, aVar4, f30Var);
        } else if (fVar instanceof ww.d) {
            gVar.f131169g = false;
            ((pw.c) p0Var.f97861c).c(gVar.f131164b, ((ww.d) fVar).f131161a);
        }
        return Unit.f80348a;
    }
}
