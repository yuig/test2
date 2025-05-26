package we1;

import android.content.Context;
import com.pinterest.design.widget.RoundedCornersLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends RoundedCornersLayout implements yk1.n, nx.v {

    /* renamed from: f, reason: collision with root package name */
    public final p0 f129558f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(float f13, int i13, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        p0 p0Var = new p0(f13, i13, context);
        this.f129558f = p0Var;
        addView(p0Var);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium);
        g(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        uo0.c cVar = this.f129558f.f129546f;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        uo0.c cVar = this.f129558f.f129546f;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }
}
