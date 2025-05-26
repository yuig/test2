package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class FragmentActivity extends androidx.activity.o implements c5.a, c5.b {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.b0 mFragmentLifecycleRegistry;
    final e0 mFragments;
    boolean mResumed;
    boolean mStopped;

    public class HostCallbacks extends g0 implements d5.c, d5.d, c5.f0, c5.g0, androidx.lifecycle.u1, androidx.activity.k0, g.h, ma.i, a1, q5.l {
        public HostCallbacks() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.a1
        public final void a(w0 w0Var, Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // q5.l
        public final void addMenuProvider(q5.q qVar) {
            FragmentActivity.this.addMenuProvider(qVar);
        }

        @Override // d5.c
        public final void addOnConfigurationChangedListener(p5.a aVar) {
            FragmentActivity.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // c5.f0
        public final void addOnMultiWindowModeChangedListener(p5.a aVar) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // c5.g0
        public final void addOnPictureInPictureModeChangedListener(p5.a aVar) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // d5.d
        public final void addOnTrimMemoryListener(p5.a aVar) {
            FragmentActivity.this.addOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.d0
        public final View b(int i13) {
            return FragmentActivity.this.findViewById(i13);
        }

        @Override // androidx.fragment.app.d0
        public final boolean c() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.g0
        public final void d() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // g.h
        public final g.g getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.z
        public final androidx.lifecycle.s getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.k0
        public final androidx.activity.i0 getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // ma.i
        public final ma.g getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.u1
        public final androidx.lifecycle.t1 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // q5.l
        public final void removeMenuProvider(q5.q qVar) {
            FragmentActivity.this.removeMenuProvider(qVar);
        }

        @Override // d5.c
        public final void removeOnConfigurationChangedListener(p5.a aVar) {
            FragmentActivity.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // c5.f0
        public final void removeOnMultiWindowModeChangedListener(p5.a aVar) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // c5.g0
        public final void removeOnPictureInPictureModeChangedListener(p5.a aVar) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // d5.d
        public final void removeOnTrimMemoryListener(p5.a aVar) {
            FragmentActivity.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public FragmentActivity() {
        this.mFragments = new e0(new HostCallbacks());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.b0(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new androidx.activity.f(this, 2));
        final int i13 = 0;
        addOnConfigurationChangedListener(new p5.a(this) { // from class: androidx.fragment.app.b0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f18289b;

            {
                this.f18289b = this;
            }

            @Override // p5.a
            public final void accept(Object obj) {
                int i14 = i13;
                FragmentActivity fragmentActivity = this.f18289b;
                switch (i14) {
                    case 0:
                        fragmentActivity.lambda$init$1((Configuration) obj);
                        break;
                    default:
                        fragmentActivity.lambda$init$2((Intent) obj);
                        break;
                }
            }
        });
        final int i14 = 1;
        addOnNewIntentListener(new p5.a(this) { // from class: androidx.fragment.app.b0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f18289b;

            {
                this.f18289b = this;
            }

            @Override // p5.a
            public final void accept(Object obj) {
                int i142 = i14;
                FragmentActivity fragmentActivity = this.f18289b;
                switch (i142) {
                    case 0:
                        fragmentActivity.lambda$init$1((Configuration) obj);
                        break;
                    default:
                        fragmentActivity.lambda$init$2((Intent) obj);
                        break;
                }
            }
        });
        addOnContextAvailableListener(new androidx.activity.g(this, 1));
    }

    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.q.ON_STOP);
        return new Bundle();
    }

    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    public void lambda$init$3(Context context) {
        g0 g0Var = this.mFragments.f18313a;
        g0Var.f18327d.e(g0Var, g0Var, null);
    }

    private static boolean markState(w0 w0Var, androidx.lifecycle.r rVar) {
        boolean z13 = false;
        for (Fragment fragment : w0Var.f18451c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z13 |= markState(fragment.getChildFragmentManager(), rVar);
                }
                p1 p1Var = fragment.mViewLifecycleOwner;
                if (p1Var != null) {
                    p1Var.b();
                    if (p1Var.f18403e.f18588d.isAtLeast(androidx.lifecycle.r.STARTED)) {
                        fragment.mViewLifecycleOwner.f18403e.g(rVar);
                        z13 = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f18588d.isAtLeast(androidx.lifecycle.r.STARTED)) {
                    fragment.mLifecycleRegistry.g(rVar);
                    z13 = true;
                }
            }
        }
        return z13;
    }

    public final View dispatchFragmentsOnCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.f18313a.f18327d.f18454f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                x6.a.a(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.f18313a.f18327d.x(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public w0 getSupportFragmentManager() {
        return this.mFragments.f18313a.f18327d;
    }

    @NonNull
    @Deprecated
    public x6.a getSupportLoaderManager() {
        return x6.a.a(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), androidx.lifecycle.r.CREATED)) {
        }
    }

    @Override // androidx.activity.o, android.app.Activity
    public void onActivityResult(int i13, int i14, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i13, i14, intent);
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // androidx.activity.o, c5.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.q.ON_CREATE);
        x0 x0Var = this.mFragments.f18313a.f18327d;
        x0Var.H = false;
        x0Var.I = false;
        x0Var.O.f18507g = false;
        x0Var.w(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f18313a.f18327d.n();
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.q.ON_DESTROY);
    }

    @Override // androidx.activity.o, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i13, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i13, menuItem)) {
            return true;
        }
        if (i13 == 6) {
            return this.mFragments.f18313a.f18327d.l(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f18313a.f18327d.w(5);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.q.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.o, android.app.Activity
    public void onRequestPermissionsResult(int i13, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i13, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f18313a.f18327d.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.q.ON_RESUME);
        x0 x0Var = this.mFragments.f18313a.f18327d;
        x0Var.H = false;
        x0Var.I = false;
        x0Var.O.f18507g = false;
        x0Var.w(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            x0 x0Var = this.mFragments.f18313a.f18327d;
            x0Var.H = false;
            x0Var.I = false;
            x0Var.O.f18507g = false;
            x0Var.w(4);
        }
        this.mFragments.f18313a.f18327d.A(true);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.q.ON_START);
        x0 x0Var2 = this.mFragments.f18313a.f18327d;
        x0Var2.H = false;
        x0Var2.I = false;
        x0Var2.O.f18507g = false;
        x0Var2.w(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        x0 x0Var = this.mFragments.f18313a.f18327d;
        x0Var.I = true;
        x0Var.O.f18507g = true;
        x0Var.w(4);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.q.ON_STOP);
    }

    public void setEnterSharedElementCallback(c5.j0 j0Var) {
        int i13 = c5.c.f25774b;
        kotlin.jvm.internal.r.j0(this);
    }

    public void setExitSharedElementCallback(c5.j0 j0Var) {
        int i13 = c5.c.f25774b;
        kotlin.jvm.internal.r.k0(this);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i13) {
        startActivityFromFragment(fragment, intent, i13, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i13, Intent intent, int i14, int i15, int i16, Bundle bundle) {
        if (i13 != -1) {
            fragment.startIntentSenderForResult(intentSender, i13, intent, i14, i15, i16, bundle);
        } else {
            int i17 = c5.c.f25774b;
            startIntentSenderForResult(intentSender, i13, intent, i14, i15, i16, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        int i13 = c5.c.f25774b;
        kotlin.jvm.internal.r.s(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        int i13 = c5.c.f25774b;
        kotlin.jvm.internal.r.g0(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i13 = c5.c.f25774b;
        kotlin.jvm.internal.r.n0(this);
    }

    @Override // c5.b
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i13) {
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i13, Bundle bundle) {
        if (i13 != -1) {
            fragment.startActivityForResult(intent, i13, bundle);
        } else {
            int i14 = c5.c.f25774b;
            startActivityForResult(intent, -1, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i13) {
        super(i13);
        this.mFragments = new e0(new HostCallbacks());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.b0(this);
        this.mStopped = true;
        init();
    }
}
