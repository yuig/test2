package ads_mobile_sdk;

import android.os.SystemClock;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public final class v extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f12262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, bl2.c cVar) {
        super(2, cVar);
        this.f12262b = xVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new v(this.f12262b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v(this.f12262b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f12261a;
        if (i13 == 0) {
            ue.c.H(obj);
            oh0 oh0Var = this.f12262b.f13321g;
            oh0Var.getClass();
            zn2.a aVar2 = zn2.b.f142311b;
            long a13 = oh0Var.a(dl2.b.P2(500, zn2.d.MILLISECONDS), "gads:app_activity_tracker:notify_background_listeners_delay_ms");
            this.f12261a = 1;
            if (l0.T(a13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        x xVar = this.f12262b;
        synchronized (xVar) {
            try {
                if (xVar.f13326l && !xVar.d()) {
                    gk0.c("App is now backgrounded", null);
                    xVar.f13329o = true;
                    zn2.a aVar3 = zn2.b.f142311b;
                    xVar.f13322h.getClass();
                    long Q2 = dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS);
                    for (a.ie ieVar : xVar.f13323i) {
                        j0 j0Var = xVar.f13320f;
                        u block = new u(ieVar, Q2, null);
                        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(block, "block");
                        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
                    }
                }
                unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return unit;
    }
}
