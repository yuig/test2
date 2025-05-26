package ads_mobile_sdk;

import a.zb;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class bz2 implements a.n6 {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f3659f = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public final zb f3660a;

    /* renamed from: b, reason: collision with root package name */
    public long f3661b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f3662c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f3663d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3664e = false;

    public bz2(Context context, zb zbVar, ExecutorService executorService, String[] strArr) {
        this.f3660a = zbVar;
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        az2 az2Var = new az2(this, zbVar);
        try {
            Object systemService = context.getSystemService("appops");
            systemService.getClass();
            ((AppOpsManager) systemService).startWatchingActive(strArr, executorService, az2Var);
        } catch (Throwable unused) {
        }
    }

    @Override // a.n6
    public final void a(HashMap hashMap) {
        long j13;
        b();
        synchronized (this) {
            try {
                j13 = this.f3664e ? this.f3662c - this.f3661b : -1L;
            } finally {
            }
        }
        hashMap.put("vs", Long.valueOf(j13));
        hashMap.put("vf", Long.valueOf(a()));
    }

    @Override // a.n6
    public final void b(HashMap hashMap) {
        b();
    }

    public final void b() {
        synchronized (this) {
            try {
                this.f3663d = -1L;
                if (this.f3664e) {
                    this.f3660a.getClass();
                    this.f3662c = System.currentTimeMillis();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // a.n6
    public final void a(HashMap hashMap, Context context, View view) {
        b();
    }

    public final long a() {
        long j13;
        synchronized (this) {
            j13 = this.f3663d;
            this.f3663d = -1L;
        }
        return j13;
    }
}
