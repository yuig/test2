package za2;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.constraintlayout.widget.p;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import ky.g;
import ky.h;
import ll.j;
import nx.v;
import rh1.d1;

/* loaded from: classes4.dex */
public final class b extends d1 implements xa2.a, v, h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f141482i = 0;

    /* renamed from: d, reason: collision with root package name */
    public ya2.a f141483d;

    /* renamed from: e, reason: collision with root package name */
    public l f141484e;

    /* renamed from: f, reason: collision with root package name */
    public final ProportionalImageView f141485f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f141486g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltButton.SmallSecondaryButton f141487h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        ProportionalImageView proportionalImageView = new ProportionalImageView(context);
        proportionalImageView.setId(f62.c.general_shopping_upsell_image);
        proportionalImageView.f52576J = 1.33f;
        proportionalImageView.U1(eo1.c.lego_corner_radius_medium);
        int i13 = eo1.b.color_themed_background_dark_opacity_300;
        Object obj = d5.a.f53679a;
        proportionalImageView.setColorFilter(context.getColor(i13), PorterDuff.Mode.SRC_ATOP);
        proportionalImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(proportionalImageView);
        this.f141485f = proportionalImageView;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(a.f141480k);
        addView(gestaltText);
        this.f141486g = gestaltText;
        GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context, (AttributeSet) null);
        smallSecondaryButton.d(a.f141479j);
        addView(smallSecondaryButton);
        this.f141487h = smallSecondaryButton;
        p pVar = new p();
        int id3 = proportionalImageView.getId();
        int i14 = gestaltText.l().f108860r;
        int i15 = smallSecondaryButton.h().f139308i;
        pVar.n(i14, -2);
        pVar.o(i14, -2);
        pVar.l(i14, 6, 0, 6);
        pVar.l(i14, 7, 0, 7);
        pVar.l(i14, 3, id3, 3);
        pVar.l(i14, 4, id3, 4);
        pVar.n(i15, -2);
        pVar.o(i15, 0);
        pVar.l(i15, 6, 0, 6);
        pVar.l(i15, 7, 0, 7);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.margin_half);
        pVar.m(i15, 3, id3, 4, dimensionPixelOffset);
        pVar.m(i15, 4, 0, 4, dimensionPixelOffset);
        pVar.b(this);
        setOnClickListener(new wq1.a(this, 25));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        ya2.a aVar = this.f141483d;
        if (aVar == null) {
            return null;
        }
        return j.x(aVar.f138315a, aVar.f138316b, 0, 0, aVar.f138322h, null, null, 52);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        ya2.a aVar = this.f141483d;
        if (aVar != null) {
            return aVar.f138315a.y(aVar.f138317c);
        }
        return null;
    }

    @Override // ky.h
    public final g z() {
        return g.OTHER;
    }
}
