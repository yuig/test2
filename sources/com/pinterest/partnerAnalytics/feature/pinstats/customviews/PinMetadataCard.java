package com.pinterest.partnerAnalytics.feature.pinstats.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.z;
import b7.c;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.partnerAnalytics.components.MetricRowView;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.PinMetadataCard;
import com.pinterest.screens.u2;
import df.j1;
import ex1.n;
import fy1.d;
import fy1.e;
import h32.f1;
import h32.g0;
import h32.v0;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import m60.u;
import m60.w;
import n60.o;
import ni1.c0;
import ni1.o2;
import ni1.t2;
import ni1.u0;
import ni1.y2;
import nx.d0;
import nx.d1;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import qa2.j0;
import ti1.f;
import wa2.m;
import xk2.v;
import xo.s;
import xx1.b;
import yv1.i;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/pinstats/customviews/PinMetadataCard;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PinMetadataCard extends s {

    /* renamed from: u, reason: collision with root package name */
    public static final e f50200u = new e(d.BIG_NUMBERS, 2);

    /* renamed from: d, reason: collision with root package name */
    public d0 f50201d;

    /* renamed from: e, reason: collision with root package name */
    public final w f50202e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f50203f;

    /* renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f50204g;

    /* renamed from: h, reason: collision with root package name */
    public final f f50205h;

    /* renamed from: i, reason: collision with root package name */
    public final o2 f50206i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f50207j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f50208k;

    /* renamed from: l, reason: collision with root package name */
    public final MetricRowView f50209l;

    /* renamed from: m, reason: collision with root package name */
    public final MetricRowView f50210m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltSpinner f50211n;

    /* renamed from: o, reason: collision with root package name */
    public j0 f50212o;

    /* renamed from: p, reason: collision with root package name */
    public t2 f50213p;

    /* renamed from: q, reason: collision with root package name */
    public ni1.d0 f50214q;

    /* renamed from: r, reason: collision with root package name */
    public d1 f50215r;

    /* renamed from: s, reason: collision with root package name */
    public final m f50216s;

    /* renamed from: t, reason: collision with root package name */
    public final v f50217t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinMetadataCard(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void i(Date date) {
        this.f50208k.i(new n(date, 12));
    }

    public final void j(cy1.d pinStats) {
        Intrinsics.checkNotNullParameter(pinStats, "pinStats");
        String str = pinStats.f53442c;
        GestaltText gestaltText = this.f50207j;
        if (str == null) {
            gestaltText.i(b.f136129j);
        } else {
            gestaltText.i(new n(pinStats, 13));
        }
        final f30 f30Var = pinStats.f53440a;
        if (f30Var != null) {
            final int i13 = 0;
            y2 a13 = ((c0) this.f50217t.getValue()).a(0, f30Var);
            o2 o2Var = this.f50206i;
            if (o2Var != null) {
                u0 b13 = o2Var.b(a13, false);
                f fVar = this.f50205h;
                if (fVar != null) {
                    fVar.bindDisplayState(b13);
                }
            }
            int i14 = pinStats.f53443d;
            e eVar = f50200u;
            String t03 = eVar.t0(i14);
            MetricRowView metricRowView = this.f50209l;
            GestaltText gestaltText2 = metricRowView.f50052d;
            if (t03 == null) {
                a0.p(gestaltText2, "_");
            } else {
                a0.p(gestaltText2, t03);
            }
            final int i15 = 1;
            if (i14 > 0) {
                metricRowView.setOnClickListener(new View.OnClickListener(this) { // from class: xx1.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PinMetadataCard f136127b;

                    {
                        this.f136127b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i16 = i15;
                        f30 pin = f30Var;
                        PinMetadataCard this$0 = this.f136127b;
                        switch (i16) {
                            case 0:
                                fy1.e eVar2 = PinMetadataCard.f50200u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(pin, "$pin");
                                d0 d0Var = this$0.f50201d;
                                if (d0Var != null) {
                                    d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : h32.u0.PIN_REACTION_COUNT, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                                }
                                this$0.f50202e.d(Navigation.z0((ScreenLocation) u2.f51429f.getValue(), pin.getUid()));
                                return;
                            default:
                                fy1.e eVar3 = PinMetadataCard.f50200u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(pin, "$pin");
                                d0 d0Var2 = this$0.f50201d;
                                if (d0Var2 != null) {
                                    d0Var2.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : h32.u0.COMMENTS_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                                }
                                d1 d1Var = this$0.f50215r;
                                v0 v0Var = null;
                                if (d1Var == null) {
                                    Intrinsics.r("trackingParamAttacher");
                                    throw null;
                                }
                                String b14 = d1Var.b(pin);
                                if (b14 != null) {
                                    v0Var = new v0();
                                    v0Var.G = b14;
                                }
                                v0 v0Var2 = v0Var;
                                d0 d0Var3 = this$0.f50201d;
                                if (d0Var3 != null) {
                                    f1 f1Var = f1.COMMUNITY_VIEW_INTENT;
                                    h32.u0 u0Var = h32.u0.SEE_PIN_STATS_BUTTON;
                                    g0 g0Var = g0.STORY_PIN_STATS_MODULE;
                                    String uid = pin.getUid();
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("pin_id", pin.getUid());
                                    Unit unit = Unit.f80348a;
                                    d0Var3.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : uid, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var2 : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                                }
                                NavigationImpl z03 = Navigation.z0((ScreenLocation) u2.f51424a.getValue(), b40.g(pin));
                                z03.m0("com.pinterest.EXTRA_PIN_ID", pin.getUid());
                                this$0.f50202e.d(z03);
                                return;
                        }
                    }
                });
            }
            int i16 = pinStats.f53444e;
            String t04 = eVar.t0(i16);
            MetricRowView metricRowView2 = this.f50210m;
            GestaltText gestaltText3 = metricRowView2.f50052d;
            if (t04 == null) {
                a0.p(gestaltText3, "_");
            } else {
                a0.p(gestaltText3, t04);
            }
            if (i16 > 0) {
                metricRowView2.setOnClickListener(new View.OnClickListener(this) { // from class: xx1.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PinMetadataCard f136127b;

                    {
                        this.f136127b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162 = i13;
                        f30 pin = f30Var;
                        PinMetadataCard this$0 = this.f136127b;
                        switch (i162) {
                            case 0:
                                fy1.e eVar2 = PinMetadataCard.f50200u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(pin, "$pin");
                                d0 d0Var = this$0.f50201d;
                                if (d0Var != null) {
                                    d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : h32.u0.PIN_REACTION_COUNT, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                                }
                                this$0.f50202e.d(Navigation.z0((ScreenLocation) u2.f51429f.getValue(), pin.getUid()));
                                return;
                            default:
                                fy1.e eVar3 = PinMetadataCard.f50200u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(pin, "$pin");
                                d0 d0Var2 = this$0.f50201d;
                                if (d0Var2 != null) {
                                    d0Var2.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : h32.u0.COMMENTS_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                                }
                                d1 d1Var = this$0.f50215r;
                                v0 v0Var = null;
                                if (d1Var == null) {
                                    Intrinsics.r("trackingParamAttacher");
                                    throw null;
                                }
                                String b14 = d1Var.b(pin);
                                if (b14 != null) {
                                    v0Var = new v0();
                                    v0Var.G = b14;
                                }
                                v0 v0Var2 = v0Var;
                                d0 d0Var3 = this$0.f50201d;
                                if (d0Var3 != null) {
                                    f1 f1Var = f1.COMMUNITY_VIEW_INTENT;
                                    h32.u0 u0Var = h32.u0.SEE_PIN_STATS_BUTTON;
                                    g0 g0Var = g0.STORY_PIN_STATS_MODULE;
                                    String uid = pin.getUid();
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("pin_id", pin.getUid());
                                    Unit unit = Unit.f80348a;
                                    d0Var3.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : uid, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var2 : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                                }
                                NavigationImpl z03 = Navigation.z0((ScreenLocation) u2.f51424a.getValue(), b40.g(pin));
                                z03.m0("com.pinterest.EXTRA_PIN_ID", pin.getUid());
                                this$0.f50202e.d(z03);
                                return;
                        }
                    }
                });
            }
            boolean B = o.B(f30Var, "getIsPromoted(...)");
            if (!j1.F1(f30Var)) {
                Boolean Z4 = f30Var.Z4();
                Intrinsics.checkNotNullExpressionValue(Z4, "getIsOosProduct(...)");
                if (!Z4.booleanValue()) {
                    Boolean Z42 = f30Var.Z4();
                    Intrinsics.checkNotNullExpressionValue(Z42, "getIsOosProduct(...)");
                    if (!Z42.booleanValue()) {
                        i15 = 0;
                    }
                }
            }
            metricRowView2.setVisibility((B || i15 != 0) ? 8 : 0);
            dl2.b.X2(this.f50211n, ln1.e.LOADED);
            this.f50203f.setVisibility(0);
            this.f50204g.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinMetadataCard(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 21);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50202e = u.f85943a;
        m mVar = new m(-1048577, -1, 1023, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        this.f50216s = mVar;
        this.f50217t = xk2.m.b(new i(this, 6));
        View.inflate(context, com.pinterest.partnerAnalytics.e.pin_metadata_card, this);
        if (!isInEditMode()) {
            FrameLayout frameLayout = (FrameLayout) findViewById(com.pinterest.partnerAnalytics.d.pinImage_container);
            z r13 = c.r(this);
            ao2.j0 S = r13 != null ? bf.b.S(r13) : dl2.b.e();
            j0 j0Var = this.f50212o;
            if (j0Var == null) {
                Intrinsics.r("pinGridCellFactory");
                throw null;
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            SbaPinRep sbaPinRep = (SbaPinRep) ((qa2.d) j0Var).a(context2, true);
            t2 t2Var = this.f50213p;
            if (t2Var == null) {
                Intrinsics.r("pinRepViewModelFactory");
                throw null;
            }
            o2 a13 = t2.a(t2Var, S, null, 14);
            sbaPinRep.setPinalytics(new nx.a0());
            sbaPinRep.applyUnMigratedPFCFields(mVar.f128875n0, mVar.f128861g0, null, false, mVar.M);
            sbaPinRep.setEventIntake(a13.c());
            j.z(S, null, null, new xx1.d(a13, sbaPinRep, null), 3);
            this.f50205h = sbaPinRep;
            this.f50206i = a13;
            frameLayout.addView(sbaPinRep);
        }
        View findViewById = findViewById(com.pinterest.partnerAnalytics.d.loadingView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltSpinner gestaltSpinner = (GestaltSpinner) findViewById;
        this.f50211n = gestaltSpinner;
        dl2.b.X2(gestaltSpinner, ln1.e.LOADING);
        View findViewById2 = findViewById(com.pinterest.partnerAnalytics.d.pinTitleContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50203f = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(com.pinterest.partnerAnalytics.d.pinMetricsContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f50204g = (ConstraintLayout) findViewById3;
        View findViewById4 = findViewById(com.pinterest.partnerAnalytics.d.tvPinTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f50207j = (GestaltText) findViewById4;
        View findViewById5 = findViewById(com.pinterest.partnerAnalytics.d.tvPinCreationDate);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f50208k = (GestaltText) findViewById5;
        View findViewById6 = findViewById(com.pinterest.partnerAnalytics.d.mdComments);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f50209l = (MetricRowView) findViewById6;
        View findViewById7 = findViewById(com.pinterest.partnerAnalytics.d.mdReactions);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f50210m = (MetricRowView) findViewById7;
    }
}
