package ni;

import android.os.Bundle;
import android.os.SystemClock;
import com.bumptech.glide.d;
import com.google.android.gms.measurement.internal.zznc;
import g1.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import oi.a6;
import oi.b6;
import oi.f7;
import oi.k5;
import oi.o;
import oi.o4;
import oi.s5;
import oi.u4;
import oi.y3;
import q5.h1;
import q8.m0;

/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public final u4 f90564a;

    /* renamed from: b, reason: collision with root package name */
    public final k5 f90565b;

    public b(u4 u4Var) {
        d.t(u4Var);
        this.f90564a = u4Var;
        k5 k5Var = u4Var.f95212p;
        u4.b(k5Var);
        this.f90565b = k5Var;
    }

    @Override // oi.w5
    public final void a(String str, String str2, Bundle bundle) {
        k5 k5Var = this.f90564a.f95212p;
        u4.b(k5Var);
        k5Var.G(str, str2, bundle);
    }

    @Override // oi.w5
    public final void b(String str) {
        u4 u4Var = this.f90564a;
        o i13 = u4Var.i();
        u4Var.f95210n.getClass();
        i13.B(SystemClock.elapsedRealtime(), str);
    }

    @Override // oi.w5
    public final void c(String str, String str2, Bundle bundle) {
        k5 k5Var = this.f90565b;
        ((oh.b) k5Var.zzb()).getClass();
        k5Var.H(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // oi.w5
    public final Map d(String str, String str2, boolean z13) {
        k5 k5Var = this.f90565b;
        if (k5Var.zzl().A()) {
            k5Var.zzj().f95268f.c("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (m0.d()) {
            k5Var.zzj().f95268f.c("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        o4 o4Var = ((u4) k5Var.f24333a).f95206j;
        u4.d(o4Var);
        o4Var.t(atomicReference, 5000L, "get user properties", new s5(k5Var, atomicReference, str, str2, z13));
        List<zznc> list = (List) atomicReference.get();
        if (list == null) {
            y3 zzj = k5Var.zzj();
            zzj.f95268f.b(Boolean.valueOf(z13), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.emptyMap();
        }
        g gVar = new g(list.size());
        for (zznc zzncVar : list) {
            Object e13 = zzncVar.e();
            if (e13 != null) {
                gVar.put(zzncVar.f32038g, e13);
            }
        }
        return gVar;
    }

    @Override // oi.w5
    public final List e(String str, String str2) {
        k5 k5Var = this.f90565b;
        if (k5Var.zzl().A()) {
            k5Var.zzj().f95268f.c("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (m0.d()) {
            k5Var.zzj().f95268f.c("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        o4 o4Var = ((u4) k5Var.f24333a).f95206j;
        u4.d(o4Var);
        o4Var.t(atomicReference, 5000L, "get conditional user properties", new h1(k5Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return f7.i0(list);
        }
        k5Var.zzj().f95268f.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // oi.w5
    public final void f(Bundle bundle) {
        k5 k5Var = this.f90565b;
        ((oh.b) k5Var.zzb()).getClass();
        k5Var.C(bundle, System.currentTimeMillis());
    }

    @Override // oi.w5
    public final int zza(String str) {
        d.o(str);
        return 25;
    }

    @Override // oi.w5
    public final void zzb(String str) {
        u4 u4Var = this.f90564a;
        o i13 = u4Var.i();
        u4Var.f95210n.getClass();
        i13.x(SystemClock.elapsedRealtime(), str);
    }

    @Override // oi.w5
    public final String zzf() {
        return (String) this.f90565b.f94910g.get();
    }

    @Override // oi.w5
    public final String zzg() {
        a6 a6Var = ((u4) this.f90565b.f24333a).f95211o;
        u4.b(a6Var);
        b6 b6Var = a6Var.f94645c;
        if (b6Var != null) {
            return b6Var.f94698b;
        }
        return null;
    }

    @Override // oi.w5
    public final String zzh() {
        a6 a6Var = ((u4) this.f90565b.f24333a).f95211o;
        u4.b(a6Var);
        b6 b6Var = a6Var.f94645c;
        if (b6Var != null) {
            return b6Var.f94697a;
        }
        return null;
    }

    @Override // oi.w5
    public final String zzi() {
        return (String) this.f90565b.f94910g.get();
    }

    @Override // oi.w5
    public final long zza() {
        f7 f7Var = this.f90564a.f95208l;
        u4.c(f7Var);
        return f7Var.x0();
    }
}
