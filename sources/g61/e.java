package g61;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupLegoActionButtonModule;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import k42.f;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nx.d0;
import nx.v;
import s71.s;
import uj2.q;

/* loaded from: classes5.dex */
public abstract class e extends LinearLayout implements s, v {

    /* renamed from: a, reason: collision with root package name */
    public f61.a f63731a;

    /* renamed from: b, reason: collision with root package name */
    public final q21.d f63732b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f63733c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f63734d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f63735e;

    /* renamed from: f, reason: collision with root package name */
    public final PinCloseupLegoActionButtonModule f63736f;

    /* renamed from: g, reason: collision with root package name */
    public f30 f63737g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, d0 pinalytics, q networkStateStream) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin);
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int dimensionPixelSize2 = imageView.getResources().getDimensionPixelSize(r0.margin_half);
        Intrinsics.checkNotNullParameter(layoutParams, "<this>");
        com.bumptech.glide.c.a1(layoutParams, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        layoutParams.gravity = 49;
        imageView.setLayoutParams(layoutParams);
        imageView.setContentDescription(imageView.getResources().getString(f.content_description_drawer_handle));
        imageView.setImageResource(k42.c.lego_handlebar);
        addView(imageView);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        addView(relativeLayout, new LinearLayout.LayoutParams(-1, -2));
        q21.d dVar = new q21.d(context, pinalytics, networkStateStream, "medium", r0.corner_radius_gs_lego, new a(this, true, 0), null, null, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
        dVar.g(dVar.getResources().getDimensionPixelSize(k42.b.product_card_pin_image_width_height), dVar.getResources().getDimensionPixelSize(k42.b.product_card_pin_image_width_height));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(dimensionPixelSize);
        layoutParams2.setMarginEnd(dimensionPixelSize);
        layoutParams2.bottomMargin = dimensionPixelSize;
        dVar.setId(k42.d.pin_image);
        dVar.setLayoutParams(layoutParams2);
        relativeLayout.addView(dVar);
        this.f63732b = dVar;
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(21);
        layoutParams3.addRule(17, dVar.getId());
        layoutParams3.setMarginEnd(dimensionPixelSize);
        layoutParams3.bottomMargin = dimensionPixelSize;
        linearLayout.setLayoutParams(layoutParams3);
        final int i13 = 1;
        linearLayout.setOrientation(1);
        relativeLayout.addView(linearLayout);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.bottomMargin = gestaltText.getResources().getDimensionPixelSize(eo1.c.space_100);
        gestaltText.setLayoutParams(layoutParams4);
        dl2.b.y2(gestaltText);
        final int i14 = 0;
        GestaltText j13 = gestaltText.i(d.f63728k).j(new gm1.a(this) { // from class: g61.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f63723b;

            {
                this.f63723b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                f61.a aVar;
                f61.a aVar2;
                int i15 = i14;
                e this$0 = this.f63723b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        f30 pin = this$0.f63737g;
                        if (pin != null && (aVar = this$0.f63731a) != null) {
                            Intrinsics.checkNotNullParameter(pin, "pin");
                            aVar.p3(pin);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        f30 pin2 = this$0.f63737g;
                        if (pin2 != null && (aVar2 = this$0.f63731a) != null) {
                            Intrinsics.checkNotNullParameter(pin2, "pin");
                            aVar2.p3(pin2);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout.addView(j13);
        this.f63733c = j13;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.bottomMargin = gestaltText2.getResources().getDimensionPixelSize(eo1.c.space_300);
        gestaltText2.setLayoutParams(layoutParams5);
        dl2.b.y2(gestaltText2);
        GestaltText j14 = gestaltText2.i(d.f63729l).j(new c(this));
        linearLayout.addView(j14);
        this.f63734d = j14;
        GestaltText gestaltText3 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        dl2.b.y2(gestaltText3);
        GestaltText j15 = gestaltText3.i(d.f63727j).j(new gm1.a(this) { // from class: g61.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f63723b;

            {
                this.f63723b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                f61.a aVar;
                f61.a aVar2;
                int i15 = i13;
                e this$0 = this.f63723b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        f30 pin = this$0.f63737g;
                        if (pin != null && (aVar = this$0.f63731a) != null) {
                            Intrinsics.checkNotNullParameter(pin, "pin");
                            aVar.p3(pin);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        f30 pin2 = this$0.f63737g;
                        if (pin2 != null && (aVar2 = this$0.f63731a) != null) {
                            Intrinsics.checkNotNullParameter(pin2, "pin");
                            aVar2.p3(pin2);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout.addView(j15);
        this.f63735e = j15;
        PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule = new PinCloseupLegoActionButtonModule(context);
        pinCloseupLegoActionButtonModule.updatePinalytics(pinalytics);
        pinCloseupLegoActionButtonModule.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(pinCloseupLegoActionButtonModule);
        this.f63736f = pinCloseupLegoActionButtonModule;
        setOrientation(1);
        int i15 = eo1.d.lego_card_rounded_top_transparent_and_bottom;
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i15));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public final void a(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule = this.f63736f;
        if (pinCloseupLegoActionButtonModule != null) {
            pinCloseupLegoActionButtonModule.updatePin(pin);
        }
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return e0.b(this.f63732b);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return this.f63732b.markImpressionEnd();
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f63732b.markImpressionStart();
    }

    @Override // yk1.r
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
    }
}
