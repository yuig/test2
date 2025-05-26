package androidx.recyclerview.widget;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public int f19523a = -1;

    public static int b(int i13, int i14) {
        int i15;
        int i16 = i13 & 3158064;
        if (i16 == 0) {
            return i13;
        }
        int i17 = i13 & (~i16);
        if (i14 == 0) {
            i15 = i16 >> 2;
        } else {
            int i18 = i16 >> 1;
            i17 |= (-3158065) & i18;
            i15 = (i18 & 3158064) >> 2;
        }
        return i17 | i15;
    }

    public static int c(int i13, int i14) {
        int i15;
        int i16 = i13 & 789516;
        if (i16 == 0) {
            return i13;
        }
        int i17 = i13 & (~i16);
        if (i14 == 0) {
            i15 = i16 << 2;
        } else {
            int i18 = i16 << 1;
            i17 |= (-789517) & i18;
            i15 = (i18 & 789516) << 2;
        }
        return i17 | i15;
    }

    public static void f(RecyclerView recyclerView, y2 y2Var, float f13, float f14, boolean z13) {
        View view = y2Var.f19717a;
        if (z13 && view.getTag(ia.c.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = q5.v0.f102521a;
            Float valueOf = Float.valueOf(q5.m0.e(view));
            int childCount = recyclerView.getChildCount();
            float f15 = 0.0f;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = recyclerView.getChildAt(i13);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = q5.v0.f102521a;
                    float e13 = q5.m0.e(childAt);
                    if (e13 > f15) {
                        f15 = e13;
                    }
                }
            }
            q5.m0.l(view, f15 + 1.0f);
            view.setTag(ia.c.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f13);
        view.setTranslationY(f14);
    }

    public abstract void a(RecyclerView recyclerView, y2 y2Var);

    public abstract int d(RecyclerView recyclerView, y2 y2Var);

    public abstract int e(RecyclerView recyclerView, int i13, int i14, long j13);
}
