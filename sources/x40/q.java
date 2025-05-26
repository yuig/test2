package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements u {

    /* renamed from: d, reason: collision with root package name */
    public final String f133057d;

    /* renamed from: e, reason: collision with root package name */
    public final p f133058e;

    public q(String __typename, p pVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133057d = __typename;
        this.f133058e = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f133057d, qVar.f133057d) && Intrinsics.d(this.f133058e, qVar.f133058e);
    }

    public final int hashCode() {
        int hashCode = this.f133057d.hashCode() * 31;
        p pVar = this.f133058e;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    public final String toString() {
        return "ConversationMessageResponseV3AddConversationMessageMutation(__typename=" + this.f133057d + ", data=" + this.f133058e + ")";
    }
}
