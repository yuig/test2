package i2;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Set f71361a;

    /* renamed from: e, reason: collision with root package name */
    public g1.g0 f71365e;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f71362b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f71363c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f71364d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f71366f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final g1.t f71367g = new g1.t();

    /* renamed from: h, reason: collision with root package name */
    public final g1.t f71368h = new g1.t();

    public y(g1.f0 f0Var) {
        this.f71361a = f0Var;
    }

    public final void a() {
        Set set = this.f71361a;
        if (!set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    q2 q2Var = (q2) it.next();
                    it.remove();
                    q2Var.b();
                }
                Unit unit = Unit.f80348a;
                Trace.endSection();
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        }
    }

    public final void b() {
        d(Integer.MIN_VALUE);
        ArrayList arrayList = this.f71363c;
        boolean z13 = !arrayList.isEmpty();
        Set set = this.f71361a;
        if (z13) {
            Trace.beginSection("Compose:onForgotten");
            try {
                g1.g0 g0Var = this.f71365e;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    Object obj = arrayList.get(size);
                    if (obj instanceof q2) {
                        set.remove(obj);
                        ((q2) obj).c();
                    }
                    if (obj instanceof m) {
                        if (g0Var == null || !g0Var.a(obj)) {
                            ((m) obj).a();
                        } else {
                            ((m) obj).c();
                        }
                    }
                }
                Unit unit = Unit.f80348a;
                Trace.endSection();
            } finally {
            }
        }
        ArrayList arrayList2 = this.f71362b;
        if (!arrayList2.isEmpty()) {
            Trace.beginSection("Compose:onRemembered");
            try {
                int size2 = arrayList2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    q2 q2Var = (q2) arrayList2.get(i13);
                    set.remove(q2Var);
                    q2Var.a();
                }
                Unit unit2 = Unit.f80348a;
                Trace.endSection();
            } finally {
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f71364d;
        if (!arrayList.isEmpty()) {
            Trace.beginSection("Compose:sideeffects");
            try {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((Function0) arrayList.get(i13)).invoke();
                }
                arrayList.clear();
                Unit unit = Unit.f80348a;
                Trace.endSection();
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        }
    }

    public final void d(int i13) {
        ArrayList arrayList = this.f71366f;
        if (!arrayList.isEmpty()) {
            int i14 = 0;
            ArrayList arrayList2 = null;
            int i15 = 0;
            g1.t tVar = null;
            g1.t tVar2 = null;
            while (true) {
                g1.t tVar3 = this.f71368h;
                if (i15 >= tVar3.f63324b) {
                    break;
                }
                if (i13 <= tVar3.e(i15)) {
                    Object remove = arrayList.remove(i15);
                    int g13 = tVar3.g(i15);
                    int g14 = this.f71367g.g(i15);
                    if (arrayList2 == null) {
                        arrayList2 = kotlin.collections.f0.l(remove);
                        tVar2 = new g1.t();
                        tVar2.b(g13);
                        tVar = new g1.t();
                        tVar.b(g14);
                    } else {
                        Intrinsics.g(tVar, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        Intrinsics.g(tVar2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        arrayList2.add(remove);
                        tVar2.b(g13);
                        tVar.b(g14);
                    }
                } else {
                    i15++;
                }
            }
            if (arrayList2 != null) {
                Intrinsics.g(tVar, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                Intrinsics.g(tVar2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                int size = arrayList2.size() - 1;
                while (i14 < size) {
                    int i16 = i14 + 1;
                    int size2 = arrayList2.size();
                    for (int i17 = i16; i17 < size2; i17++) {
                        int e13 = tVar2.e(i14);
                        int e14 = tVar2.e(i17);
                        if (e13 < e14 || (e14 == e13 && tVar.e(i14) < tVar.e(i17))) {
                            Object obj = a0.f71069a;
                            Object obj2 = arrayList2.get(i14);
                            arrayList2.set(i14, arrayList2.get(i17));
                            arrayList2.set(i17, obj2);
                            a0.a(tVar, i14, i17);
                            a0.a(tVar2, i14, i17);
                        }
                    }
                    i14 = i16;
                }
                this.f71363c.addAll(arrayList2);
            }
        }
    }

    public final void e(int i13, int i14, Object obj, int i15) {
        d(i13);
        if (i15 < 0 || i15 >= i13) {
            this.f71363c.add(obj);
            return;
        }
        this.f71366f.add(obj);
        this.f71367g.b(i14);
        this.f71368h.b(i15);
    }
}
