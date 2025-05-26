package s52;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.sheet.header.GestaltSheetHeader;
import e0.t;
import et1.r0;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import java.util.List;
import kh2.a1;
import kh2.b0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import o82.b3;
import r02.c0;
import xk2.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls52/n;", "Lp82/a;", "<init>", "()V", "shareBoardVideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class n extends a {

    /* renamed from: g1, reason: collision with root package name */
    public static final /* synthetic */ int f111189g1 = 0;
    public hf0.b Q0;
    public final v R0;
    public final v S0 = xk2.m.b(new e(this, 10));
    public final v T0 = xk2.m.b(new e(this, 6));
    public final v U0 = xk2.m.b(new e(this, 9));
    public final v V0 = xk2.m.b(l.f111186i);
    public final v W0 = xk2.m.b(new e(this, 8));
    public final v X0 = xk2.m.b(new e(this, 7));
    public final v Y0 = xk2.m.b(new e(this, 11));
    public GestaltButton.SmallPrimaryButton Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final m1 f111190a1;

    /* renamed from: b1, reason: collision with root package name */
    public final int f111191b1;

    /* renamed from: c1, reason: collision with root package name */
    public final int f111192c1;

    /* renamed from: d1, reason: collision with root package name */
    public final e f111193d1;

    /* renamed from: e1, reason: collision with root package name */
    public final d4 f111194e1;

    /* renamed from: f1, reason: collision with root package name */
    public final g0 f111195f1;

    public n() {
        int i13 = 0;
        this.R0 = xk2.m.b(new e(this, i13));
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ax1.a(12, new c0(this, 3)));
        int i14 = 1;
        this.f111190a1 = a1.s(this, k0.f80436a.b(s.class), new m(a13, i13), new t02.h(a13, i14), new t02.i(this, a13, i14));
        this.f111191b1 = o52.d.fragment_share_board_pin_selection_sheet;
        this.f111192c1 = 95;
        this.f111193d1 = new e(this, i14);
        this.f111194e1 = d4.ACTION_SHEET;
        this.f111195f1 = g0.SHARE_SCREEN_EDIT_PIN_PICKER;
    }

    @Override // nl1.d, ec2.o
    public final ac2.m P0() {
        return B7();
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new w41.g0(n9().a(), 16);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new kd1.j(n9().c(), 16);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        qa2.n E = b0.E(requireContext, s7());
        adapter.E(30032002, dl2.b.m2(s7(), E, new r0(8, this, E)), new ol0.p(E.f103320a, new f(this, 1), 1), h.f111177l);
        adapter.H(326537, new e(this, 5));
        adapter.A(true);
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        kh2.j.x2(n9(), r52.k.f106289a);
        return true;
    }

    @Override // nl1.d, nx.a
    public final i0 generateLoggingContext() {
        return com.bumptech.glide.d.z0(super.generateLoggingContext(), new f(this, 0));
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getF44791p0() {
        return this.f111195f1;
    }

    @Override // o82.v2, sq0.b0
    /* renamed from: getNumColumns */
    public final int getT0() {
        if (this.Q0 == null) {
            Intrinsics.r("device");
            throw null;
        }
        int i13 = hf0.b.f69004d;
        if (i13 < 3) {
            return 3;
        }
        return i13;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getZ0() {
        return t.x(((b60.d) getActiveUserManager()).f(), (String) this.R0.getValue());
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getY0() {
        return this.f111194e1;
    }

    @Override // p82.a
    public final Function0 h9() {
        return this.f111193d1;
    }

    @Override // p82.a
    /* renamed from: i9, reason: from getter */
    public final int getF111192c1() {
        return this.f111192c1;
    }

    @Override // p82.a
    /* renamed from: j9, reason: from getter */
    public final int getG0() {
        return this.f111191b1;
    }

    public final s n9() {
        return (s) this.f111190a1.getValue();
    }

    @Override // p82.a, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s n93 = n9();
        String str = (String) this.R0.getValue();
        n93.h(new p(((Number) this.S0.getValue()).intValue(), str, (String) this.U0.getValue(), (List) this.T0.getValue()), generateLoggingContext());
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        mm1.k kVar = this.K0;
        if (kVar == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        BottomSheetBehavior a13 = kVar.f().a();
        if (a13 != null) {
            a13.R(false);
        }
        GestaltSheetHeader gestaltSheetHeader = (GestaltSheetHeader) v13.findViewById(tk1.a.gestalt_sheet_header);
        FrameLayout frameLayout = new FrameLayout(requireContext());
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GestaltButton.SmallPrimaryButton smallPrimaryButton = new GestaltButton.SmallPrimaryButton(6, requireContext, (AttributeSet) null);
        smallPrimaryButton.d(h.f111178m);
        gestaltSheetHeader.addView(frameLayout);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.f17693v = 0;
        layoutParams2.f17671i = 0;
        layoutParams2.setMarginStart(bs1.c.X(this, eo1.c.space_100));
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = bs1.c.X(this, eo1.c.space_400);
        layoutParams2.setMarginEnd(bs1.c.X(this, eo1.c.space_200));
        frameLayout.setLayoutParams(layoutParams2);
        frameLayout.addView(smallPrimaryButton);
        frameLayout.setOnClickListener(new wq1.a(this, 21));
        ((GestaltSheetHeader) gestaltSheetHeader.findViewById(tk1.a.gestalt_sheet_header)).requestLayout();
        this.Z0 = smallPrimaryButton;
        h nextState = h.f111175j;
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        mm1.k kVar2 = this.K0;
        if (kVar2 == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar2.i().T(nextState);
        ((GestaltIconButton) v13.findViewById(hn1.t.sheet_start_button)).t(h.f111176k);
        RecyclerView recyclerView = (RecyclerView) requireView().findViewById(o52.c.thumbnail_tray_list);
        recyclerView.H2((c) this.V0.getValue());
        g41.a aVar = new g41.a(this, 20);
        recyclerView.getContext();
        recyclerView.R2(new PinterestLinearLayoutManager(aVar, 0, bs1.c.l1(recyclerView)));
        recyclerView.m(new pw0.d());
        RecyclerView g83 = g8();
        l2 l2Var = g83 != null ? g83.f19242n : null;
        PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
        if (pinterestStaggeredGridLayoutManager != null) {
            if (this.Q0 == null) {
                Intrinsics.r("device");
                throw null;
            }
            int i13 = hf0.b.f69004d;
            if (i13 < 3) {
                i13 = 3;
            }
            pinterestStaggeredGridLayoutManager.h1(i13);
        }
        P8();
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new k(this, null), 3);
    }
}
