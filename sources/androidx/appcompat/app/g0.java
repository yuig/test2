package androidx.appcompat.app;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class g0 implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f16016a;

    /* renamed from: b, reason: collision with root package name */
    public w0 f16017b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16018c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16019d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0 f16021f;

    public g0(n0 n0Var, Window.Callback callback) {
        this.f16021f = n0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f16016a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f16018c = true;
            callback.onContentChanged();
        } finally {
            this.f16018c = false;
        }
    }

    @Override // android.view.Window.Callback
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f16016a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f16016a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void onAttachedToWindow() {
        this.f16016a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f16016a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z13 = this.f16019d;
        Window.Callback callback = this.f16016a;
        return z13 ? callback.dispatchKeyEvent(keyEvent) : this.f16021f.z(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (this.f16016a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        n0 n0Var = this.f16021f;
        n0Var.I();
        a aVar = n0Var.f16095o;
        if (aVar != null && aVar.i(keyCode, keyEvent)) {
            return true;
        }
        m0 m0Var = n0Var.M;
        if (m0Var != null && n0Var.N(m0Var, keyEvent.getKeyCode(), keyEvent)) {
            m0 m0Var2 = n0Var.M;
            if (m0Var2 == null) {
                return true;
            }
            m0Var2.f16074l = true;
            return true;
        }
        if (n0Var.M == null) {
            m0 G = n0Var.G(0);
            n0Var.O(G, keyEvent);
            boolean N = n0Var.N(G, keyEvent.getKeyCode(), keyEvent);
            G.f16073k = false;
            if (N) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f16016a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f16016a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f16016a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void onDetachedFromWindow() {
        this.f16016a.onDetachedFromWindow();
    }

    public final boolean f(int i13, Menu menu) {
        return this.f16016a.onMenuOpened(i13, menu);
    }

    public final void g(int i13, Menu menu) {
        this.f16016a.onPanelClosed(i13, menu);
    }

    @Override // android.view.Window.Callback
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void onPointerCaptureChanged(boolean z13) {
        m.q.a(this.f16016a, z13);
    }

    public final void i(List list, Menu menu, int i13) {
        m.p.a(this.f16016a, list, menu, i13);
    }

    @Override // android.view.Window.Callback
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f16016a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void onWindowFocusChanged(boolean z13) {
        this.f16016a.onWindowFocusChanged(z13);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f16018c) {
            this.f16016a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i13, Menu menu) {
        if (i13 != 0 || (menu instanceof n.o)) {
            return this.f16016a.onCreatePanelMenu(i13, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i13) {
        View a13;
        w0 w0Var = this.f16017b;
        return (w0Var == null || (a13 = w0Var.a(i13)) == null) ? this.f16016a.onCreatePanelView(i13) : a13;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i13, MenuItem menuItem) {
        return this.f16016a.onMenuItemSelected(i13, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i13, Menu menu) {
        f(i13, menu);
        n0 n0Var = this.f16021f;
        if (i13 == 108) {
            n0Var.I();
            a aVar = n0Var.f16095o;
            if (aVar != null) {
                aVar.c(true);
            }
        } else {
            n0Var.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i13, Menu menu) {
        if (this.f16020e) {
            this.f16016a.onPanelClosed(i13, menu);
            return;
        }
        g(i13, menu);
        n0 n0Var = this.f16021f;
        if (i13 == 108) {
            n0Var.I();
            a aVar = n0Var.f16095o;
            if (aVar != null) {
                aVar.c(false);
                return;
            }
            return;
        }
        if (i13 != 0) {
            n0Var.getClass();
            return;
        }
        m0 G = n0Var.G(i13);
        if (G.f16075m) {
            n0Var.x(G, false);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i13, View view, Menu menu) {
        n.o oVar = menu instanceof n.o ? (n.o) menu : null;
        if (i13 == 0 && oVar == null) {
            return false;
        }
        if (oVar != null) {
            oVar.z(true);
        }
        w0 w0Var = this.f16017b;
        if (w0Var != null) {
            w0Var.b(i13);
        }
        boolean onPreparePanel = this.f16016a.onPreparePanel(i13, view, menu);
        if (oVar != null) {
            oVar.z(false);
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i13) {
        n.o oVar = this.f16021f.G(0).f16070h;
        if (oVar != null) {
            i(list, oVar, i13);
        } else {
            i(list, menu, i13);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return m.o.a(this.f16016a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f16016a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i13) {
        n0 n0Var = this.f16021f;
        n0Var.getClass();
        if (i13 != 0) {
            return m.o.b(this.f16016a, callback, i13);
        }
        m.h hVar = new m.h(n0Var.f16091k, callback);
        m.c p13 = n0Var.p(hVar);
        if (p13 != null) {
            return hVar.z(p13);
        }
        return null;
    }
}
