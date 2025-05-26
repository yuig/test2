package androidx.fragment.app;

import a.cb;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import t3.r4;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final tb.l f18303a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f18304b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f18305c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18306d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f18307e = -1;

    public d1(tb.l lVar, e1 e1Var, Fragment fragment) {
        this.f18303a = lVar;
        this.f18304b = e1Var;
        this.f18305c = fragment;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f18305c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f18303a.f(false);
    }

    public final void b() {
        Fragment fragment;
        View view;
        View view2;
        Fragment fragment2 = this.f18305c;
        View view3 = fragment2.mContainer;
        while (true) {
            fragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(l6.b.fragment_container_view_tag);
            Fragment fragment3 = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment3 != null) {
                fragment = fragment3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        Fragment parentFragment = fragment2.getParentFragment();
        if (fragment != null && !fragment.equals(parentFragment)) {
            m6.c.f(fragment2, fragment, fragment2.mContainerId);
        }
        e1 e1Var = this.f18304b;
        e1Var.getClass();
        ViewGroup viewGroup = fragment2.mContainer;
        int i13 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = e1Var.f18314a;
            int indexOf = arrayList.indexOf(fragment2);
            int i14 = indexOf - 1;
            while (true) {
                if (i14 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment4 = (Fragment) arrayList.get(indexOf);
                        if (fragment4.mContainer == viewGroup && (view = fragment4.mView) != null) {
                            i13 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment5 = (Fragment) arrayList.get(i14);
                    if (fragment5.mContainer == viewGroup && (view2 = fragment5.mView) != null) {
                        i13 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i14--;
                }
            }
        }
        fragment2.mContainer.addView(fragment2.mView, i13);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f18305c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        d1 d1Var = null;
        e1 e1Var = this.f18304b;
        if (fragment2 != null) {
            d1 d1Var2 = (d1) e1Var.f18315b.get(fragment2.mWho);
            if (d1Var2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            d1Var = d1Var2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (d1Var = (d1) e1Var.f18315b.get(str)) == null) {
                StringBuilder sb3 = new StringBuilder("Fragment ");
                sb3.append(fragment);
                sb3.append(" declared target fragment ");
                throw new IllegalStateException(a.a.p(sb3, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (d1Var != null) {
            d1Var.l();
        }
        w0 w0Var = fragment.mFragmentManager;
        fragment.mHost = w0Var.f18470v;
        fragment.mParentFragment = w0Var.f18472x;
        tb.l lVar = this.f18303a;
        lVar.l(false);
        fragment.performAttach();
        lVar.g(false);
    }

    public final int d() {
        Object obj;
        Fragment fragment = this.f18305c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i13 = this.f18307e;
        int i14 = c1.f18298a[fragment.mMaxState.ordinal()];
        if (i14 != 1) {
            i13 = i14 != 2 ? i14 != 3 ? i14 != 4 ? Math.min(i13, -1) : Math.min(i13, 0) : Math.min(i13, 1) : Math.min(i13, 5);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                i13 = Math.max(this.f18307e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i13 = Math.min(i13, 2);
                }
            } else {
                i13 = this.f18307e < 4 ? Math.min(i13, fragment.mState) : Math.min(i13, 1);
            }
        }
        if (!fragment.mAdded) {
            i13 = Math.min(i13, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            k m13 = k.m(viewGroup, fragment.getParentFragmentManager());
            m13.getClass();
            Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            z1 k13 = m13.k(fragment);
            u1 u1Var = k13 != null ? k13.f18509b : null;
            Iterator it = m13.f18363c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                z1 z1Var = (z1) obj;
                if (Intrinsics.d(z1Var.f18510c, fragment) && !z1Var.f18513f) {
                    break;
                }
            }
            z1 z1Var2 = (z1) obj;
            r9 = z1Var2 != null ? z1Var2.f18509b : null;
            int i15 = u1Var == null ? -1 : a2.f18286a[u1Var.ordinal()];
            if (i15 != -1 && i15 != 1) {
                r9 = u1Var;
            }
        }
        if (r9 == u1.ADDING) {
            i13 = Math.min(i13, 6);
        } else if (r9 == u1.REMOVING) {
            i13 = Math.max(i13, 3);
        } else if (fragment.mRemoving) {
            i13 = fragment.isInBackStack() ? Math.min(i13, 1) : Math.min(i13, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            i13 = Math.min(i13, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i13 + " for " + fragment);
        }
        return i13;
    }

    public final void e() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f18305c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            tb.l lVar = this.f18303a;
            lVar.m(false);
            fragment.performCreate(bundle2);
            lVar.h(fragment, bundle2, false);
        }
    }

    public final void f() {
        String str;
        Fragment fragment = this.f18305c;
        if (fragment.mFromLayout) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup container = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            container = viewGroup;
        } else {
            int i13 = fragment.mContainerId;
            if (i13 != 0) {
                if (i13 == -1) {
                    throw new IllegalArgumentException(cb.k("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                container = (ViewGroup) fragment.mFragmentManager.f18471w.b(i13);
                if (container == null) {
                    if (!fragment.mRestored) {
                        try {
                            str = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                    }
                } else if (!(container instanceof FragmentContainerView)) {
                    m6.b bVar = m6.c.f85884a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
                    m6.c.c(wrongFragmentContainerViolation);
                    m6.b a13 = m6.c.a(fragment);
                    if (a13.f85882a.contains(m6.a.DETECT_WRONG_FRAGMENT_CONTAINER) && m6.c.g(a13, fragment.getClass(), WrongFragmentContainerViolation.class)) {
                        m6.c.b(a13, wrongFragmentContainerViolation);
                    }
                }
            }
        }
        fragment.mContainer = container;
        fragment.performCreateView(performGetLayoutInflater, container, bundle2);
        if (fragment.mView != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(l6.b.fragment_container_view_tag, fragment);
            if (container != null) {
                b();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view = fragment.mView;
            WeakHashMap weakHashMap = q5.v0.f102521a;
            if (view.isAttachedToWindow()) {
                q5.k0.c(fragment.mView);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new r4(this, view2));
            }
            fragment.performViewCreated();
            this.f18303a.r(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void g() {
        Fragment b13;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f18305c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean z13 = true;
        boolean z14 = fragment.mRemoving && !fragment.isInBackStack();
        e1 e1Var = this.f18304b;
        if (z14 && !fragment.mBeingSaved) {
            e1Var.j(fragment.mWho, null);
        }
        if (!z14 && !e1Var.f18317d.m(fragment)) {
            String str = fragment.mTargetWho;
            if (str != null && (b13 = e1Var.b(str)) != null && b13.mRetainInstance) {
                fragment.mTarget = b13;
            }
            fragment.mState = 0;
            return;
        }
        g0 g0Var = fragment.mHost;
        if (g0Var instanceof androidx.lifecycle.u1) {
            z13 = e1Var.f18317d.f18506f;
        } else {
            Context context = g0Var.f18325b;
            if (context instanceof Activity) {
                z13 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z14 && !fragment.mBeingSaved) || z13) {
            e1Var.f18317d.i(fragment, false);
        }
        fragment.performDestroy();
        this.f18303a.i(false);
        Iterator it = e1Var.d().iterator();
        while (it.hasNext()) {
            d1 d1Var = (d1) it.next();
            if (d1Var != null) {
                String str2 = fragment.mWho;
                Fragment fragment2 = d1Var.f18305c;
                if (str2.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str3 = fragment.mTargetWho;
        if (str3 != null) {
            fragment.mTarget = e1Var.b(str3);
        }
        e1Var.i(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f18305c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f18303a.s(false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.k(null);
        fragment.mInLayout = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f18305c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        this.f18303a.j(false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f18304b.f18317d.m(fragment)) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void j() {
        Fragment fragment = this.f18305c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(l6.b.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f18303a.r(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    public final boolean k(View view) {
        Fragment fragment = this.f18305c;
        if (view == fragment.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == fragment.mView) {
                return true;
            }
        }
        return false;
    }

    public final void l() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z13 = this.f18306d;
        Fragment fragment = this.f18305c;
        if (z13) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.f18306d = true;
            boolean z14 = false;
            while (true) {
                int d2 = d();
                int i13 = fragment.mState;
                e1 e1Var = this.f18304b;
                if (d2 == i13) {
                    if (!z14 && i13 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        e1Var.f18317d.i(fragment, true);
                        e1Var.i(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            k m13 = k.m(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                m13.e(this);
                            } else {
                                m13.g(this);
                            }
                        }
                        w0 w0Var = fragment.mFragmentManager;
                        if (w0Var != null) {
                            w0Var.M(fragment);
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.q();
                    }
                    this.f18306d = false;
                    return;
                }
                tb.l lVar = this.f18303a;
                if (d2 <= i13) {
                    switch (i13 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && e1Var.g(fragment.mWho) == null) {
                                e1Var.j(fragment.mWho, o());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.mBeingSaved) {
                                e1Var.j(fragment.mWho, o());
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                p();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                k.m(viewGroup2, fragment.getParentFragmentManager()).f(this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fragment);
                            }
                            fragment.performStop();
                            lVar.q(false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
                            }
                            fragment.performPause();
                            lVar.k(false);
                            break;
                    }
                } else {
                    switch (i13 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                k.m(viewGroup3, fragment.getParentFragmentManager()).d(x1.from(fragment.mView.getVisibility()), this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.performStart();
                            lVar.p(false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z14 = true;
            }
        } catch (Throwable th3) {
            this.f18306d = false;
            throw th3;
        }
    }

    public final void m(ClassLoader classLoader) {
        Fragment fragment = this.f18305c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
        FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable(AnimatedTarget.PROPERTY_STATE);
        if (fragmentState != null) {
            fragment.mTargetWho = fragmentState.f18259l;
            fragment.mTargetRequestCode = fragmentState.f18260m;
            Boolean bool = fragment.mSavedUserVisibleHint;
            if (bool != null) {
                fragment.mUserVisibleHint = bool.booleanValue();
                fragment.mSavedUserVisibleHint = null;
            } else {
                fragment.mUserVisibleHint = fragmentState.f18261n;
            }
        }
        if (fragment.mUserVisibleHint) {
            return;
        }
        fragment.mDeferStart = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f18305c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null && k(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb3 = new StringBuilder("requestFocus: Restoring focused view ");
                sb3.append(focusedView);
                sb3.append(" ");
                sb3.append(requestFocus ? "succeeded" : "failed");
                sb3.append(" on Fragment ");
                sb3.append(fragment);
                sb3.append(" resulting in focused view ");
                sb3.append(fragment.mView.findFocus());
                Log.v("FragmentManager", sb3.toString());
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f18303a.n(false);
        this.f18304b.j(fragment.mWho, null);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f18305c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(AnimatedTarget.PROPERTY_STATE, new FragmentState(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f18303a.o(false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle c03 = fragment.mChildFragmentManager.c0();
            if (!c03.isEmpty()) {
                bundle2.putBundle("childFragmentManager", c03);
            }
            if (fragment.mView != null) {
                p();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        Fragment fragment = this.f18305c;
        if (fragment.mView == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f18404f.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public d1(tb.l lVar, e1 e1Var, ClassLoader classLoader, f0 f0Var, Bundle bundle) {
        this.f18303a = lVar;
        this.f18304b = e1Var;
        Fragment a13 = ((FragmentState) bundle.getParcelable(AnimatedTarget.PROPERTY_STATE)).a(f0Var, classLoader);
        this.f18305c = a13;
        a13.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a13.setArguments(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a13);
        }
    }

    public d1(tb.l lVar, e1 e1Var, Fragment fragment, Bundle bundle) {
        this.f18303a = lVar;
        this.f18304b = e1Var;
        this.f18305c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
