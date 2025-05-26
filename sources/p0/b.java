package p0;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.h0;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.z2;
import e0.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kh2.m0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final double f98296h = Math.sqrt(2.3703703703703702d);

    /* renamed from: a, reason: collision with root package name */
    public final Size f98297a;

    /* renamed from: b, reason: collision with root package name */
    public final Rational f98298b;

    /* renamed from: c, reason: collision with root package name */
    public final Rational f98299c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f98300d;

    /* renamed from: e, reason: collision with root package name */
    public final h0.i f98301e;

    /* renamed from: f, reason: collision with root package name */
    public final h0 f98302f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f98303g;

    public b(j0 j0Var, HashSet hashSet) {
        Size e13 = u.e(j0Var.d().c());
        h0 g13 = j0Var.g();
        h0.i iVar = new h0.i(g13, e13);
        this.f98303g = new HashMap();
        this.f98297a = e13;
        Rational rational = ((double) e13.getWidth()) / ((double) e13.getHeight()) > f98296h ? e0.b.f56695c : e0.b.f56693a;
        m0.p("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + e13 + ") is " + rational + ".");
        this.f98298b = rational;
        Rational rational2 = e0.b.f56693a;
        if (rational.equals(rational2)) {
            rational2 = e0.b.f56695c;
        } else if (!rational.equals(e0.b.f56695c)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.f98299c = rational2;
        this.f98302f = g13;
        this.f98300d = hashSet;
        this.f98301e = iVar;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational g13 = g(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational g14 = g(size);
        if (g13.floatValue() == g14.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (g13.floatValue() > g14.floatValue()) {
                float f13 = width;
                float floatValue = f13 / g13.floatValue();
                float f14 = (height - floatValue) / 2.0f;
                rectF = new RectF(0.0f, f14, f13, floatValue + f14);
            } else {
                float f15 = height;
                float floatValue2 = g13.floatValue() * f15;
                float f16 = (width - floatValue2) / 2.0f;
                rectF = new RectF(f16, 0.0f, floatValue2 + f16, f15);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean c(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational g(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List b(z2 z2Var) {
        Rational rational;
        if (!this.f98300d.contains(z2Var)) {
            throw new IllegalArgumentException("Invalid child config: " + z2Var);
        }
        HashMap hashMap = this.f98303g;
        if (hashMap.containsKey(z2Var)) {
            List list = (List) hashMap.get(z2Var);
            Objects.requireNonNull(list);
            return list;
        }
        ArrayList<Size> d2 = this.f98301e.d(z2Var);
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : d2) {
            Iterator it = hashMap2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rational = null;
                    break;
                }
                rational = (Rational) it.next();
                Rational rational2 = e0.b.f56693a;
                if (e0.b.a(size, rational, k0.c.f77783c)) {
                    break;
                }
            }
            if (rational != null) {
                Size size2 = (Size) hashMap2.get(rational);
                Objects.requireNonNull(size2);
                if (size.getHeight() <= size2.getHeight()) {
                    if (size.getWidth() <= size2.getWidth()) {
                        if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                        }
                    }
                }
            } else {
                rational = g(size);
            }
            arrayList.add(size);
            hashMap2.put(rational, size);
        }
        hashMap.put(z2Var, arrayList);
        return arrayList;
    }

    public final boolean d(Rational rational, Size size) {
        Rational rational2 = this.f98298b;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = e0.b.f56693a;
        Size size2 = k0.c.f77783c;
        if (e0.b.a(size, rational, size2)) {
            return false;
        }
        float floatValue = rational2.floatValue();
        float floatValue2 = rational.floatValue();
        Rational rational4 = e0.b.f56693a;
        if (!e0.b.a(size, rational4, size2)) {
            rational4 = e0.b.f56695c;
            if (!e0.b.a(size, rational4, size2)) {
                rational4 = g(size);
            }
        }
        float floatValue3 = rational4.floatValue();
        if (floatValue == floatValue2 || floatValue2 == floatValue3) {
            return false;
        }
        if (floatValue > floatValue2) {
            if (floatValue2 >= floatValue3) {
                return false;
            }
        } else if (floatValue2 <= floatValue3) {
            return false;
        }
        return true;
    }

    public final ArrayList e(List list, boolean z13) {
        List list2;
        HashMap hashMap = new HashMap();
        Rational rational = e0.b.f56693a;
        hashMap.put(rational, new ArrayList());
        Rational rational2 = e0.b.f56695c;
        hashMap.put(rational2, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        list2 = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (e0.b.a(size, rational3, k0.c.f77783c)) {
                        list2 = (List) hashMap.get(rational3);
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new ArrayList();
                    Rational g13 = g(size);
                    arrayList.add(g13);
                    hashMap.put(g13, list2);
                }
                list2.add(size);
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2, new a(g(this.f98297a)));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Rational rational4 = (Rational) it3.next();
            if (!rational4.equals(e0.b.f56695c) && !rational4.equals(e0.b.f56693a)) {
                List list3 = (List) hashMap.get(rational4);
                Objects.requireNonNull(list3);
                arrayList3.addAll(f(rational4, list3, z13));
            }
        }
        return arrayList3;
    }

    public final ArrayList f(Rational rational, List list, boolean z13) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = e0.b.f56693a;
            if (e0.b.a(size, rational, k0.c.f77783c)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new e0.f(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.f98300d.iterator();
        while (it2.hasNext()) {
            List<Size> b13 = b((z2) it2.next());
            if (!z13) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : b13) {
                    if (!d(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                b13 = arrayList3;
            }
            if (b13.isEmpty()) {
                return new ArrayList();
            }
            if (b13.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = b13.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!c((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (b13.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = b13.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                        if (c((Size) it4.next(), size4)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
