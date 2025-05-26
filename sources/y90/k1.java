package y90;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.collage.effects.components.EffectToolView;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k1 extends androidx.recyclerview.widget.f1 {

    /* renamed from: e, reason: collision with root package name */
    public i1 f138199e;

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        m62.n nVar = (m62.n) C(i13);
        if (nVar instanceof m62.l) {
            return 0;
        }
        if (nVar instanceof m62.k) {
            return 1;
        }
        throw new IllegalStateException(("Unsupported view type " + kotlin.jvm.internal.k0.f80436a.b(nVar.getClass()).f()).toString());
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 holder, int i13) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        m62.n nVar = (m62.n) C(i13);
        if (nVar instanceof m62.l) {
            j1 j1Var = (j1) holder;
            m62.l item = (m62.l) nVar;
            Intrinsics.checkNotNullParameter(item, "item");
            boolean z13 = item.f86029a;
            z90.g gVar = j1Var.f138196v;
            rm1.q icon = gVar.f141352a;
            Intrinsics.checkNotNullParameter(icon, "icon");
            rm1.c iconColor = gVar.f141353b;
            Intrinsics.checkNotNullParameter(iconColor, "iconColor");
            u50.i0 label = gVar.f141354c;
            Intrinsics.checkNotNullParameter(label, "label");
            j1Var.f138195u.o(new z90.g(icon, iconColor, label, z13, gVar.f141356e));
            return;
        }
        if (!(nVar instanceof m62.k)) {
            throw new IllegalStateException(("Unsupported item type " + kotlin.jvm.internal.k0.f80436a.b(nVar.getClass()).f()).toString());
        }
        h1 h1Var = (h1) holder;
        m62.k item2 = (m62.k) nVar;
        Intrinsics.checkNotNullParameter(item2, "item");
        h1Var.f138188x = item2;
        Context context = h1Var.f19717a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        h1Var.f138185u.k(bs1.c.A(context, item2.f86023c ? eo1.b.color_background_secondary_base : eo1.b.color_background_default));
        GestaltIcon icon2 = h1Var.f138186v;
        Intrinsics.checkNotNullExpressionValue(icon2, "icon");
        dl2.b.z(icon2, new g1(h1Var, item2, 1));
        GestaltText label2 = h1Var.f138187w;
        Intrinsics.checkNotNullExpressionValue(label2, "label");
        pk.a0.p(label2, item2.f86022b.f78426a);
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        if (i13 != 0) {
            if (i13 == 1) {
                return new h1(this, from.inflate(y1.collage_effects_item_effect_setting, (ViewGroup) parent, false));
            }
            throw new IllegalStateException(("Unsupported view type " + i13).toString());
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        EffectToolView effectToolView = new EffectToolView(6, context, (AttributeSet) null);
        effectToolView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new j1(this, effectToolView);
    }
}
