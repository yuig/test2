package cp;

import android.widget.AbsListView;

/* loaded from: classes3.dex */
public final class l implements AbsListView.OnScrollListener {
    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i13, int i14, int i15) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i13) {
        if (i13 != 0) {
            hf0.b.k(absListView);
        }
    }
}
