package fe1;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import kc1.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zd1.t;
import zd1.u;

/* loaded from: classes5.dex */
public final class k extends RelativeLayout implements zd1.f, CompoundButton.OnCheckedChangeListener {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f62069h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final de1.k f62070a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f62071b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f62072c;

    /* renamed from: d, reason: collision with root package name */
    public u f62073d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltCheckBox f62074e;

    /* renamed from: f, reason: collision with root package name */
    public t f62075f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f62076g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, de1.k sortFilterItemUpdateListener, w updateSortFilter) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sortFilterItemUpdateListener, "sortFilterItemUpdateListener");
        Intrinsics.checkNotNullParameter(updateSortFilter, "updateSortFilter");
        this.f62070a = sortFilterItemUpdateListener;
        this.f62071b = updateSortFilter;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        gestaltText.i(b.f62046m);
        dl2.b.y2(gestaltText);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(20);
        layoutParams.addRule(15);
        gestaltText.setGravity(8388611);
        int dimensionPixelOffset = gestaltText.getResources().getDimensionPixelOffset(eo1.c.lego_spacing_between_elements);
        gestaltText.setPaddingRelative(0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        gestaltText.setLayoutParams(layoutParams);
        this.f62072c = gestaltText;
        this.f62073d = u.MOST_RELEVANT;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltCheckBox gestaltCheckBox = new GestaltCheckBox(context3);
        gestaltCheckBox.L(b.f62045l);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(21);
        layoutParams2.addRule(15);
        layoutParams2.setMarginStart(gestaltCheckBox.getResources().getDimensionPixelOffset(eo1.c.lego_spacing_between_elements));
        gestaltCheckBox.setLayoutParams(layoutParams2);
        c0.d.l(gestaltCheckBox, new w(this, 24));
        this.f62074e = gestaltCheckBox;
        addView(gestaltText);
        addView(gestaltCheckBox);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
        if (z13) {
            t tVar = this.f62075f;
            if (tVar == null) {
                Intrinsics.r("sortFilterItem");
                throw null;
            }
            this.f62070a.x1(tVar, this.f62076g);
            boolean a23 = c0.d.a2(this.f62074e);
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            setContentDescription(zd1.f.P1(a23, resources, tVar.f141764a));
            this.f62071b.invoke(this.f62073d);
        }
    }

    @Override // android.view.View
    public final void setSelected(boolean z13) {
        this.f62076g = z13;
        GestaltCheckBox gestaltCheckBox = this.f62074e;
        gestaltCheckBox.L(new r1.f(z13, gestaltCheckBox, 29));
        setOnClickListener(new g61.a(z13, this));
        this.f62076g = false;
    }
}
