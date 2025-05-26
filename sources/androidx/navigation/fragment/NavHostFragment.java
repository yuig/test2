package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.fragment.app.w0;
import ca.n;
import j1.q0;
import kg.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xk2.m;
import xk2.v;
import z9.e0;
import z9.u0;
import z9.v0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "g4/u", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public class NavHostFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public final v f19150a = m.b(new q0(this, 29));

    /* renamed from: b, reason: collision with root package name */
    public View f19151b;

    /* renamed from: c, reason: collision with root package name */
    public int f19152c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19153d;

    public final e0 M6() {
        return (e0) this.f19150a.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (this.f19153d) {
            w0 parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            a aVar = new a(parentFragmentManager);
            aVar.o(this);
            aVar.e(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        M6();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f19153d = true;
            w0 parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            a aVar = new a(parentFragmentManager);
            aVar.o(this);
            aVar.e(false);
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id3 = getId();
        if (id3 == 0 || id3 == -1) {
            id3 = ca.m.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id3);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.f19151b;
        if (view != null && p.r(view) == M6()) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setTag(u0.nav_controller_view_tag, null);
        }
        this.f19151b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attrs, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, v0.NavHost);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(v0.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.f19152c = resourceId;
        }
        Unit unit = Unit.f80348a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attrs, n.NavHostFragment);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(n.NavHostFragment_defaultNavHost, false)) {
            this.f19153d = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f19153d) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        e0 M6 = M6();
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(u0.nav_controller_view_tag, M6);
        if (view.getParent() != null) {
            Object parent = view.getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.f19151b = view2;
            if (view2.getId() == getId()) {
                View view3 = this.f19151b;
                Intrinsics.f(view3);
                e0 M62 = M6();
                Intrinsics.checkNotNullParameter(view3, "view");
                view3.setTag(u0.nav_controller_view_tag, M62);
            }
        }
    }
}
