package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import io.embrace.android.embracesdk.ViewSwazzledHooks;

/* loaded from: classes2.dex */
public final class v implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityChooserView f16694a;

    public v(ActivityChooserView activityChooserView) {
        this.f16694a = activityChooserView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kg.n.a(view);
        ActivityChooserView activityChooserView = this.f16694a;
        FrameLayout frameLayout = activityChooserView.f16271e;
        u uVar = activityChooserView.f16267a;
        if (view == frameLayout) {
            activityChooserView.a();
            uVar.getClass();
            throw null;
        }
        if (view != activityChooserView.f16270d) {
            throw new IllegalArgumentException();
        }
        uVar.getClass();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ActivityChooserView activityChooserView = this.f16694a;
        activityChooserView.getClass();
        activityChooserView.getClass();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        ((u) adapterView.getAdapter()).getClass();
        ActivityChooserView activityChooserView = this.f16694a;
        activityChooserView.a();
        activityChooserView.f16267a.getClass();
        throw null;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ViewSwazzledHooks.logOnClickEvent(view, th2.n.LONG_PRESS);
        ActivityChooserView activityChooserView = this.f16694a;
        if (view != activityChooserView.f16271e) {
            throw new IllegalArgumentException();
        }
        activityChooserView.f16267a.getClass();
        throw null;
    }
}
