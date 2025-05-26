package j3;

import android.view.View;
import kh2.b0;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final View f74542a;

    public b(View view) {
        this.f74542a = view;
    }

    public final void a(int i13) {
        boolean d03 = b0.d0(i13, 0);
        View view = this.f74542a;
        if (d03) {
            view.performHapticFeedback(0);
        } else if (b0.d0(i13, 9)) {
            view.performHapticFeedback(9);
        }
    }
}
