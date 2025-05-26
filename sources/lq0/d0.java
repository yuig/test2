package lq0;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.wy0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 extends qa2.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final List f84287d;

    /* renamed from: e, reason: collision with root package name */
    public final mv f84288e;

    /* renamed from: f, reason: collision with root package name */
    public final wy0 f84289f;

    /* renamed from: g, reason: collision with root package name */
    public final dq0.h f84290g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f84291h;

    public d0(List reactionRowItems, mv message, wy0 activeUser, dq0.h hVar) {
        Intrinsics.checkNotNullParameter(reactionRowItems, "reactionRowItems");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(activeUser, "activeUser");
        this.f84287d = reactionRowItems;
        this.f84288e = message;
        this.f84289f = activeUser;
        this.f84290g = hVar;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f84287d.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        f0 holder = (f0) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        oq0.a reaction = (oq0.a) this.f84287d.get(i13);
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        e0 reactionRowItem = holder.f84308u;
        reactionRowItem.getClass();
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(reaction, "<set-?>");
        reactionRowItem.f84305b = reaction;
        Object value = ((xk2.k) reactionRowItem.f84306c).getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ImageView) value).setImageResource(reaction.f97213a);
        reactionRowItem.setContentDescription(reactionRowItem.a().f97214b);
        reactionRowItem.setOnClickListener(new xo.u(this, i13, holder, 2));
        dq0.h hVar = this.f84290g;
        if (hVar != null) {
            Intrinsics.checkNotNullParameter(reactionRowItem, "reactionRowItem");
            oq0.a a13 = reactionRowItem.a();
            HashMap hashMap = oq0.b.f97216b;
            Map K = hVar.f56096a.K();
            if (Intrinsics.d(hashMap.get(K != null ? (String) K.get(hVar.f56098c.getUid()) : null), a13)) {
                Object value2 = ((xk2.k) reactionRowItem.f84306c).getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                d7.b.A0(((ImageView) value2).getBackground(), bs1.c.B(reactionRowItem, xc0.b.message_reaction_selected_bg));
            } else {
                Object value3 = ((xk2.k) reactionRowItem.f84306c).getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                d7.b.A0(((ImageView) value3).getBackground(), bs1.c.B(reactionRowItem, xc0.b.message_reaction_bg));
            }
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new f0(new e0(parent.getContext(), 0));
    }
}
