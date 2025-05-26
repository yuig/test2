package hi2;

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
import java.util.ArrayList;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f69242a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f69243b;

    public c(Window.Callback delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f69242a = delegate;
        this.f69243b = new ArrayList();
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f69242a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f69242a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f69242a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f69242a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f69242a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f69242a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f69242a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f69242a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f69242a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        k0.y(this.f69243b, b.f69241i);
        this.f69242a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i13, Menu p13) {
        Intrinsics.checkNotNullParameter(p13, "p1");
        return this.f69242a.onCreatePanelMenu(i13, p13);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i13) {
        return this.f69242a.onCreatePanelView(i13);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f69242a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i13, MenuItem p13) {
        Intrinsics.checkNotNullParameter(p13, "p1");
        return this.f69242a.onMenuItemSelected(i13, p13);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i13, Menu p13) {
        Intrinsics.checkNotNullParameter(p13, "p1");
        return this.f69242a.onMenuOpened(i13, p13);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i13, Menu p13) {
        Intrinsics.checkNotNullParameter(p13, "p1");
        this.f69242a.onPanelClosed(i13, p13);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i13, View view, Menu p23) {
        Intrinsics.checkNotNullParameter(p23, "p2");
        return this.f69242a.onPreparePanel(i13, view, p23);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f69242a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f69242a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z13) {
        this.f69242a.onWindowFocusChanged(z13);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f69242a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f69242a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i13) {
        return this.f69242a.onWindowStartingActionMode(callback, i13);
    }
}
