package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.widget.j;
import androidx.lifecycle.c0;
import bk.f;
import java.util.UUID;
import k1.v0;
import kb.b0;
import kotlin.jvm.internal.Intrinsics;
import lb.j0;
import sb.b;
import sb.c;

/* loaded from: classes3.dex */
public class SystemForegroundService extends c0 implements b {

    /* renamed from: e, reason: collision with root package name */
    public static final String f20023e = b0.h("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public boolean f20024b;

    /* renamed from: c, reason: collision with root package name */
    public c f20025c;

    /* renamed from: d, reason: collision with root package name */
    public NotificationManager f20026d;

    public final void a() {
        this.f20026d = (NotificationManager) getApplicationContext().getSystemService("notification");
        c cVar = new c(getApplicationContext());
        this.f20025c = cVar;
        if (cVar.f112234i != null) {
            b0.e().c(c.f112225j, "A callback already exists.");
        } else {
            cVar.f112234i = this;
        }
    }

    @Override // androidx.lifecycle.c0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.c0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f20025c.f();
    }

    @Override // androidx.lifecycle.c0, android.app.Service
    public final int onStartCommand(Intent intent, int i13, int i14) {
        super.onStartCommand(intent, i13, i14);
        boolean z13 = this.f20024b;
        String str = f20023e;
        if (z13) {
            b0.e().f(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f20025c.f();
            a();
            this.f20024b = false;
        }
        if (intent == null) {
            return 3;
        }
        c cVar = this.f20025c;
        cVar.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = c.f112225j;
        if (equals) {
            b0.e().f(str2, "Started foreground service " + intent);
            cVar.f112227b.a(new j(10, cVar, intent.getStringExtra("KEY_WORKSPEC_ID")));
            cVar.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            cVar.d(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            b0.e().f(str2, "Stopping foreground service");
            b bVar = cVar.f112234i;
            if (bVar == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) bVar;
            systemForegroundService.f20024b = true;
            b0.e().a(str, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
        b0.e().f(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID id3 = UUID.fromString(stringExtra);
        j0 workManagerImpl = cVar.f112226a;
        workManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        f fVar = workManagerImpl.f82606c.f78982m;
        ub.j jVar = workManagerImpl.f82608e.f125444a;
        Intrinsics.checkNotNullExpressionValue(jVar, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        tb.f.T(fVar, "CancelWorkById", jVar, new v0(21, workManagerImpl, id3));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i13) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f20025c.g(2048);
    }

    public final void onTimeout(int i13, int i14) {
        this.f20025c.g(i14);
    }
}
