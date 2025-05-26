package a1;

import android.content.SharedPreferences;
import androidx.camera.core.impl.v2;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import com.google.android.gms.internal.measurement.h3;
import com.google.android.gms.internal.measurement.q3;
import d0.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import oi.a7;
import oi.g4;
import oi.s;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public long f238a;

    /* renamed from: b, reason: collision with root package name */
    public Object f239b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f240c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f241d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f242e;

    public d(a7 a7Var) {
        this.f242e = a7Var;
    }

    public final void a(q3 q3Var) {
        this.f239b = q3Var;
    }

    public final boolean b(long j13, h3 h3Var) {
        if (((List) this.f241d) == null) {
            this.f241d = new ArrayList();
        }
        if (((List) this.f240c) == null) {
            this.f240c = new ArrayList();
        }
        if (!((List) this.f241d).isEmpty() && ((((h3) ((List) this.f241d).get(0)).D() / 1000) / 60) / 60 != ((h3Var.D() / 1000) / 60) / 60) {
            return false;
        }
        long a13 = this.f238a + h3Var.a(null);
        a7 a7Var = (a7) this.f242e;
        a7Var.G();
        if (a13 >= Math.max(0, ((Integer) s.f95105j.a(null)).intValue())) {
            return false;
        }
        this.f238a = a13;
        ((List) this.f241d).add(h3Var);
        ((List) this.f240c).add(Long.valueOf(j13));
        int size = ((List) this.f241d).size();
        a7Var.G();
        return size < Math.max(1, ((Integer) s.f95107k.a(null)).intValue());
    }

    public final void c() {
        g4 g4Var = (g4) this.f242e;
        g4Var.p();
        ((oh.b) g4Var.zzb()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = g4Var.w().edit();
        edit.remove((String) this.f240c);
        edit.remove((String) this.f241d);
        edit.putLong((String) this.f239b, currentTimeMillis);
        edit.apply();
    }

    public d(g4 g4Var, long j13) {
        this.f242e = g4Var;
        com.bumptech.glide.d.o("health_monitor");
        com.bumptech.glide.d.j(j13 > 0);
        this.f239b = "health_monitor:start";
        this.f240c = "health_monitor:count";
        this.f241d = "health_monitor:value";
        this.f238a = j13;
    }

    public d(o oVar, v2 v2Var, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.f238a = -1L;
        this.f239b = oVar;
        this.f240c = v2Var;
        this.f242e = cameraUseInconsistentTimebaseQuirk;
    }
}
