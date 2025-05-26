package com.pinterest.feature.home.tuner.sba;

import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.api.model.f30;
import com.pinterest.feature.home.tuner.sba.SbaHfTunerActivityPinCellView;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.blurView.BlurView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.z3;
import lq0.f1;
import lq0.g1;
import om1.l;
import org.jetbrains.annotations.NotNull;
import pb0.d;
import qa2.f0;
import qa2.h0;
import qa2.j0;
import so.jb;
import so.oa;
import so.s8;
import u50.r;
import xk2.m;
import xk2.v;
import xp1.a;
import xp1.b;
import xs0.p;
import xs0.q;
import ye2.o;
import yq0.k;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/home/tuner/sba/SbaHfTunerActivityPinCellView;", "Landroid/widget/FrameLayout;", "Lqa2/f0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homeFeedTuner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SbaHfTunerActivityPinCellView extends FrameLayout implements f0, c {

    /* renamed from: a, reason: collision with root package name */
    public o f45824a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45825b;

    /* renamed from: c, reason: collision with root package name */
    public j0 f45826c;

    /* renamed from: d, reason: collision with root package name */
    public d f45827d;

    /* renamed from: e, reason: collision with root package name */
    public b20.c f45828e;

    /* renamed from: f, reason: collision with root package name */
    public final SbaPinRep f45829f;

    /* renamed from: g, reason: collision with root package name */
    public r f45830g;

    /* renamed from: h, reason: collision with root package name */
    public q f45831h;

    /* renamed from: i, reason: collision with root package name */
    public final View f45832i;

    /* renamed from: j, reason: collision with root package name */
    public final View f45833j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f45834k;

    /* renamed from: l, reason: collision with root package name */
    public final v f45835l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltIconButton f45836m;

    /* renamed from: n, reason: collision with root package name */
    public final SbaPinRep f45837n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbaHfTunerActivityPinCellView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        e();
        View.inflate(getContext(), b.home_feed_pin_activity_cell, this);
        j0 j0Var = this.f45826c;
        if (j0Var == null) {
            Intrinsics.r("pinGridCellFactory");
            throw null;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        final int i13 = 1;
        SbaPinRep sbaPinRep = (SbaPinRep) ((qa2.d) j0Var).a(context2, true);
        ((ViewGroup) findViewById(a.pin_cell_holder)).addView(sbaPinRep);
        this.f45829f = sbaPinRep;
        this.f45831h = new q();
        this.f45832i = findViewById(a.overlay);
        this.f45833j = findViewById(a.overlay_text);
        this.f45834k = (GestaltText) findViewById(a.tv_time_ago);
        this.f45835l = m.b(new k(this, 24));
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById(a.btn_follow);
        gestaltIconButton.u(new gm1.a(this) { // from class: xs0.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SbaHfTunerActivityPinCellView f135833b;

            {
                this.f135833b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i14 = i13;
                SbaHfTunerActivityPinCellView.a(this.f135833b, cVar);
            }
        });
        this.f45836m = gestaltIconButton;
        this.f45837n = sbaPinRep;
    }

    public static void a(SbaHfTunerActivityPinCellView this$0, gm1.c it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof l) {
            r rVar = this$0.f45830g;
            if (rVar != null) {
                rVar.a(xs0.r.f135839a);
            } else {
                Intrinsics.r("eventIntake");
                throw null;
            }
        }
    }

    public final void b(q displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        SbaPinRep sbaPinRep = this.f45829f;
        Intrinsics.g(sbaPinRep, "null cannot be cast to non-null type com.pinterest.featurelibrary.pingridcell.sba.view.PinRep");
        sbaPinRep.bindDisplayState(displayState.f135838e);
        boolean isEmpty = this.f45831h.f135838e.f90820n.f59328a.isEmpty();
        boolean z13 = displayState.f135837d;
        if (!isEmpty) {
            q qVar = this.f45831h;
            if (qVar.f135837d == z13) {
                if (Intrinsics.d(qVar.f135835b, displayState.f135835b)) {
                    return;
                }
            }
        }
        this.f45831h = displayState;
        b20.c cVar = this.f45828e;
        if (cVar == null) {
            Intrinsics.r("experimentV2Helper");
            throw null;
        }
        boolean r13 = cVar.r(z3.DO_NOT_ACTIVATE_EXPERIMENT);
        View overlayText = this.f45833j;
        boolean z14 = displayState.f135834a;
        if (r13) {
            BlurView blurView = (BlurView) this.f45835l.getValue();
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            Intrinsics.checkNotNullParameter(overlayText, "overlayText");
            bs1.c.R1(blurView, z14);
            bs1.c.R1(overlayText, z14);
        } else {
            View overlay = this.f45832i;
            Intrinsics.checkNotNullExpressionValue(overlay, "overlay");
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            Intrinsics.checkNotNullParameter(overlayText, "overlayText");
            bs1.c.R1(overlay, z14);
            Context context = overlay.getContext();
            int i13 = eo1.b.sema_color_background_wash_dark_opacity_40;
            Object obj = d5.a.f53679a;
            overlay.setBackgroundColor(context.getColor(i13));
            bs1.c.R1(overlayText, z14);
        }
        this.f45834k.i(new g1(20, this, displayState));
        f1 f1Var = new f1(displayState, 14);
        GestaltIconButton gestaltIconButton = this.f45836m;
        gestaltIconButton.t(f1Var);
        gestaltIconButton.setSelected(z13);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45824a == null) {
            this.f45824a = new o(this);
        }
        return this.f45824a;
    }

    public final void e() {
        if (this.f45825b) {
            return;
        }
        this.f45825b = true;
        jb jbVar = (jb) ((p) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.f45826c = oaVar.v2();
        this.f45827d = oaVar.j2();
        s8 s8Var = jbVar.f113485c;
        s8Var.H5();
        this.f45828e = s8Var.G5();
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45824a == null) {
            this.f45824a = new o(this);
        }
        return this.f45824a.generatedComponent();
    }

    @Override // qa2.f0
    public final h0 getInternalCell() {
        return this.f45837n;
    }

    @Override // qa2.f0, y92.i
    public final void onViewRecycled() {
        this.f45831h = new q();
        super.onViewRecycled();
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbaHfTunerActivityPinCellView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        e();
        View.inflate(getContext(), b.home_feed_pin_activity_cell, this);
        j0 j0Var = this.f45826c;
        if (j0Var != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            SbaPinRep sbaPinRep = (SbaPinRep) ((qa2.d) j0Var).a(context2, true);
            ((ViewGroup) findViewById(a.pin_cell_holder)).addView(sbaPinRep);
            this.f45829f = sbaPinRep;
            this.f45831h = new q();
            this.f45832i = findViewById(a.overlay);
            this.f45833j = findViewById(a.overlay_text);
            this.f45834k = (GestaltText) findViewById(a.tv_time_ago);
            this.f45835l = m.b(new k(this, 24));
            GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById(a.btn_follow);
            final int i13 = 2;
            gestaltIconButton.u(new gm1.a(this) { // from class: xs0.o

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SbaHfTunerActivityPinCellView f135833b;

                {
                    this.f135833b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c cVar) {
                    int i14 = i13;
                    SbaHfTunerActivityPinCellView.a(this.f135833b, cVar);
                }
            });
            this.f45836m = gestaltIconButton;
            this.f45837n = sbaPinRep;
            return;
        }
        Intrinsics.r("pinGridCellFactory");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbaHfTunerActivityPinCellView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        e();
        View.inflate(getContext(), b.home_feed_pin_activity_cell, this);
        j0 j0Var = this.f45826c;
        if (j0Var != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            SbaPinRep sbaPinRep = (SbaPinRep) ((qa2.d) j0Var).a(context2, true);
            ((ViewGroup) findViewById(a.pin_cell_holder)).addView(sbaPinRep);
            this.f45829f = sbaPinRep;
            this.f45831h = new q();
            this.f45832i = findViewById(a.overlay);
            this.f45833j = findViewById(a.overlay_text);
            this.f45834k = (GestaltText) findViewById(a.tv_time_ago);
            this.f45835l = m.b(new k(this, 24));
            GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById(a.btn_follow);
            final int i14 = 0;
            gestaltIconButton.u(new gm1.a(this) { // from class: xs0.o

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SbaHfTunerActivityPinCellView f135833b;

                {
                    this.f135833b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c cVar) {
                    int i142 = i14;
                    SbaHfTunerActivityPinCellView.a(this.f135833b, cVar);
                }
            });
            this.f45836m = gestaltIconButton;
            this.f45837n = sbaPinRep;
            return;
        }
        Intrinsics.r("pinGridCellFactory");
        throw null;
    }
}
