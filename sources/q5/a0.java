package q5;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public class a0 extends e3.e {

    /* renamed from: c, reason: collision with root package name */
    public final View f102397c;

    public a0(View view) {
        this.f102397c = view;
    }

    @Override // e3.e
    public void b() {
        View view = this.f102397c;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // e3.e
    public void c() {
        View view;
        View view2 = this.f102397c;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new z(view, 0));
    }
}
