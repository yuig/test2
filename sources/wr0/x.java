package wr0;

import com.pinterest.api.model.deserializer.ConversationMessageDeserializer;
import com.pinterest.api.model.deserializer.OutpaintingResponseDeserializer;
import com.pinterest.api.model.m10;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130931a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f130932b;

    public x(ConversationMessageDeserializer conversationMessageDeserializer) {
        Intrinsics.checkNotNullParameter(conversationMessageDeserializer, "conversationMessageDeserializer");
        this.f130932b = conversationMessageDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        vd0.c m13;
        int i13 = this.f130931a;
        Object obj = this.f130932b;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                vd0.c m14 = pinterestJsonObject.m("data");
                if (m14 != null && (m13 = m14.m("generations")) != null) {
                    pinterestJsonObject = m13;
                }
                return (m10) ((ke0.a) obj).d(pinterestJsonObject);
            default:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                ConversationMessageDeserializer conversationMessageDeserializer = (ConversationMessageDeserializer) obj;
                vd0.c m15 = pinterestJsonObject.m("data");
                if (m15 != null) {
                    pinterestJsonObject = m15;
                }
                conversationMessageDeserializer.getClass();
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "json");
                return conversationMessageDeserializer.e(pinterestJsonObject, true, false);
        }
    }

    public x(OutpaintingResponseDeserializer outpaintResponseDeserializer) {
        Intrinsics.checkNotNullParameter(outpaintResponseDeserializer, "outpaintResponseDeserializer");
        this.f130932b = outpaintResponseDeserializer;
    }
}
