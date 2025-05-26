package androidx.fragment.app;

import a.cb;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.z, androidx.lifecycle.u1, androidx.lifecycle.k, ma.i {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    y mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    w0 mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.p1 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    w0 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    g0 mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.b0 mLifecycleRegistry;
    androidx.lifecycle.r mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<z> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final z mSavedStateAttachListener;
    ma.h mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    p1 mViewLifecycleOwner;
    androidx.lifecycle.l0 mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    /* loaded from: classes3.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new x0();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new l(this, 1);
        this.mMaxState = androidx.lifecycle.r.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.l0();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new r(this);
        initLifecycle();
    }

    private y ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            y yVar = new y();
            yVar.f18489i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            yVar.f18490j = obj;
            yVar.f18491k = null;
            yVar.f18492l = obj;
            yVar.f18493m = null;
            yVar.f18494n = obj;
            yVar.f18497q = 1.0f;
            yVar.f18498r = null;
            this.mAnimationInfo = yVar;
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        androidx.lifecycle.r rVar = this.mMaxState;
        return (rVar == androidx.lifecycle.r.INITIALIZED || this.mParentFragment == null) ? rVar.ordinal() : Math.min(rVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.b0(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        this.mSavedStateRegistryController = new ma.h(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    public void lambda$performCreateView$0() {
        p1 p1Var = this.mViewLifecycleOwner;
        p1Var.f18404f.b(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    @NonNull
    private <I, O> g.b prepareCallInternal(@NonNull h.a aVar, @NonNull q.a aVar2, @NonNull g.a aVar3) {
        if (this.mState > 1) {
            throw new IllegalStateException(cb.k("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new x(this, aVar2, atomicReference, aVar, aVar3));
        return new g.d(this, atomicReference, aVar, 2);
    }

    private void registerOnPreAttachListener(@NonNull z zVar) {
        if (this.mState >= 0) {
            zVar.a();
        } else {
            this.mOnPreAttachedListeners.add(zVar);
        }
    }

    private void restoreViewState() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public View T() {
        return getView();
    }

    public void callStartTransitionListener(boolean z13) {
        ViewGroup viewGroup;
        w0 w0Var;
        y yVar = this.mAnimationInfo;
        if (yVar != null) {
            yVar.f18499s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (w0Var = this.mFragmentManager) == null) {
            return;
        }
        k m13 = k.m(viewGroup, w0Var);
        m13.n();
        if (z13) {
            this.mHost.f18326c.post(new s(m13));
        } else {
            m13.i();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @NonNull
    public d0 createFragmentContainer() {
        return new t(this);
    }

    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            x6.a.a(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.x(a.a.C(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f18451c.c(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    /* renamed from: getActivity */
    public final FragmentActivity E4() {
        g0 g0Var = this.mHost;
        if (g0Var == null) {
            return null;
        }
        return (FragmentActivity) g0Var.f18324a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        y yVar = this.mAnimationInfo;
        if (yVar == null || (bool = yVar.f18496p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        y yVar = this.mAnimationInfo;
        if (yVar == null || (bool = yVar.f18495o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        yVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final w0 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(cb.k("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        g0 g0Var = this.mHost;
        if (g0Var == null) {
            return null;
        }
        return g0Var.f18325b;
    }

    @Override // androidx.lifecycle.k
    @NonNull
    public u6.c getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        u6.e eVar = new u6.e(0);
        if (application != null) {
            eVar.b(androidx.lifecycle.o1.f18669d, application);
        }
        eVar.b(androidx.lifecycle.g1.f18625a, this);
        eVar.b(androidx.lifecycle.g1.f18626b, this);
        if (getArguments() != null) {
            eVar.b(androidx.lifecycle.g1.f18627c, getArguments());
        }
        return eVar;
    }

    @NonNull
    public androidx.lifecycle.p1 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.j1(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f18482b;
    }

    public Object getEnterTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        return yVar.f18489i;
    }

    public c5.j0 getEnterTransitionCallback() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        yVar.getClass();
        return null;
    }

    public int getExitAnim() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f18483c;
    }

    public Object getExitTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        return yVar.f18491k;
    }

    public c5.j0 getExitTransitionCallback() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        yVar.getClass();
        return null;
    }

    public View getFocusedView() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        return yVar.f18498r;
    }

    @Deprecated
    public final w0 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        g0 g0Var = this.mHost;
        if (g0Var == null) {
            return null;
        }
        return FragmentActivity.this;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.z
    @NonNull
    public androidx.lifecycle.s getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public x6.a getLoaderManager() {
        return x6.a.a(this);
    }

    public int getNextTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f18486f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final w0 getParentFragmentManager() {
        w0 w0Var = this.mFragmentManager;
        if (w0Var != null) {
            return w0Var;
        }
        throw new IllegalStateException(cb.k("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return false;
        }
        return yVar.f18481a;
    }

    public int getPopEnterAnim() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f18484d;
    }

    public int getPopExitAnim() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f18485e;
    }

    public float getPostOnViewCreatedAlpha() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 1.0f;
        }
        return yVar.f18497q;
    }

    public Object getReenterTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        Object obj = yVar.f18492l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        m6.b bVar = m6.c.f85884a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this);
        m6.c.c(getRetainInstanceUsageViolation);
        m6.b a13 = m6.c.a(this);
        if (a13.f85882a.contains(m6.a.DETECT_RETAIN_INSTANCE_USAGE) && m6.c.g(a13, getClass(), GetRetainInstanceUsageViolation.class)) {
            m6.c.b(a13, getRetainInstanceUsageViolation);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        Object obj = yVar.f18490j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // ma.i
    @NonNull
    public final ma.g getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f86760b;
    }

    public Object getSharedElementEnterTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        return yVar.f18493m;
    }

    public Object getSharedElementReturnTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        Object obj = yVar.f18494n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        y yVar = this.mAnimationInfo;
        return (yVar == null || (arrayList = yVar.f18487g) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        y yVar = this.mAnimationInfo;
        return (yVar == null || (arrayList = yVar.f18488h) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(int i13) {
        return getResources().getString(i13);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        m6.b bVar = m6.c.f85884a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(this);
        m6.c.c(getTargetFragmentRequestCodeUsageViolation);
        m6.b a13 = m6.c.a(this);
        if (a13.f85882a.contains(m6.a.DETECT_TARGET_FRAGMENT_USAGE) && m6.c.g(a13, getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            m6.c.b(a13, getTargetFragmentRequestCodeUsageViolation);
        }
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(int i13) {
        return getResources().getText(i13);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    @NonNull
    public androidx.lifecycle.z getViewLifecycleOwner() {
        p1 p1Var = this.mViewLifecycleOwner;
        if (p1Var != null) {
            return p1Var;
        }
        throw new IllegalStateException(cb.k("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @NonNull
    public androidx.lifecycle.h0 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.u1
    @NonNull
    public androidx.lifecycle.t1 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == androidx.lifecycle.r.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.mFragmentManager.O.f18504d;
        androidx.lifecycle.t1 t1Var = (androidx.lifecycle.t1) hashMap.get(this.mWho);
        if (t1Var != null) {
            return t1Var;
        }
        androidx.lifecycle.t1 t1Var2 = new androidx.lifecycle.t1();
        hashMap.put(this.mWho, t1Var2);
        return t1Var2;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new x0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public boolean isFinishing() {
        return isRemoving();
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            w0 w0Var = this.mFragmentManager;
            if (w0Var != null) {
                Fragment fragment = this.mParentFragment;
                w0Var.getClass();
                if (fragment != null && fragment.isHidden()) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        Fragment fragment;
        return this.mMenuVisible && (this.mFragmentManager == null || (fragment = this.mParentFragment) == null || fragment.isMenuVisible());
    }

    public boolean isPostponed() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return false;
        }
        return yVar.f18499s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        w0 w0Var = this.mFragmentManager;
        if (w0Var == null) {
            return false;
        }
        return w0Var.Q();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.S();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i13, int i14, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i13 + " resultCode: " + i14 + " data: " + intent);
        }
    }

    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        g0 g0Var = this.mHost;
        Activity activity = g0Var == null ? null : g0Var.f18324a;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        w0 w0Var = this.mChildFragmentManager;
        if (w0Var.f18469u >= 1) {
            return;
        }
        w0Var.H = false;
        w0Var.I = false;
        w0Var.O.f18507g = false;
        w0Var.w(1);
    }

    public Animation onCreateAnimation(int i13, boolean z13, int i14) {
        return null;
    }

    public Animator onCreateAnimator(int i13, boolean z13, int i14) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i13 = this.mContentLayoutId;
        if (i13 != 0) {
            return layoutInflater.inflate(i13, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z13) {
    }

    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        g0 g0Var = this.mHost;
        Activity activity = g0Var == null ? null : g0Var.f18324a;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z13) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z13) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z13) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i13, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public View p5() {
        return getView();
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.S();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new b2(cb.k("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        w0 w0Var = this.mChildFragmentManager;
        w0Var.H = false;
        w0Var.I = false;
        w0Var.O.f18507g = false;
        w0Var.w(4);
    }

    public void performAttach() {
        Iterator<z> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.e(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f18325b);
        if (!this.mCalled) {
            throw new b2(cb.k("Fragment ", this, " did not call through to super.onAttach()"));
        }
        w0 w0Var = this.mFragmentManager;
        Iterator it2 = w0Var.f18463o.iterator();
        while (it2.hasNext()) {
            ((a1) it2.next()).a(w0Var, this);
        }
        w0 w0Var2 = this.mChildFragmentManager;
        w0Var2.H = false;
        w0Var2.I = false;
        w0Var2.O.f18507g = false;
        w0Var2.w(0);
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.l(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.S();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new u(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new b2(cb.k("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.q.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z13 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z13 = true;
        }
        return z13 | this.mChildFragmentManager.m(menu, menuInflater);
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.S();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new p1(this, getViewModelStore(), new androidx.activity.d(this, 7));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        b7.c.Q(this.mView, this.mViewLifecycleOwner);
        d7.b.t0(this.mView, this.mViewLifecycleOwner);
        lb.l0.i1(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.k(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.n();
        this.mLifecycleRegistry.e(androidx.lifecycle.q.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new b2(cb.k("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.w(1);
        if (this.mView != null) {
            p1 p1Var = this.mViewLifecycleOwner;
            p1Var.b();
            if (p1Var.f18403e.f18588d.isAtLeast(androidx.lifecycle.r.CREATED)) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.q.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new b2(cb.k("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        g1.p0 p0Var = x6.a.a(this).f133927b.f133924b;
        int k13 = p0Var.k();
        for (int i13 = 0; i13 < k13; i13++) {
            ((x6.b) p0Var.l(i13)).m();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new b2(cb.k("Fragment ", this, " did not call through to super.onDetach()"));
        }
        w0 w0Var = this.mChildFragmentManager;
        if (w0Var.f18448J) {
            return;
        }
        w0Var.n();
        this.mChildFragmentManager = new x0();
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z13) {
        onMultiWindowModeChanged(z13);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.r(menuItem);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.s(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.w(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.q.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.q.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new b2(cb.k("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z13) {
        onPictureInPictureModeChanged(z13);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z13 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z13 = true;
        }
        return z13 | this.mChildFragmentManager.v(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean P = w0.P(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != P) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(P);
            onPrimaryNavigationFragmentChanged(P);
            w0 w0Var = this.mChildFragmentManager;
            w0Var.l0();
            w0Var.t(w0Var.f18473y);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.S();
        this.mChildFragmentManager.A(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new b2(cb.k("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.b0 b0Var = this.mLifecycleRegistry;
        androidx.lifecycle.q qVar = androidx.lifecycle.q.ON_RESUME;
        b0Var.e(qVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f18403e.e(qVar);
        }
        w0 w0Var = this.mChildFragmentManager;
        w0Var.H = false;
        w0Var.I = false;
        w0Var.O.f18507g = false;
        w0Var.w(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.S();
        this.mChildFragmentManager.A(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new b2(cb.k("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.b0 b0Var = this.mLifecycleRegistry;
        androidx.lifecycle.q qVar = androidx.lifecycle.q.ON_START;
        b0Var.e(qVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f18403e.e(qVar);
        }
        w0 w0Var = this.mChildFragmentManager;
        w0Var.H = false;
        w0Var.I = false;
        w0Var.O.f18507g = false;
        w0Var.w(5);
    }

    public void performStop() {
        w0 w0Var = this.mChildFragmentManager;
        w0Var.I = true;
        w0Var.O.f18507g = true;
        w0Var.w(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.q.ON_STOP);
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.q.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new b2(cb.k("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.w(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f18499s = true;
    }

    @NonNull
    public final <I, O> g.b registerForActivityResult(@NonNull h.a aVar, @NonNull g.a aVar2) {
        return prepareCallInternal(aVar, new v(this), aVar2);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i13) {
        if (this.mHost == null) {
            throw new IllegalStateException(cb.k("Fragment ", this, " not attached to Activity"));
        }
        w0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.E == null) {
            parentFragmentManager.f18470v.getClass();
            return;
        }
        parentFragmentManager.F.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i13));
        parentFragmentManager.E.a(strArr);
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            return E4;
        }
        throw new IllegalStateException(cb.k("Fragment ", this, " not attached to an activity."));
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(cb.k("Fragment ", this, " does not have any arguments."));
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(cb.k("Fragment ", this, " not attached to a context."));
    }

    @NonNull
    @Deprecated
    public final w0 requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(cb.k("Fragment ", this, " not attached to a host."));
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(cb.k("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(cb.k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.b0(bundle);
        w0 w0Var = this.mChildFragmentManager;
        w0Var.H = false;
        w0Var.I = false;
        w0Var.O.f18507g = false;
        w0Var.w(1);
    }

    public void setAllowEnterTransitionOverlap(boolean z13) {
        ensureAnimationInfo().f18496p = Boolean.valueOf(z13);
    }

    public void setAllowReturnTransitionOverlap(boolean z13) {
        ensureAnimationInfo().f18495o = Boolean.valueOf(z13);
    }

    public void setAnimations(int i13, int i14, int i15, int i16) {
        if (this.mAnimationInfo == null && i13 == 0 && i14 == 0 && i15 == 0 && i16 == 0) {
            return;
        }
        ensureAnimationInfo().f18482b = i13;
        ensureAnimationInfo().f18483c = i14;
        ensureAnimationInfo().f18484d = i15;
        ensureAnimationInfo().f18485e = i16;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(c5.j0 j0Var) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f18489i = obj;
    }

    public void setExitSharedElementCallback(c5.j0 j0Var) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f18491k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f18498r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z13) {
        if (this.mHasMenu != z13) {
            this.mHasMenu = z13;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.d();
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f18232a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z13) {
        if (this.mMenuVisible != z13) {
            this.mMenuVisible = z13;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.d();
            }
        }
    }

    public void setNextTransition(int i13) {
        if (this.mAnimationInfo == null && i13 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f18486f = i13;
    }

    public void setPopDirection(boolean z13) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f18481a = z13;
    }

    public void setPostOnViewCreatedAlpha(float f13) {
        ensureAnimationInfo().f18497q = f13;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f18492l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z13) {
        m6.b bVar = m6.c.f85884a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this, "Attempting to set retain instance for fragment " + this);
        m6.c.c(setRetainInstanceUsageViolation);
        m6.b a13 = m6.c.a(this);
        if (a13.f85882a.contains(m6.a.DETECT_RETAIN_INSTANCE_USAGE) && m6.c.g(a13, getClass(), SetRetainInstanceUsageViolation.class)) {
            m6.c.b(a13, setRetainInstanceUsageViolation);
        }
        this.mRetainInstance = z13;
        w0 w0Var = this.mFragmentManager;
        if (w0Var == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z13) {
            w0Var.c(this);
        } else {
            w0Var.O.l(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f18490j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f18493m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        y yVar = this.mAnimationInfo;
        yVar.f18487g = arrayList;
        yVar.f18488h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f18494n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment targetFragment, int i13) {
        if (targetFragment != null) {
            m6.b bVar = m6.c.f85884a;
            Intrinsics.checkNotNullParameter(this, "violatingFragment");
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(this, targetFragment, i13);
            m6.c.c(setTargetFragmentUsageViolation);
            m6.b a13 = m6.c.a(this);
            if (a13.f85882a.contains(m6.a.DETECT_TARGET_FRAGMENT_USAGE) && m6.c.g(a13, getClass(), SetTargetFragmentUsageViolation.class)) {
                m6.c.b(a13, setTargetFragmentUsageViolation);
            }
        }
        w0 w0Var = this.mFragmentManager;
        w0 w0Var2 = targetFragment != null ? targetFragment.mFragmentManager : null;
        if (w0Var != null && w0Var2 != null && w0Var != w0Var2) {
            throw new IllegalArgumentException(cb.k("Fragment ", targetFragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment = targetFragment; fragment != null; fragment = fragment.getTargetFragment(false)) {
            if (fragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + targetFragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (targetFragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || targetFragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = targetFragment;
        } else {
            this.mTargetWho = targetFragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i13;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z13) {
        m6.b bVar = m6.c.f85884a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, z13);
        m6.c.c(setUserVisibleHintViolation);
        m6.b a13 = m6.c.a(this);
        if (a13.f85882a.contains(m6.a.DETECT_SET_USER_VISIBLE_HINT) && m6.c.g(a13, getClass(), SetUserVisibleHintViolation.class)) {
            m6.c.b(a13, setUserVisibleHintViolation);
        }
        boolean z14 = false;
        if (!this.mUserVisibleHint && z13 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            w0 w0Var = this.mFragmentManager;
            d1 i13 = w0Var.i(this);
            Fragment fragment = i13.f18305c;
            if (fragment.mDeferStart) {
                if (w0Var.f18450b) {
                    w0Var.K = true;
                } else {
                    fragment.mDeferStart = false;
                    i13.l();
                }
            }
        }
        this.mUserVisibleHint = z13;
        if (this.mState < 5 && !z13) {
            z14 = true;
        }
        this.mDeferStart = z14;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z13);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        g0 g0Var = this.mHost;
        if (g0Var != null) {
            return c5.c.g(str, FragmentActivity.this);
        }
        return false;
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i13) {
        startActivityForResult(intent, i13, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i13, Intent intent, int i14, int i15, int i16, Bundle bundle) {
        Intent intent2 = intent;
        if (this.mHost == null) {
            throw new IllegalStateException(cb.k("Fragment ", this, " not attached to Activity"));
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i13 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        w0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.D == null) {
            g0 g0Var = parentFragmentManager.f18470v;
            g0Var.getClass();
            if (i13 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            int i17 = c5.c.f25774b;
            g0Var.f18324a.startIntentSenderForResult(intentSender, i13, intent, i14, i15, i16, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        g.i iVar = new g.i(intentSender);
        iVar.G(intent2);
        iVar.I(i15, i14);
        IntentSenderRequest m13 = iVar.m();
        parentFragmentManager.F.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i13));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.D.a(m13);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f18499s) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f18499s = false;
        } else if (Looper.myLooper() != this.mHost.f18326c.getLooper()) {
            this.mHost.f18326c.postAtFrontOfQueue(new androidx.appcompat.app.z(this, 13));
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb3 = new StringBuilder(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        sb3.append(getClass().getSimpleName());
        sb3.append("{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append("} (");
        sb3.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb3.append(" id=0x");
            sb3.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb3.append(" tag=");
            sb3.append(this.mTag);
        }
        sb3.append(")");
        return sb3.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes3.dex */
    public static class SavedState implements Parcelable {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a0();

        /* renamed from: a */
        public final Bundle f18232a;

        public SavedState(Bundle bundle) {
            this.f18232a = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.writeBundle(this.f18232a);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f18232a = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    private Fragment getTargetFragment(boolean z13) {
        String str;
        if (z13) {
            m6.b bVar = m6.c.f85884a;
            Intrinsics.checkNotNullParameter(this, "fragment");
            GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(this);
            m6.c.c(getTargetFragmentUsageViolation);
            m6.b a13 = m6.c.a(this);
            if (a13.f85882a.contains(m6.a.DETECT_TARGET_FRAGMENT_USAGE) && m6.c.g(a13, getClass(), GetTargetFragmentUsageViolation.class)) {
                m6.c.b(a13, getTargetFragmentUsageViolation);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        w0 w0Var = this.mFragmentManager;
        if (w0Var == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return w0Var.f18451c.b(str);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) f0.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e13) {
            throw new InstantiationException(a.a.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e13);
        } catch (java.lang.InstantiationException e14) {
            throw new InstantiationException(a.a.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e14);
        } catch (NoSuchMethodException e15) {
            throw new InstantiationException(a.a.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e15);
        } catch (InvocationTargetException e16) {
            throw new InstantiationException(a.a.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e16);
        }
    }

    @NonNull
    public final String getString(int i13, Object... objArr) {
        return getResources().getString(i13, objArr);
    }

    public final void postponeEnterTransition(long j13, @NonNull TimeUnit timeUnit) {
        ensureAnimationInfo().f18499s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        w0 w0Var = this.mFragmentManager;
        if (w0Var != null) {
            this.mPostponedHandler = w0Var.f18470v.f18326c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j13));
    }

    @NonNull
    public final <I, O> g.b registerForActivityResult(@NonNull h.a aVar, @NonNull g.g gVar, @NonNull g.a aVar2) {
        return prepareCallInternal(aVar, new w(gVar), aVar2);
    }

    public void startActivity(@NonNull Intent intent, Bundle bundle) {
        g0 g0Var = this.mHost;
        if (g0Var == null) {
            throw new IllegalStateException(cb.k("Fragment ", this, " not attached to Activity"));
        }
        Object obj = d5.a.f53679a;
        g0Var.f18325b.startActivity(intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i13, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(cb.k("Fragment ", this, " not attached to Activity"));
        }
        w0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.C != null) {
            parentFragmentManager.F.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i13));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.C.a(intent);
            return;
        }
        g0 g0Var = parentFragmentManager.f18470v;
        g0Var.getClass();
        if (i13 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        Object obj = d5.a.f53679a;
        g0Var.f18325b.startActivity(intent, bundle);
    }

    @NonNull
    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        g0 g0Var = this.mHost;
        if (g0Var != null) {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            LayoutInflater cloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
            cloneInContext.setFactory2(this.mChildFragmentManager.f18454f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.q.ON_CREATE);
                return;
            }
            return;
        }
        throw new b2(cb.k("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public Fragment(int i13) {
        this();
        this.mContentLayoutId = i13;
    }
}
