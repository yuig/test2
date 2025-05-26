package oq1;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.d4;
import java.util.HashSet;
import java.util.Set;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oc2.j;
import rf1.p0;
import sf1.e1;
import so.s;
import x02.i2;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Loq1/e;", "Lyk1/k;", "Loq1/b;", "Loc2/j;", "<init>", "()V", "ideaPinDisplay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends a implements b, j {

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f97226w0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f97227j0;

    /* renamed from: k0, reason: collision with root package name */
    public i2 f97228k0;

    /* renamed from: l0, reason: collision with root package name */
    public s f97229l0;

    /* renamed from: m0, reason: collision with root package name */
    public wk2.a f97230m0;

    /* renamed from: n0, reason: collision with root package name */
    public yk1.j f97231n0;

    /* renamed from: o0, reason: collision with root package name */
    public final v f97232o0 = m.b(new c(this, 2));

    /* renamed from: p0, reason: collision with root package name */
    public final v f97233p0 = m.b(new c(this, 1));

    /* renamed from: q0, reason: collision with root package name */
    public final v f97234q0 = m.b(d.f97225i);

    /* renamed from: r0, reason: collision with root package name */
    public ConstraintLayout f97235r0;

    /* renamed from: s0, reason: collision with root package name */
    public h f97236s0;

    /* renamed from: t0, reason: collision with root package name */
    public p0 f97237t0;

    /* renamed from: u0, reason: collision with root package name */
    public e1 f97238u0;

    /* renamed from: v0, reason: collision with root package name */
    public final d4 f97239v0;

    public e() {
        this.E = fq1.c.idea_pin_full_screen_fragment;
        this.f97239v0 = d4.PIN_CLOSEUP_FULL_SCREEN_IDEA_PIN_VIDEO;
    }

    @Override // yk1.k, nl1.d
    public final void K7() {
        super.K7();
        FragmentActivity E4 = E4();
        if (E4 != null) {
            k3.O1(E4);
            E4.getWindow().addFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        }
        p0 p0Var = this.f97237t0;
        if (p0Var != null) {
            p0Var.h4();
        }
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        p0 p0Var = this.f97237t0;
        if (p0Var == null) {
            Intrinsics.r("storyPinDisplayPresenter");
            throw null;
        }
        p0Var.i4();
        FragmentActivity E4 = E4();
        if (E4 != null) {
            k3.X1(E4);
            E4.getWindow().clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        }
        super.L7();
    }

    @Override // oc2.j
    public final Set S0() {
        return new HashSet();
    }

    @Override // androidx.fragment.app.Fragment, oc2.j
    public final View T() {
        ConstraintLayout constraintLayout = this.f97235r0;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("rootView");
        throw null;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        s sVar = this.f97229l0;
        if (sVar == null) {
            Intrinsics.r("ideaPinFullScreenPresenterFactory");
            throw null;
        }
        uk1.d dVar = (uk1.d) this.f97232o0.getValue();
        i2 i2Var = this.f97228k0;
        if (i2Var != null) {
            return sVar.a(dVar, i2Var);
        }
        Intrinsics.r("pinRepository");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF97239v0() {
        return this.f97239v0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(fq1.b.idea_pin_full_screen_root_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f97235r0 = (ConstraintLayout) findViewById;
        String str = (String) this.f97233p0.getValue();
        if (str != null) {
            h hVar = this.f97236s0;
            if (hVar != null) {
                hVar.p3(str);
            } else {
                Intrinsics.r("viewListener");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, oc2.j
    public final View p5() {
        ConstraintLayout constraintLayout = this.f97235r0;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("rootView");
        throw null;
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return null;
    }
}
