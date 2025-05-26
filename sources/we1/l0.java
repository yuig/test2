package we1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.design.widget.RoundedCornersLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 extends LinearLayout implements yk1.n, nx.v {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f129455d = 0;

    /* renamed from: a, reason: collision with root package name */
    public uo0.c f129456a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f129457b;

    /* renamed from: c, reason: collision with root package name */
    public final q1 f129458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        w0 w0Var = new w0(context);
        w0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f129457b = w0Var;
        RoundedCornersLayout roundedCornersLayout = new RoundedCornersLayout(context);
        roundedCornersLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int dimensionPixelSize = roundedCornersLayout.getResources().getDimensionPixelSize(eo1.c.space_400);
        roundedCornersLayout.g(dimensionPixelSize, dimensionPixelSize, z13 ? 0 : dimensionPixelSize, z13 ? 0 : dimensionPixelSize);
        q1 q1Var = new q1(context);
        q1Var.setVisibility(8);
        this.f129458c = q1Var;
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOnClickListener(new lc1.b(this, 25));
        addView(roundedCornersLayout);
        roundedCornersLayout.addView(w0Var);
        addView(q1Var);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        uo0.c cVar = this.f129456a;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        uo0.c cVar = this.f129456a;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }
}
