package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e2;
import androidx.appcompat.widget.j3;
import androidx.fragment.app.FragmentActivity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class n extends FragmentActivity implements o, c5.k0 {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private t mDelegate;
    private Resources mResources;

    public n() {
        getSavedStateRegistry().c(DELEGATE_TAG, new l(this));
        addOnContextAvailableListener(new m(this, 0));
    }

    @Override // androidx.activity.o, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        n0 n0Var = (n0) getDelegate();
        n0Var.B();
        ((ViewGroup) n0Var.A.findViewById(R.id.content)).addView(view, layoutParams);
        n0Var.f16093m.a(n0Var.f16092l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        n0 n0Var = (n0) getDelegate();
        n0Var.O = true;
        int i13 = n0Var.S;
        if (i13 == -100) {
            i13 = t.f16129b;
        }
        int K = n0Var.K(context, i13);
        if (t.e(context)) {
            t.q(context);
        }
        j5.h t13 = n0.t(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(n0.y(context, K, t13, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof m.e) {
            try {
                ((m.e) context).a(n0.y(context, K, t13, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (n0.f16081j0) {
            Configuration configuration = new Configuration();
            configuration.uiMode = -1;
            configuration.fontScale = 0.0f;
            Configuration configuration2 = context.createConfigurationContext(configuration).getResources().getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            configuration2.uiMode = configuration3.uiMode;
            Configuration y13 = n0.y(context, K, t13, !configuration2.equals(configuration3) ? n0.D(configuration2, configuration3) : null, true);
            m.e eVar = new m.e(context, i.i.Theme_AppCompat_Empty);
            eVar.a(y13);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = eVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        v0.a.e(theme);
                    } else {
                        synchronized (e5.m.f57240a) {
                            if (!e5.m.f57242c) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    e5.m.f57241b = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e13) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e13);
                                }
                                e5.m.f57242c = true;
                            }
                            Method method = e5.m.f57241b;
                            if (method != null) {
                                try {
                                    method.invoke(theme, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException e14) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e14);
                                    e5.m.f57241b = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = eVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // c5.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i13) {
        n0 n0Var = (n0) getDelegate();
        n0Var.B();
        return (T) n0Var.f16092l.findViewById(i13);
    }

    @NonNull
    public t getDelegate() {
        if (this.mDelegate == null) {
            r rVar = t.f16128a;
            this.mDelegate = new n0(this, null, this, this);
        }
        return this.mDelegate;
    }

    public b getDrawerToggleDelegate() {
        n0 n0Var = (n0) getDelegate();
        n0Var.getClass();
        return new x(n0Var, 1);
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        n0 n0Var = (n0) getDelegate();
        if (n0Var.f16096p == null) {
            n0Var.I();
            a aVar = n0Var.f16095o;
            n0Var.f16096p = new m.l(aVar != null ? aVar.e() : n0Var.f16091k);
        }
        return n0Var.f16096p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i13 = j3.f16617a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public a getSupportActionBar() {
        n0 n0Var = (n0) getDelegate();
        n0Var.I();
        return n0Var.f16095o;
    }

    @Override // c5.k0
    public Intent getSupportParentActivityIntent() {
        return ao2.m0.G(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().d();
    }

    @Override // androidx.activity.o, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n0 n0Var = (n0) getDelegate();
        if (n0Var.F && n0Var.f16106z) {
            n0Var.I();
            a aVar = n0Var.f16095o;
            if (aVar != null) {
                aVar.g();
            }
        }
        androidx.appcompat.widget.y a13 = androidx.appcompat.widget.y.a();
        Context context = n0Var.f16091k;
        synchronized (a13) {
            e2 e2Var = a13.f16736a;
            synchronized (e2Var) {
                g1.p pVar = (g1.p) e2Var.f16555b.get(context);
                if (pVar != null) {
                    pVar.a();
                }
            }
        }
        n0Var.R = new Configuration(n0Var.f16091k.getResources().getConfiguration());
        n0Var.r(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull c5.l0 l0Var) {
        l0Var.b(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i13, KeyEvent keyEvent) {
        return super.onKeyDown(i13, keyEvent);
    }

    public void onLocalesChanged(@NonNull j5.h hVar) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.o, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i13, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i13, menuItem)) {
            return true;
        }
        a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i13, Menu menu) {
        return super.onMenuOpened(i13, menu);
    }

    public void onNightModeChanged(int i13) {
    }

    @Override // androidx.activity.o, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i13, @NonNull Menu menu) {
        super.onPanelClosed(i13, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((n0) getDelegate()).B();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        n0 n0Var = (n0) getDelegate();
        n0Var.I();
        a aVar = n0Var.f16095o;
        if (aVar != null) {
            aVar.m(true);
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull c5.l0 l0Var) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        ((n0) getDelegate()).r(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        n0 n0Var = (n0) getDelegate();
        n0Var.I();
        a aVar = n0Var.f16095o;
        if (aVar != null) {
            aVar.m(false);
        }
    }

    @Override // androidx.appcompat.app.o
    public void onSupportActionModeFinished(@NonNull m.c cVar) {
    }

    @Override // androidx.appcompat.app.o
    public void onSupportActionModeStarted(@NonNull m.c cVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        c5.l0 d2 = c5.l0.d(this);
        onCreateSupportNavigateUpTaskStack(d2);
        onPrepareSupportNavigateUpTaskStack(d2);
        d2.e();
        try {
            int i13 = c5.c.f25774b;
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i13) {
        super.onTitleChanged(charSequence, i13);
        getDelegate().o(charSequence);
    }

    @Override // androidx.appcompat.app.o
    public m.c onWindowStartingSupportActionMode(@NonNull m.b bVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    public final void p() {
        b7.c.Q(getWindow().getDecorView(), this);
        d7.b.t0(getWindow().getDecorView(), this);
        lb.l0.i1(getWindow().getDecorView(), this);
        tb.f.e0(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.o, android.app.Activity
    public void setContentView(int i13) {
        p();
        getDelegate().k(i13);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        n0 n0Var = (n0) getDelegate();
        if (n0Var.f16090j instanceof Activity) {
            n0Var.I();
            a aVar = n0Var.f16095o;
            if (aVar instanceof d1) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            n0Var.f16096p = null;
            if (aVar != null) {
                aVar.h();
            }
            n0Var.f16095o = null;
            if (toolbar != null) {
                Object obj = n0Var.f16090j;
                y0 y0Var = new y0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : n0Var.f16097q, n0Var.f16093m);
                n0Var.f16095o = y0Var;
                n0Var.f16093m.f16017b = y0Var.f16153c;
                toolbar.x();
            } else {
                n0Var.f16093m.f16017b = null;
            }
            n0Var.d();
        }
    }

    @Deprecated
    public void setSupportProgress(int i13) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z13) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z13) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z13) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i13) {
        super.setTheme(i13);
        ((n0) getDelegate()).T = i13;
    }

    public m.c startSupportActionMode(@NonNull m.b bVar) {
        return getDelegate().p(bVar);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().d();
    }

    public void supportNavigateUpTo(@NonNull Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i13) {
        return getDelegate().j(i13);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // androidx.activity.o, android.app.Activity
    public void setContentView(View view) {
        p();
        getDelegate().l(view);
    }

    @Override // androidx.activity.o, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        getDelegate().m(view, layoutParams);
    }
}
