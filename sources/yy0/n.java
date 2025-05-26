package yy0;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.m1;
import h32.a4;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import t3.b4;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lyy0/n;", "Lnl1/d;", "<init>", "()V", "Lyy0/d;", "displayState", "nux_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class n extends c {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f140464g0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f140465c0;

    /* renamed from: d0, reason: collision with root package name */
    public iy0.a f140466d0;

    /* renamed from: e0, reason: collision with root package name */
    public final d4 f140467e0;

    /* renamed from: f0, reason: collision with root package name */
    public final a4 f140468f0;

    public n() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new uv0.f(12, new au0.a(this, 18)));
        this.f140465c0 = a1.s(this, k0.f80436a.b(e0.class), new ml0.v(a13, 12), new kl0.x(null, a13, 13), new kl0.y(this, a13, 13));
        this.f140467e0 = d4.ORIENTATION;
        this.f140468f0 = a4.ORIENTATION_USE_CASE_PICKER_STEP;
    }

    public final e0 Y7() {
        return (e0) this.f140465c0.getValue();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF86878d0() {
        return this.f140468f0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF75509a1() {
        return this.f140467e0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new tx0.j(Y7().c(), 5);
    }

    @Override // yy0.c, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ComponentCallbacks2 k03 = bs1.c.k0(context);
        if (k03 instanceof iy0.a) {
            this.f140466d0 = (iy0.a) k03;
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Y7().h(generateLoggingContext());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(6, requireContext, (AttributeSet) null);
        b4 b4Var = b4.f115859b;
        Function0 function0 = composeView.f17451e;
        if (function0 != null) {
            function0.invoke();
        }
        composeView.f17451e = b4Var.a(composeView);
        m mVar = new m(this, 1);
        Object obj = q2.i.f102113a;
        composeView.o(new q2.h(mVar, true, 370995485));
        return composeView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f140466d0 = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (((androidx.lifecycle.b0) requireActivity().getLifecycle()).f18588d.isAtLeast(androidx.lifecycle.r.STARTED)) {
            return;
        }
        kh2.j.x2(Y7(), h.f140458a);
    }
}
