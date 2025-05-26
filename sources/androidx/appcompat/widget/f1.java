package androidx.appcompat.widget;

import android.widget.AbsListView;

/* loaded from: classes2.dex */
public abstract class f1 {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z13) {
        absListView.setSelectedChildViewEnabled(z13);
    }
}
