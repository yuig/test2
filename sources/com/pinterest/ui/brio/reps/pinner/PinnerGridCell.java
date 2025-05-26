package com.pinterest.ui.brio.reps.pinner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.pinterest.activity.conversation.view.GroupUserImageViewV2;
import com.pinterest.following.view.lego.CreatorFollowButton;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.brio.reps.pinner.PinnerGridCell;
import com.pinterest.ui.grid.PinterestAdapterView;
import d5.a;
import ea2.c;
import eo1.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le0.i;
import rl1.r;
import u50.i0;
import vn1.g;
import wy1.d;
import wy1.e;
import xo.s;
import z40.d0;

@Deprecated
/* loaded from: classes4.dex */
public class PinnerGridCell extends s {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f52214n = 0;

    /* renamed from: d, reason: collision with root package name */
    public d0 f52215d;

    /* renamed from: e, reason: collision with root package name */
    public r f52216e;

    /* renamed from: f, reason: collision with root package name */
    public final GroupUserImageViewV2 f52217f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f52218g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f52219h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f52220i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f52221j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltButtonToggle f52222k;

    /* renamed from: l, reason: collision with root package name */
    public final CreatorFollowButton f52223l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f52224m;

    public PinnerGridCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 22);
        this.f52216e = r.LG;
        setLayoutParams(new PinterestAdapterView.LayoutParams(-1));
        View.inflate(getContext(), e.list_cell_pinner_brio_v2, this);
        this.f52217f = (GroupUserImageViewV2) findViewById(d.pinner_avatars);
        this.f52218g = (RelativeLayout) findViewById(d.details_container);
        this.f52219h = (GestaltText) findViewById(d.name_tv);
        this.f52220i = (GestaltText) findViewById(d.subtitle_tv);
        this.f52221j = (GestaltText) findViewById(d.active_tv);
        this.f52223l = (CreatorFollowButton) findViewById(d.follow_bt);
        GestaltButtonToggle gestaltButtonToggle = (GestaltButtonToggle) findViewById(d.inline_add_button);
        this.f52222k = gestaltButtonToggle;
        gestaltButtonToggle.setClickable(false);
        GroupUserImageViewV2 groupUserImageViewV2 = this.f52217f;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.PinnerGridCell);
        obtainStyledAttributes.getBoolean(i.PinnerGridCell_elevated, false);
        obtainStyledAttributes.recycle();
        groupUserImageViewV2.getClass();
        Context context2 = getContext();
        int i13 = b.color_themed_background_default;
        Object obj = a.f53679a;
        setBackgroundColor(context2.getColor(i13));
        this.f52222k.setVisibility(0);
    }

    public final void i() {
        final g gVar;
        final g gVar2;
        int i13 = c.f58179a[this.f52216e.ordinal()];
        final int i14 = 2;
        final int i15 = 1;
        if (i13 == 1) {
            gVar = g.BODY_300;
            gVar2 = g.BODY_100;
        } else if (i13 == 2) {
            gVar = g.UI_400;
            gVar2 = g.BODY_300;
        } else {
            if (i13 != 3) {
                throw new IllegalStateException("ImageSize not supported by PinnerGridCell");
            }
            gVar = g.BODY_300;
            gVar2 = g.BODY_100;
        }
        final int i16 = 0;
        this.f52219h.i(new Function1() { // from class: ea2.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        rn1.a displayState = (rn1.a) obj;
                        int i17 = PinnerGridCell.f52214n;
                        Intrinsics.checkNotNullParameter(displayState, "displayState");
                        i0 i0Var = displayState.f108849g;
                        g variant = gVar;
                        Intrinsics.checkNotNullParameter(variant, "variant");
                        return new rn1.a(i0Var, displayState.f108850h, displayState.f108851i, displayState.f108852j, variant, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
                    case 1:
                        rn1.a displayState2 = (rn1.a) obj;
                        int i18 = PinnerGridCell.f52214n;
                        Intrinsics.checkNotNullParameter(displayState2, "displayState");
                        i0 i0Var2 = displayState2.f108849g;
                        g variant2 = gVar;
                        Intrinsics.checkNotNullParameter(variant2, "variant");
                        return new rn1.a(i0Var2, displayState2.f108850h, displayState2.f108851i, displayState2.f108852j, variant2, displayState2.f108854l, displayState2.f108855m, displayState2.f108856n, displayState2.f108857o, displayState2.f108858p, displayState2.f108859q, displayState2.f108860r, displayState2.f108861s, displayState2.f108862t, displayState2.f108863u, displayState2.f108864v, displayState2.f108865w, displayState2.f108866x, displayState2.f108867y, displayState2.f108868z, displayState2.A);
                    default:
                        rn1.a displayState3 = (rn1.a) obj;
                        int i19 = PinnerGridCell.f52214n;
                        Intrinsics.checkNotNullParameter(displayState3, "displayState");
                        i0 i0Var3 = displayState3.f108849g;
                        g variant3 = gVar;
                        Intrinsics.checkNotNullParameter(variant3, "variant");
                        return new rn1.a(i0Var3, displayState3.f108850h, displayState3.f108851i, displayState3.f108852j, variant3, displayState3.f108854l, displayState3.f108855m, displayState3.f108856n, displayState3.f108857o, displayState3.f108858p, displayState3.f108859q, displayState3.f108860r, displayState3.f108861s, displayState3.f108862t, displayState3.f108863u, displayState3.f108864v, displayState3.f108865w, displayState3.f108866x, displayState3.f108867y, displayState3.f108868z, displayState3.A);
                }
            }
        });
        GestaltText gestaltText = this.f52220i;
        if (gestaltText != null) {
            gestaltText.i(new Function1() { // from class: ea2.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            rn1.a displayState = (rn1.a) obj;
                            int i17 = PinnerGridCell.f52214n;
                            Intrinsics.checkNotNullParameter(displayState, "displayState");
                            i0 i0Var = displayState.f108849g;
                            g variant = gVar2;
                            Intrinsics.checkNotNullParameter(variant, "variant");
                            return new rn1.a(i0Var, displayState.f108850h, displayState.f108851i, displayState.f108852j, variant, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
                        case 1:
                            rn1.a displayState2 = (rn1.a) obj;
                            int i18 = PinnerGridCell.f52214n;
                            Intrinsics.checkNotNullParameter(displayState2, "displayState");
                            i0 i0Var2 = displayState2.f108849g;
                            g variant2 = gVar2;
                            Intrinsics.checkNotNullParameter(variant2, "variant");
                            return new rn1.a(i0Var2, displayState2.f108850h, displayState2.f108851i, displayState2.f108852j, variant2, displayState2.f108854l, displayState2.f108855m, displayState2.f108856n, displayState2.f108857o, displayState2.f108858p, displayState2.f108859q, displayState2.f108860r, displayState2.f108861s, displayState2.f108862t, displayState2.f108863u, displayState2.f108864v, displayState2.f108865w, displayState2.f108866x, displayState2.f108867y, displayState2.f108868z, displayState2.A);
                        default:
                            rn1.a displayState3 = (rn1.a) obj;
                            int i19 = PinnerGridCell.f52214n;
                            Intrinsics.checkNotNullParameter(displayState3, "displayState");
                            i0 i0Var3 = displayState3.f108849g;
                            g variant3 = gVar2;
                            Intrinsics.checkNotNullParameter(variant3, "variant");
                            return new rn1.a(i0Var3, displayState3.f108850h, displayState3.f108851i, displayState3.f108852j, variant3, displayState3.f108854l, displayState3.f108855m, displayState3.f108856n, displayState3.f108857o, displayState3.f108858p, displayState3.f108859q, displayState3.f108860r, displayState3.f108861s, displayState3.f108862t, displayState3.f108863u, displayState3.f108864v, displayState3.f108865w, displayState3.f108866x, displayState3.f108867y, displayState3.f108868z, displayState3.A);
                    }
                }
            });
        }
        GestaltText gestaltText2 = this.f52221j;
        if (gestaltText2 != null) {
            gestaltText2.i(new Function1() { // from class: ea2.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            rn1.a displayState = (rn1.a) obj;
                            int i17 = PinnerGridCell.f52214n;
                            Intrinsics.checkNotNullParameter(displayState, "displayState");
                            i0 i0Var = displayState.f108849g;
                            g variant = gVar2;
                            Intrinsics.checkNotNullParameter(variant, "variant");
                            return new rn1.a(i0Var, displayState.f108850h, displayState.f108851i, displayState.f108852j, variant, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
                        case 1:
                            rn1.a displayState2 = (rn1.a) obj;
                            int i18 = PinnerGridCell.f52214n;
                            Intrinsics.checkNotNullParameter(displayState2, "displayState");
                            i0 i0Var2 = displayState2.f108849g;
                            g variant2 = gVar2;
                            Intrinsics.checkNotNullParameter(variant2, "variant");
                            return new rn1.a(i0Var2, displayState2.f108850h, displayState2.f108851i, displayState2.f108852j, variant2, displayState2.f108854l, displayState2.f108855m, displayState2.f108856n, displayState2.f108857o, displayState2.f108858p, displayState2.f108859q, displayState2.f108860r, displayState2.f108861s, displayState2.f108862t, displayState2.f108863u, displayState2.f108864v, displayState2.f108865w, displayState2.f108866x, displayState2.f108867y, displayState2.f108868z, displayState2.A);
                        default:
                            rn1.a displayState3 = (rn1.a) obj;
                            int i19 = PinnerGridCell.f52214n;
                            Intrinsics.checkNotNullParameter(displayState3, "displayState");
                            i0 i0Var3 = displayState3.f108849g;
                            g variant3 = gVar2;
                            Intrinsics.checkNotNullParameter(variant3, "variant");
                            return new rn1.a(i0Var3, displayState3.f108850h, displayState3.f108851i, displayState3.f108852j, variant3, displayState3.f108854l, displayState3.f108855m, displayState3.f108856n, displayState3.f108857o, displayState3.f108858p, displayState3.f108859q, displayState3.f108860r, displayState3.f108861s, displayState3.f108862t, displayState3.f108863u, displayState3.f108864v, displayState3.f108865w, displayState3.f108866x, displayState3.f108867y, displayState3.f108868z, displayState3.A);
                    }
                }
            });
        }
    }

    public final void j() {
        int i13 = 0;
        boolean z13 = dl2.b.F0(getContext(), this.f52216e.getValue()) < dl2.b.F0(getContext(), r.XL.getValue()) || this.f52216e == r.LG;
        if (!z13 && !this.f52224m) {
            i13 = 1;
        }
        setOrientation(i13);
        RelativeLayout relativeLayout = this.f52218g;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setGravity((z13 || this.f52224m) ? 16 : 1);
        if (z13) {
            return;
        }
        this.f52218g.getLayoutParams().width = -1;
        this.f52223l.getLayoutParams().width = -1;
    }
}
