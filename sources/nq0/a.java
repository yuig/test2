package nq0;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f91805a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f91806b;

    public a(String messageId, HashMap reactions) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        this.f91805a = messageId;
        this.f91806b = reactions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f91805a, aVar.f91805a) && Intrinsics.d(this.f91806b, aVar.f91806b);
    }

    public final int hashCode() {
        return this.f91806b.hashCode() + (this.f91805a.hashCode() * 31);
    }

    public final String toString() {
        return "ConversationMessageReactionEvent(messageId=" + this.f91805a + ", reactions=" + this.f91806b + ")";
    }
}
