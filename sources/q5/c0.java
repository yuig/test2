package q5;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c0 extends a0 {

    /* renamed from: d, reason: collision with root package name */
    public View f102411d;

    /* renamed from: e, reason: collision with root package name */
    public WindowInsetsController f102412e;

    @Override // q5.a0, e3.e
    public final void b() {
        int ime;
        View view = this.f102411d;
        WindowInsetsController windowInsetsController = this.f102412e;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController == null) {
            super.b();
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        b0 b0Var = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: q5.b0

            /* renamed from: a */
            public final /* synthetic */ AtomicBoolean f102404a;

            public /* synthetic */ b0(AtomicBoolean atomicBoolean2) {
                r1 = atomicBoolean2;
            }

            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i13) {
                r1.set((i13 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(b0Var);
        if (!atomicBoolean2.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(b0Var);
        ime = WindowInsets.Type.ime();
        windowInsetsController.hide(ime);
    }

    @Override // q5.a0, e3.e
    public final void c() {
        int ime;
        View view = this.f102411d;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f102412e;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        }
        super.c();
    }
}
