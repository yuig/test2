package ne1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import com.pinterest.api.model.vh;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ku1.l;
import ky.g;
import ky.h;
import lh0.x3;
import m60.r0;
import nx.d0;
import nx.v;
import r82.e;
import tb0.p;
import uj2.q;
import vb0.j;
import xo.s;

/* loaded from: classes5.dex */
public final class b extends s implements le1.a, v, h {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f90460k = 0;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f90461d;

    /* renamed from: e, reason: collision with root package name */
    public l f90462e;

    /* renamed from: f, reason: collision with root package name */
    public x3 f90463f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f90464g;

    /* renamed from: h, reason: collision with root package name */
    public final GridLayout f90465h;

    /* renamed from: i, reason: collision with root package name */
    public GestaltButton.SmallSecondaryButton f90466i;

    /* renamed from: j, reason: collision with root package name */
    public me1.a f90467j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, d0 pinalytics, q networkStateStream) {
        super(context, 16);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f90461d = pinalytics;
        int integer = getResources().getInteger(e.grid_section_container_col);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        gestaltText.i(a.f90459i);
        int dimensionPixelOffset = gestaltText.getResources().getDimensionPixelOffset(r0.margin_half);
        gestaltText.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        this.f90464g = gestaltText;
        GridLayout gridLayout = new GridLayout(getContext());
        gridLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int dimensionPixelOffset2 = gridLayout.getResources().getDimensionPixelOffset(r0.margin_quarter);
        gridLayout.setPaddingRelative(dimensionPixelOffset2, gridLayout.getResources().getDimensionPixelOffset(r0.margin_half) + dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
        gridLayout.setColumnCount(integer);
        gridLayout.setVisibility(8);
        this.f90465h = gridLayout;
        x3 x3Var = this.f90463f;
        if (x3Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        if (x3Var.a()) {
            j.f125466a.K(true, "ShoppingGridSectionContainer usage reported", p.PLATFORM, new Object[0]);
        }
        setOrientation(1);
        setGravity(17);
        addView(gestaltText);
        addView(gridLayout);
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        GridLayout gridLayout = this.f90465h;
        IntRange q13 = ql2.s.q(0, gridLayout.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator it = q13.iterator();
        while (it.hasNext()) {
            View childAt = gridLayout.getChildAt(((u0) it).b());
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        return CollectionsKt.F0(arrayList);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        vh vhVar;
        me1.a aVar = this.f90467j;
        if (aVar == null || (vhVar = aVar.f87043e) == null) {
            return null;
        }
        int size = vhVar.f42865w.size();
        return ll.j.x(aVar.f87041c, vhVar.getUid(), size, size, vhVar.u(), null, null, 48);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        me1.a aVar = this.f90467j;
        if (aVar != null) {
            return aVar.f87041c.y(aVar.f87044f);
        }
        return null;
    }

    @Override // ky.h
    public final g z() {
        return g.ITEM_GRID;
    }
}
