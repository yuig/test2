package w21;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f2;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final TreeMap f127681a;

    static {
        TreeMap treeMap = new TreeMap();
        treeMap.put(Float.valueOf(0.0f), Float.valueOf(0.42f));
        treeMap.put(Float.valueOf(1.9f), Float.valueOf(0.49f));
        treeMap.put(Float.valueOf(1.95f), Float.valueOf(0.51f));
        treeMap.put(Float.valueOf(2.0f), Float.valueOf(0.55f));
        f127681a = treeMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(w21.y1 r16, u2.q r17, i2.o r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.e1.a(w21.y1, u2.q, i2.o, int, int):void");
    }

    public static final void b(float f13, float f14, m mVar, long j13, u2.q qVar, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(737295277);
        u2.q qVar2 = (i14 & 16) != 0 ? u2.n.f120041b : qVar;
        u2.q c13 = androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.e.b(qVar2, 1.0f), com.bumptech.glide.d.A(db0.a.pin_selection_page_top_bar_height, sVar) + f13);
        fc0.g gVar = (fc0.g) ((fc0.f) sVar.m(fc0.h.f61707g));
        int i15 = gVar.f61695a;
        c2.j1.b(c13, null, gVar.f61696b, null, 0, q2.i.c(-456098006, new i0(j13, f14, mVar), sVar), sVar, 1769472, 26);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new j0(f13, f14, mVar, j13, qVar2, i13, i14);
        }
    }

    public static final void c(String str, u2.q qVar, i2.o oVar, int i13, int i14) {
        int i15;
        u2.q qVar2;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-616587776);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (sVar.h(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
            i15 |= sVar.h(qVar) ? 32 : 16;
        }
        if ((i15 & 91) == 18 && sVar.z()) {
            sVar.Q();
            qVar2 = qVar;
        } else {
            u2.q qVar3 = i16 != 0 ? u2.n.f120041b : qVar;
            dl2.b.h(str, qVar3, null, null, sVar, (i15 & 14) | (i15 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER), 12);
            qVar2 = qVar3;
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.h(str, qVar2, i13, i14, 3);
        }
    }

    public static final float d(float f13, float f14, int i13) {
        float f15;
        float f16;
        float f17;
        float f18;
        if (i13 == 0) {
            float f19 = 2;
            f15 = (f13 * 3) / f19;
            f16 = f14 * f19;
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    float f23 = 2;
                    f17 = (f13 * 3) / f23;
                    f18 = f14 * f23;
                } else {
                    float f24 = 2;
                    f17 = f13 / f24;
                    f18 = (f14 * f24) / 3;
                }
                return f18 + f17;
            }
            float f25 = 2;
            f15 = f13 / f25;
            f16 = (f14 * f25) / 3;
        }
        return -(f16 + f15);
    }
}
