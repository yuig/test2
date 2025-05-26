package vb0;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Unit;
import xk2.n;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final xk2.k f125456e;

    /* renamed from: f, reason: collision with root package name */
    public static final xk2.k f125457f;

    /* renamed from: a, reason: collision with root package name */
    public long f125458a;

    /* renamed from: b, reason: collision with root package name */
    public long f125459b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f125460c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f125461d;

    static {
        n nVar = n.NONE;
        f125456e = xk2.m.a(nVar, d.f125453k);
        f125457f = xk2.m.a(nVar, d.f125452j);
    }

    public final boolean a() {
        NetworkCapabilities networkCapabilities;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f125459b >= 5000) {
            synchronized (e.a()) {
                this.f125459b = currentTimeMillis;
                ConnectivityManager a13 = e.a();
                Network activeNetwork = a13.getActiveNetwork();
                boolean z13 = false;
                if (activeNetwork != null && (networkCapabilities = a13.getNetworkCapabilities(activeNetwork)) != null) {
                    z13 = networkCapabilities.hasTransport(0);
                }
                this.f125461d = z13;
                Unit unit = Unit.f80348a;
            }
        }
        return this.f125461d;
    }

    public final boolean b() {
        NetworkCapabilities networkCapabilities;
        if (ff0.j.f62104b) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f125458a >= 5000) {
            synchronized (e.a()) {
                this.f125458a = currentTimeMillis;
                ConnectivityManager a13 = e.a();
                Network activeNetwork = a13.getActiveNetwork();
                boolean z13 = false;
                if (activeNetwork != null && (networkCapabilities = a13.getNetworkCapabilities(activeNetwork)) != null) {
                    z13 = networkCapabilities.hasTransport(1);
                }
                this.f125460c = z13;
                Unit unit = Unit.f80348a;
            }
        }
        return this.f125460c;
    }
}
