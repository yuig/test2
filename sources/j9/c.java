package j9;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.i9;
import com.google.android.gms.internal.measurement.j9;
import oi.f7;
import oi.g4;
import oi.q6;
import oi.r5;
import oi.u4;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f74961a;

    /* renamed from: b, reason: collision with root package name */
    public long f74962b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f74963c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f74964d;

    public c(q6 q6Var) {
        this.f74964d = q6Var;
        this.f74963c = new r5(this, (u4) q6Var.f24333a, 1);
        ((oh.b) q6Var.zzb()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f74961a = elapsedRealtime;
        this.f74962b = elapsedRealtime;
    }

    public final boolean a(long j13, boolean z13, boolean z14) {
        q6 q6Var = (q6) this.f74964d;
        q6Var.p();
        q6Var.w();
        ((i9) j9.f31483b.get()).getClass();
        if (!q6Var.l().x(null, oi.s.f95112m0) || ((u4) q6Var.f24333a).e()) {
            g4 n13 = q6Var.n();
            ((oh.b) q6Var.zzb()).getClass();
            n13.f94780o.b(System.currentTimeMillis());
        }
        long j14 = j13 - this.f74961a;
        if (!z13 && j14 < 1000) {
            q6Var.zzj().f95276n.b(Long.valueOf(j14), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z14) {
            j14 = j13 - this.f74962b;
            this.f74962b = j13;
        }
        q6Var.zzj().f95276n.b(Long.valueOf(j14), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j14);
        f7.R(q6Var.t().A(!q6Var.l().B()), bundle, true);
        if (!z14) {
            q6Var.s().W("auto", "_e", bundle);
        }
        this.f74961a = j13;
        oi.l lVar = (oi.l) this.f74963c;
        lVar.a();
        lVar.b(3600000L);
        return true;
    }

    public c(String str, byte[] bArr, long j13, long j14) {
        this.f74963c = str;
        this.f74964d = bArr;
        this.f74961a = j13;
        this.f74962b = j14;
    }
}
