package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class h0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16022c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f16023d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16024e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(n0 n0Var, d dVar) {
        super(n0Var);
        this.f16023d = n0Var;
        this.f16024e = dVar;
    }

    @Override // androidx.appcompat.app.j0
    public final IntentFilter n() {
        switch (this.f16022c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // androidx.appcompat.app.j0
    public final int o() {
        long j13;
        boolean z13;
        int i13 = this.f16022c;
        Object obj = this.f16024e;
        switch (i13) {
            case 0:
                if (!b0.a((PowerManager) obj)) {
                    break;
                }
                break;
            default:
                d dVar = (d) obj;
                a1 a1Var = (a1) dVar.f15968d;
                if (a1Var.f15953a <= System.currentTimeMillis()) {
                    Location s13 = kh2.s0.x((Context) dVar.f15966b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? dVar.s("network") : null;
                    Location s14 = kh2.s0.x((Context) dVar.f15966b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? dVar.s("gps") : null;
                    if (s14 == null || s13 == null ? s14 != null : s14.getTime() > s13.getTime()) {
                        s13 = s14;
                    }
                    if (s13 == null) {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i14 = Calendar.getInstance().get(11);
                        if (i14 < 6 || i14 >= 22) {
                        }
                        break;
                    } else {
                        a1 a1Var2 = (a1) dVar.f15968d;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (z0.f16161d == null) {
                            z0.f16161d = new z0();
                        }
                        z0 z0Var = z0.f16161d;
                        z0Var.a(s13.getLatitude(), s13.getLongitude(), currentTimeMillis - 86400000);
                        z0Var.a(s13.getLatitude(), s13.getLongitude(), currentTimeMillis);
                        boolean z14 = z0Var.f16162a == 1;
                        long j14 = z0Var.f16164c;
                        long j15 = z0Var.f16163b;
                        z0Var.a(s13.getLatitude(), s13.getLongitude(), currentTimeMillis + 86400000);
                        long j16 = z0Var.f16164c;
                        if (j14 == -1 || j15 == -1) {
                            j13 = 43200000 + currentTimeMillis;
                        } else {
                            if (currentTimeMillis > j15) {
                                j14 = j16;
                            } else if (currentTimeMillis > j14) {
                                j14 = j15;
                            }
                            j13 = j14 + 60000;
                        }
                        a1Var2.f15954b = z14;
                        a1Var2.f15953a = j13;
                        z13 = a1Var.f15954b;
                    }
                } else {
                    z13 = a1Var.f15954b;
                }
                if (z13) {
                }
                break;
        }
        return 1;
    }

    @Override // androidx.appcompat.app.j0
    public final void u() {
        int i13 = this.f16022c;
        n0 n0Var = this.f16023d;
        switch (i13) {
            case 0:
                n0Var.r(true, true);
                break;
            default:
                n0Var.r(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(n0 n0Var, Context context) {
        super(n0Var);
        this.f16023d = n0Var;
        this.f16024e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
