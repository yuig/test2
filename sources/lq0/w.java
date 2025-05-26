package lq0;

import android.widget.ImageView;
import com.pinterest.feature.conversation.view.ConversationMessageReactionCountItemDisplay;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84450i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ConversationMessageReactionCountItemDisplay f84451j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(ConversationMessageReactionCountItemDisplay conversationMessageReactionCountItemDisplay, int i13) {
        super(0);
        this.f84450i = i13;
        this.f84451j = conversationMessageReactionCountItemDisplay;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f84450i;
        ConversationMessageReactionCountItemDisplay conversationMessageReactionCountItemDisplay = this.f84451j;
        switch (i13) {
            case 0:
                return (GestaltText) conversationMessageReactionCountItemDisplay.findViewById(xc0.e.reaction_count_display_count);
            default:
                return (ImageView) conversationMessageReactionCountItemDisplay.findViewById(xc0.e.reaction_count_display_icon);
        }
    }
}
