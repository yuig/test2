package qn0;

import android.view.View;

/* loaded from: classes5.dex */
public final class b implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        view.removeOnLayoutChangeListener(this);
        view.scrollTo(10000, 0);
    }
}
