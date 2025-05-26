package p0;

import a.z0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.j1;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.o2;
import androidx.camera.core.impl.z2;
import c0.i0;
import c0.q0;
import c0.r1;
import c0.s1;
import c0.w0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import e0.u;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import l0.o;
import l0.r;
import l0.s;

/* loaded from: classes2.dex */
public final class g implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f98328a;

    /* renamed from: e, reason: collision with root package name */
    public final c3 f98332e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f98333f;

    /* renamed from: g, reason: collision with root package name */
    public final j0 f98334g;

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f98336i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f98337j;

    /* renamed from: k, reason: collision with root package name */
    public final b f98338k;

    /* renamed from: l, reason: collision with root package name */
    public final b f98339l;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f98329b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f98330c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f98331d = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final q0 f98335h = new q0(this, 3);

    public g(j0 j0Var, j0 j0Var2, HashSet hashSet, c3 c3Var, z0 z0Var) {
        this.f98333f = j0Var;
        this.f98334g = j0Var2;
        this.f98332e = c3Var;
        this.f98328a = hashSet;
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            s1 s1Var = (s1) it.next();
            hashMap.put(s1Var, s1Var.m(j0Var.g(), null, s1Var.f(true, c3Var)));
        }
        this.f98337j = hashMap;
        HashSet hashSet2 = new HashSet(hashMap.values());
        this.f98336i = hashSet2;
        this.f98338k = new b(j0Var, hashSet2);
        if (this.f98334g != null) {
            this.f98339l = new b(this.f98334g, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            s1 s1Var2 = (s1) it2.next();
            this.f98331d.put(s1Var2, Boolean.FALSE);
            this.f98330c.put(s1Var2, new f(j0Var, this, z0Var));
        }
    }

    public static void q(s sVar, androidx.camera.core.impl.z0 z0Var, o2 o2Var) {
        sVar.e();
        try {
            f0.h.s();
            sVar.b();
            r rVar = sVar.f81278l;
            Objects.requireNonNull(rVar);
            rVar.g(z0Var, new o(rVar, 1));
        } catch (DeferrableSurface$SurfaceClosedException unused) {
            k2 k2Var = o2Var.f16936f;
            if (k2Var != null) {
                k2Var.a(o2Var, m2.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    public static androidx.camera.core.impl.z0 r(s1 s1Var) {
        List b13 = s1Var instanceof i0 ? s1Var.f24346m.b() : Collections.unmodifiableList(s1Var.f24346m.f16937g.f16967a);
        com.bumptech.glide.d.v(null, b13.size() <= 1);
        if (b13.size() == 1) {
            return (androidx.camera.core.impl.z0) b13.get(0);
        }
        return null;
    }

    @Override // c0.r1
    public final void b(s1 s1Var) {
        f0.h.s();
        if (t(s1Var)) {
            return;
        }
        this.f98331d.put(s1Var, Boolean.TRUE);
        androidx.camera.core.impl.z0 r13 = r(s1Var);
        if (r13 != null) {
            q(s(s1Var), r13, s1Var.f24346m);
        }
    }

    @Override // c0.r1
    public final void c(s1 s1Var) {
        f0.h.s();
        if (t(s1Var)) {
            s s13 = s(s1Var);
            androidx.camera.core.impl.z0 r13 = r(s1Var);
            if (r13 != null) {
                q(s13, r13, s1Var.f24346m);
                return;
            }
            f0.h.s();
            s13.b();
            s13.f81278l.a();
        }
    }

    @Override // c0.r1
    public final void h(s1 s1Var) {
        androidx.camera.core.impl.z0 r13;
        f0.h.s();
        s s13 = s(s1Var);
        if (t(s1Var) && (r13 = r(s1Var)) != null) {
            q(s13, r13, s1Var.f24346m);
        }
    }

    @Override // c0.r1
    public final void o(s1 s1Var) {
        f0.h.s();
        if (t(s1Var)) {
            this.f98331d.put(s1Var, Boolean.FALSE);
            s s13 = s(s1Var);
            f0.h.s();
            s13.b();
            s13.f81278l.a();
        }
    }

    public final n0.c p(s1 s1Var, b bVar, j0 j0Var, s sVar, int i13, boolean z13) {
        Size size;
        Size size2;
        int o13 = j0Var.g().o(i13);
        Matrix matrix = sVar.f81268b;
        RectF rectF = u.f56755a;
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        boolean z14 = false;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = (f14 * f16) + (f13 * f15);
        float f18 = (f13 * f16) - (f14 * f15);
        double sqrt = Math.sqrt((f14 * f14) + (f13 * f13)) * Math.sqrt((f16 * f16) + (f15 * f15));
        boolean z15 = ((float) Math.toDegrees(Math.atan2(((double) f18) / sqrt, ((double) f17) / sqrt))) > 0.0f;
        z2 z2Var = (z2) this.f98337j.get(s1Var);
        Objects.requireNonNull(z2Var);
        sVar.f81268b.getValues(new float[9]);
        int h10 = u.h((int) Math.round(Math.atan2(r9[3], r9[0]) * 57.29577951308232d));
        bVar.getClass();
        boolean c13 = u.c(h10);
        Rect rect = sVar.f81270d;
        if (c13) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            z14 = true;
        }
        if (z13) {
            size2 = u.e(rect);
            Iterator it = bVar.b(z2Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Size e13 = u.e(b.a((Size) it.next(), size2));
                if (!b.c(e13, size2)) {
                    size2 = e13;
                    break;
                }
            }
        } else {
            Size e14 = u.e(rect);
            List b13 = bVar.b(z2Var);
            Iterator it2 = b13.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = b13.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = e14;
                            break;
                        }
                        Size size3 = (Size) it3.next();
                        if (!b.c(size3, e14)) {
                            size = size3;
                            break;
                        }
                    }
                } else {
                    size = (Size) it2.next();
                    Rational rational = e0.b.f56693a;
                    Size size4 = k0.c.f77783c;
                    if (!e0.b.a(e14, rational, size4)) {
                        rational = e0.b.f56695c;
                        if (!e0.b.a(e14, rational, size4)) {
                            rational = b.g(e14);
                        }
                    }
                    if (!bVar.d(rational, size) && !b.c(size, e14)) {
                        break;
                    }
                }
            }
            rect = b.a(e14, size);
            size2 = size;
        }
        Pair pair = new Pair(rect, size2);
        Rect rect2 = (Rect) pair.first;
        Size size5 = (Size) pair.second;
        if (z14) {
            Size size6 = new Size(size5.getHeight(), size5.getWidth());
            rect2 = new Rect(rect2.top, rect2.left, rect2.bottom, rect2.right);
            size5 = size6;
        }
        Pair pair2 = new Pair(rect2, size5);
        Rect rect3 = (Rect) pair2.first;
        Size size7 = (Size) pair2.second;
        int o14 = this.f98333f.g().o(((j1) s1Var.f24339f).n());
        f fVar = (f) this.f98330c.get(s1Var);
        Objects.requireNonNull(fVar);
        fVar.f98326c.f98345c = o14;
        int h13 = u.h((sVar.f81275i + o14) - o13);
        return new n0.c(UUID.randomUUID(), s1Var instanceof w0 ? 1 : s1Var instanceof i0 ? 4 : 2, s1Var instanceof i0 ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : 34, rect3, u.g(h13, size7), h13, s1Var.l(j0Var) ^ z15);
    }

    public final s s(s1 s1Var) {
        s sVar = (s) this.f98329b.get(s1Var);
        Objects.requireNonNull(sVar);
        return sVar;
    }

    public final boolean t(s1 s1Var) {
        Boolean bool = (Boolean) this.f98331d.get(s1Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void u(HashMap hashMap) {
        HashMap hashMap2 = this.f98329b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        for (Map.Entry entry : hashMap2.entrySet()) {
            s1 s1Var = (s1) entry.getKey();
            s sVar = (s) entry.getValue();
            s1Var.y(sVar.f81270d);
            s1Var.f24343j = new Matrix(sVar.f81268b);
            s1Var.f24340g = s1Var.w(sVar.f81273g, null);
            s1Var.p();
        }
    }
}
