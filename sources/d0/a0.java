package d0;

import a.jg;
import android.util.Log;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.h1;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.q1;
import androidx.camera.core.impl.s0;
import androidx.camera.core.impl.s1;
import androidx.camera.core.impl.t0;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import c0.i0;
import c0.k1;
import c0.m1;
import c0.n0;
import com.google.common.util.concurrent.c0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import v.c1;
import v.l0;

/* loaded from: classes2.dex */
public final class a0 implements c0.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final gc.c f53486b;

    /* renamed from: c, reason: collision with root package name */
    public n f53487c;

    /* renamed from: d, reason: collision with root package name */
    public u f53488d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f53489e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f53485a = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public boolean f53490f = false;

    public a0(gc.c cVar) {
        f0.h.s();
        this.f53486b = cVar;
        this.f53489e = new ArrayList();
    }

    @Override // c0.a0
    public final void a(n0 n0Var) {
        l3.c.H0().execute(new z(this, 1));
    }

    public final void b() {
        int i13;
        f0.h.s();
        ImageCaptureException imageCaptureException = new ImageCaptureException("Camera is closed.", null);
        ArrayDeque arrayDeque = this.f53485a;
        Iterator it = arrayDeque.iterator();
        while (true) {
            i13 = 21;
            if (!it.hasNext()) {
                break;
            }
            h hVar = (h) it.next();
            hVar.getClass();
            hVar.f53515b.execute(new jg(i13, hVar, imageCaptureException));
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.f53489e).iterator();
        while (it2.hasNext()) {
            u uVar = (u) it2.next();
            uVar.getClass();
            f0.h.s();
            if (!uVar.f53570d.f106128b.isDone()) {
                f0.h.s();
                uVar.f53573g = true;
                c0 c0Var = uVar.f53575i;
                Objects.requireNonNull(c0Var);
                c0Var.cancel(true);
                uVar.f53571e.d(imageCaptureException);
                uVar.f53572f.b(null);
                f0.h.s();
                h hVar2 = uVar.f53567a;
                hVar2.getClass();
                hVar2.f53515b.execute(new jg(i13, hVar2, imageCaptureException));
            }
        }
    }

    public final void c() {
        n nVar;
        f0.h.s();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (this.f53488d != null) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.f53490f) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        n nVar2 = this.f53487c;
        nVar2.getClass();
        f0.h.s();
        if (nVar2.f53533c.f() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        h hVar = (h) this.f53485a.poll();
        if (hVar == null) {
            Log.d("TakePictureManager", "No new request.");
            return;
        }
        u uVar = new u(hVar, this);
        boolean z13 = false;
        com.bumptech.glide.d.v(null, !(this.f53488d != null));
        this.f53488d = uVar;
        f0.h.s();
        uVar.f53569c.f106128b.d(new z(this, 0 == true ? 1 : 0), l3.c.s());
        this.f53489e.add(uVar);
        f0.h.s();
        uVar.f53570d.f106128b.d(new jg(20, this, uVar), l3.c.s());
        n nVar3 = this.f53487c;
        f0.h.s();
        r4.l lVar = uVar.f53569c;
        nVar3.getClass();
        f0.h.s();
        c0.y yVar = (c0.y) nVar3.f53531a.j(h1.f16852d, new c0.y(Arrays.asList(new t0())));
        Objects.requireNonNull(yVar);
        int i13 = n.f53530f;
        n.f53530f = i13 + 1;
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(yVar.hashCode());
        List<t0> list = yVar.f24393a;
        Objects.requireNonNull(list);
        for (t0 t0Var : list) {
            c1 c1Var = new c1();
            s0 s0Var = nVar3.f53532b;
            c1Var.f123384a = s0Var.f16969c;
            c1Var.c(s0Var.f16968b);
            c1Var.a(hVar.f53523j);
            b bVar = nVar3.f53535e;
            k1 k1Var = bVar.f53492b;
            Objects.requireNonNull(k1Var);
            ((Set) c1Var.f123387d).add(k1Var);
            c1Var.f123385b = bVar.f53493c != null ? true : z13;
            if (bp1.h.u(bVar.f53495e)) {
                if (((ImageCaptureRotationOptionQuirk) i0.a.f70646a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
                    androidx.camera.core.impl.c cVar = s0.f16964i;
                } else {
                    ((q1) ((p1) c1Var.f123388e)).s(s0.f16964i, Integer.valueOf(hVar.f53520g));
                }
                nVar = nVar3;
                ((q1) ((p1) c1Var.f123388e)).s(s0.f16965j, Integer.valueOf(((hVar.f53516c != null) && e0.u.b(hVar.f53518e, bVar.f53494d)) ? hVar.f53522i == 0 ? 100 : 95 : hVar.f53521h));
            } else {
                nVar = nVar3;
            }
            c1Var.c(t0Var.f16975a.f16968b);
            z13 = false;
            ((s1) c1Var.f123390g).f16977a.put(valueOf, 0);
            ((s1) c1Var.f123390g).f16977a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i13));
            c1Var.b(bVar.f53491a);
            arrayList.add(c1Var.e());
            nVar3 = nVar;
        }
        k kVar = new k(arrayList, uVar);
        s sVar = new s(yVar, hVar.f53517d, hVar.f53518e, hVar.f53520g, hVar.f53521h, hVar.f53519f, uVar, lVar, i13);
        n nVar4 = this.f53487c;
        nVar4.getClass();
        f0.h.s();
        nVar4.f53535e.f53500j.accept(sVar);
        f0.h.s();
        i0 i0Var = (i0) this.f53486b.f64764b;
        synchronized (i0Var.f24254p) {
            try {
                if (i0Var.f24254p.get() == null) {
                    i0Var.f24254p.set(Integer.valueOf(i0Var.D()));
                }
            } finally {
            }
        }
        i0 i0Var2 = (i0) this.f53486b.f64764b;
        i0Var2.getClass();
        f0.h.s();
        g0.b j13 = g0.m.j(i0Var2.d().j(i0Var2.f24253o, i0Var2.f24255q, arrayList), new g0.l(new l0(6)), l3.c.s());
        g0.m.a(j13, new m1(2, this, kVar), l3.c.H0());
        f0.h.s();
        if (uVar.f53575i == null) {
            z13 = true;
        }
        com.bumptech.glide.d.v("CaptureRequestFuture can only be set once.", z13);
        uVar.f53575i = j13;
    }
}
