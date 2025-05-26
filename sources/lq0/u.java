package lq0;

import android.text.SpannableString;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84440i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ConversationMessageItemView f84441j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f84442k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(ConversationMessageItemView conversationMessageItemView, String str, int i13) {
        super(1);
        this.f84440i = i13;
        this.f84441j = conversationMessageItemView;
        this.f84442k = str;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f84440i;
        String str = this.f84442k;
        ConversationMessageItemView conversationMessageItemView = this.f84441j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                SpannableString string = ConversationMessageItemView.i(conversationMessageItemView, str);
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new u50.f0(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                SpannableString string2 = ConversationMessageItemView.i(conversationMessageItemView, str);
                Intrinsics.checkNotNullParameter(string2, "string");
                return rn1.a.y(it, new u50.f0(string2), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f84440i) {
        }
        return b((rn1.a) obj);
    }
}
