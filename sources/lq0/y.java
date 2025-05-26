package lq0;

import com.pinterest.feature.conversation.view.ConversationMessageReactionDisplayReactionItem;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84454i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ConversationMessageReactionDisplayReactionItem f84455j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(ConversationMessageReactionDisplayReactionItem conversationMessageReactionDisplayReactionItem, int i13) {
        super(0);
        this.f84454i = i13;
        this.f84455j = conversationMessageReactionDisplayReactionItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f84454i;
        ConversationMessageReactionDisplayReactionItem conversationMessageReactionDisplayReactionItem = this.f84455j;
        switch (i13) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                switch (i13) {
                }
            default:
                switch (i13) {
                }
        }
        return (GestaltText) conversationMessageReactionDisplayReactionItem.findViewById(xc0.e.reaction_user_identifier);
    }
}
