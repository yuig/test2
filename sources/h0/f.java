package h0;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.e2;
import androidx.camera.core.impl.f2;
import androidx.camera.core.impl.g0;
import androidx.camera.core.impl.h0;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.j1;
import androidx.camera.core.impl.o2;
import androidx.camera.core.impl.q1;
import androidx.camera.core.impl.v0;
import androidx.camera.core.impl.v1;
import androidx.camera.core.impl.w1;
import androidx.camera.core.impl.z2;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import c0.i0;
import c0.l;
import c0.p0;
import c0.r;
import c0.s1;
import c0.w0;
import e0.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kh2.m0;
import v.h1;
import v.r2;

/* loaded from: classes2.dex */
public final class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f66381a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f66382b;

    /* renamed from: c, reason: collision with root package name */
    public final sp2.i f66383c;

    /* renamed from: d, reason: collision with root package name */
    public final c3 f66384d;

    /* renamed from: e, reason: collision with root package name */
    public final a f66385e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f66386f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f66387g;

    /* renamed from: h, reason: collision with root package name */
    public final a0.a f66388h;

    /* renamed from: i, reason: collision with root package name */
    public List f66389i;

    /* renamed from: j, reason: collision with root package name */
    public final a0 f66390j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f66391k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f66392l;

    /* renamed from: m, reason: collision with root package name */
    public v0 f66393m;

    /* renamed from: n, reason: collision with root package name */
    public s1 f66394n;

    /* renamed from: o, reason: collision with root package name */
    public p0.d f66395o;

    /* renamed from: p, reason: collision with root package name */
    public final e2 f66396p;

    /* renamed from: q, reason: collision with root package name */
    public final f2 f66397q;

    /* renamed from: r, reason: collision with root package name */
    public final f2 f66398r;

    /* renamed from: s, reason: collision with root package name */
    public final p0 f66399s;

    /* renamed from: t, reason: collision with root package name */
    public final p0 f66400t;

    public f(j0 j0Var, j0 j0Var2, f2 f2Var, f2 f2Var2, a0.a aVar, sp2.i iVar, h1 h1Var) {
        p0 p0Var = p0.f24292f;
        this.f66386f = new ArrayList();
        this.f66387g = new ArrayList();
        this.f66389i = Collections.emptyList();
        this.f66391k = new Object();
        this.f66392l = true;
        this.f66393m = null;
        this.f66381a = j0Var;
        this.f66382b = j0Var2;
        this.f66399s = p0Var;
        this.f66400t = p0Var;
        this.f66388h = aVar;
        this.f66383c = iVar;
        this.f66384d = h1Var;
        a0 a0Var = f2Var.f16840c;
        this.f66390j = a0Var;
        a0Var.p();
        this.f66396p = new e2(j0Var.d());
        this.f66397q = f2Var;
        this.f66398r = f2Var2;
        this.f66385e = s(f2Var, f2Var2);
    }

    public static Matrix o(Rect rect, Size size) {
        com.bumptech.glide.d.g("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static a s(f2 f2Var, f2 f2Var2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f2Var.f16843a.c());
        sb3.append(f2Var2 == null ? "" : f2Var2.f16843a.c());
        return new a(sb3.toString(), ((c0) f2Var.f16840c).f16812a);
    }

    public static HashMap t(ArrayList arrayList, c3 c3Var, c3 c3Var2) {
        z2 f13;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s1 s1Var = (s1) it.next();
            if (s1Var instanceof p0.d) {
                p0.d dVar = (p0.d) s1Var;
                w1 w1Var = new w1(v1.b(new u.a(4).f119717b));
                j1.m(w1Var);
                w0 w0Var = new w0(w1Var);
                w0Var.f24374p = w0.f24372w;
                z2 f14 = w0Var.f(false, c3Var);
                if (f14 == null) {
                    f13 = null;
                } else {
                    q1 k13 = q1.k(f14);
                    k13.f16980a.remove(k.f66416vo);
                    f13 = dVar.k(k13).e();
                }
            } else {
                f13 = s1Var.f(false, c3Var);
            }
            z2 f15 = s1Var.f(true, c3Var2);
            e eVar = new e();
            eVar.f66379a = f13;
            eVar.f66380b = f15;
            hashMap.put(s1Var, eVar);
        }
        return hashMap;
    }

    public static boolean x(androidx.camera.core.impl.k kVar, o2 o2Var) {
        v0 v0Var = o2Var.f16937g.f16968b;
        v0 v0Var2 = kVar.f16896d;
        if (v0Var2.a().size() != o2Var.f16937g.f16968b.a().size()) {
            return true;
        }
        for (androidx.camera.core.impl.c cVar : v0Var2.a()) {
            if (!v0Var.d(cVar) || !Objects.equals(v0Var.f(cVar), v0Var2.f(cVar))) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList z(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((s1) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it2.next());
                throw null;
            }
        }
        return arrayList2;
    }

    public final void A(LinkedHashSet linkedHashSet, boolean z13, boolean z14) {
        int i13;
        HashMap hashMap;
        androidx.camera.core.impl.k kVar;
        v0 v0Var;
        int i14;
        synchronized (this.f66391k) {
            w();
            synchronized (this.f66391k) {
                try {
                    if (!this.f66389i.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            s1 s1Var = (s1) it.next();
                            if (s1Var instanceof i0) {
                                z2 z2Var = s1Var.f24339f;
                                androidx.camera.core.impl.c cVar = androidx.camera.core.impl.h1.f16854f;
                                if (z2Var.d(cVar)) {
                                    Integer num = (Integer) z2Var.f(cVar);
                                    num.getClass();
                                    if (num.intValue() == 1) {
                                        throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                } finally {
                }
            }
            if (!z13) {
                w();
            }
            p0.d q13 = q(linkedHashSet, z13);
            s1 h10 = h(linkedHashSet, q13);
            ArrayList arrayList = new ArrayList(linkedHashSet);
            if (h10 != null) {
                arrayList.add(h10);
            }
            if (q13 != null) {
                arrayList.add(q13);
                arrayList.removeAll(q13.f98311p.f98328a);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.removeAll(this.f66387g);
            ArrayList arrayList3 = new ArrayList(arrayList);
            arrayList3.retainAll(this.f66387g);
            ArrayList arrayList4 = new ArrayList(this.f66387g);
            arrayList4.removeAll(arrayList);
            HashMap t13 = t(arrayList2, (c3) this.f66390j.j(a0.Um, c3.f16813a), this.f66384d);
            Map emptyMap = Collections.emptyMap();
            try {
                synchronized (this.f66391k) {
                    try {
                        i13 = this.f66388h.f202a == 2 ? 1 : 0;
                    } finally {
                    }
                }
                HashMap hashMap2 = t13;
                HashMap p13 = p(i13, this.f66381a.g(), arrayList2, arrayList3, t13);
                if (this.f66382b != null) {
                    synchronized (this.f66391k) {
                        try {
                            i14 = this.f66388h.f202a == 2 ? 1 : 0;
                        } finally {
                        }
                    }
                    j0 j0Var = this.f66382b;
                    Objects.requireNonNull(j0Var);
                    hashMap = p13;
                    emptyMap = p(i14, j0Var.g(), arrayList2, arrayList3, hashMap2);
                } else {
                    hashMap = p13;
                }
                Map map = emptyMap;
                B(arrayList, hashMap);
                ArrayList z15 = z(arrayList, this.f66389i);
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                arrayList5.removeAll(arrayList);
                ArrayList z16 = z(arrayList5, z15);
                if (z16.size() > 0) {
                    m0.X0("CameraUseCaseAdapter", "Unused effects: " + z16);
                }
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    ((s1) it2.next()).z(this.f66381a);
                }
                this.f66381a.k(arrayList4);
                if (this.f66382b != null) {
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        s1 s1Var2 = (s1) it3.next();
                        j0 j0Var2 = this.f66382b;
                        Objects.requireNonNull(j0Var2);
                        s1Var2.z(j0Var2);
                    }
                    j0 j0Var3 = this.f66382b;
                    Objects.requireNonNull(j0Var3);
                    j0Var3.k(arrayList4);
                }
                if (arrayList4.isEmpty()) {
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        s1 s1Var3 = (s1) it4.next();
                        if (hashMap.containsKey(s1Var3) && (v0Var = (kVar = (androidx.camera.core.impl.k) hashMap.get(s1Var3)).f16896d) != null && x(kVar, s1Var3.f24346m)) {
                            s1Var3.f24340g = s1Var3.v(v0Var);
                            if (this.f66392l) {
                                this.f66381a.c(s1Var3);
                                j0 j0Var4 = this.f66382b;
                                if (j0Var4 != null) {
                                    j0Var4.c(s1Var3);
                                }
                            }
                        }
                    }
                }
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    s1 s1Var4 = (s1) it5.next();
                    HashMap hashMap3 = hashMap2;
                    e eVar = (e) hashMap3.get(s1Var4);
                    Objects.requireNonNull(eVar);
                    j0 j0Var5 = this.f66382b;
                    if (j0Var5 != null) {
                        s1Var4.a(this.f66381a, j0Var5, eVar.f66379a, eVar.f66380b);
                        androidx.camera.core.impl.k kVar2 = (androidx.camera.core.impl.k) hashMap.get(s1Var4);
                        kVar2.getClass();
                        s1Var4.f24340g = s1Var4.w(kVar2, (androidx.camera.core.impl.k) map.get(s1Var4));
                    } else {
                        s1Var4.a(this.f66381a, null, eVar.f66379a, eVar.f66380b);
                        androidx.camera.core.impl.k kVar3 = (androidx.camera.core.impl.k) hashMap.get(s1Var4);
                        kVar3.getClass();
                        s1Var4.f24340g = s1Var4.w(kVar3, null);
                    }
                    hashMap2 = hashMap3;
                }
                if (this.f66392l) {
                    this.f66381a.l(arrayList2);
                    j0 j0Var6 = this.f66382b;
                    if (j0Var6 != null) {
                        j0Var6.l(arrayList2);
                    }
                }
                Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    ((s1) it6.next()).p();
                }
                this.f66386f.clear();
                this.f66386f.addAll(linkedHashSet);
                this.f66387g.clear();
                this.f66387g.addAll(arrayList);
                this.f66394n = h10;
                this.f66395o = q13;
            } catch (IllegalArgumentException e13) {
                if (!z13) {
                    w();
                    if (this.f66388h.f202a != 2) {
                        A(linkedHashSet, true, z14);
                        return;
                    }
                }
                throw e13;
            }
        }
    }

    public final void B(ArrayList arrayList, HashMap hashMap) {
        synchronized (this.f66391k) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    s1 s1Var = (s1) it.next();
                    Rect c13 = this.f66381a.d().c();
                    androidx.camera.core.impl.k kVar = (androidx.camera.core.impl.k) hashMap.get(s1Var);
                    kVar.getClass();
                    Matrix o13 = o(c13, kVar.f16893a);
                    s1Var.getClass();
                    s1Var.f24343j = new Matrix(o13);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // c0.l
    public final r a() {
        return this.f66397q;
    }

    public final void b(Collection collection) {
        synchronized (this.f66391k) {
            try {
                this.f66381a.i(this.f66390j);
                j0 j0Var = this.f66382b;
                if (j0Var != null) {
                    j0Var.i(this.f66390j);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f66386f);
                linkedHashSet.addAll(collection);
                try {
                    j0 j0Var2 = this.f66382b;
                    A(linkedHashSet, j0Var2 != null, j0Var2 != null);
                } catch (IllegalArgumentException e13) {
                    throw new CameraUseCaseAdapter$CameraException(e13);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        synchronized (this.f66391k) {
            try {
                if (!this.f66392l) {
                    if (!this.f66387g.isEmpty()) {
                        this.f66381a.i(this.f66390j);
                        j0 j0Var = this.f66382b;
                        if (j0Var != null) {
                            j0Var.i(this.f66390j);
                        }
                    }
                    this.f66381a.l(this.f66387g);
                    j0 j0Var2 = this.f66382b;
                    if (j0Var2 != null) {
                        j0Var2.l(this.f66387g);
                    }
                    synchronized (this.f66391k) {
                        try {
                            if (this.f66393m != null) {
                                this.f66381a.d().h(this.f66393m);
                            }
                        } finally {
                        }
                    }
                    Iterator it = this.f66387g.iterator();
                    while (it.hasNext()) {
                        ((s1) it.next()).p();
                    }
                    this.f66392l = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final s1 h(LinkedHashSet linkedHashSet, p0.d dVar) {
        boolean z13;
        boolean z14;
        s1 s1Var;
        synchronized (this.f66391k) {
            try {
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (dVar != null) {
                    arrayList.add(dVar);
                    arrayList.removeAll(dVar.f98311p.f98328a);
                }
                synchronized (this.f66391k) {
                    z13 = false;
                    z14 = ((Integer) this.f66390j.j(a0.Vm, 0)).intValue() == 1;
                }
                if (z14) {
                    Iterator it = arrayList.iterator();
                    boolean z15 = false;
                    boolean z16 = false;
                    while (it.hasNext()) {
                        s1 s1Var2 = (s1) it.next();
                        if (!(s1Var2 instanceof w0) && !(s1Var2 instanceof p0.d)) {
                            if (s1Var2 instanceof i0) {
                                z15 = true;
                            }
                        }
                        z16 = true;
                    }
                    if (!z15 || z16) {
                        Iterator it2 = arrayList.iterator();
                        boolean z17 = false;
                        while (it2.hasNext()) {
                            s1 s1Var3 = (s1) it2.next();
                            if (!(s1Var3 instanceof w0) && !(s1Var3 instanceof p0.d)) {
                                if (s1Var3 instanceof i0) {
                                    z17 = true;
                                }
                            }
                            z13 = true;
                        }
                        if (z13 && !z17) {
                            s1 s1Var4 = this.f66394n;
                            if (s1Var4 instanceof i0) {
                                s1Var = s1Var4;
                            } else {
                                u.a aVar = new u.a(3);
                                aVar.f119717b.s(k.f66415uo, "ImageCapture-Extra");
                                s1Var = aVar.a();
                            }
                        }
                    } else {
                        s1 s1Var5 = this.f66394n;
                        if (!(s1Var5 instanceof w0)) {
                            u.a aVar2 = new u.a(4);
                            aVar2.f119717b.s(k.f66415uo, "Preview-Extra");
                            w1 w1Var = new w1(v1.b(aVar2.f119717b));
                            j1.m(w1Var);
                            w0 w0Var = new w0(w1Var);
                            w0Var.f24374p = w0.f24372w;
                            w0Var.C(new gs1.b());
                            s1Var = w0Var;
                        }
                    }
                }
                s1Var = null;
            } finally {
            }
        }
        return s1Var;
    }

    public final HashMap p(int i13, h0 h0Var, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap) {
        sp2.i iVar;
        Rect rect;
        boolean z13;
        ArrayList arrayList3 = new ArrayList();
        String c13 = h0Var.c();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            iVar = this.f66383c;
            if (!hasNext) {
                break;
            }
            s1 s1Var = (s1) it.next();
            int l13 = s1Var.f24339f.l();
            androidx.camera.core.impl.k kVar = s1Var.f24340g;
            Size size = kVar != null ? kVar.f16893a : null;
            r2 r2Var = (r2) ((Map) iVar.f114928b).get(c13);
            androidx.camera.core.impl.l c14 = r2Var != null ? androidx.camera.core.impl.l.c(i13, l13, size, r2Var.i(l13)) : null;
            int l14 = s1Var.f24339f.l();
            androidx.camera.core.impl.k kVar2 = s1Var.f24340g;
            Size size2 = kVar2 != null ? kVar2.f16893a : null;
            kVar2.getClass();
            androidx.camera.core.impl.a aVar = new androidx.camera.core.impl.a(c14, l14, size2, kVar2.f16894b, p0.d.F(s1Var), s1Var.f24340g.f16896d, (Range) s1Var.f24339f.j(z2.f17021sn, null));
            arrayList3.add(aVar);
            hashMap3.put(aVar, s1Var);
            hashMap2.put(s1Var, s1Var.f24340g);
        }
        if (!arrayList.isEmpty()) {
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            try {
                rect = this.f66381a.d().c();
            } catch (NullPointerException unused) {
                rect = null;
            }
            i iVar2 = new i(h0Var, rect != null ? u.e(rect) : null);
            Iterator it2 = arrayList.iterator();
            boolean z14 = false;
            while (it2.hasNext()) {
                s1 s1Var2 = (s1) it2.next();
                e eVar = (e) hashMap.get(s1Var2);
                z2 m13 = s1Var2.m(h0Var, eVar.f66379a, eVar.f66380b);
                hashMap4.put(m13, s1Var2);
                hashMap5.put(m13, iVar2.d(m13));
                z2 z2Var = s1Var2.f24339f;
                if (z2Var instanceof w1) {
                    z14 = ((w1) z2Var).r() == 2;
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z13 = false;
                    break;
                }
                s1 s1Var3 = (s1) it3.next();
                if (s1Var3 != null) {
                    if (s1Var3.f24339f.d(z2.f17024vn)) {
                        if (s1Var3.f24339f.A() == b3.VIDEO_CAPTURE) {
                            z13 = true;
                            break;
                        }
                    } else {
                        Log.e("CameraUseCaseAdapter", s1Var3 + " UseCase does not have capture type.");
                    }
                }
            }
            iVar.getClass();
            com.bumptech.glide.d.g("No new use cases to be bound.", !hashMap5.isEmpty());
            r2 r2Var2 = (r2) ((Map) iVar.f114928b).get(c13);
            if (r2Var2 == null) {
                throw new IllegalArgumentException(a.a.j("No such camera id in supported combination list: ", c13));
            }
            Pair g13 = r2Var2.g(i13, arrayList3, hashMap5, z14, z13);
            for (Map.Entry entry : hashMap4.entrySet()) {
                hashMap2.put((s1) entry.getValue(), (androidx.camera.core.impl.k) ((Map) g13.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) g13.second).entrySet()) {
                if (hashMap3.containsKey(entry2.getKey())) {
                    hashMap2.put((s1) hashMap3.get(entry2.getKey()), (androidx.camera.core.impl.k) entry2.getValue());
                }
            }
        }
        return hashMap2;
    }

    public final p0.d q(LinkedHashSet linkedHashSet, boolean z13) {
        synchronized (this.f66391k) {
            try {
                HashSet u13 = u(linkedHashSet, z13);
                if (u13.size() < 2) {
                    w();
                    return null;
                }
                p0.d dVar = this.f66395o;
                if (dVar != null && dVar.f98311p.f98328a.equals(u13)) {
                    p0.d dVar2 = this.f66395o;
                    Objects.requireNonNull(dVar2);
                    return dVar2;
                }
                int[] iArr = {1, 2, 4};
                HashSet hashSet = new HashSet();
                Iterator it = u13.iterator();
                while (it.hasNext()) {
                    s1 s1Var = (s1) it.next();
                    for (int i13 = 0; i13 < 3; i13++) {
                        int i14 = iArr[i13];
                        Iterator it2 = s1Var.j().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                int intValue = ((Integer) it2.next()).intValue();
                                if ((i14 & intValue) == intValue) {
                                    if (hashSet.contains(Integer.valueOf(i14))) {
                                        return null;
                                    }
                                    hashSet.add(Integer.valueOf(i14));
                                }
                            }
                        }
                    }
                }
                return new p0.d(this.f66381a, this.f66382b, this.f66399s, this.f66400t, u13, this.f66384d);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void r() {
        synchronized (this.f66391k) {
            try {
                if (this.f66392l) {
                    this.f66381a.k(new ArrayList(this.f66387g));
                    j0 j0Var = this.f66382b;
                    if (j0Var != null) {
                        j0Var.k(new ArrayList(this.f66387g));
                    }
                    synchronized (this.f66391k) {
                        g0 d2 = this.f66381a.d();
                        this.f66393m = d2.f();
                        d2.m();
                    }
                    this.f66392l = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final HashSet u(LinkedHashSet linkedHashSet, boolean z13) {
        int i13;
        HashSet hashSet = new HashSet();
        synchronized (this.f66391k) {
            Iterator it = this.f66389i.iterator();
            if (it.hasNext()) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                throw null;
            }
            i13 = z13 ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            s1 s1Var = (s1) it2.next();
            com.bumptech.glide.d.g("Only support one level of sharing for now.", !(s1Var instanceof p0.d));
            Iterator it3 = s1Var.j().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int intValue = ((Integer) it3.next()).intValue();
                    if ((i13 & intValue) == intValue) {
                        hashSet.add(s1Var);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    public final List v() {
        ArrayList arrayList;
        synchronized (this.f66391k) {
            arrayList = new ArrayList(this.f66386f);
        }
        return arrayList;
    }

    public final void w() {
        synchronized (this.f66391k) {
            this.f66390j.p();
        }
    }

    public final void y(ArrayList arrayList) {
        synchronized (this.f66391k) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f66386f);
            linkedHashSet.removeAll(arrayList);
            j0 j0Var = this.f66382b;
            A(linkedHashSet, j0Var != null, j0Var != null);
        }
    }
}
