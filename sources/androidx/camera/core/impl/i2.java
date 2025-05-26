package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class i2 extends h2 {
    public static i2 d(Size size, z2 z2Var) {
        if (((l2) z2Var.j(z2.f17018pn, null)) == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + ((String) z2Var.j(h0.k.f66415uo, z2Var.toString())));
        }
        i2 i2Var = new i2();
        o2 o2Var = (o2) z2Var.j(z2.f17016nn, null);
        v0 v0Var = v1.f16979c;
        int i13 = o2.a().f16937g.f16969c;
        if (o2Var != null) {
            i13 = o2Var.f16937g.f16969c;
            for (CameraDevice.StateCallback stateCallback : o2Var.f16933c) {
                ArrayList arrayList = i2Var.f16864c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : o2Var.f16934d) {
                ArrayList arrayList2 = i2Var.f16865d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            i2Var.f16863b.a(o2Var.f16937g.f16971e);
            v0Var = o2Var.f16937g.f16968b;
        }
        v.c1 c1Var = i2Var.f16863b;
        c1Var.getClass();
        c1Var.f123388e = q1.k(v0Var);
        if (z2Var instanceof w1) {
            Rational rational = z.d.f140503a;
            if (((PreviewPixelHDRnetQuirk) y.b.f136245a.b(PreviewPixelHDRnetQuirk.class)) != null && !z.d.f140503a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                u.a aVar = new u.a(0);
                aVar.f(CaptureRequest.TONEMAP_MODE, 2);
                i2Var.f16863b.c(aVar.c());
            }
        }
        u.b bVar = new u.b(z2Var);
        i2Var.f16863b.f123384a = ((Integer) ((v0) bVar.f64764b).j(u.b.f119718c, Integer.valueOf(i13))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) ((v0) bVar.f64764b).j(u.b.f119720e, new v.l1());
        ArrayList arrayList3 = i2Var.f16864c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) ((v0) bVar.f64764b).j(u.b.f119721f, new v.k1());
        ArrayList arrayList4 = i2Var.f16865d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        v.n1 n1Var = new v.n1((CameraCaptureSession.CaptureCallback) ((v0) bVar.f64764b).j(u.b.f119722g, new v.j0()));
        i2Var.f16863b.b(n1Var);
        ArrayList arrayList5 = i2Var.f16866e;
        if (!arrayList5.contains(n1Var)) {
            arrayList5.add(n1Var);
        }
        int o13 = z2Var.o();
        if (o13 != 0) {
            v.c1 c1Var2 = i2Var.f16863b;
            c1Var2.getClass();
            if (o13 != 0) {
                ((q1) ((p1) c1Var2.f123388e)).s(z2.f17026xn, Integer.valueOf(o13));
            }
        }
        int r13 = z2Var.r();
        if (r13 != 0) {
            v.c1 c1Var3 = i2Var.f16863b;
            c1Var3.getClass();
            if (r13 != 0) {
                ((q1) ((p1) c1Var3.f123388e)).s(z2.f17025wn, Integer.valueOf(r13));
            }
        }
        q1 c13 = q1.c();
        c cVar = u.b.f119723h;
        c13.s(cVar, (String) ((v0) bVar.f64764b).j(cVar, null));
        c cVar2 = u.b.f119719d;
        Long l13 = (Long) ((v0) bVar.f64764b).j(cVar2, -1L);
        l13.getClass();
        c13.s(cVar2, l13);
        i2Var.f16863b.c(c13);
        i2Var.f16863b.c(u.a.d((v0) bVar.f64764b).b());
        return i2Var;
    }

    public final void a(v0 v0Var) {
        this.f16863b.c(v0Var);
    }

    public final void b(z0 z0Var, c0.z zVar, int i13) {
        androidx.appcompat.widget.c2 a13 = h.a(z0Var);
        a13.f16533d = null;
        if (zVar == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        a13.f16536g = zVar;
        a13.f16534e = Integer.valueOf(i13);
        this.f16862a.add(a13.b());
        ((Set) this.f16863b.f123387d).add(z0Var);
    }

    public final o2 c() {
        return new o2(new ArrayList(this.f16862a), new ArrayList(this.f16864c), new ArrayList(this.f16865d), new ArrayList(this.f16866e), this.f16863b.e(), this.f16867f, this.f16868g, this.f16869h, this.f16870i);
    }
}
