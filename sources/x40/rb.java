package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rb implements r9 {

    /* renamed from: d, reason: collision with root package name */
    public final String f133179d;

    /* renamed from: e, reason: collision with root package name */
    public final qb f133180e;

    public rb(String __typename, qb qbVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133179d = __typename;
        this.f133180e = qbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb)) {
            return false;
        }
        rb rbVar = (rb) obj;
        return Intrinsics.d(this.f133179d, rbVar.f133179d) && Intrinsics.d(this.f133180e, rbVar.f133180e);
    }

    public final int hashCode() {
        int hashCode = this.f133179d.hashCode() * 31;
        qb qbVar = this.f133180e;
        return hashCode + (qbVar == null ? 0 : qbVar.hashCode());
    }

    public final String toString() {
        return "V3GetConversationsDataConnectionContainerData(__typename=" + this.f133179d + ", connection=" + this.f133180e + ")";
    }
}
