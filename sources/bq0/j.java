package bq0;

import com.pinterest.api.model.deserializer.ConversationMessageDeserializer;
import com.pinterest.api.model.ow;
import com.pinterest.feature.conversation.datasource.ThreadMessagesRetrofitPagedRemoteRequest;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.text.StringsKt;
import qz.f0;

/* loaded from: classes5.dex */
public final class j extends h0 {
    public String E;
    public final int F;
    public final ThreadMessagesRetrofitPagedRemoteRequest G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String convoId, String str, xv.g viewBinder, ConversationMessageDeserializer conversationMessageDeserializer) {
        super(str == null ? a.a.k("conversations/", convoId, "/threads/<thread_id>/messages/") : a.a.m("conversations/", convoId, "/threads/", str, "/messages/"), new ke0.a[]{conversationMessageDeserializer}, null, null, null, null, null, null, 0L, 2044);
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(conversationMessageDeserializer, "conversationMessageDeserializer");
        this.E = str;
        this.F = 0;
        LinkedHashMap registeredDeserializers = this.f49132v;
        ow modelStorage = this.f49116f;
        x12.a pagedListService = this.f49117g;
        xt1.d dVar = this.f49118h;
        Intrinsics.checkNotNullParameter(registeredDeserializers, "registeredDeserializers");
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        this.G = new ThreadMessagesRetrofitPagedRemoteRequest(registeredDeserializers, modelStorage, null, null, pagedListService, dVar, null, null, null, 460, null);
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.CONVERSATION_MESSAGE_FEED_WITH_THREADS));
        f0Var.d(Boolean.TRUE, "hide_sys_msg");
        this.f49121k = f0Var;
        o(0, viewBinder);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final com.pinterest.hairball.network.e M(r requestState) {
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        return !StringsKt.E(this.f49111a, "<thread_id>", false) ? super.M(requestState) : this.G;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return this.F;
    }

    @Override // wt1.b
    public final boolean i() {
        return this.E != null;
    }
}
