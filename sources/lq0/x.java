package lq0;

import android.content.Context;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.conversation.view.ConversationMessageReactionDisplayReactionItem;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends qa2.s1 {

    /* renamed from: d, reason: collision with root package name */
    public List f84452d;

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f84452d.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        z holder = (z) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Pair pair = (Pair) this.f84452d.get(i13);
        wy0 user = (wy0) pair.f80346a;
        oq0.a reaction = (oq0.a) pair.f80347b;
        Intrinsics.checkNotNullParameter(user, "reactionUser");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        ConversationMessageReactionDisplayReactionItem conversationMessageReactionDisplayReactionItem = holder.f84461u;
        conversationMessageReactionDisplayReactionItem.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Object value = conversationMessageReactionDisplayReactionItem.f45604b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((GestaltText) value).setText(user.Z2());
        Object value2 = conversationMessageReactionDisplayReactionItem.f45605c.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((GestaltText) value2).setText(user.z4());
        Object value3 = conversationMessageReactionDisplayReactionItem.f45603a.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((GestaltAvatar) value3).H2(new rq.y(4, user));
        Object value4 = conversationMessageReactionDisplayReactionItem.f45606d.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((ImageView) value4).setImageResource(reaction.f97213a);
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new z(new ConversationMessageReactionDisplayReactionItem(context));
    }
}
