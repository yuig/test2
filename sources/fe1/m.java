package fe1;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import de1.n;
import kotlin.jvm.internal.Intrinsics;
import zd1.v;

/* loaded from: classes5.dex */
public final class m extends RelativeLayout implements n, CompoundButton.OnCheckedChangeListener {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f62079e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f62080a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltCheckBox f62081b;

    /* renamed from: c, reason: collision with root package name */
    public v f62082c;

    /* renamed from: d, reason: collision with root package name */
    public de1.m f62083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(b.f62047n);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(15);
        int dimensionPixelOffset = gestaltText.getResources().getDimensionPixelOffset(eo1.c.lego_spacing_between_elements);
        layoutParams.setMargins(0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        gestaltText.setLayoutParams(layoutParams);
        this.f62080a = gestaltText;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltCheckBox gestaltCheckBox = new GestaltCheckBox(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(15);
        layoutParams2.setMarginStart(gestaltCheckBox.getResources().getDimensionPixelOffset(eo1.c.lego_spacing_between_elements));
        gestaltCheckBox.setLayoutParams(layoutParams2);
        c0.d.l(gestaltCheckBox, new l(this, 0));
        this.f62081b = gestaltCheckBox;
        addView(gestaltText);
        addView(gestaltCheckBox);
        setOnClickListener(new lc1.b(this, 16));
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
        v vVar = this.f62082c;
        if (vVar == null) {
            Intrinsics.r("standardListFilter");
            throw null;
        }
        vVar.f141771f = z13;
        de1.m mVar = this.f62083d;
        if (mVar == null) {
            Intrinsics.r("itemUpdateListener");
            throw null;
        }
        mVar.R(vVar);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        v vVar2 = this.f62082c;
        if (vVar2 != null) {
            setContentDescription(zd1.f.P1(z13, resources, vVar2.f141768c));
        } else {
            Intrinsics.r("standardListFilter");
            throw null;
        }
    }

    @Override // android.view.View
    public final void setSelected(boolean z13) {
        this.f62081b.L(new fd1.h(z13, 9));
    }
}
