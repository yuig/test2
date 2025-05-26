package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ge implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132451a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132452b;

    public ge(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132451a = message;
        this.f132452b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132452b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge)) {
            return false;
        }
        ge geVar = (ge) obj;
        return Intrinsics.d(this.f132451a, geVar.f132451a) && Intrinsics.d(this.f132452b, geVar.f132452b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132451a;
    }

    public final int hashCode() {
        int hashCode = this.f132451a.hashCode() * 31;
        String str = this.f132452b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132451a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132452b, ")");
    }
}
