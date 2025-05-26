package ua;

import android.view.View;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class o1 extends k0 {

    /* renamed from: r, reason: collision with root package name */
    public static final String[] f121336r = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int k(y0 y0Var, int i13) {
        int[] iArr;
        if (y0Var == null || (iArr = (int[]) y0Var.f121377a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i13];
    }

    @Override // ua.k0
    public final void d(y0 y0Var) {
        View view = y0Var.f121378b;
        HashMap hashMap = y0Var.f121377a;
        Integer num = (Integer) hashMap.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        hashMap.put("android:visibilityPropagation:visibility", num);
        int[] iArr = {r5, 0};
        view.getLocationOnScreen(iArr);
        int round = Math.round(view.getTranslationX()) + iArr[0];
        iArr[0] = (view.getWidth() / 2) + round;
        int round2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = round2;
        iArr[1] = (view.getHeight() / 2) + round2;
        hashMap.put("android:visibilityPropagation:center", iArr);
    }
}
