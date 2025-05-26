package xo0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.gridlayout.widget.GridLayout;
import h32.g0;
import h32.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import m60.r0;
import m60.t0;
import nx.y0;

/* loaded from: classes5.dex */
public final class g extends GridLayout implements h, nx.v, ky.h {
    public o6.d A;
    public wo0.c B;
    public final int C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        o6.a CENTER = GridLayout.f18530x;
        Intrinsics.checkNotNullExpressionValue(CENTER, "CENTER");
        this.A = CENTER;
        this.C = context.getResources().getDimensionPixelOffset(r0.end_frame_buttons_separation_small) / 2;
        setId(t0.bubble_container);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.margin_quarter);
        setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, getResources().getDimensionPixelOffset(r0.margin_half));
        this.f18533a.p(getResources().getInteger(c80.c.bubble_container_col));
        l();
        requestLayout();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        IntRange q13 = ql2.s.q(0, getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator it = q13.iterator();
        while (it.hasNext()) {
            View childAt = getChildAt(((u0) it).b());
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        return CollectionsKt.F0(arrayList);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        wo0.c cVar = this.B;
        if (cVar != null) {
            v2 x13 = ll.j.x(cVar.f130626c, cVar.f130633j, cVar.f130632i.size(), cVar.f130635l.size(), cVar.f130641r, null, null, 48);
            if (x13 != null) {
                return new y0(x13, null, null, g0.DYNAMIC_GRID_STORY, 6);
            }
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        wo0.c cVar = this.B;
        if (cVar != null) {
            return new y0(cVar.f130626c.y(cVar.f130640q), null, null, g0.DYNAMIC_GRID_STORY, 6);
        }
        return null;
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.ITEM_GRID;
    }
}
