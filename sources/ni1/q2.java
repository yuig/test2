package ni1;

import android.view.ViewParent;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q2 implements u50.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f90784b;

    public /* synthetic */ q2(Object obj, int i13) {
        this.f90783a = i13;
        this.f90784b = obj;
    }

    @Override // u50.r
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f90783a) {
            case 0:
                b((z1) obj);
                break;
            default:
                b((z1) obj);
                break;
        }
    }

    public final void b(z1 event) {
        boolean z13;
        f30 f30Var;
        int i13 = this.f90783a;
        Object obj = this.f90784b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(event, "event");
                s2 s2Var = (s2) obj;
                s2Var.getClass();
                xk2.v vVar = s2Var.f90795c;
                try {
                    boolean booleanValue = ((Boolean) s2Var.f90797e.getValue()).booleanValue();
                    xk2.v vVar2 = s2Var.f90798f;
                    if (!(booleanValue ? ((LinkedBlockingQueue) vVar2.getValue()).offer(event, 10L, TimeUnit.MILLISECONDS) : ((LinkedBlockingQueue) vVar2.getValue()).offer(event))) {
                        ((v2) vVar.getValue()).a(u2.PIN_REP_EVENT_QUEUE_FULL, event);
                        break;
                    }
                } catch (InterruptedException unused) {
                    ((v2) vVar.getValue()).a(u2.PIN_REP_EVENT_QUEUE_INTERRUPTED, event);
                    return;
                } catch (NullPointerException unused2) {
                    ((v2) vVar.getValue()).a(u2.PIN_REP_EVENT_QUEUE_NULL, event);
                    return;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(event, "event");
                z13 = SbaPinRep.hasMissingEventIntakeErrorBeenLogged;
                if (!z13) {
                    SbaPinRep.hasMissingEventIntakeErrorBeenLogged = true;
                    SbaPinRep sbaPinRep = (SbaPinRep) obj;
                    f30Var = sbaPinRep.deprecatedPin;
                    String uid = f30Var != null ? f30Var.getUid() : null;
                    ViewParent parent = sbaPinRep.getParent();
                    vb0.j.f125466a.F(t3.s1.c("EventIntake not bound in SbaPinGridCell for pin uid:", uid, " - parent:", parent != null ? parent.getClass().getSimpleName() : null), tb0.p.PLATFORM, new Object[0]);
                    break;
                }
                break;
        }
    }
}
