package c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.appcompat.widget.c2;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.j2;
import androidx.camera.core.impl.y2;
import androidx.camera.core.impl.z2;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i0 extends s1 {

    /* renamed from: z, reason: collision with root package name */
    public static final c0 f24252z = new c0();

    /* renamed from: o, reason: collision with root package name */
    public final int f24253o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReference f24254p;

    /* renamed from: q, reason: collision with root package name */
    public final int f24255q;

    /* renamed from: r, reason: collision with root package name */
    public int f24256r;

    /* renamed from: s, reason: collision with root package name */
    public Rational f24257s;

    /* renamed from: t, reason: collision with root package name */
    public final h0.h f24258t;

    /* renamed from: u, reason: collision with root package name */
    public i2 f24259u;

    /* renamed from: v, reason: collision with root package name */
    public d0.n f24260v;

    /* renamed from: w, reason: collision with root package name */
    public d0.a0 f24261w;

    /* renamed from: x, reason: collision with root package name */
    public j2 f24262x;

    /* renamed from: y, reason: collision with root package name */
    public final gc.c f24263y;

    public i0(androidx.camera.core.impl.h1 h1Var) {
        super(h1Var);
        this.f24254p = new AtomicReference(null);
        this.f24256r = -1;
        this.f24257s = null;
        this.f24263y = new gc.c(this, 13);
        androidx.camera.core.impl.h1 h1Var2 = (androidx.camera.core.impl.h1) this.f24339f;
        androidx.camera.core.impl.c cVar = androidx.camera.core.impl.h1.f16850b;
        if (h1Var2.d(cVar)) {
            this.f24253o = ((Integer) h1Var2.f(cVar)).intValue();
        } else {
            this.f24253o = 1;
        }
        this.f24255q = ((Integer) h1Var2.j(androidx.camera.core.impl.h1.f16857i, 0)).intValue();
        this.f24258t = new h0.h((g0) h1Var2.j(androidx.camera.core.impl.h1.f16859k, null));
    }

    public static boolean E(int i13, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i13))) {
                return true;
            }
        }
        return false;
    }

    public final void B(boolean z13) {
        d0.a0 a0Var;
        Log.d("ImageCapture", "clearPipeline");
        f0.h.s();
        j2 j2Var = this.f24262x;
        if (j2Var != null) {
            j2Var.b();
            this.f24262x = null;
        }
        d0.n nVar = this.f24260v;
        if (nVar != null) {
            nVar.a();
            this.f24260v = null;
        }
        if (z13 || (a0Var = this.f24261w) == null) {
            return;
        }
        a0Var.b();
        this.f24261w = null;
    }

    public final i2 C(String str, androidx.camera.core.impl.h1 h1Var, androidx.camera.core.impl.k kVar) {
        f0.h.s();
        Log.d("ImageCapture", "createPipeline(cameraId: " + str + ", streamSpec: " + kVar + ")");
        Size size = kVar.f16893a;
        androidx.camera.core.impl.j0 c13 = c();
        Objects.requireNonNull(c13);
        int i13 = 1;
        boolean m13 = c13.m() ^ true;
        if (this.f24260v != null) {
            com.bumptech.glide.d.v(null, m13);
            this.f24260v.a();
        }
        if (((Boolean) this.f24339f.j(androidx.camera.core.impl.h1.f16860l, Boolean.FALSE)).booleanValue()) {
            c().e().p();
        }
        this.f24260v = new d0.n(h1Var, size, m13);
        if (this.f24261w == null) {
            this.f24261w = new d0.a0(this.f24263y);
        }
        d0.a0 a0Var = this.f24261w;
        d0.n nVar = this.f24260v;
        a0Var.getClass();
        f0.h.s();
        a0Var.f53487c = nVar;
        nVar.getClass();
        f0.h.s();
        c2 c2Var = nVar.f53533c;
        c2Var.getClass();
        f0.h.s();
        com.bumptech.glide.d.v("The ImageReader is not initialized.", ((c1) c2Var.f16532c) != null);
        c1 c1Var = (c1) c2Var.f16532c;
        synchronized (c1Var.f24208a) {
            c1Var.f24213f = a0Var;
        }
        d0.n nVar2 = this.f24260v;
        i2 d2 = i2.d(kVar.f16893a, nVar2.f53531a);
        d0.b bVar = nVar2.f53535e;
        k1 k1Var = bVar.f53492b;
        Objects.requireNonNull(k1Var);
        z zVar = z.f24401d;
        c2 a13 = androidx.camera.core.impl.h.a(k1Var);
        a13.f16536g = zVar;
        d2.f16862a.add(a13.b());
        k1 k1Var2 = bVar.f53493c;
        if (k1Var2 != null) {
            d2.f16870i = androidx.camera.core.impl.h.a(k1Var2).b();
        }
        if (this.f24253o == 2 && !kVar.f16897e) {
            d().i(d2);
        }
        androidx.camera.core.impl.v0 v0Var = kVar.f16896d;
        if (v0Var != null) {
            d2.f16863b.c(v0Var);
        }
        j2 j2Var = this.f24262x;
        if (j2Var != null) {
            j2Var.b();
        }
        j2 j2Var2 = new j2(new v.i2(this, i13));
        this.f24262x = j2Var2;
        d2.f16867f = j2Var2;
        return d2;
    }

    public final int D() {
        int i13;
        synchronized (this.f24254p) {
            i13 = this.f24256r;
            if (i13 == -1) {
                i13 = ((Integer) ((androidx.camera.core.impl.h1) this.f24339f).j(androidx.camera.core.impl.h1.f16851c, 2)).intValue();
            }
        }
        return i13;
    }

    public final void F(int i13) {
        androidx.camera.core.impl.j0 c13;
        kh2.m0.p("ImageCapture", "setFlashMode: flashMode = " + i13);
        if (i13 != 0 && i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                throw new IllegalArgumentException(a.a.d("Invalid flash mode: ", i13));
            }
            if (this.f24258t.f66402a == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            }
            if (c() != null && ((c13 = c()) == null || c13.g().d() != 0)) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        synchronized (this.f24254p) {
            this.f24256r = i13;
            H();
        }
    }

    public final void G(e0 e0Var, Executor executor, fp0.b bVar) {
        Rect rect;
        int round;
        int i13;
        int i14;
        int i15;
        int i16;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            l3.c.H0().execute(new w.b(this, e0Var, executor, bVar, 3));
            return;
        }
        f0.h.s();
        if (D() == 3 && this.f24258t.f66402a == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        Log.d("ImageCapture", "takePictureInternal");
        androidx.camera.core.impl.j0 c13 = c();
        Rect rect2 = null;
        if (c13 == null) {
            ImageCaptureException e13 = new ImageCaptureException("Not bound to a valid Camera [" + this + "]", null);
            if (bVar == null) {
                throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
            }
            Intrinsics.checkNotNullParameter(e13, "e");
            bVar.f62756a.invoke(e13);
            return;
        }
        d0.a0 a0Var = this.f24261w;
        Objects.requireNonNull(a0Var);
        Rect rect3 = this.f24342i;
        androidx.camera.core.impl.k kVar = this.f24340g;
        Size size = kVar != null ? kVar.f16893a : null;
        Objects.requireNonNull(size);
        if (rect3 != null) {
            rect = rect3;
        } else {
            Rational rational = this.f24257s;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            } else {
                androidx.camera.core.impl.j0 c14 = c();
                Objects.requireNonNull(c14);
                int h10 = h(c14, false);
                Rational rational2 = new Rational(this.f24257s.getDenominator(), this.f24257s.getNumerator());
                if (!e0.u.c(h10)) {
                    rational2 = this.f24257s;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    kh2.m0.X0("ImageUtil", "Invalid view ratio.");
                } else {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    float f13 = width;
                    float f14 = height;
                    float f15 = f13 / f14;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f15) {
                        int round2 = Math.round((f13 / numerator) * denominator);
                        i15 = (height - round2) / 2;
                        i14 = round2;
                        round = width;
                        i13 = 0;
                    } else {
                        round = Math.round((f14 / denominator) * numerator);
                        i13 = (width - round) / 2;
                        i14 = height;
                        i15 = 0;
                    }
                    rect2 = new Rect(i13, i15, round + i13, i14 + i15);
                }
                Objects.requireNonNull(rect2);
            }
            rect = rect2;
        }
        Matrix matrix = this.f24343j;
        int h13 = h(c13, false);
        androidx.camera.core.impl.h1 h1Var = (androidx.camera.core.impl.h1) this.f24339f;
        androidx.camera.core.impl.c cVar = androidx.camera.core.impl.h1.f16858j;
        if (h1Var.d(cVar)) {
            i16 = ((Integer) h1Var.f(cVar)).intValue();
        } else {
            int i17 = this.f24253o;
            if (i17 == 0) {
                i16 = 100;
            } else {
                if (i17 != 1 && i17 != 2) {
                    throw new IllegalStateException(a.a.e("CaptureMode ", i17, " is invalid"));
                }
                i16 = 95;
            }
        }
        int i18 = i16;
        List unmodifiableList = Collections.unmodifiableList(this.f24259u.f16866e);
        com.bumptech.glide.d.g("onDiskCallback and outputFileOptions should be both null or both non-null.", (bVar == null) == (e0Var == null));
        com.bumptech.glide.d.g("One and only one on-disk or in-memory callback should be present.", !(bVar == null));
        d0.h hVar = new d0.h(executor, bVar, e0Var, rect, matrix, h13, i18, this.f24253o, unmodifiableList);
        f0.h.s();
        a0Var.f53485a.offer(hVar);
        a0Var.c();
    }

    public final void H() {
        synchronized (this.f24254p) {
            try {
                if (this.f24254p.get() != null) {
                    return;
                }
                d().d(D());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // c0.s1
    public final z2 f(boolean z13, c3 c3Var) {
        f24252z.getClass();
        androidx.camera.core.impl.h1 h1Var = c0.f24207a;
        androidx.camera.core.impl.v0 a13 = c3Var.a(h1Var.A(), this.f24253o);
        if (z13) {
            a13 = androidx.camera.core.impl.v0.B(a13, h1Var);
        }
        if (a13 == null) {
            return null;
        }
        return k(a13).e();
    }

    @Override // c0.s1
    public final HashSet j() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // c0.s1
    public final u.a k(androidx.camera.core.impl.v0 v0Var) {
        return new u.a(androidx.camera.core.impl.q1.k(v0Var), 3);
    }

    @Override // c0.s1
    public final void q() {
        com.bumptech.glide.d.s(c(), "Attached camera cannot be null");
        if (D() == 3) {
            androidx.camera.core.impl.j0 c13 = c();
            if (c13 == null || c13.g().d() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // c0.s1
    public final void r() {
        kh2.m0.p("ImageCapture", "onCameraControlReady");
        H();
        d().l(this.f24258t);
    }

    @Override // c0.s1
    public final z2 s(androidx.camera.core.impl.h0 h0Var, y2 y2Var) {
        Object obj;
        Object obj2;
        Object obj3;
        if (h0Var.g().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            u.a aVar = (u.a) y2Var;
            androidx.camera.core.impl.q1 q1Var = aVar.f119717b;
            androidx.camera.core.impl.c cVar = androidx.camera.core.impl.h1.f16856h;
            Object obj4 = Boolean.TRUE;
            q1Var.getClass();
            try {
                obj4 = q1Var.f(cVar);
            } catch (IllegalArgumentException unused) {
            }
            if (bool.equals(obj4)) {
                kh2.m0.X0("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                if (kh2.m0.G0(4, "ImageCapture")) {
                    Log.i("ImageCapture", "Requesting software JPEG due to device quirk.");
                }
                aVar.f119717b.s(androidx.camera.core.impl.h1.f16856h, Boolean.TRUE);
            }
        }
        u.a aVar2 = (u.a) y2Var;
        androidx.camera.core.impl.q1 q1Var2 = aVar2.f119717b;
        Boolean bool2 = Boolean.TRUE;
        androidx.camera.core.impl.c cVar2 = androidx.camera.core.impl.h1.f16856h;
        Object obj5 = Boolean.FALSE;
        q1Var2.getClass();
        try {
            obj5 = q1Var2.f(cVar2);
        } catch (IllegalArgumentException unused2) {
        }
        boolean equals = bool2.equals(obj5);
        Object obj6 = null;
        boolean z13 = false;
        if (equals) {
            if (c() != null) {
                c().e().p();
            }
            try {
                obj3 = q1Var2.f(androidx.camera.core.impl.h1.f16853e);
            } catch (IllegalArgumentException unused3) {
                obj3 = null;
            }
            Integer num = (Integer) obj3;
            if (num == null || num.intValue() == 256) {
                z13 = true;
            } else {
                kh2.m0.X0("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z13) {
                kh2.m0.X0("ImageCapture", "Unable to support software JPEG. Disabling.");
                q1Var2.s(androidx.camera.core.impl.h1.f16856h, Boolean.FALSE);
            }
        }
        androidx.camera.core.impl.c cVar3 = androidx.camera.core.impl.h1.f16853e;
        androidx.camera.core.impl.q1 q1Var3 = aVar2.f119717b;
        q1Var3.getClass();
        try {
            obj = q1Var3.f(cVar3);
        } catch (IllegalArgumentException unused4) {
            obj = null;
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            if (c() != null) {
                c().e().p();
            }
            q1Var3.s(androidx.camera.core.impl.i1.f16872an, Integer.valueOf(z13 ? 35 : num2.intValue()));
        } else {
            androidx.camera.core.impl.c cVar4 = androidx.camera.core.impl.h1.f16854f;
            q1Var3.getClass();
            try {
                obj2 = q1Var3.f(cVar4);
            } catch (IllegalArgumentException unused5) {
                obj2 = null;
            }
            if (Objects.equals(obj2, 1)) {
                q1Var3.s(androidx.camera.core.impl.i1.f16872an, 4101);
                q1Var3.s(androidx.camera.core.impl.i1.f16873bn, z.f24400c);
            } else if (z13) {
                q1Var3.s(androidx.camera.core.impl.i1.f16872an, 35);
            } else {
                androidx.camera.core.impl.c cVar5 = androidx.camera.core.impl.j1.f16887kn;
                q1Var3.getClass();
                try {
                    obj6 = q1Var3.f(cVar5);
                } catch (IllegalArgumentException unused6) {
                }
                List list = (List) obj6;
                if (list == null) {
                    q1Var3.s(androidx.camera.core.impl.i1.f16872an, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER));
                } else if (E(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, list)) {
                    q1Var3.s(androidx.camera.core.impl.i1.f16872an, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER));
                } else if (E(35, list)) {
                    q1Var3.s(androidx.camera.core.impl.i1.f16872an, 35);
                }
            }
        }
        return aVar2.e();
    }

    public final String toString() {
        return "ImageCapture:".concat(g());
    }

    @Override // c0.s1
    public final void u() {
        h0.h hVar = this.f24258t;
        hVar.c();
        hVar.b();
        d0.a0 a0Var = this.f24261w;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // c0.s1
    public final androidx.camera.core.impl.k v(androidx.camera.core.impl.v0 v0Var) {
        this.f24259u.f16863b.c(v0Var);
        Object[] objArr = {this.f24259u.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(Collections.unmodifiableList(arrayList));
        androidx.camera.core.impl.j a13 = this.f24340g.a();
        a13.f16878e = v0Var;
        return a13.b();
    }

    @Override // c0.s1
    public final androidx.camera.core.impl.k w(androidx.camera.core.impl.k kVar, androidx.camera.core.impl.k kVar2) {
        i2 C = C(e(), (androidx.camera.core.impl.h1) this.f24339f, kVar);
        this.f24259u = C;
        Object[] objArr = {C.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(Collections.unmodifiableList(arrayList));
        n();
        return kVar;
    }

    @Override // c0.s1
    public final void x() {
        h0.h hVar = this.f24258t;
        hVar.c();
        hVar.b();
        d0.a0 a0Var = this.f24261w;
        if (a0Var != null) {
            a0Var.b();
        }
        B(false);
        d().l(null);
    }
}
