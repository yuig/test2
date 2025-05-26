package oq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.helper.widget.Flow;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rq.g2;

/* loaded from: classes3.dex */
public final class m0 extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final nx.d0 f97080a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f97081b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f97082c;

    /* renamed from: d, reason: collision with root package name */
    public g2 f97083d;

    /* renamed from: e, reason: collision with root package name */
    public final b11.d f97084e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f97085f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltText f97086g;

    /* renamed from: h, reason: collision with root package name */
    public GestaltText f97087h;

    /* renamed from: i, reason: collision with root package name */
    public final List f97088i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f97089j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f97090k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Context context, nx.d0 pinalytics, j0 pinCloseupMetadataViewListener, hs.d moduleViewabilityHelper) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinCloseupMetadataViewListener, "pinCloseupMetadataViewListener");
        Intrinsics.checkNotNullParameter(moduleViewabilityHelper, "moduleViewabilityHelper");
        this.f97080a = pinalytics;
        this.f97081b = pinCloseupMetadataViewListener;
        boolean b13 = moduleViewabilityHelper.b();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        final int i13 = 0;
        linearLayout.setOrientation(0);
        this.f97082c = linearLayout;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b11.d dVar = new b11.d(0, context2);
        dVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f97084e = dVar;
        LinearLayout linearLayout2 = new LinearLayout(context);
        final int i14 = 1;
        linearLayout2.setOrientation(1);
        linearLayout2.setPaddingRelative(linearLayout2.getPaddingStart(), bs1.c.W(linearLayout2, eo1.c.space_100), linearLayout2.getPaddingEnd(), linearLayout2.getPaddingBottom());
        this.f97085f = linearLayout2;
        this.f97088i = b13 ? kotlin.collections.e0.b(vn1.e.REGULAR) : kotlin.collections.e0.b(vn1.e.BOLD);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        gestaltText.setPaddingRelative(bs1.c.W(gestaltText, eo1.c.space_200), gestaltText.getPaddingTop(), gestaltText.getPaddingEnd(), gestaltText.getPaddingBottom());
        gestaltText.setBackgroundColor(bs1.c.B(gestaltText, eo1.b.color_background_default));
        gestaltText.i(new l0(this, 2));
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        gestaltText2.i(new l0(this, 1));
        this.f97089j = gestaltText2;
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(bs1.c.W(view, eo1.c.space_1200), -1));
        view.setBackground(context.getDrawable(n80.b.gradient_sideway_transparent_to_white));
        LinearLayout linearLayout3 = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        linearLayout3.setLayoutParams(layoutParams);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(8388629);
        linearLayout3.addView(view);
        linearLayout3.addView(gestaltText);
        this.f97090k = linearLayout3;
        setOrientation(1);
        setPaddingRelative(getPaddingStart(), bs1.c.W(this, eo1.c.space_100), getPaddingEnd(), getPaddingBottom());
        setOnClickListener(new View.OnClickListener(this) { // from class: oq.i0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f97053b;

            {
                this.f97053b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i13;
                m0 this$0 = this.f97053b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((x0) this$0.f97081b).S0();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((x0) this$0.f97081b).S0();
                        break;
                }
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: oq.i0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f97053b;

            {
                this.f97053b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                m0 this$0 = this.f97053b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((x0) this$0.f97081b).S0();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((x0) this$0.f97081b).S0();
                        break;
                }
            }
        });
    }

    public static final int a(m0 m0Var) {
        m0Var.getClass();
        return hf0.b.q() ? 2 : 1;
    }

    public final void b(View view) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        frameLayout.addView(view);
        frameLayout.addView(this.f97090k);
        LinearLayout linearLayout = this.f97082c;
        linearLayout.addView(frameLayout);
        addView(linearLayout);
    }

    public final void c(HashMap hashMap) {
        Flow flow;
        Flow flow2;
        b11.d dVar = this.f97084e;
        b11.d.d(dVar);
        boolean a13 = dVar.a();
        LinearLayout linearLayout = this.f97090k;
        GestaltText gestaltText = this.f97089j;
        if (a13) {
            this.f97080a.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : h32.u0.CLOSEUP_METADATA_EXPAND_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            GestaltText gestaltText2 = this.f97086g;
            if (gestaltText2 != null) {
                gestaltText2.i(n.f97103v);
            }
            g2 g2Var = this.f97083d;
            if (g2Var != null && (flow2 = g2Var.f109207f) != null) {
                flow2.E(1);
            }
            bs1.c.X0(linearLayout);
            bs1.c.U1(gestaltText);
            return;
        }
        this.f97080a.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : h32.u0.CLOSEUP_METADATA_COLLAPSE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        GestaltText gestaltText3 = this.f97086g;
        if (gestaltText3 != null) {
            gestaltText3.i(new l0(this, 3));
        }
        g2 g2Var2 = this.f97083d;
        if (g2Var2 != null && (flow = g2Var2.f109207f) != null) {
            flow.E(0);
        }
        bs1.c.U1(linearLayout);
        bs1.c.X0(gestaltText);
    }
}
