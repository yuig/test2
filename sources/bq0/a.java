package bq0;

import com.pinterest.api.model.deserializer.ConversationMessageDeserializer;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import qz.f0;

/* loaded from: classes5.dex */
public final class a extends h0 {
    public final int E;

    public /* synthetic */ a(String str, g0 g0Var, yo0.a aVar) {
        this(str, g0Var, aVar, 43);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return this.E;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String userId, g0 pageSizeProvider, yo0.a viewBinder, int i13) {
        super(a.a.p(new StringBuilder("users/"), userId, "/boards/following/"), new ke0.a[]{gh0.b.K()}, null, new rr0.b(pageSizeProvider), null, null, null, null, 0L, 2028);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.E = i13;
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.DEFAULT_BOARD_FEED_LARGE_THUMBNAILS));
        f0Var.e("page_size", pageSizeProvider.d());
        f0Var.e("explicit_following", "true");
        this.f49121k = f0Var;
        o(i13, viewBinder);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String convoId, xv.g viewBinder, ConversationMessageDeserializer conversationMessageDeserializer, boolean z13) {
        super(a.a.p(new StringBuilder("conversations/"), convoId, "/messages/"), new ke0.a[]{conversationMessageDeserializer}, null, null, null, null, null, null, 0L, 2044);
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(conversationMessageDeserializer, "conversationMessageDeserializer");
        this.E = 0;
        f0 f0Var = new f0();
        if (z13) {
            f0Var.e("fields", n00.b.a(n00.c.CONVERSATION_MESSAGE_FEED_WITH_THREADS));
        } else {
            f0Var.e("fields", n00.b.a(n00.c.CONVERSATION_MESSAGE_FEED));
        }
        f0Var.d(Boolean.TRUE, "hide_sys_msg");
        this.f49121k = f0Var;
        o(0, viewBinder);
    }
}
