package nb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import ja.d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kb.b0;
import kb.c0;
import kotlin.jvm.internal.Intrinsics;
import lb.i0;
import lb.t;
import lb.u;
import lb.w;
import tb.j;
import tb.s;

/* loaded from: classes3.dex */
public final class b implements lb.c {

    /* renamed from: f */
    public static final String f90109f = b0.h("CommandHandler");

    /* renamed from: a */
    public final Context f90110a;

    /* renamed from: b */
    public final HashMap f90111b = new HashMap();

    /* renamed from: c */
    public final Object f90112c = new Object();

    /* renamed from: d */
    public final bk.f f90113d;

    /* renamed from: e */
    public final u f90114e;

    public b(Context context, bk.f fVar, w wVar) {
        this.f90110a = context;
        this.f90113d = fVar;
        this.f90114e = wVar;
    }

    public static j c(Intent intent) {
        return new j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f116981a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f116982b);
    }

    public final void a(Intent intent, int i13, i iVar) {
        List<t> list;
        String action = intent.getAction();
        int i14 = 8;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b0.e().a(f90109f, "Handling constraints changed " + intent);
            d dVar = new d(this.f90110a, this.f90113d, i13, iVar);
            ArrayList h10 = iVar.f90145e.f82607d.y().h();
            String str = c.f90115a;
            Iterator it = h10.iterator();
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            while (it.hasNext()) {
                kb.g gVar = ((s) it.next()).f117025j;
                z13 |= gVar.f78993e;
                z14 |= gVar.f78991c;
                z15 |= gVar.f78994f;
                z16 |= gVar.f78989a != c0.NOT_REQUIRED;
                if (z13 && z14 && z15 && z16) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f20013a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = dVar.f90117a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z13).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z14).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z15).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z16);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(h10.size());
            dVar.f90118b.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = h10.iterator();
            while (it2.hasNext()) {
                s sVar = (s) it2.next();
                if (currentTimeMillis >= sVar.a() && (!sVar.e() || dVar.f90120d.f(sVar))) {
                    arrayList.add(sVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                s sVar2 = (s) it3.next();
                String str3 = sVar2.f117016a;
                j q13 = b7.c.q(sVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, q13);
                b0.e().a(d.f90116e, a.a.k("Creating a delay_met command for workSpec with id (", str3, ")"));
                iVar.f90142b.f125447d.execute(new d.d(iVar, intent3, dVar.f90119c, i14));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            b0.e().a(f90109f, "Handling reschedule " + intent + ", " + i13);
            iVar.f90145e.k();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            b0.e().c(f90109f, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            j c13 = c(intent);
            String str4 = f90109f;
            b0.e().a(str4, "Handling schedule work for " + c13);
            WorkDatabase workDatabase = iVar.f90145e.f82607d;
            workDatabase.c();
            try {
                s j13 = workDatabase.y().j(c13.f116981a);
                if (j13 == null) {
                    b0.e().i(str4, "Skipping scheduling " + c13 + " because it's no longer in the DB");
                } else if (j13.f117017b.isFinished()) {
                    b0.e().i(str4, "Skipping scheduling " + c13 + "because it is finished.");
                } else {
                    long a13 = j13.a();
                    boolean e13 = j13.e();
                    Context context2 = this.f90110a;
                    if (e13) {
                        b0.e().a(str4, "Opportunistically setting an alarm for " + c13 + "at " + a13);
                        a.b(context2, workDatabase, c13, a13);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        iVar.f90142b.f125447d.execute(new d.d(iVar, intent4, i13, i14));
                    } else {
                        b0.e().a(str4, "Setting up Alarms for " + c13 + "at " + a13);
                        a.b(context2, workDatabase, c13, a13);
                    }
                    workDatabase.r();
                }
                return;
            } finally {
                workDatabase.m();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f90112c) {
                try {
                    j c14 = c(intent);
                    b0 e14 = b0.e();
                    String str5 = f90109f;
                    e14.a(str5, "Handing delay met for " + c14);
                    if (this.f90111b.containsKey(c14)) {
                        b0.e().a(str5, "WorkSpec " + c14 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        f fVar = new f(this.f90110a, i13, iVar, this.f90114e.b(c14));
                        this.f90111b.put(c14, fVar);
                        fVar.d();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                b0.e().i(f90109f, "Ignoring intent " + intent);
                return;
            }
            j c15 = c(intent);
            boolean z17 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            b0.e().a(f90109f, "Handling onExecutionCompleted " + intent + ", " + i13);
            b(c15, z17);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        u uVar = this.f90114e;
        if (containsKey) {
            int i15 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            t d2 = uVar.d(new j(string, i15));
            list = arrayList2;
            if (d2 != null) {
                arrayList2.add(d2);
                list = arrayList2;
            }
        } else {
            list = uVar.remove(string);
        }
        for (t workSpecId : list) {
            b0.e().a(f90109f, a.a.j("Handing stopWork work for ", string));
            i0 i0Var = iVar.f90150j;
            i0Var.getClass();
            Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
            i0Var.a(workSpecId, -512);
            WorkDatabase workDatabase2 = iVar.f90145e.f82607d;
            String str6 = a.f90108a;
            tb.i v13 = workDatabase2.v();
            j id3 = workSpecId.f82669a;
            tb.g a14 = v13.a(id3);
            if (a14 != null) {
                a.a(this.f90110a, id3, a14.f116974c);
                b0.e().a(a.f90108a, "Removing SystemIdInfo for workSpecId (" + id3 + ")");
                Intrinsics.checkNotNullParameter(id3, "id");
                d0 d0Var = v13.f116977a;
                d0Var.b();
                tb.h hVar = v13.f116979c;
                oa.i a15 = hVar.a();
                a15.c1(1, id3.f116981a);
                a15.u1(2, id3.f116982b);
                try {
                    d0Var.c();
                    try {
                        a15.G();
                        d0Var.r();
                        d0Var.m();
                    } catch (Throwable th3) {
                        d0Var.m();
                        throw th3;
                    }
                } finally {
                    hVar.j(a15);
                }
            }
            iVar.b(id3, false);
        }
    }

    @Override // lb.c
    public final void b(j jVar, boolean z13) {
        synchronized (this.f90112c) {
            try {
                f fVar = (f) this.f90111b.remove(jVar);
                this.f90114e.d(jVar);
                if (fVar != null) {
                    fVar.f(z13);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
