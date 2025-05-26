package com.pinterest.navdemo.one;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import ca1.m;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import cu1.b;
import d7.g;
import ea1.t0;
import ea1.u0;
import eu1.a;
import eu1.l;
import gh1.e;
import h32.d4;
import h32.g0;
import h32.w0;
import java.util.HashMap;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k0;
import nc0.f;
import xk2.k;
import xk2.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/navdemo/one/NavDemoOneFragment;", "Lyk1/k;", "<init>", "()V", "navPlayground_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NavDemoOneFragment extends a {

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ int f49913o0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public final m1 f49914j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltText f49915k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltText f49916l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltButton f49917m0;

    /* renamed from: n0, reason: collision with root package name */
    public final d4 f49918n0;

    public NavDemoOneFragment() {
        k r13 = g.r(27, new t0(this, 20), n.NONE);
        int i13 = 18;
        this.f49914j0 = a1.s(this, k0.f80436a.b(l.class), new u0(r13, 17), new m(r13, i13), new ca1.n(this, r13, i13));
        this.f49918n0 = d4.UNKNOWN_VIEW;
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
    public final d4 getH0() {
        return this.f49918n0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = b.nav_demo_fragment;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(cu1.a.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49915k0 = (GestaltText) findViewById;
        View findViewById2 = v13.findViewById(cu1.a.description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f49916l0 = (GestaltText) findViewById2;
        this.f49917m0 = ((GestaltButton) v13.findViewById(cu1.a.nav_button)).e(new e(this, 14));
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        j.z(bf.b.S(viewLifecycleOwner), null, null, new eu1.g(this, null), 3);
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
