package sb;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import ao2.o1;
import i2.a2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kb.b0;
import kb.r;
import lb.j0;
import lb.t;
import pb.i;
import tb.j;
import tb.s;
import ub.k;
import v.e1;

/* loaded from: classes3.dex */
public final class c implements i, lb.c {

    /* renamed from: j, reason: collision with root package name */
    public static final String f112225j = b0.h("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final j0 f112226a;

    /* renamed from: b, reason: collision with root package name */
    public final vb.b f112227b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f112228c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public j f112229d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f112230e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f112231f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f112232g;

    /* renamed from: h, reason: collision with root package name */
    public final a2 f112233h;

    /* renamed from: i, reason: collision with root package name */
    public b f112234i;

    public c(Context context) {
        j0 h10 = j0.h(context);
        this.f112226a = h10;
        this.f112227b = h10.f82608e;
        this.f112229d = null;
        this.f112230e = new LinkedHashMap();
        this.f112232g = new HashMap();
        this.f112231f = new HashMap();
        this.f112233h = new a2(h10.f82614k);
        h10.f82610g.a(this);
    }

    public static Intent a(Context context, j jVar, r rVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f116981a);
        intent.putExtra("KEY_GENERATION", jVar.f116982b);
        intent.putExtra("KEY_NOTIFICATION_ID", rVar.f79025a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", rVar.f79026b);
        intent.putExtra("KEY_NOTIFICATION", rVar.f79027c);
        return intent;
    }

    public static Intent c(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // lb.c
    public final void b(j jVar, boolean z13) {
        Map.Entry entry;
        synchronized (this.f112228c) {
            try {
                o1 o1Var = ((s) this.f112231f.remove(jVar)) != null ? (o1) this.f112232g.remove(jVar) : null;
                if (o1Var != null) {
                    o1Var.cancel((CancellationException) null);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        r rVar = (r) this.f112230e.remove(jVar);
        if (jVar.equals(this.f112229d)) {
            if (this.f112230e.size() > 0) {
                Iterator it = this.f112230e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f112229d = (j) entry.getKey();
                if (this.f112234i != null) {
                    r rVar2 = (r) entry.getValue();
                    b bVar = this.f112234i;
                    int i13 = rVar2.f79025a;
                    int i14 = rVar2.f79026b;
                    Notification notification = rVar2.f79027c;
                    SystemForegroundService systemForegroundService = (SystemForegroundService) bVar;
                    systemForegroundService.getClass();
                    int i15 = Build.VERSION.SDK_INT;
                    if (i15 >= 31) {
                        e1.f(systemForegroundService, i13, notification, i14);
                    } else if (i15 >= 29) {
                        v0.a.j(systemForegroundService, i13, notification, i14);
                    } else {
                        systemForegroundService.startForeground(i13, notification);
                    }
                    ((SystemForegroundService) this.f112234i).f20026d.cancel(rVar2.f79025a);
                }
            } else {
                this.f112229d = null;
            }
        }
        b bVar2 = this.f112234i;
        if (rVar == null || bVar2 == null) {
            return;
        }
        b0.e().a(f112225j, "Removing Notification (id: " + rVar.f79025a + ", workSpecId: " + jVar + ", notificationType: " + rVar.f79026b);
        ((SystemForegroundService) bVar2).f20026d.cancel(rVar.f79025a);
    }

    public final void d(Intent intent) {
        if (this.f112234i == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i13 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        b0 e13 = b0.e();
        StringBuilder sb3 = new StringBuilder("Notifying with (id:");
        sb3.append(intExtra);
        sb3.append(", workSpecId: ");
        sb3.append(stringExtra);
        sb3.append(", notificationType :");
        e13.a(f112225j, a.a.n(sb3, intExtra2, ")"));
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        r rVar = new r(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.f112230e;
        linkedHashMap.put(jVar, rVar);
        r rVar2 = (r) linkedHashMap.get(this.f112229d);
        if (rVar2 == null) {
            this.f112229d = jVar;
        } else {
            ((SystemForegroundService) this.f112234i).f20026d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i13 |= ((r) ((Map.Entry) it.next()).getValue()).f79026b;
                }
                rVar = new r(rVar2.f79025a, i13, rVar2.f79027c);
            } else {
                rVar = rVar2;
            }
        }
        SystemForegroundService systemForegroundService = (SystemForegroundService) this.f112234i;
        systemForegroundService.getClass();
        int i14 = Build.VERSION.SDK_INT;
        int i15 = rVar.f79025a;
        int i16 = rVar.f79026b;
        Notification notification2 = rVar.f79027c;
        if (i14 >= 31) {
            e1.f(systemForegroundService, i15, notification2, i16);
        } else if (i14 >= 29) {
            v0.a.j(systemForegroundService, i15, notification2, i16);
        } else {
            systemForegroundService.startForeground(i15, notification2);
        }
    }

    @Override // pb.i
    public final void e(s sVar, pb.c cVar) {
        if (cVar instanceof pb.b) {
            String str = sVar.f117016a;
            b0.e().a(f112225j, a.a.j("Constraints unmet for WorkSpec ", str));
            j q13 = b7.c.q(sVar);
            int i13 = ((pb.b) cVar).f99403a;
            j0 j0Var = this.f112226a;
            j0Var.getClass();
            j0Var.f82608e.a(new k(j0Var.f82610g, new t(q13), true, i13));
        }
    }

    public final void f() {
        this.f112234i = null;
        synchronized (this.f112228c) {
            try {
                Iterator it = this.f112232g.values().iterator();
                while (it.hasNext()) {
                    ((o1) it.next()).cancel((CancellationException) null);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f112226a.f82610g.f(this);
    }

    public final void g(int i13) {
        b0.e().f(f112225j, a.a.d("Foreground service timed out, FGS type: ", i13));
        for (Map.Entry entry : this.f112230e.entrySet()) {
            if (((r) entry.getValue()).f79026b == i13) {
                j jVar = (j) entry.getKey();
                j0 j0Var = this.f112226a;
                j0Var.getClass();
                j0Var.f82608e.a(new k(j0Var.f82610g, new t(jVar), true, -128));
            }
        }
        b bVar = this.f112234i;
        if (bVar != null) {
            SystemForegroundService systemForegroundService = (SystemForegroundService) bVar;
            systemForegroundService.f20024b = true;
            b0.e().a(SystemForegroundService.f20023e, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
        }
    }
}
