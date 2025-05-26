package hc;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class f0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f68642a = new f0();

    /* renamed from: b, reason: collision with root package name */
    public static final tb.c f68643b = tb.c.k("c", "v", "i", "o");

    @Override // hc.l0
    public final Object f(ic.d dVar, float f13) {
        if (dVar.g() == ic.c.BEGIN_ARRAY) {
            dVar.a();
        }
        dVar.c();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z13 = false;
        while (dVar.hasNext()) {
            int k13 = dVar.k(f68643b);
            if (k13 == 0) {
                z13 = dVar.R0();
            } else if (k13 == 1) {
                arrayList = r.c(dVar, f13);
            } else if (k13 == 2) {
                arrayList2 = r.c(dVar, f13);
            } else if (k13 != 3) {
                dVar.m();
                dVar.E();
            } else {
                arrayList3 = r.c(dVar, f13);
            }
        }
        dVar.e();
        if (dVar.g() == ic.c.END_ARRAY) {
            dVar.d();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayList.isEmpty()) {
            return new ec.q(new PointF(), false, Collections.emptyList());
        }
        int size = arrayList.size();
        PointF pointF = (PointF) arrayList.get(0);
        ArrayList arrayList4 = new ArrayList(size);
        for (int i13 = 1; i13 < size; i13++) {
            PointF pointF2 = (PointF) arrayList.get(i13);
            int i14 = i13 - 1;
            arrayList4.add(new cc.a(jc.f.a((PointF) arrayList.get(i14), (PointF) arrayList3.get(i14)), jc.f.a(pointF2, (PointF) arrayList2.get(i13)), pointF2));
        }
        if (z13) {
            PointF pointF3 = (PointF) arrayList.get(0);
            int i15 = size - 1;
            arrayList4.add(new cc.a(jc.f.a((PointF) arrayList.get(i15), (PointF) arrayList3.get(i15)), jc.f.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
        }
        return new ec.q(pointF, z13, arrayList4);
    }
}
