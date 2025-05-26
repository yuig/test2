package qk1;

import android.view.View;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import aq0.i;
import aq0.j;
import com.pinterest.feature.conversation.view.ConversationQuickRepliesContainer;
import dq0.p;
import java.util.HashSet;
import kh2.k3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lq0.o0;
import mf0.f;
import tb0.g;
import tb0.h;
import tb0.k;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f104054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f104055c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f104056d;

    public /* synthetic */ a(Object obj, boolean z13, Object obj2, int i13) {
        this.f104053a = i13;
        this.f104054b = obj;
        this.f104055c = z13;
        this.f104056d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f104053a;
        boolean z13 = this.f104055c;
        Object obj = this.f104056d;
        Object obj2 = this.f104054b;
        switch (i13) {
            case 0:
                Function0 positiveButtonAction = (Function0) obj2;
                f this_apply = (f) obj;
                Intrinsics.checkNotNullParameter(positiveButtonAction, "$positiveButtonAction");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                positiveButtonAction.invoke();
                if (z13) {
                    this_apply.N6(false, false);
                    return;
                }
                return;
            case 1:
                Function0 negativeButtonAction = (Function0) obj2;
                f this_apply2 = (f) obj;
                Intrinsics.checkNotNullParameter(negativeButtonAction, "$negativeButtonAction");
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                negativeButtonAction.invoke();
                if (z13) {
                    this_apply2.N6(false, false);
                    return;
                }
                return;
            default:
                ConversationQuickRepliesContainer this$0 = (ConversationQuickRepliesContainer) obj2;
                String text = (String) obj;
                int i14 = ConversationQuickRepliesContainer.f45615e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(text, "$replyText");
                String str = z13 ? "EmojiReply" : "TextReply";
                this$0.getClass();
                HashSet hashSet = h.f117076w;
                h hVar = g.f117075a;
                k kVar = new k();
                kVar.c("Quick Reply Action", str);
                kVar.c("Quick Reply Pin Category", this$0.f45618c);
                kVar.c("Quick Reply Text", text);
                String str2 = this$0.f45619d;
                if (str2 == null) {
                    str2 = "NotAvailable";
                }
                kVar.c("Quick Reply Action By User", str2);
                String str3 = this$0.f45616a;
                if (str3 == null) {
                    Intrinsics.r("conversationId");
                    throw null;
                }
                kVar.c("Quick Reply Action By Conversation", str3);
                hVar.k("ConversationQuickReplies", kVar.f117102a);
                this$0.setVisibility(8);
                ViewParent parent = this$0.getParent();
                Intrinsics.g(parent, "null cannot be cast to non-null type android.widget.HorizontalScrollView");
                ((HorizontalScrollView) parent).setVisibility(8);
                j jVar = this$0.f45617b;
                if (jVar != null) {
                    p pVar = (p) jVar;
                    Intrinsics.checkNotNullParameter(text, "text");
                    o0 o0Var = (o0) ((i) pVar.getView());
                    if (o0Var.T0) {
                        k3.R1(o0Var.c9(), false);
                        HorizontalScrollView horizontalScrollView = o0Var.D1;
                        if (horizontalScrollView == null) {
                            Intrinsics.r("quickReplyHScrollView");
                            throw null;
                        }
                        k3.R1(horizontalScrollView, false);
                        o0Var.T0 = false;
                    }
                    pVar.U3(text, false, true);
                    return;
                }
                return;
        }
    }
}
