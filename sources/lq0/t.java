package lq0;

import com.pinterest.api.model.wy0;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84435i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ConversationMessageItemView f84436j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(ConversationMessageItemView conversationMessageItemView, int i13) {
        super(1);
        this.f84435i = i13;
        this.f84436j = conversationMessageItemView;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f84435i;
        ConversationMessageItemView conversationMessageItemView = this.f84436j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(conversationMessageItemView.f45586v0), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(conversationMessageItemView.f45580s0), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(conversationMessageItemView.f45584u0), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConversationMessageItemView conversationMessageItemView = this.f84436j;
        int i13 = this.f84435i;
        switch (i13) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                rl1.q it = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rl1.q.e(it, null, null, false, null, null, false, false, conversationMessageItemView.f45582t0 ? fm1.c.VISIBLE : fm1.c.INVISIBLE, 0, null, null, 1919);
            case 3:
                return b((rn1.a) obj);
            case 4:
                wy0 wy0Var = (wy0) obj;
                switch (i13) {
                    case 4:
                        GestaltAvatar gestaltAvatar = conversationMessageItemView.f45589x;
                        if (gestaltAvatar == null) {
                            Intrinsics.r("systemMessageUserAvatar");
                            throw null;
                        }
                        ConversationMessageItemView.T0(conversationMessageItemView, gestaltAvatar, wy0Var, 12);
                        break;
                    default:
                        GestaltAvatar gestaltAvatar2 = conversationMessageItemView.f45589x;
                        if (gestaltAvatar2 == null) {
                            Intrinsics.r("systemMessageUserAvatar");
                            throw null;
                        }
                        ConversationMessageItemView.T0(conversationMessageItemView, gestaltAvatar2, wy0Var, 12);
                        break;
                }
                return Unit.f80348a;
            default:
                wy0 wy0Var2 = (wy0) obj;
                switch (i13) {
                    case 4:
                        GestaltAvatar gestaltAvatar3 = conversationMessageItemView.f45589x;
                        if (gestaltAvatar3 == null) {
                            Intrinsics.r("systemMessageUserAvatar");
                            throw null;
                        }
                        ConversationMessageItemView.T0(conversationMessageItemView, gestaltAvatar3, wy0Var2, 12);
                        break;
                    default:
                        GestaltAvatar gestaltAvatar4 = conversationMessageItemView.f45589x;
                        if (gestaltAvatar4 == null) {
                            Intrinsics.r("systemMessageUserAvatar");
                            throw null;
                        }
                        ConversationMessageItemView.T0(conversationMessageItemView, gestaltAvatar4, wy0Var2, 12);
                        break;
                }
                return Unit.f80348a;
        }
    }
}
