package zv;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142836a;

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View parent, View child) {
        switch (this.f142836a) {
            case 0:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(child, "child");
                if (child instanceof ImageView) {
                    ((ImageView) child).setAdjustViewBounds(true);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(child, "child");
                if (child instanceof ImageView) {
                    ((ImageView) child).setAdjustViewBounds(true);
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View parent, View child) {
        switch (this.f142836a) {
            case 0:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(child, "child");
                break;
            default:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(child, "child");
                break;
        }
    }
}
