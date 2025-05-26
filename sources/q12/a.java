package q12;

import com.pinterest.api.model.ConversationFeed;
import com.pinterest.api.model.deserializer.ConversationDeserializer;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102045a;

    /* renamed from: b, reason: collision with root package name */
    public final ConversationDeserializer f102046b;

    public a(ConversationDeserializer conversationDeserializer, int i13) {
        this.f102045a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(conversationDeserializer, "conversationDeserializer");
            this.f102046b = conversationDeserializer;
        } else {
            Intrinsics.checkNotNullParameter(conversationDeserializer, "conversationDeserializer");
            this.f102046b = conversationDeserializer;
        }
    }

    @Override // rz.d
    public final Object b(c json) {
        int i13 = this.f102045a;
        ConversationDeserializer conversationDeserializer = this.f102046b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(json, "pinterestJsonObject");
                c m13 = json.m("data");
                if (m13 != null) {
                    json = m13;
                }
                conversationDeserializer.getClass();
                Intrinsics.checkNotNullParameter(json, "json");
                return conversationDeserializer.e(json, true, false);
            default:
                Intrinsics.checkNotNullParameter(json, "pinterestJsonObject");
                c m14 = json.m("data");
                if (m14 != null) {
                    json = m14;
                }
                return new ConversationFeed(json, "", conversationDeserializer);
        }
    }
}
