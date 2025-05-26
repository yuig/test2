package ua;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class x extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f121366c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup f121367a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f121368b;

    public static void a(View view, ArrayList arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (!this.f121368b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            int i13 = e0.ghost_view_holder;
            ViewGroup viewGroup = this.f121367a;
            viewGroup.setTag(i13, null);
            viewGroup.getOverlay().remove(this);
            this.f121368b = false;
        }
    }
}
