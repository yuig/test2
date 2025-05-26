package we1;

import android.content.Context;
import android.view.View;
import android.widget.GridLayout;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1 extends ConstraintLayout implements re1.m, ky.h {

    /* renamed from: a, reason: collision with root package name */
    public final Flow f129346a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f129347b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Flow flow = new Flow(context);
        flow.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        flow.setId(View.generateViewId());
        flow.C();
        flow.E(1);
        flow.A();
        flow.z(bs1.c.W(flow, eo1.c.space_100));
        flow.D(bs1.c.W(flow, eo1.c.lego_brick_three_quarters));
        flow.f17494k.O0 = 0.5f;
        flow.requestLayout();
        this.f129346a = flow;
        this.f129347b = new ArrayList();
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setPadding(bs1.c.W(this, eo1.c.space_400), bs1.c.W(this, eo1.c.space_200), bs1.c.W(this, eo1.c.space_400), 0);
        androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
        pVar.j(this);
        int id3 = flow.getId();
        pVar.l(id3, 4, 0, 3);
        pVar.l(id3, 4, 0, 4);
        pVar.l(id3, 6, 0, 6);
        pVar.l(id3, 7, 0, 7);
        pVar.b(this);
    }

    @Override // re1.m
    public final void q(re1.l freeformModel) {
        o0 o0Var;
        Intrinsics.checkNotNullParameter(freeformModel, "freeformModel");
        removeAllViews();
        List storyItems = freeformModel.f107613a.f122026a;
        Intrinsics.checkNotNullParameter(storyItems, "storyItems");
        Iterator it = storyItems.iterator();
        int i13 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList = this.f129347b;
            if (!hasNext) {
                int[] E0 = CollectionsKt.E0(arrayList);
                Flow flow = this.f129346a;
                flow.s(E0);
                addView(flow);
                return;
            }
            Object next = it.next();
            int i14 = i13 + 1;
            View view = null;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            ue1.a0 a0Var = (ue1.a0) next;
            if (a0Var.m() == 181) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                o0Var = new o0(context, true);
                GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                layoutParams.height = -2;
                layoutParams.width = -2;
                o0Var.setLayoutParams(layoutParams);
                dl2.b.C2(o0Var.f129532e);
            } else {
                o0Var = null;
            }
            if (o0Var != null) {
                h90.m mVar = a0Var.m() == 181 ? new h90.m(0) : null;
                if (mVar != null) {
                    mVar.c(o0Var, a0Var, i13);
                    view = o0Var;
                }
            }
            if (view != null) {
                int generateViewId = View.generateViewId();
                view.setId(generateViewId);
                arrayList.add(Integer.valueOf(generateViewId));
                addView(view);
            }
            i13 = i14;
        }
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}
