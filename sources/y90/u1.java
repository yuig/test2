package y90;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u1 extends androidx.recyclerview.widget.f1 {

    /* renamed from: e, reason: collision with root package name */
    public final n72.b f138254e;

    /* renamed from: f, reason: collision with root package name */
    public t1 f138255f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(n72.b fontManager) {
        super(f1.f138175d);
        Intrinsics.checkNotNullParameter(fontManager, "fontManager");
        this.f138254e = fontManager;
        this.f138255f = new vt1.a();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        s1 holder = (s1) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object C = C(i13);
        Intrinsics.checkNotNullExpressionValue(C, "getItem(...)");
        m62.h1 item = (m62.h1) C;
        Intrinsics.checkNotNullParameter(item, "item");
        holder.f138242w = item;
        View view = holder.f19717a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        holder.f138240u.k(bs1.c.A(context, item.f86009b ? eo1.b.color_text_default : eo1.b.color_background_secondary_base));
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int A = bs1.c.A(context2, item.f86009b ? eo1.b.color_background_secondary_base : eo1.b.color_text_default);
        TextView textView = holder.f138241v;
        textView.setTextColor(A);
        textView.setTypeface(holder.f138243x.f138254e.a(item.a()));
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new s1(this, LayoutInflater.from(parent.getContext()).inflate(y1.collage_effects_item_font, (ViewGroup) parent, false));
    }
}
