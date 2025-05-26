package ow;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public ww.g f97793r;

    /* renamed from: s, reason: collision with root package name */
    public int f97794s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p0 f97795t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f97796u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p0 p0Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f97795t = p0Var;
        this.f97796u = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f97795t, this.f97796u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        ww.g gVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f97794s;
        p0 p0Var = this.f97795t;
        if (i13 == 0) {
            ue.c.H(obj);
            ww.g gVar2 = (ww.g) p0Var.f97871m.remove(this.f97796u);
            if ((gVar2 != null ? gVar2.f131165c : null) == null) {
                ((pw.c) p0Var.f97861c).getClass();
                Intrinsics.checkNotNullParameter("Attempting to destroy ad session that does not exist.", "message");
                return Unit.f80348a;
            }
            g gVar3 = new g(p0Var, gVar2, null);
            this.f97793r = gVar2;
            this.f97794s = 1;
            Object M = kotlin.jvm.internal.j.M(this, p0Var.f97870l, gVar3);
            if (M == aVar) {
                return aVar;
            }
            gVar = gVar2;
            obj = M;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = this.f97793r;
            ue.c.H(obj);
        }
        ww.f fVar = (ww.f) obj;
        if (fVar instanceof ww.d) {
            pw.a aVar2 = p0Var.f97861c;
            f30 f30Var = gVar.f131164b;
            Throwable throwable = ((ww.d) fVar).f131161a;
            pw.c cVar = (pw.c) aVar2;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            pw.c.h("[AD SESSION DESTROY] Error: " + throwable.getMessage());
            rw.a aVar3 = rw.a.AD_SESSION_FINISH;
            sw.a.b(cVar.f101492a, aVar3, throwable, f30Var, 8);
            qw.a.b(cVar.f101493b, aVar3, throwable, f30Var, 8);
        } else if (fVar instanceof ww.e) {
            pw.a aVar4 = p0Var.f97861c;
            f30 f30Var2 = gVar.f131164b;
            pw.c cVar2 = (pw.c) aVar4;
            cVar2.getClass();
            Intrinsics.checkNotNullParameter("[AD SESSION DESTROY] Success", "message");
            rw.a aVar5 = rw.a.AD_SESSION_FINISH;
            ((sw.b) cVar2.f101492a).c(aVar5, f30Var2, null);
            qw.a.a(cVar2.f101493b, aVar5, f30Var2);
        }
        return Unit.f80348a;
    }
}
