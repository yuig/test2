package dy0;

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
import t3.b4;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Ldy0/o;", "Lnl1/d;", "<init>", "()V", "Ldy0/e;", "displayState", "nux_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o extends d {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f56602h0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f56603c0;

    /* renamed from: d0, reason: collision with root package name */
    public iy0.a f56604d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f56605e0;

    /* renamed from: f0, reason: collision with root package name */
    public final d4 f56606f0;

    /* renamed from: g0, reason: collision with root package name */
    public final a4 f56607g0;

    public o() {
        int i13 = 11;
        int i14 = 10;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new uv0.f(i14, new kl0.w(this, i13)));
        this.f56603c0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(o0.class), new ml0.v(a13, i14), new kl0.x(null, a13, i13), new kl0.y(this, a13, i13));
        this.f56606f0 = d4.ORIENTATION;
        this.f56607g0 = a4.ORIENTATION_LOADING_HOME_FEED;
    }

    public final o0 Y7() {
        return (o0) this.f56603c0.getValue();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getP0() {
        return this.f56607g0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getO0() {
        return this.f56606f0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new tx0.j(Y7().c(), 1);
    }

    @Override // dy0.d, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LayoutInflater.Factory requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        if (requireActivity instanceof iy0.a) {
            this.f56604d0 = (iy0.a) requireActivity;
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
        n nVar = new n(this, 1);
        Object obj = q2.i.f102113a;
        composeView.o(new q2.h(nVar, true, 2021568475));
        return composeView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f56604d0 = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        kh2.j.x2(Y7(), h.f56578a);
        super.onStop();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        iy0.a aVar = this.f56604d0;
        if (aVar != null) {
            aVar.updateIndicatorHeader(false);
        }
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new m(this, null), 3);
    }
}
