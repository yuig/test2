package oq0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f97213a;

    /* renamed from: b, reason: collision with root package name */
    public final String f97214b;

    public a(int i13, String reactionText) {
        Intrinsics.checkNotNullParameter(reactionText, "reactionText");
        this.f97213a = i13;
        this.f97214b = reactionText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f97213a == aVar.f97213a && Intrinsics.d(this.f97214b, aVar.f97214b);
    }

    public final int hashCode() {
        return this.f97214b.hashCode() + (Integer.hashCode(this.f97213a) * 31);
    }

    public final String toString() {
        return "ConversationMessageReactionModel(iconDrawableRes=" + this.f97213a + ", reactionText=" + this.f97214b + ")";
    }
}
