package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kd implements od {

    /* renamed from: d, reason: collision with root package name */
    public final String f132676d;

    /* renamed from: e, reason: collision with root package name */
    public final jd f132677e;

    public kd(String __typename, jd jdVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132676d = __typename;
        this.f132677e = jdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd)) {
            return false;
        }
        kd kdVar = (kd) obj;
        return Intrinsics.d(this.f132676d, kdVar.f132676d) && Intrinsics.d(this.f132677e, kdVar.f132677e);
    }

    public final int hashCode() {
        int hashCode = this.f132676d.hashCode() * 31;
        jd jdVar = this.f132677e;
        return hashCode + (jdVar == null ? 0 : jdVar.hashCode());
    }

    public final String toString() {
        return "ConversationResponseV3GetConversationQuery(__typename=" + this.f132676d + ", data=" + this.f132677e + ")";
    }
}
