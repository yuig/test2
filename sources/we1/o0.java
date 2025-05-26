package we1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.component.button.LegoButton;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 extends LinearLayout implements yk1.n, nx.v {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f129527g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f129528a;

    /* renamed from: b, reason: collision with root package name */
    public uo0.c f129529b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f129530c;

    /* renamed from: d, reason: collision with root package name */
    public final RoundedCornersLayout f129531d;

    /* renamed from: e, reason: collision with root package name */
    public final LegoButton f129532e;

    /* renamed from: f, reason: collision with root package name */
    public n0 f129533f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Context context, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f129528a = z13;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        gestaltText.setPaddingRelative(0, gestaltText.getResources().getDimensionPixelSize(eo1.c.space_200), 0, 0);
        gestaltText.setLayoutParams(layoutParams);
        gestaltText.i(o.f129513n);
        this.f129530c = gestaltText;
        RoundedCornersLayout roundedCornersLayout = new RoundedCornersLayout(context);
        int dimensionPixelSize = roundedCornersLayout.getResources().getDimensionPixelSize(eo1.c.shopping_navigation_bubble_corner_radius);
        roundedCornersLayout.setLayoutParams(new FrameLayout.LayoutParams(roundedCornersLayout.getResources().getDimensionPixelSize(eo1.c.shopping_navigation_bubble_rep_size), roundedCornersLayout.getResources().getDimensionPixelSize(eo1.c.shopping_navigation_bubble_rep_size)));
        roundedCornersLayout.g(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        ef0.a cornerSettings = new ef0.a(dimensionPixelSize, 6);
        Intrinsics.checkNotNullParameter(cornerSettings, "cornerSettings");
        roundedCornersLayout.f44944e = cornerSettings;
        this.f129531d = roundedCornersLayout;
        int i13 = LegoButton.f44743h;
        Intrinsics.checkNotNullParameter(context, "context");
        LegoButton legoButton = new LegoButton(context, ga2.g.LegoButton_Secondary_Small);
        this.f129532e = legoButton;
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setGravity(17);
        if (z13) {
            addView(legoButton);
        } else {
            addView(roundedCornersLayout);
            addView(gestaltText);
        }
        setOnClickListener(new lc1.b(this, 27));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        uo0.c cVar = this.f129529b;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        uo0.c cVar = this.f129529b;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (this.f129528a) {
            n0 n0Var = this.f129533f;
            if (n0Var != null) {
                int measuredWidth = this.f129532e.getMeasuredWidth();
                u2 u2Var = (u2) n0Var;
                ArrayList arrayList = u2Var.f129644k;
                arrayList.add(Integer.valueOf(measuredWidth));
                int size = arrayList.size();
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                Iterator it = arrayList.iterator();
                int i15 = 0;
                while (it.hasNext()) {
                    i15 += ((Number) it.next()).intValue();
                }
                int i16 = (int) ((hf0.b.f69002b - (((u2Var.f129638e.f129650a * size) * 2) + i15)) / 2);
                u2Var.setPaddingRelative(i16, 0, i16, 0);
            }
            this.f129533f = null;
        }
    }
}
