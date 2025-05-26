package p11;

import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.d4;
import java.util.Calendar;
import java.util.TimeZone;
import jc0.v;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import so.q1;
import so.r1;
import zp.i0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lp11/l;", "Lyk1/k;", "Lp11/g;", "<init>", "()V", "bp1/h", "pin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class l extends f implements g {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f98658y0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public q1 f98659j0;

    /* renamed from: k0, reason: collision with root package name */
    public uk1.e f98660k0;

    /* renamed from: l0, reason: collision with root package name */
    public r1 f98661l0;

    /* renamed from: m0, reason: collision with root package name */
    public TimePickerDialog f98662m0;

    /* renamed from: n0, reason: collision with root package name */
    public o11.a f98663n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltText f98664o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltText f98665p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltButton f98666q0;

    /* renamed from: r0, reason: collision with root package name */
    public GestaltButton f98667r0;

    /* renamed from: s0, reason: collision with root package name */
    public ConstraintLayout f98668s0;

    /* renamed from: t0, reason: collision with root package name */
    public ConstraintLayout f98669t0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f98671v0;

    /* renamed from: x0, reason: collision with root package name */
    public final d4 f98673x0;

    /* renamed from: u0, reason: collision with root package name */
    public final Calendar f98670u0 = Calendar.getInstance(TimeZone.getDefault());

    /* renamed from: w0, reason: collision with root package name */
    public String f98672w0 = "";

    public l() {
        this.E = ry1.d.schedule_pin_date_time_picker_fragment;
        this.f98673x0 = d4.PIN_SCHEDULING_DATE_TIME_PICKER;
    }

    @Override // nl1.d, ku1.k
    public final void D5() {
        P7();
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        this.f98671v0 = com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_IS_EDITABLE_PIN", false);
        this.f98672w0 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_SCHEDULED_PIN_ID", "");
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltButton gestaltButton = this.f98666q0;
        if (gestaltButton == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        k3.J1(gestaltButton);
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.b0(getString(ry1.f.date_time_picker_fragment_header));
        GestaltButton gestaltButton2 = this.f98666q0;
        if (gestaltButton2 == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        gestaltToolbarImpl.c(gestaltButton2);
        gestaltToolbarImpl.U(new h(this, 0));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        q1 q1Var = this.f98659j0;
        if (q1Var == null) {
            Intrinsics.r("dateTimePickerPresenterFactory");
            throw null;
        }
        uk1.e eVar = this.f98660k0;
        if (eVar != null) {
            return q1Var.a(((uk1.a) eVar).f(s7(), ""), this.f98671v0, this.f98672w0);
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        if (this.f98671v0) {
            w f73 = f7();
            r1 r1Var = this.f98661l0;
            if (r1Var == null) {
                Intrinsics.r("pinEditModalV2Factory");
                throw null;
            }
            f73.d(new v(r1Var.a(i0.SCHEDULED_PIN), true, 0L, 28));
        }
        nl1.d.J7();
        return false;
    }

    @Override // nl1.d, uk1.c
    public final d4 getViewType() {
        return this.f98673x0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(ry1.c.date_select_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = onCreateView.findViewById(ry1.c.time_select_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = onCreateView.findViewById(ry1.c.time_selection);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f98665p0 = (GestaltText) findViewById3;
        View findViewById4 = onCreateView.findViewById(ry1.c.date_selection);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f98664o0 = (GestaltText) findViewById4;
        View findViewById5 = onCreateView.findViewById(ry1.c.reset_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f98667r0 = (GestaltButton) findViewById5;
        View findViewById6 = onCreateView.findViewById(ry1.c.publish_date_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f98668s0 = (ConstraintLayout) findViewById6;
        View findViewById7 = onCreateView.findViewById(ry1.c.publish_time_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f98669t0 = (ConstraintLayout) findViewById7;
        ConstraintLayout constraintLayout = this.f98668s0;
        if (constraintLayout == null) {
            Intrinsics.r("dateWrapper");
            throw null;
        }
        final int i13 = 1;
        constraintLayout.setOnClickListener(new h(this, i13));
        ConstraintLayout constraintLayout2 = this.f98669t0;
        if (constraintLayout2 == null) {
            Intrinsics.r("timeWrapper");
            throw null;
        }
        constraintLayout2.setOnClickListener(new h(this, 2));
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        final int i14 = 0;
        this.f98666q0 = new GestaltButton.SmallPrimaryButton(6, requireContext, (AttributeSet) null).d(a.f98637m).e(new gm1.a(this) { // from class: p11.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f98655b;

            {
                this.f98655b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                l this$0 = this.f98655b;
                switch (i15) {
                    case 0:
                        int i16 = l.f98658y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        o11.a aVar = this$0.f98663n0;
                        if (aVar != null) {
                            aVar.r3();
                            return;
                        } else {
                            Intrinsics.r("pageListener");
                            throw null;
                        }
                    default:
                        int i17 = l.f98658y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        o11.a aVar2 = this$0.f98663n0;
                        if (aVar2 != null) {
                            aVar2.t3();
                            return;
                        } else {
                            Intrinsics.r("pageListener");
                            throw null;
                        }
                }
            }
        });
        GestaltButton gestaltButton = this.f98667r0;
        if (gestaltButton != null) {
            gestaltButton.e(new gm1.a(this) { // from class: p11.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f98655b;

                {
                    this.f98655b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i15 = i13;
                    l this$0 = this.f98655b;
                    switch (i15) {
                        case 0:
                            int i16 = l.f98658y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            o11.a aVar = this$0.f98663n0;
                            if (aVar != null) {
                                aVar.r3();
                                return;
                            } else {
                                Intrinsics.r("pageListener");
                                throw null;
                            }
                        default:
                            int i17 = l.f98658y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            o11.a aVar2 = this$0.f98663n0;
                            if (aVar2 != null) {
                                aVar2.t3();
                                return;
                            } else {
                                Intrinsics.r("pageListener");
                                throw null;
                            }
                    }
                }
            });
            return onCreateView;
        }
        Intrinsics.r("resetButton");
        throw null;
    }
}
