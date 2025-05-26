package ye0;

import android.view.View;
import android.view.ViewTreeObserver;
import bs1.c;

/* loaded from: classes5.dex */
public final class a implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f138839a;

    public a(View view) {
        this.f138839a = view;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z13) {
        if (z13) {
            View view = this.f138839a;
            c.V1(view);
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
