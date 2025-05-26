package ow;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public ww.g f97829r;

    /* renamed from: s, reason: collision with root package name */
    public int f97830s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p0 f97831t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f97832u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p0 p0Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f97831t = p0Var;
        this.f97832u = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f97831t, this.f97832u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        ww.g gVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f97830s;
        p0 p0Var = this.f97831t;
        if (i13 == 0) {
            ue.c.H(obj);
            ww.g gVar2 = (ww.g) p0Var.f97871m.get(this.f97832u);
            fn.i iVar = gVar2 != null ? gVar2.f131165c : null;
            pw.a aVar2 = p0Var.f97861c;
            if (iVar == null || gVar2.f131166d == null) {
                ((pw.c) aVar2).d(gVar2 != null ? gVar2.f131164b : null, new Throwable("Attempting to mark impression event for ad session or ad events that do not exist."));
                return Unit.f80348a;
            }
            if (gVar2.f131168f) {
                ((pw.c) aVar2).getClass();
                Intrinsics.checkNotNullParameter("Deduplicated impression event for ad session.", "message");
                return Unit.f80348a;
            }
            gVar2.f131168f = true;
            l lVar = new l(p0Var, gVar2, null);
            this.f97829r = gVar2;
            this.f97830s = 1;
            Object M = kotlin.jvm.internal.j.M(this, p0Var.f97870l, lVar);
            if (M == aVar) {
                return aVar;
            }
            gVar = gVar2;
            obj = M;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = this.f97829r;
            ue.c.H(obj);
        }
        ww.f fVar = (ww.f) obj;
        if (fVar instanceof ww.d) {
            gVar.f131168f = false;
            ((pw.c) p0Var.f97861c).d(gVar.f131164b, ((ww.d) fVar).f131161a);
        } else if (fVar instanceof ww.e) {
            pw.a aVar3 = p0Var.f97861c;
            f30 f30Var = gVar.f131164b;
            pw.c cVar = (pw.c) aVar3;
            cVar.getClass();
            Intrinsics.checkNotNullParameter("[AD IMPRESSION] Success", "message");
            rw.a aVar4 = rw.a.AD_IMP_OCCURRED;
            ((sw.b) cVar.f101492a).c(aVar4, f30Var, null);
            qw.a.a(cVar.f101493b, aVar4, f30Var);
        }
        return Unit.f80348a;
    }
}
