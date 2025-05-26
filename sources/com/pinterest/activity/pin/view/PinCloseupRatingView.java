package com.pinterest.activity.pin.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import com.pinterest.activity.pin.view.PinCloseupRatingView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import kh2.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n80.c;
import n80.d;
import n80.f;
import oq.o0;

/* loaded from: classes3.dex */
public class PinCloseupRatingView extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34988e = 0;

    /* renamed from: a, reason: collision with root package name */
    public RatingBar f34989a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltText f34990b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f34991c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f34992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupRatingView(Context context) {
        super(context);
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        this.f34991c = bool2;
        this.f34992d = bool2;
        b(context, bool, bool);
    }

    public final void a(f30 f30Var, Boolean bool) {
        final int i13 = this.f34991c.booleanValue() ? f.pdp_plus_ratings : f.rich_pin_ratings_lego;
        final int intValue = b40.V(f30Var) != null ? b40.V(f30Var).intValue() : 0;
        float W = b40.W(f30Var);
        this.f34989a.setRating(W);
        final int i14 = 1;
        this.f34990b.i(new Function1(this) { // from class: oq.n0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinCloseupRatingView f97107b;

            {
                this.f97107b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i15 = i14;
                int i16 = i13;
                int i17 = intValue;
                PinCloseupRatingView pinCloseupRatingView = this.f97107b;
                switch (i15) {
                    case 0:
                        rn1.a displayState = (rn1.a) obj;
                        int i18 = PinCloseupRatingView.f34988e;
                        pinCloseupRatingView.getClass();
                        Intrinsics.checkNotNullParameter(displayState, "displayState");
                        u50.i0 i0Var = displayState.f108849g;
                        u50.f0 text = bs1.c.h2(j1.X(pinCloseupRatingView.getResources().getQuantityString(i16, i17, Integer.valueOf(i17)), new Object[0]));
                        Intrinsics.checkNotNullParameter(text, "text");
                        return new rn1.a(text, displayState.f108850h, displayState.f108851i, displayState.f108852j, displayState.f108853k, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
                    default:
                        rn1.a displayState2 = (rn1.a) obj;
                        int i19 = PinCloseupRatingView.f34988e;
                        pinCloseupRatingView.getClass();
                        Intrinsics.checkNotNullParameter(displayState2, "displayState");
                        u50.i0 i0Var2 = displayState2.f108849g;
                        u50.f0 text2 = bs1.c.h2(j1.X(pinCloseupRatingView.getResources().getString(i16, Integer.valueOf(i17)), new Object[0]));
                        Intrinsics.checkNotNullParameter(text2, "text");
                        return new rn1.a(text2, displayState2.f108850h, displayState2.f108851i, displayState2.f108852j, displayState2.f108853k, displayState2.f108854l, displayState2.f108855m, displayState2.f108856n, displayState2.f108857o, displayState2.f108858p, displayState2.f108859q, displayState2.f108860r, displayState2.f108861s, displayState2.f108862t, displayState2.f108863u, displayState2.f108864v, displayState2.f108865w, displayState2.f108866x, displayState2.f108867y, displayState2.f108868z, displayState2.A);
                }
            }
        });
        if (this.f34992d.booleanValue()) {
            return;
        }
        setOnClickListener(new o0(W, intValue, f30Var));
    }

    public final void b(Context context, Boolean bool, Boolean bool2) {
        this.f34991c = bool;
        this.f34992d = bool2;
        View.inflate(context, bool.booleanValue() ? d.pdp_rating_view : d.pin_closeup_rating_view, this);
        setOrientation(0);
        this.f34989a = (RatingBar) findViewById(c.pin_rating_bar);
        if (bool2.booleanValue()) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(0);
            this.f34989a.setLayoutParams(layoutParams);
        }
        this.f34990b = (GestaltText) findViewById(c.pin_review_count);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        r.u(this, "PinCloseupRatingView");
    }

    public PinCloseupRatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Boolean bool = Boolean.FALSE;
        this.f34991c = bool;
        this.f34992d = bool;
        b(context, bool, bool);
    }

    public PinCloseupRatingView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Boolean bool = Boolean.FALSE;
        this.f34991c = bool;
        this.f34992d = bool;
        b(context, bool, bool);
    }
}
