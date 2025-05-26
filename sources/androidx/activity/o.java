package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.lifecycle.a1;
import androidx.lifecycle.g1;
import androidx.lifecycle.j1;
import androidx.lifecycle.o1;
import androidx.lifecycle.p1;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class o extends c5.h implements u1, androidx.lifecycle.k, ma.i, k0, g.h, d5.c, d5.d, c5.f0, c5.g0, q5.l, w {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final g.g mActivityResultRegistry;
    private int mContentLayoutId;
    final f.a mContextAwareHelper;
    private p1 mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;

    @NonNull
    final v mFullyDrawnReporter;
    private final androidx.lifecycle.b0 mLifecycleRegistry;
    private final q5.p mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private i0 mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<p5.a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<p5.a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<p5.a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<p5.a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<p5.a> mOnTrimMemoryListeners;
    final m mReportFullyDrawnExecutor;
    final ma.h mSavedStateRegistryController;
    private t1 mViewModelStore;

    public o() {
        this.mContextAwareHelper = new f.a();
        int i13 = 0;
        this.mMenuHostHelper = new q5.p(new d(this, i13));
        this.mLifecycleRegistry = new androidx.lifecycle.b0(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        ma.h hVar = new ma.h(this);
        this.mSavedStateRegistryController = hVar;
        this.mOnBackPressedDispatcher = null;
        n nVar = new n(this);
        this.mReportFullyDrawnExecutor = nVar;
        this.mFullyDrawnReporter = new v(nVar, new e(this, i13));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new h(this);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new i(this, 1));
        getLifecycle().a(new i(this, i13));
        getLifecycle().a(new i(this, 2));
        hVar.a();
        g1.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new f(this, 0));
        addOnContextAvailableListener(new g(this, 0));
    }

    public static void j(o oVar) {
        Bundle a13 = oVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a13 != null) {
            g.g gVar = oVar.mActivityResultRegistry;
            gVar.getClass();
            ArrayList<Integer> integerArrayList = a13.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a13.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            gVar.f63174d = a13.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            Bundle bundle = a13.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = gVar.f63177g;
            bundle2.putAll(bundle);
            for (int i13 = 0; i13 < stringArrayList.size(); i13++) {
                String str = stringArrayList.get(i13);
                HashMap hashMap = gVar.f63172b;
                boolean containsKey = hashMap.containsKey(str);
                HashMap hashMap2 = gVar.f63171a;
                if (containsKey) {
                    Integer num = (Integer) hashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        hashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i13);
                num2.intValue();
                String str2 = stringArrayList.get(i13);
                hashMap2.put(num2, str2);
                hashMap.put(str2, num2);
            }
        }
    }

    public static Bundle k(o oVar) {
        oVar.getClass();
        Bundle bundle = new Bundle();
        g.g gVar = oVar.mActivityResultRegistry;
        gVar.getClass();
        HashMap hashMap = gVar.f63172b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(gVar.f63174d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) gVar.f63177g.clone());
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.e(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // q5.l
    public void addMenuProvider(@NonNull q5.q qVar) {
        q5.p pVar = this.mMenuHostHelper;
        pVar.f102493b.add(qVar);
        pVar.f102492a.run();
    }

    @Override // d5.c
    public final void addOnConfigurationChangedListener(@NonNull p5.a aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(@NonNull f.b listener) {
        f.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = aVar.f60720b;
        if (context != null) {
            listener.a(context);
        }
        aVar.f60719a.add(listener);
    }

    @Override // c5.f0
    public final void addOnMultiWindowModeChangedListener(@NonNull p5.a aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(@NonNull p5.a aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    @Override // c5.g0
    public final void addOnPictureInPictureModeChangedListener(@NonNull p5.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    @Override // d5.d
    public final void addOnTrimMemoryListener(@NonNull p5.a aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            l lVar = (l) getLastNonConfigurationInstance();
            if (lVar != null) {
                this.mViewModelStore = lVar.f15913b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new t1();
            }
        }
    }

    @Override // g.h
    @NonNull
    public final g.g getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.k
    @NonNull
    public u6.c getDefaultViewModelCreationExtras() {
        u6.e eVar = new u6.e(0);
        if (getApplication() != null) {
            eVar.b(o1.f18669d, getApplication());
        }
        eVar.b(g1.f18625a, this);
        eVar.b(g1.f18626b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            eVar.b(g1.f18627c, getIntent().getExtras());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.k
    @NonNull
    public p1 getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new j1(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @NonNull
    public v getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        l lVar = (l) getLastNonConfigurationInstance();
        if (lVar != null) {
            return lVar.f15912a;
        }
        return null;
    }

    @Override // androidx.lifecycle.z
    @NonNull
    public androidx.lifecycle.s getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.k0
    @NonNull
    public final i0 getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new i0(new j(this));
            getLifecycle().a(new i(this, 3));
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // ma.i
    @NonNull
    public final ma.g getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f86760b;
    }

    @Override // androidx.lifecycle.u1
    @NonNull
    public t1 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void initializeViewTreeOwners() {
        b7.c.Q(getWindow().getDecorView(), this);
        d7.b.t0(getWindow().getDecorView(), this);
        lb.l0.i1(getWindow().getDecorView(), this);
        tb.f.e0(getWindow().getDecorView(), this);
        jk.r.u(getWindow().getDecorView(), this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i13, int i14, Intent intent) {
        if (this.mActivityResultRegistry.a(i13, i14, intent)) {
            return;
        }
        super.onActivityResult(i13, i14, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<p5.a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // c5.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        f.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        aVar.f60720b = this;
        Iterator it = aVar.f60719a.iterator();
        while (it.hasNext()) {
            ((f.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i13 = a1.f18582b;
        bk.f.U(this);
        int i14 = this.mContentLayoutId;
        if (i14 != 0) {
            setContentView(i14);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i13, @NonNull Menu menu) {
        if (i13 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i13, menu);
        q5.p pVar = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = pVar.f102493b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.n0) ((q5.q) it.next())).f18383a.m(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i13, MenuItem menuItem) {
        if (super.onMenuItemSelected(i13, menuItem)) {
            return true;
        }
        if (i13 == 0) {
            return this.mMenuHostHelper.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z13) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<p5.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new c5.n(z13));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<p5.a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i13, @NonNull Menu menu) {
        Iterator it = this.mMenuHostHelper.f102493b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.n0) ((q5.q) it.next())).f18383a.s(menu);
        }
        super.onPanelClosed(i13, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z13) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<p5.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new c5.h0(z13));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i13, View view, @NonNull Menu menu) {
        if (i13 != 0) {
            return true;
        }
        super.onPreparePanel(i13, view, menu);
        Iterator it = this.mMenuHostHelper.f102493b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.n0) ((q5.q) it.next())).f18383a.v(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i13, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.a(i13, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i13, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        l lVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        t1 t1Var = this.mViewModelStore;
        if (t1Var == null && (lVar = (l) getLastNonConfigurationInstance()) != null) {
            t1Var = lVar.f15913b;
        }
        if (t1Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        l lVar2 = new l();
        lVar2.f15912a = onRetainCustomNonConfigurationInstance;
        lVar2.f15913b = t1Var;
        return lVar2;
    }

    @Override // c5.h, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        androidx.lifecycle.s lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.b0) {
            ((androidx.lifecycle.b0) lifecycle).g(androidx.lifecycle.r.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i13) {
        super.onTrimMemory(i13);
        Iterator<p5.a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i13));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f60720b;
    }

    @NonNull
    public final <I, O> g.b registerForActivityResult(@NonNull h.a aVar, @NonNull g.g gVar, @NonNull g.a aVar2) {
        return gVar.d("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, aVar2);
    }

    @Override // q5.l
    public void removeMenuProvider(@NonNull q5.q qVar) {
        this.mMenuHostHelper.b(qVar);
    }

    @Override // d5.c
    public final void removeOnConfigurationChangedListener(@NonNull p5.a aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(@NonNull f.b listener) {
        f.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        aVar.f60719a.remove(listener);
    }

    @Override // c5.f0
    public final void removeOnMultiWindowModeChangedListener(@NonNull p5.a aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(@NonNull p5.a aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    @Override // c5.g0
    public final void removeOnPictureInPictureModeChangedListener(@NonNull p5.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    @Override // d5.d
    public final void removeOnTrimMemoryListener(@NonNull p5.a aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (tb.f.Q()) {
                Trace.beginSection(tb.f.k0("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            v vVar = this.mFullyDrawnReporter;
            synchronized (vVar.f15938b) {
                try {
                    vVar.f15939c = true;
                    Iterator it = vVar.f15940d.iterator();
                    while (it.hasNext()) {
                        ((Function0) it.next()).invoke();
                    }
                    vVar.f15940d.clear();
                    Unit unit = Unit.f80348a;
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i13) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.e(getWindow().getDecorView());
        super.setContentView(i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i13) {
        super.startActivityForResult(intent, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i13, Intent intent, int i14, int i15, int i16) {
        super.startIntentSenderForResult(intentSender, i13, intent, i14, i15, i16);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i13, Bundle bundle) {
        super.startActivityForResult(intent, i13, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i13, Intent intent, int i14, int i15, int i16, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i13, intent, i14, i15, i16, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z13, @NonNull Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z13, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<p5.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new c5.n(z13, configuration));
            }
        } catch (Throwable th3) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th3;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z13, @NonNull Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z13, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<p5.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new c5.h0(z13, configuration));
            }
        } catch (Throwable th3) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th3;
        }
    }

    @NonNull
    public final <I, O> g.b registerForActivityResult(@NonNull h.a aVar, @NonNull g.a aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.e(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(@NonNull q5.q qVar, @NonNull androidx.lifecycle.z zVar) {
        q5.p pVar = this.mMenuHostHelper;
        pVar.f102493b.add(qVar);
        pVar.f102492a.run();
        androidx.lifecycle.s lifecycle = zVar.getLifecycle();
        HashMap hashMap = pVar.f102494c;
        q5.o oVar = (q5.o) hashMap.remove(qVar);
        if (oVar != null) {
            oVar.a();
        }
        hashMap.put(qVar, new q5.o(lifecycle, new q5.n(0, pVar, qVar)));
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.e(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull final q5.q qVar, @NonNull androidx.lifecycle.z zVar, @NonNull final androidx.lifecycle.r rVar) {
        final q5.p pVar = this.mMenuHostHelper;
        pVar.getClass();
        androidx.lifecycle.s lifecycle = zVar.getLifecycle();
        HashMap hashMap = pVar.f102494c;
        q5.o oVar = (q5.o) hashMap.remove(qVar);
        if (oVar != null) {
            oVar.a();
        }
        hashMap.put(qVar, new q5.o(lifecycle, new androidx.lifecycle.x() { // from class: q5.m
            @Override // androidx.lifecycle.x
            public final void c(androidx.lifecycle.z zVar2, androidx.lifecycle.q qVar2) {
                p pVar2 = p.this;
                pVar2.getClass();
                androidx.lifecycle.r rVar2 = rVar;
                androidx.lifecycle.q upTo = androidx.lifecycle.q.upTo(rVar2);
                Runnable runnable = pVar2.f102492a;
                CopyOnWriteArrayList copyOnWriteArrayList = pVar2.f102493b;
                q qVar3 = qVar;
                if (qVar2 == upTo) {
                    copyOnWriteArrayList.add(qVar3);
                    runnable.run();
                } else if (qVar2 == androidx.lifecycle.q.ON_DESTROY) {
                    pVar2.b(qVar3);
                } else if (qVar2 == androidx.lifecycle.q.downFrom(rVar2)) {
                    copyOnWriteArrayList.remove(qVar3);
                    runnable.run();
                }
            }
        }));
    }

    public o(int i13) {
        this();
        this.mContentLayoutId = i13;
    }
}
