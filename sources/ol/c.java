package ol;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.internal.measurement.n1;
import com.google.android.gms.internal.measurement.r0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import oi.w5;

/* loaded from: classes3.dex */
public final class c implements w5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f96347a;

    public c(d1 d1Var) {
        this.f96347a = d1Var;
    }

    @Override // oi.w5
    public final void a(String str, String str2, Bundle bundle) {
        d1 d1Var = this.f96347a;
        d1Var.getClass();
        d1Var.b(new g1(d1Var, str, str2, bundle, 1));
    }

    @Override // oi.w5
    public final void b(String str) {
        d1 d1Var = this.f96347a;
        d1Var.getClass();
        d1Var.b(new h1(d1Var, str, 0));
    }

    @Override // oi.w5
    public final void c(String str, String str2, Bundle bundle) {
        d1 d1Var = this.f96347a;
        d1Var.getClass();
        d1Var.b(new n1(d1Var, str, str2, bundle, true));
    }

    @Override // oi.w5
    public final Map d(String str, String str2, boolean z13) {
        d1 d1Var = this.f96347a;
        d1Var.getClass();
        r0 r0Var = new r0();
        d1Var.b(new j1(d1Var, str, str2, z13, r0Var));
        Bundle B = r0Var.B(5000L);
        if (B == null || B.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(B.size());
        for (String str3 : B.keySet()) {
            Object obj = B.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    @Override // oi.w5
    public final List e(String str, String str2) {
        d1 d1Var = this.f96347a;
        d1Var.getClass();
        r0 r0Var = new r0();
        d1Var.b(new g1(d1Var, str, str2, r0Var, 0));
        List list = (List) r0.C(r0Var.B(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    @Override // oi.w5
    public final void f(Bundle bundle) {
        d1 d1Var = this.f96347a;
        d1Var.getClass();
        d1Var.b(new e1(d1Var, bundle, 0));
    }

    @Override // oi.w5
    public final int zza(String str) {
        d1 d1Var = this.f96347a;
        d1Var.getClass();
        r0 r0Var = new r0();
        d1Var.b(new m1(d1Var, str, r0Var));
        Integer num = (Integer) r0.C(r0Var.B(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // oi.w5
    public final void zzb(String str) {
        d1 d1Var = this.f96347a;
        d1Var.getClass();
        d1Var.b(new h1(d1Var, str, 1));
    }

    @Override // oi.w5
    public final String zzf() {
        d1 d1Var = this.f96347a;
        d1Var.getClass();
        r0 r0Var = new r0();
        d1Var.b(new i1(d1Var, r0Var, 0));
        return r0Var.E(50L);
    }

    @Override // oi.w5
    public final String zzg() {
        d1 d1Var = this.f96347a;
        d1Var.getClass();
        r0 r0Var = new r0();
        d1Var.b(new i1(d1Var, r0Var, 4));
        return r0Var.E(500L);
    }

    @Override // oi.w5
    public final String zzh() {
        d1 d1Var = this.f96347a;
        d1Var.getClass();
        r0 r0Var = new r0();
        d1Var.b(new i1(d1Var, r0Var, 2));
        return r0Var.E(500L);
    }

    @Override // oi.w5
    public final String zzi() {
        d1 d1Var = this.f96347a;
        d1Var.getClass();
        r0 r0Var = new r0();
        d1Var.b(new i1(d1Var, r0Var, 1));
        return r0Var.E(500L);
    }

    @Override // oi.w5
    public final long zza() {
        d1 d1Var = this.f96347a;
        d1Var.getClass();
        r0 r0Var = new r0();
        d1Var.b(new i1(d1Var, r0Var, 3));
        Long D = r0Var.D();
        if (D == null) {
            long nanoTime = System.nanoTime();
            d1Var.f31350b.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i13 = d1Var.f31353e + 1;
            d1Var.f31353e = i13;
            return nextLong + i13;
        }
        return D.longValue();
    }
}
