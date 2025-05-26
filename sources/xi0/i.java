package xi0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import m60.r0;
import nx.v;
import so.jb;

/* loaded from: classes5.dex */
public final class i extends k implements vi0.d, v, ky.h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f135018g = 0;

    /* renamed from: c, reason: collision with root package name */
    public wi0.c f135019c;

    /* renamed from: d, reason: collision with root package name */
    public String f135020d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltButton.SmallSecondaryButton f135021e;

    /* renamed from: f, reason: collision with root package name */
    public final l f135022f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f135024b) {
            this.f135024b = true;
            this.f135022f = (l) ((jb) ((j) generatedComponent())).f113485c.f114476s.get();
        }
        this.f135020d = "";
        GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context, (AttributeSet) null);
        smallSecondaryButton.e(new bp.j(19, this, context));
        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
        layoutParams.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 2, GridLayout.CENTER, 1.0f);
        layoutParams.height = -2;
        layoutParams.width = -2;
        layoutParams.topMargin = smallSecondaryButton.getResources().getDimensionPixelSize(r0.margin_quarter);
        layoutParams.bottomMargin = smallSecondaryButton.getResources().getDimensionPixelSize(r0.margin_quarter) + smallSecondaryButton.getResources().getDimensionPixelSize(r0.margin_double);
        smallSecondaryButton.setLayoutParams(layoutParams);
        this.f135021e = smallSecondaryButton;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.neg_margin_quarter);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setColumnCount(2);
        addView(smallSecondaryButton);
    }

    public final void a(a aVar) {
        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
        layoutParams.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1, GridLayout.FILL, 1.0f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.margin_quarter);
        Intrinsics.checkNotNullParameter(layoutParams, "<this>");
        com.bumptech.glide.c.a1(layoutParams, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        layoutParams.height = -2;
        layoutParams.width = 0;
        aVar.setLayoutParams(layoutParams);
    }

    public final void b(a aVar) {
        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
        layoutParams.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 2, GridLayout.FILL, 1.0f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.margin_quarter);
        Intrinsics.checkNotNullParameter(layoutParams, "<this>");
        com.bumptech.glide.c.a1(layoutParams, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        layoutParams.height = -2;
        layoutParams.width = 0;
        aVar.setLayoutParams(layoutParams);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        wi0.c cVar = this.f135019c;
        if (cVar == null) {
            return null;
        }
        return ll.j.x(cVar.f130006b, cVar.f130008d, cVar.f130010f.size(), 0, cVar.f130014j, null, null, 48);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        wi0.c cVar = this.f135019c;
        if (cVar != null) {
            return cVar.f130006b.y(cVar.f130009e);
        }
        return null;
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}
