package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes2.dex */
public final class j2 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f16616a;

    public j2(SearchView searchView) {
        this.f16616a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z13) {
        SearchView searchView = this.f16616a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.H;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z13);
        }
    }
}
