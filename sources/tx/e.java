package tx;

import android.content.Context;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nx.d0;
import tb0.h;
import tb0.k;

/* loaded from: classes.dex */
public final class e implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f119631a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f119632b;

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f119633c;

    /* renamed from: d, reason: collision with root package name */
    public final m60.e f119634d;

    /* renamed from: e, reason: collision with root package name */
    public final h f119635e;

    /* renamed from: f, reason: collision with root package name */
    public Context f119636f;

    public e(Window.Callback delegate, Context androidContext, d0 pinalytics, bf2.d dauManagerProvider, m60.e applicationInfoProvider, h crashReporting) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(dauManagerProvider, "dauManagerProvider");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f119631a = delegate;
        this.f119632b = pinalytics;
        this.f119633c = dauManagerProvider;
        this.f119634d = applicationInfoProvider;
        this.f119635e = crashReporting;
        this.f119636f = androidContext;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f119631a.dispatchGenericMotionEvent(event);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f119631a.dispatchKeyEvent(event);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f119631a.dispatchKeyShortcutEvent(event);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f119631a.dispatchPopulateAccessibilityEvent(event);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            return this.f119631a.dispatchTouchEvent(event);
        } catch (NullPointerException e13) {
            k kVar = new k();
            String message = e13.getMessage();
            boolean z13 = false;
            if (message == null || !StringsKt.E(message, "mPrivateFlags", false)) {
                kVar.c("Exception", "NPE - Other");
                String message2 = e13.getMessage();
                if (message2 == null) {
                    message2 = "Empty";
                }
                kVar.c("NPE-Other", message2);
            } else {
                kVar.c("Exception", "NPE - mPrivateFlags");
                z13 = true;
            }
            this.f119635e.k("DispatchTouchEvent", kVar.f117102a);
            if (z13) {
                return true;
            }
            throw e13;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f119631a.dispatchTrackballEvent(event);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f119631a.onActionModeFinished(mode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f119631a.onActionModeStarted(mode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f119631a.onAttachedToWindow();
        wk2.a aVar = this.f119633c;
        ((d) aVar.get()).f119629g = true;
        m60.d dVar = (m60.d) this.f119634d;
        m60.b bVar = dVar.f85891a;
        if (bVar != m60.b.BACKGROUND_OFFLINE && bVar != m60.b.BACKGROUND && dVar.f85892b == null) {
            ((d) aVar.get()).a(this.f119636f, this.f119632b.p());
        }
        this.f119636f = null;
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.f119631a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i13, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return this.f119631a.onCreatePanelMenu(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i13) {
        return this.f119631a.onCreatePanelView(i13);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f119631a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i13, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f119631a.onMenuItemSelected(i13, item);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i13, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return this.f119631a.onMenuOpened(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i13, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.f119631a.onPanelClosed(i13, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i13, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return this.f119631a.onPreparePanel(i13, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        Intrinsics.checkNotNullParameter(searchEvent, "searchEvent");
        return this.f119631a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams attrs) {
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f119631a.onWindowAttributesChanged(attrs);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z13) {
        this.f119631a.onWindowFocusChanged(z13);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return this.f119631a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f119631a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i13) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return this.f119631a.onWindowStartingActionMode(callback, i13);
    }
}
