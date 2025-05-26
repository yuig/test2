package xa;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public final class j extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager f134387a;

    public j(ViewPager viewPager) {
        this.f134387a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f134387a.f();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f134387a.f();
    }
}
