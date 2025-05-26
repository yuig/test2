package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vh implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f133558a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133559b;

    public vh(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f133558a = message;
        this.f133559b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f133559b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh)) {
            return false;
        }
        vh vhVar = (vh) obj;
        return Intrinsics.d(this.f133558a, vhVar.f133558a) && Intrinsics.d(this.f133559b, vhVar.f133559b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f133558a;
    }

    public final int hashCode() {
        int hashCode = this.f133558a.hashCode() * 31;
        String str = this.f133559b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f133558a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f133559b, ")");
    }
}
