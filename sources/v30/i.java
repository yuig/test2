package v30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f123933a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123934b;

    public i(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f123933a = message;
        this.f123934b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f123934b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f123933a, iVar.f123933a) && Intrinsics.d(this.f123934b, iVar.f123934b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f123933a;
    }

    public final int hashCode() {
        int hashCode = this.f123933a.hashCode() * 31;
        String str = this.f123934b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f123933a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f123934b, ")");
    }
}
