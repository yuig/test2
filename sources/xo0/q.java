package xo0;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u0;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final class q extends LinearLayout implements uo0.e, nx.v, ky.h, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f135619a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f135620b;

    /* renamed from: c, reason: collision with root package name */
    public wo0.h f135621c;

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f135619a == null) {
            this.f135619a = new ye2.o(this);
        }
        return this.f135619a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f135619a == null) {
            this.f135619a = new ye2.o(this);
        }
        return this.f135619a.generatedComponent();
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
        wo0.h hVar = this.f135621c;
        if (hVar == null) {
            return null;
        }
        return ll.j.x(hVar.f130654c, hVar.f130657f, hVar.f130659h.size(), hVar.f130660i.size(), hVar.f130664m, null, null, 48);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        wo0.h hVar = this.f135621c;
        if (hVar != null) {
            return hVar.f130654c.y(hVar.f130661j);
        }
        return null;
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.ITEM_GRID;
    }
}
