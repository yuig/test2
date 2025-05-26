package i50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f71550a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71551b;

    public i(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f71550a = message;
        this.f71551b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f71551b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f71550a, iVar.f71550a) && Intrinsics.d(this.f71551b, iVar.f71551b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f71550a;
    }

    public final int hashCode() {
        int hashCode = this.f71550a.hashCode() * 31;
        String str = this.f71551b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f71550a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f71551b, ")");
    }
}
