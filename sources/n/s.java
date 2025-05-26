package n;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class s extends FrameLayout implements m.d {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f88704a;

    /* JADX WARN: Multi-variable type inference failed */
    public s(View view) {
        super(view.getContext());
        this.f88704a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // m.d
    public final void c() {
        this.f88704a.onActionViewExpanded();
    }

    @Override // m.d
    public final void d() {
        this.f88704a.onActionViewCollapsed();
    }
}
