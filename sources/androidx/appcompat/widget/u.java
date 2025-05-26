package androidx.appcompat.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* loaded from: classes2.dex */
public final class u extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityChooserView f16687a;

    public u(ActivityChooserView activityChooserView) {
        this.f16687a = activityChooserView;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        throw null;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        throw null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return i13;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i13) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        ActivityChooserView activityChooserView = this.f16687a;
        if (view == null || view.getId() != i.f.list_item) {
            view = LayoutInflater.from(activityChooserView.getContext()).inflate(i.g.abc_activity_chooser_view_list_item, viewGroup, false);
        }
        activityChooserView.getContext().getPackageManager();
        getItem(i13);
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }
}
