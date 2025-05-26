package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.c0;
import java.util.LinkedHashMap;
import java.util.Map;
import kb.b0;
import kotlin.Unit;
import nb.h;
import nb.i;
import ub.l;
import ub.m;

/* loaded from: classes3.dex */
public class SystemAlarmService extends c0 implements h {

    /* renamed from: d */
    public static final String f20015d = b0.h("SystemAlarmService");

    /* renamed from: b */
    public i f20016b;

    /* renamed from: c */
    public boolean f20017c;

    public final void a() {
        this.f20017c = true;
        b0.e().a(f20015d, "All commands completed in dispatcher");
        String str = l.f121674a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (m.f121675a) {
            linkedHashMap.putAll(m.f121676b);
            Unit unit = Unit.f80348a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                b0.e().i(l.f121674a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.c0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        i iVar = new i(this);
        this.f20016b = iVar;
        if (iVar.f90149i != null) {
            b0.e().c(i.f90140k, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            iVar.f90149i = this;
        }
        this.f20017c = false;
    }

    @Override // androidx.lifecycle.c0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f20017c = true;
        i iVar = this.f20016b;
        iVar.getClass();
        b0.e().a(i.f90140k, "Destroying SystemAlarmDispatcher");
        iVar.f90144d.f(iVar);
        iVar.f90149i = null;
    }

    @Override // androidx.lifecycle.c0, android.app.Service
    public final int onStartCommand(Intent intent, int i13, int i14) {
        super.onStartCommand(intent, i13, i14);
        if (this.f20017c) {
            b0.e().f(f20015d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            i iVar = this.f20016b;
            iVar.getClass();
            b0 e13 = b0.e();
            String str = i.f90140k;
            e13.a(str, "Destroying SystemAlarmDispatcher");
            iVar.f90144d.f(iVar);
            iVar.f90149i = null;
            i iVar2 = new i(this);
            this.f20016b = iVar2;
            if (iVar2.f90149i != null) {
                b0.e().c(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                iVar2.f90149i = this;
            }
            this.f20017c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f20016b.a(intent, i14);
        return 3;
    }
}
