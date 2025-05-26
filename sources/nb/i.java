package nb;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import kb.b0;
import lb.i0;
import lb.j0;
import lb.o;
import lb.w;
import tb.j;
import ub.l;
import ub.v;

/* loaded from: classes3.dex */
public final class i implements lb.c {

    /* renamed from: k, reason: collision with root package name */
    public static final String f90140k = b0.h("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f90141a;

    /* renamed from: b, reason: collision with root package name */
    public final vb.b f90142b;

    /* renamed from: c, reason: collision with root package name */
    public final v f90143c;

    /* renamed from: d, reason: collision with root package name */
    public final o f90144d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f90145e;

    /* renamed from: f, reason: collision with root package name */
    public final b f90146f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f90147g;

    /* renamed from: h, reason: collision with root package name */
    public Intent f90148h;

    /* renamed from: i, reason: collision with root package name */
    public h f90149i;

    /* renamed from: j, reason: collision with root package name */
    public final i0 f90150j;

    public i(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f90141a = applicationContext;
        w wVar = new w(new lb.v());
        j0 h10 = j0.h(context);
        this.f90145e = h10;
        this.f90146f = new b(applicationContext, h10.f82606c.f78973d, wVar);
        this.f90143c = new v(h10.f82606c.f78976g);
        o oVar = h10.f82610g;
        this.f90144d = oVar;
        vb.b bVar = h10.f82608e;
        this.f90142b = bVar;
        this.f90150j = new i0(oVar, bVar);
        oVar.a(this);
        this.f90147g = new ArrayList();
        this.f90148h = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(Intent intent, int i13) {
        b0 e13 = b0.e();
        String str = f90140k;
        e13.a(str, "Adding command " + intent + " (" + i13 + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            b0.e().i(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f90147g) {
                try {
                    Iterator it = this.f90147g.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i13);
        synchronized (this.f90147g) {
            try {
                boolean z13 = !this.f90147g.isEmpty();
                this.f90147g.add(intent);
                if (!z13) {
                    d();
                }
            } finally {
            }
        }
    }

    @Override // lb.c
    public final void b(j jVar, boolean z13) {
        vb.a aVar = this.f90142b.f125447d;
        String str = b.f90109f;
        Intent intent = new Intent(this.f90141a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z13);
        b.d(intent, jVar);
        aVar.execute(new d.d(this, intent, 0, 8));
    }

    public final void d() {
        c();
        PowerManager.WakeLock a13 = l.a(this.f90141a, "ProcessCommand");
        try {
            a13.acquire();
            this.f90145e.f82608e.a(new g(this, 0));
        } finally {
            a13.release();
        }
    }
}
