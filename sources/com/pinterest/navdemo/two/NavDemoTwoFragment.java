package com.pinterest.navdemo.two;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import ca1.m;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import cu1.b;
import d7.g;
import ea1.t0;
import ea1.u0;
import gh1.e;
import h32.d4;
import h32.g0;
import h32.w0;
import iu1.a;
import iu1.o;
import iu1.t;
import iu1.u;
import java.util.HashMap;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k0;
import l82.y;
import nc0.f;
import xk2.k;
import xk2.n;
import yq1.u1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/navdemo/two/NavDemoTwoFragment;", "Lyk1/k;", "<init>", "()V", "navPlayground_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NavDemoTwoFragment extends a {

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f49929s0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public final m1 f49930j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltText f49931k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltText f49932l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltButton f49933m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltSpinner f49934n0;

    /* renamed from: o0, reason: collision with root package name */
    public ViewGroup f49935o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltText f49936p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltText f49937q0;

    /* renamed from: r0, reason: collision with root package name */
    public final d4 f49938r0;

    public NavDemoTwoFragment() {
        k r13 = g.r(29, new t0(this, 22), n.NONE);
        int i13 = 20;
        this.f49930j0 = a1.s(this, k0.f80436a.b(u.class), new u0(r13, 19), new m(r13, i13), new ca1.n(this, r13, i13));
        this.f49938r0 = d4.UNKNOWN_VIEW;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        return new nd0.a();
    }

    @Override // nl1.d, nx.i1
    public final g0 b2() {
        return null;
    }

    @Override // nl1.d, nx.i1
    public final w0 e() {
        return null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF99380v0() {
        return this.f49938r0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = b.nav_demo_two;
        u uVar = (u) this.f49930j0.getValue();
        uVar.getClass();
        Intrinsics.checkNotNullParameter("me", "userId");
        y.i(uVar.f73721e, new t(), false, new u1(uVar, 15), 2);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(cu1.a.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49931k0 = (GestaltText) findViewById;
        View findViewById2 = v13.findViewById(cu1.a.description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f49932l0 = (GestaltText) findViewById2;
        this.f49933m0 = ((GestaltButton) v13.findViewById(cu1.a.nav_button)).e(new e(this, 16));
        View findViewById3 = v13.findViewById(cu1.a.loading_spinner);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f49934n0 = (GestaltSpinner) findViewById3;
        View findViewById4 = v13.findViewById(cu1.a.model_fields_container);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f49935o0 = (ViewGroup) findViewById4;
        View findViewById5 = v13.findViewById(cu1.a.username);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f49936p0 = (GestaltText) findViewById5;
        View findViewById6 = v13.findViewById(cu1.a.full_name);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f49937q0 = (GestaltText) findViewById6;
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        j.z(bf.b.S(viewLifecycleOwner), null, null, new o(this, null), 3);
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        return null;
    }

    @Override // nl1.d
    public final f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return null;
    }
}
