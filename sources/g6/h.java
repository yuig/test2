package g6;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import kh2.c3;

/* loaded from: classes3.dex */
public final class h implements a {

    /* renamed from: p, reason: collision with root package name */
    public static final e f63660p = new e(8);

    /* renamed from: q, reason: collision with root package name */
    public static final e f63661q = new e(9);

    /* renamed from: r, reason: collision with root package name */
    public static final e f63662r = new e(10);

    /* renamed from: s, reason: collision with root package name */
    public static final e f63663s = new e(11);

    /* renamed from: t, reason: collision with root package name */
    public static final e f63664t = new e(12);

    /* renamed from: u, reason: collision with root package name */
    public static final e f63665u = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public float f63666a;

    /* renamed from: b, reason: collision with root package name */
    public float f63667b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f63668c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f63669d;

    /* renamed from: e, reason: collision with root package name */
    public final c3 f63670e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f63671f;

    /* renamed from: g, reason: collision with root package name */
    public final float f63672g;

    /* renamed from: h, reason: collision with root package name */
    public final float f63673h;

    /* renamed from: i, reason: collision with root package name */
    public long f63674i;

    /* renamed from: j, reason: collision with root package name */
    public final float f63675j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f63676k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f63677l;

    /* renamed from: m, reason: collision with root package name */
    public i f63678m;

    /* renamed from: n, reason: collision with root package name */
    public float f63679n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f63680o;

    public h(Object obj) {
        xj.g gVar = xj.h.f135101q;
        this.f63666a = 0.0f;
        this.f63667b = Float.MAX_VALUE;
        this.f63668c = false;
        this.f63671f = false;
        this.f63672g = Float.MAX_VALUE;
        this.f63673h = -3.4028235E38f;
        this.f63674i = 0L;
        this.f63676k = new ArrayList();
        this.f63677l = new ArrayList();
        this.f63669d = obj;
        this.f63670e = gVar;
        if (gVar == f63662r || gVar == f63663s || gVar == f63664t) {
            this.f63675j = 0.1f;
        } else if (gVar == f63665u) {
            this.f63675j = 0.00390625f;
        } else if (gVar == f63660p || gVar == f63661q) {
            this.f63675j = 0.00390625f;
        } else {
            this.f63675j = 1.0f;
        }
        this.f63678m = null;
        this.f63679n = Float.MAX_VALUE;
        this.f63680o = false;
    }

    public final void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f63671f) {
            b();
        }
    }

    public final void b() {
        int i13 = 0;
        this.f63671f = false;
        ThreadLocal threadLocal = d.f63650g;
        if (threadLocal.get() == null) {
            threadLocal.set(new d());
        }
        d dVar = (d) threadLocal.get();
        dVar.f63651a.remove(this);
        ArrayList arrayList = dVar.f63652b;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
            dVar.f63656f = true;
        }
        this.f63674i = 0L;
        this.f63668c = false;
        while (true) {
            ArrayList arrayList2 = this.f63676k;
            if (i13 >= arrayList2.size()) {
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    if (arrayList2.get(size) == null) {
                        arrayList2.remove(size);
                    }
                }
                return;
            }
            if (arrayList2.get(i13) != null) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList2.get(i13));
                throw null;
            }
            i13++;
        }
    }

    public final void c(float f13) {
        this.f63670e.o0(f13, this.f63669d);
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f63677l;
            if (i13 >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i13) != null) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(i13));
                throw null;
            }
            i13++;
        }
    }

    public final void d() {
        if (this.f63678m.f63682b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f63671f) {
            this.f63680o = true;
        }
    }

    public final void e() {
        i iVar = this.f63678m;
        if (iVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d2 = (float) iVar.f63689i;
        if (d2 > this.f63672g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < this.f63673h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.f63675j * 0.75f);
        iVar.f63684d = abs;
        iVar.f63685e = abs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z13 = this.f63671f;
        if (z13 || z13) {
            return;
        }
        this.f63671f = true;
        if (!this.f63668c) {
            this.f63667b = this.f63670e.N(this.f63669d);
        }
        float f13 = this.f63667b;
        if (f13 > this.f63672g || f13 < this.f63673h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = d.f63650g;
        if (threadLocal.get() == null) {
            threadLocal.set(new d());
        }
        d dVar = (d) threadLocal.get();
        ArrayList arrayList = dVar.f63652b;
        if (arrayList.size() == 0) {
            if (dVar.f63654d == null) {
                dVar.f63654d = new c(dVar.f63653c);
            }
            dVar.f63654d.q();
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public h(View view, e eVar) {
        this.f63666a = 0.0f;
        this.f63667b = Float.MAX_VALUE;
        this.f63668c = false;
        this.f63671f = false;
        this.f63672g = Float.MAX_VALUE;
        this.f63673h = -3.4028235E38f;
        this.f63674i = 0L;
        this.f63676k = new ArrayList();
        this.f63677l = new ArrayList();
        this.f63669d = view;
        this.f63670e = eVar;
        if (eVar != f63662r && eVar != f63663s && eVar != f63664t) {
            if (eVar == f63665u) {
                this.f63675j = 0.00390625f;
            } else if (eVar != f63660p && eVar != f63661q) {
                this.f63675j = 1.0f;
            } else {
                this.f63675j = 0.00390625f;
            }
        } else {
            this.f63675j = 0.1f;
        }
        this.f63678m = null;
        this.f63679n = Float.MAX_VALUE;
        this.f63680o = false;
        this.f63678m = new i(1.0f);
    }
}
