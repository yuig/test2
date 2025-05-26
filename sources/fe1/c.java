package fe1;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import kc1.w;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public final class c extends RelativeLayout implements de1.b, CompoundButton.OnCheckedChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f62049f = 0;

    /* renamed from: a, reason: collision with root package name */
    public ae1.a f62050a;

    /* renamed from: b, reason: collision with root package name */
    public final g71.c f62051b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f62052c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltCheckBox f62053d;

    /* renamed from: e, reason: collision with root package name */
    public zd1.c f62054e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin_extra_small);
        int i13 = eo1.b.color_themed_text_default;
        Object obj = d5.a.f53679a;
        g71.c cVar = new g71.c(context, dimensionPixelSize, context.getColor(i13), getResources().getDimensionPixelSize(mz1.c.color_filter_diameter), getResources().getDimensionPixelSize(mz1.c.color_filter_diameter), getResources().getDimensionPixelSize(eo1.c.margin));
        this.f62051b = cVar;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(b.f62043j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(gestaltText.getResources().getDimensionPixelOffset(eo1.c.margin), 0, 0, 0);
        layoutParams.gravity = 16;
        gestaltText.setLayoutParams(layoutParams);
        this.f62052c = gestaltText;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(9);
        layoutParams2.addRule(15);
        linearLayout.setGravity(8388611);
        int dimensionPixelOffset = linearLayout.getResources().getDimensionPixelOffset(eo1.c.lego_spacing_between_elements);
        linearLayout.setPaddingRelative(0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.addView(cVar);
        linearLayout.addView(gestaltText);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltCheckBox gestaltCheckBox = new GestaltCheckBox(context2);
        gestaltCheckBox.L(b.f62044k);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.setMarginStart(gestaltCheckBox.getResources().getDimensionPixelOffset(eo1.c.lego_spacing_between_elements));
        gestaltCheckBox.setLayoutParams(layoutParams3);
        c0.d.l(gestaltCheckBox, new w(this, 22));
        this.f62053d = gestaltCheckBox;
        addView(linearLayout);
        addView(gestaltCheckBox);
        setOnClickListener(new lc1.b(this, 15));
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
        zd1.c cVar = this.f62054e;
        if (cVar != null) {
            cVar.f141696g = z13;
            ae1.a aVar = this.f62050a;
            if (aVar != null) {
                aVar.G(cVar);
            }
            String string = getResources().getString(mz1.g.content_description_color_filter, String.valueOf(cVar.f141697h));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            boolean z14 = cVar.f141696g;
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            setContentDescription(zd1.f.P1(z14, resources, string));
        }
    }

    @Override // android.view.View
    public final void setSelected(boolean z13) {
        this.f62053d.L(new fd1.h(z13, 8));
    }
}
