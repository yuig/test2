package ir;

import com.pinterest.activity.task.activity.MainActivity;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.x3;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w implements jc0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f73487a;

    public w(MainActivity mainActivity) {
        this.f73487a = mainActivity;
    }

    @Override // jc0.u
    public final void a() {
        MainActivity mainActivity = this.f73487a;
        nl1.d f34938d = mainActivity.getF34938d();
        if (f34938d != null) {
            d7.b.d(f34938d);
        }
        if (MainActivity.y(mainActivity)) {
            bz.i timeSpentLoggingManager = mainActivity.getTimeSpentLoggingManager();
            com.google.android.gms.internal.measurement.x xVar = timeSpentLoggingManager.f24185c;
            if (xVar != null) {
                Iterator it = xVar.p().iterator();
                while (it.hasNext()) {
                    timeSpentLoggingManager.h((i0) it.next());
                }
            }
            timeSpentLoggingManager.f24185c = null;
            return;
        }
        bz.i timeSpentLoggingManager2 = mainActivity.getTimeSpentLoggingManager();
        com.google.android.gms.internal.measurement.x xVar2 = timeSpentLoggingManager2.f24185c;
        if (xVar2 != null) {
            timeSpentLoggingManager2.g(xVar2.o(), null);
            Iterator it2 = xVar2.p().iterator();
            while (it2.hasNext()) {
                timeSpentLoggingManager2.d((i0) it2.next());
            }
        }
        timeSpentLoggingManager2.f24185c = null;
    }

    @Override // jc0.u
    public final void b(d4 d4Var, String str) {
        g0 g0Var;
        i0 i0Var;
        i0 i0Var2;
        g0 g0Var2;
        i0 i0Var3;
        d4 d4Var2;
        d4 d4Var3;
        i0 i0Var4;
        d4 d4Var4;
        i0 i0Var5;
        MainActivity mainActivity = this.f73487a;
        if (MainActivity.y(mainActivity)) {
            bz.i timeSpentLoggingManager = mainActivity.getTimeSpentLoggingManager();
            if (d4Var == null) {
                timeSpentLoggingManager.getClass();
                d4Var3 = d4.MODAL;
            } else {
                d4Var3 = d4Var;
            }
            bz.g gVar = timeSpentLoggingManager.f24184b;
            timeSpentLoggingManager.d(new i0(d4Var3, (gVar == null || (i0Var5 = gVar.f24164h) == null) ? null : i0Var5.f67082b, new x3(null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, gVar != null ? gVar.f24166a : null), g0.BROWSER, null, null));
            bz.g gVar2 = timeSpentLoggingManager.f24184b;
            if (gVar2 != null && (i0Var4 = gVar2.f24164h) != null && (d4Var4 = i0Var4.f67081a) != null) {
                if (d4Var4 != d4.MODAL) {
                    timeSpentLoggingManager.f24185c = null;
                }
                timeSpentLoggingManager.f24185c = new com.google.android.gms.internal.measurement.x(gVar2);
            }
        } else {
            bz.i timeSpentLoggingManager2 = mainActivity.getTimeSpentLoggingManager();
            bz.g gVar3 = timeSpentLoggingManager2.f24184b;
            if (gVar3 != null && (i0Var3 = gVar3.f24164h) != null && (d4Var2 = i0Var3.f67081a) != null) {
                if (d4Var2 != d4.MODAL) {
                    timeSpentLoggingManager2.f24185c = null;
                }
                timeSpentLoggingManager2.f24185c = new com.google.android.gms.internal.measurement.x(gVar3);
            }
            bz.g gVar4 = timeSpentLoggingManager2.f24184b;
            if (gVar4 == null || (i0Var2 = gVar4.f24164h) == null || (g0Var2 = i0Var2.f67084d) == null) {
                g0Var = null;
            } else {
                if (g0Var2 == g0.PIN_IDEA_STREAM) {
                    g0Var2 = g0.MODULE_IDEA_STREAM;
                }
                g0Var = g0Var2;
            }
            i0 i0Var6 = new i0(d4Var == null ? d4.MODAL : d4Var, (gVar4 == null || (i0Var = gVar4.f24164h) == null) ? null : i0Var.f67082b, new x3(null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, gVar4 != null ? gVar4.f24166a : null), g0Var, null, null);
            timeSpentLoggingManager2.g(i0Var6, bz.i.a(i0Var6, null));
        }
        nl1.d f34938d = mainActivity.getF34938d();
        if (f34938d != null) {
            d7.b.y(f34938d);
        }
    }
}
