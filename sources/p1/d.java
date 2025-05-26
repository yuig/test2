package p1;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f98492a = new c(1);

    /* renamed from: b, reason: collision with root package name */
    public static final c f98493b = new c(2);

    public static int a(int i13, int i14, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i15 = 0;
        int i16 = 0;
        float f13 = 0.0f;
        for (int i17 = 0; i17 < size; i17++) {
            q3.r rVar = (q3.r) list.get(i17);
            float h10 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.g(rVar));
            int d2 = rVar.d(i13);
            if (h10 == 0.0f) {
                i16 += d2;
            } else if (h10 > 0.0f) {
                f13 += h10;
                i15 = Math.max(i15, Math.round(d2 / h10));
            }
        }
        return ((list.size() - 1) * i14) + Math.round(i15 * f13) + i16;
    }

    public static int b(int i13, int i14, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i14, i13);
        int size = list.size();
        int i15 = 0;
        float f13 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            q3.r rVar = (q3.r) list.get(i16);
            float h10 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.g(rVar));
            if (h10 == 0.0f) {
                int min2 = Math.min(rVar.d(Integer.MAX_VALUE), i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i13 - min);
                min += min2;
                i15 = Math.max(i15, rVar.P(min2));
            } else if (h10 > 0.0f) {
                f13 += h10;
            }
        }
        int round = f13 == 0.0f ? 0 : i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i13 - min, 0) / f13);
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            q3.r rVar2 = (q3.r) list.get(i17);
            float h13 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.g(rVar2));
            if (h13 > 0.0f) {
                i15 = Math.max(i15, rVar2.P(round != Integer.MAX_VALUE ? Math.round(round * h13) : Integer.MAX_VALUE));
            }
        }
        return i15;
    }

    public static int c(int i13, int i14, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i15 = 0;
        int i16 = 0;
        float f13 = 0.0f;
        for (int i17 = 0; i17 < size; i17++) {
            q3.r rVar = (q3.r) list.get(i17);
            float h10 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.g(rVar));
            int D = rVar.D(i13);
            if (h10 == 0.0f) {
                i16 += D;
            } else if (h10 > 0.0f) {
                f13 += h10;
                i15 = Math.max(i15, Math.round(D / h10));
            }
        }
        return ((list.size() - 1) * i14) + Math.round(i15 * f13) + i16;
    }

    public static int d(int i13, int i14, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i14, i13);
        int size = list.size();
        int i15 = 0;
        float f13 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            q3.r rVar = (q3.r) list.get(i16);
            float h10 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.g(rVar));
            if (h10 == 0.0f) {
                int min2 = Math.min(rVar.d(Integer.MAX_VALUE), i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i13 - min);
                min += min2;
                i15 = Math.max(i15, rVar.N(min2));
            } else if (h10 > 0.0f) {
                f13 += h10;
            }
        }
        int round = f13 == 0.0f ? 0 : i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i13 - min, 0) / f13);
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            q3.r rVar2 = (q3.r) list.get(i17);
            float h13 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.g(rVar2));
            if (h13 > 0.0f) {
                i15 = Math.max(i15, rVar2.N(round != Integer.MAX_VALUE ? Math.round(round * h13) : Integer.MAX_VALUE));
            }
        }
        return i15;
    }

    public abstract int e(int i13, n4.k kVar);
}
