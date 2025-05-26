package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qh implements kg {

    /* renamed from: d, reason: collision with root package name */
    public final String f133127d;

    /* renamed from: e, reason: collision with root package name */
    public final ph f133128e;

    public qh(String __typename, ph phVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133127d = __typename;
        this.f133128e = phVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh)) {
            return false;
        }
        qh qhVar = (qh) obj;
        return Intrinsics.d(this.f133127d, qhVar.f133127d) && Intrinsics.d(this.f133128e, qhVar.f133128e);
    }

    public final int hashCode() {
        int hashCode = this.f133127d.hashCode() * 31;
        ph phVar = this.f133128e;
        return hashCode + (phVar == null ? 0 : phVar.hashCode());
    }

    public final String toString() {
        return "V3RelatedPinsForConversationDataConnectionContainerData(__typename=" + this.f133127d + ", connection=" + this.f133128e + ")";
    }
}
