package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* loaded from: classes2.dex */
public final class r extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityChooserView f16674b;

    public /* synthetic */ r(ActivityChooserView activityChooserView, int i13) {
        this.f16673a = i13;
        this.f16674b = activityChooserView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i13 = this.f16673a;
        ActivityChooserView activityChooserView = this.f16674b;
        switch (i13) {
            case 0:
                super.onChanged();
                activityChooserView.f16267a.notifyDataSetChanged();
                return;
            default:
                super.onChanged();
                activityChooserView.f16267a.getClass();
                throw null;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f16673a) {
            case 0:
                super.onInvalidated();
                this.f16674b.f16267a.notifyDataSetInvalidated();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
