package lu;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i0 extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public vt.e f84906d;

    /* renamed from: e, reason: collision with root package name */
    public List f84907e;

    /* renamed from: f, reason: collision with root package name */
    public m f84908f;

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f84907e.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        e0 holder = (e0) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        int k13 = holder.k();
        ot.a aVar = (ot.a) this.f84907e.get(k13);
        pk.a0.p(holder.f84882v, aVar.f97512b);
        Iterator it = aVar.f97511a.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            ((d0) holder.f84883w.get(i14)).f84874b.setText((String) it.next());
            i14++;
        }
        LinearLayout linearLayout = holder.f84881u;
        linearLayout.requestLayout();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f80426a = 16;
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new f0(holder, h0Var, this, k13));
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i14 = 0;
        View inflate = LayoutInflater.from(bs1.c.k0(context)).inflate(ps.q.item_view_pager, (ViewGroup) parent, false);
        View findViewById = inflate.findViewById(ps.p.quiz_radioGroup);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltRadioGroup gestaltRadioGroup = (GestaltRadioGroup) findViewById;
        View findViewById2 = inflate.findViewById(ps.p.quiz_question_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(ps.p.quiz_parent);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById3;
        ArrayList arrayList = new ArrayList();
        int size = ((ot.a) this.f84907e.get(0)).f97511a.size();
        for (int i15 = 0; i15 < size; i15++) {
            Context context2 = gestaltRadioGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            d0 d0Var = new d0(context2, this.f84906d);
            Context context3 = gestaltText.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            d0Var.f84876d.setBackgroundTintList(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, pk.a0.q0(context3) ? new int[]{-7829368, -1} : new int[]{-7829368, -16777216}));
            d0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            d0Var.setPaddingRelative(0, (int) bs1.c.T(ps.n.ads_quiz_radio_button_vertical_padding), 0, 0);
            gestaltRadioGroup.addView(d0Var);
            arrayList.add(d0Var);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d0 d0Var2 = (d0) it.next();
            d0Var2.setOnClickListener(new oq.t(this, i14, d0Var2, arrayList));
            i14++;
        }
        return new e0(inflate, linearLayout, gestaltText, arrayList);
    }
}
