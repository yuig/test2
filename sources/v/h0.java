package v;

import a.a4;
import a.jg;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import kh2.n3;

/* loaded from: classes2.dex */
public final class h0 implements androidx.camera.core.impl.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f123489a;

    /* renamed from: b, reason: collision with root package name */
    public final w.l f123490b;

    /* renamed from: c, reason: collision with root package name */
    public final sp2.i f123491c;

    /* renamed from: e, reason: collision with root package name */
    public n f123493e;

    /* renamed from: g, reason: collision with root package name */
    public final g0 f123495g;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.camera.core.impl.r f123497i;

    /* renamed from: j, reason: collision with root package name */
    public final f1 f123498j;

    /* renamed from: d, reason: collision with root package name */
    public final Object f123492d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public g0 f123494f = null;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f123496h = null;

    public h0(w.t tVar, String str) {
        str.getClass();
        this.f123489a = str;
        w.l b13 = tVar.b(str);
        this.f123490b = b13;
        this.f123491c = new sp2.i(this, 5);
        androidx.camera.core.impl.r s13 = kh2.n.s(b13);
        this.f123497i = s13;
        this.f123498j = new f1(str, s13);
        this.f123495g = new g0(new c0.e(c0.t.CLOSED, null));
    }

    @Override // androidx.camera.core.impl.h0
    public final Set a() {
        return ((x.b) gc.c.I(this.f123490b).f64764b).a();
    }

    @Override // c0.r
    public final int b() {
        return o(0);
    }

    @Override // androidx.camera.core.impl.h0
    public final String c() {
        return this.f123489a;
    }

    @Override // c0.r
    public final int d() {
        Integer num = (Integer) this.f123490b.a(CameraCharacteristics.LENS_FACING);
        com.bumptech.glide.d.g("Unable to get the lens facing of the camera.", num != null);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(a.a.e("The given lens facing integer: ", intValue, " can not be recognized."));
    }

    @Override // androidx.camera.core.impl.h0
    public final List e(int i13) {
        w.y b13 = this.f123490b.b();
        HashMap hashMap = b13.f126950d;
        Size[] sizeArr = null;
        if (!hashMap.containsKey(Integer.valueOf(i13))) {
            Size[] highResolutionOutputSizes = ((StreamConfigurationMap) b13.f126947a.f126926a).getHighResolutionOutputSizes(i13);
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length > 0) {
                highResolutionOutputSizes = b13.f126948b.j(highResolutionOutputSizes, i13);
            }
            hashMap.put(Integer.valueOf(i13), highResolutionOutputSizes);
            if (highResolutionOutputSizes != null) {
                sizeArr = (Size[]) highResolutionOutputSizes.clone();
            }
        } else if (((Size[]) hashMap.get(Integer.valueOf(i13))) != null) {
            sizeArr = (Size[]) ((Size[]) hashMap.get(Integer.valueOf(i13))).clone();
        }
        return sizeArr != null ? Arrays.asList(sizeArr) : Collections.emptyList();
    }

    @Override // c0.r
    public final boolean f() {
        w.l lVar = this.f123490b;
        Objects.requireNonNull(lVar);
        return kh2.w.g0(new e0(lVar, 0));
    }

    @Override // androidx.camera.core.impl.h0
    public final androidx.camera.core.impl.r g() {
        return this.f123497i;
    }

    @Override // androidx.camera.core.impl.h0
    public final List h(int i13) {
        Size[] a13 = this.f123490b.b().a(i13);
        return a13 != null ? Arrays.asList(a13) : Collections.emptyList();
    }

    @Override // androidx.camera.core.impl.h0
    public final void i(androidx.camera.core.impl.n nVar) {
        synchronized (this.f123492d) {
            try {
                n nVar2 = this.f123493e;
                if (nVar2 != null) {
                    nVar2.f123547c.execute(new jg(2, nVar2, nVar));
                    return;
                }
                ArrayList arrayList = this.f123496h;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == nVar) {
                        it.remove();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.h0
    public final boolean j() {
        int[] iArr = (int[]) this.f123490b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i13 : iArr) {
                if (i13 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.h0
    public final void l(f0.d dVar, b1.c cVar) {
        synchronized (this.f123492d) {
            try {
                n nVar = this.f123493e;
                if (nVar != null) {
                    nVar.f123547c.execute(new a4(nVar, dVar, cVar, 1));
                } else {
                    if (this.f123496h == null) {
                        this.f123496h = new ArrayList();
                    }
                    this.f123496h.add(new Pair(cVar, dVar));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.h0
    public final androidx.camera.core.impl.v2 m() {
        Integer num = (Integer) this.f123490b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? androidx.camera.core.impl.v2.UPTIME : androidx.camera.core.impl.v2.REALTIME;
    }

    @Override // c0.r
    public final String n() {
        Integer num = (Integer) this.f123490b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // c0.r
    public final int o(int i13) {
        Integer num = (Integer) this.f123490b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return n3.y(n3.K0(i13), num.intValue(), 1 == d());
    }

    @Override // androidx.camera.core.impl.h0
    public final androidx.camera.core.impl.c1 p() {
        return this.f123498j;
    }

    @Override // c0.r
    public final androidx.lifecycle.h0 q() {
        synchronized (this.f123492d) {
            try {
                n nVar = this.f123493e;
                if (nVar != null) {
                    g0 g0Var = this.f123494f;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    return (androidx.lifecycle.l0) nVar.f123553i.f123430f;
                }
                if (this.f123494f == null) {
                    c3 b13 = d3.b(this.f123490b);
                    e3 e3Var = new e3(b13.l(), b13.f());
                    e3Var.d();
                    this.f123494f = new g0(h0.b.c(e3Var));
                }
                return this.f123494f;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void r(n nVar) {
        synchronized (this.f123492d) {
            try {
                this.f123493e = nVar;
                g0 g0Var = this.f123494f;
                if (g0Var != null) {
                    g0Var.m((androidx.lifecycle.l0) nVar.f123553i.f123430f);
                }
                ArrayList arrayList = this.f123496h;
                int i13 = 1;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        n nVar2 = this.f123493e;
                        Executor executor = (Executor) pair.second;
                        androidx.camera.core.impl.n nVar3 = (androidx.camera.core.impl.n) pair.first;
                        nVar2.getClass();
                        nVar2.f123547c.execute(new a4(nVar2, executor, nVar3, i13));
                    }
                    this.f123496h = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Integer num = (Integer) this.f123490b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int intValue = num.intValue();
        String j13 = a.a.j("Device Level: ", intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? a.a.d("Unknown value: ", intValue) : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL" : "INFO_SUPPORTED_HARDWARE_LEVEL_3" : "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY" : "INFO_SUPPORTED_HARDWARE_LEVEL_FULL" : "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED");
        if (kh2.m0.G0(4, "Camera2CameraInfo")) {
            Log.i("Camera2CameraInfo", j13);
        }
    }
}
