package p30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f98738a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98739b;

    public h(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f98738a = message;
        this.f98739b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f98739b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f98738a, hVar.f98738a) && Intrinsics.d(this.f98739b, hVar.f98739b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f98738a;
    }

    public final int hashCode() {
        int hashCode = this.f98738a.hashCode() * 31;
        String str = this.f98739b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f98738a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f98739b, ")");
    }
}
