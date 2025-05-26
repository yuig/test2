package com.pinterest.feature.browser.view;

import ad0.b;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.z;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import java.util.HashSet;
import jh0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import nt.c2;
import nx.f0;
import po0.a;
import po0.e;
import ro0.g;
import so.l0;
import to0.h;
import to0.y;
import xk2.k;
import xk2.m;
import xk2.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/pinterest/feature/browser/view/InAppBrowserFragment;", "Lto0/g;", "Lro0/g;", "Lpo0/e;", "<init>", "()V", "lp2/b", "inAppBrowser_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class InAppBrowserFragment extends h<g> implements e {
    public static final /* synthetic */ int T0 = 0;
    public f0 M0;
    public l0 N0;
    public b O0;
    public boolean Q0;
    public final Handler P0 = new Handler();
    public final k R0 = m.a(n.NONE, new d(this, 25));
    public final d4 S0 = d4.BROWSER;

    @Override // yk1.k
    public yk1.m V7() {
        a Z7 = Z7();
        qo0.b i83 = i8(Z7);
        l0 l0Var = this.N0;
        if (l0Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        g a13 = l0Var.a(Z7, i83);
        j8();
        return a13;
    }

    @Override // to0.g, po0.d
    public final void c5(g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        super.c5(listener);
        CoordinatorLayout coordinatorLayout = this.f118653g0;
        Intrinsics.f(coordinatorLayout);
        coordinatorLayout.setPaddingRelative(coordinatorLayout.getPaddingStart(), coordinatorLayout.getPaddingTop(), coordinatorLayout.getPaddingEnd(), getResources().getDimensionPixelSize(ds1.a.iab_bottom_bar_height));
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getI0() {
        return (a4) this.R0.getValue();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getH0() {
        return this.S0;
    }

    public final qo0.b i8(a args) {
        HashMap hashMap;
        Intrinsics.checkNotNullParameter(args, "args");
        y yVar = args.f100890q;
        if (yVar == null || (hashMap = yVar.a()) == null) {
            hashMap = new HashMap();
        }
        String str = args.f100877d;
        String str2 = args.f100879f;
        f0 f0Var = this.M0;
        if (f0Var != null) {
            return new qo0.b(str, str2, hashMap, f0Var);
        }
        Intrinsics.r("pinalyticsFactory");
        throw null;
    }

    public final void j8() {
        WindowManager.LayoutParams attributes;
        Window window = requireActivity().getWindow();
        boolean z13 = false;
        if (window != null && (attributes = window.getAttributes()) != null && (attributes.flags & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            z13 = true;
        }
        this.Q0 = z13;
        if (z13) {
            return;
        }
        requireActivity().getWindow().addFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        this.P0.postDelayed(new c2(this, 22), 900000L);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        FragmentActivity E4;
        Window window;
        if (!this.Q0 && (E4 = E4()) != null && (window = E4.getWindow()) != null) {
            window.clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        }
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.l(new Pair("InAppBrowserFragment", "end"));
        this.P0.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // to0.g, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.l(new Pair("InAppBrowserFragment", "start"));
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        j.z(bf.b.S(viewLifecycleOwner), null, null, new to0.m(this, null), 3);
    }
}
