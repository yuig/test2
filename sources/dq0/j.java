package dq0;

import kotlin.jvm.internal.Intrinsics;
import lq0.b1;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f56111a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f56112b;

    public j(String messageId, b1 b1Var) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.f56111a = messageId;
        this.f56112b = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f56111a, jVar.f56111a) && Intrinsics.d(this.f56112b, jVar.f56112b);
    }

    public final int hashCode() {
        int hashCode = this.f56111a.hashCode() * 31;
        b1 b1Var = this.f56112b;
        return hashCode + (b1Var == null ? 0 : b1Var.hashCode());
    }

    public final String toString() {
        return "MessageDeletionEvent(messageId=" + this.f56111a + ", convoThreadViewState=" + this.f56112b + ")";
    }
}
