package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class te implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f133381a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133382b;

    public te(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f133381a = message;
        this.f133382b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f133382b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        return Intrinsics.d(this.f133381a, teVar.f133381a) && Intrinsics.d(this.f133382b, teVar.f133382b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f133381a;
    }

    public final int hashCode() {
        int hashCode = this.f133381a.hashCode() * 31;
        String str = this.f133382b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f133381a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f133382b, ")");
    }
}
