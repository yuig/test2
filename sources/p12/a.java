package p12;

import com.pinterest.api.model.ContactRequestFeed;
import com.pinterest.api.model.deserializer.ConversationContactRequestDeserializer;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes4.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98682a;

    /* renamed from: b, reason: collision with root package name */
    public final ConversationContactRequestDeserializer f98683b;

    public a(ConversationContactRequestDeserializer conversationContactRequestDeserializer, int i13) {
        this.f98682a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(conversationContactRequestDeserializer, "deserializer");
            this.f98683b = conversationContactRequestDeserializer;
        } else {
            Intrinsics.checkNotNullParameter(conversationContactRequestDeserializer, "conversationContactRequestDeserializer");
            this.f98683b = conversationContactRequestDeserializer;
        }
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        int i13 = this.f98682a;
        ConversationContactRequestDeserializer conversationContactRequestDeserializer = this.f98683b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                return new ContactRequestFeed(pinterestJsonObject, null, conversationContactRequestDeserializer);
            default:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                c m13 = pinterestJsonObject.m("data");
                if (m13 != null) {
                    pinterestJsonObject = m13;
                }
                return conversationContactRequestDeserializer.d(pinterestJsonObject);
        }
    }
}
