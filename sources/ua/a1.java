package ua;

import android.view.ViewGroup;

/* loaded from: classes3.dex */
public abstract class a1 {
    public static int a(ViewGroup viewGroup, int i13) {
        return viewGroup.getChildDrawingOrder(i13);
    }

    public static void b(ViewGroup viewGroup, boolean z13) {
        viewGroup.suppressLayout(z13);
    }
}
