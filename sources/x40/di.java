package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class di implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132291a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132292b;

    public di(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132291a = message;
        this.f132292b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132292b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di)) {
            return false;
        }
        di diVar = (di) obj;
        return Intrinsics.d(this.f132291a, diVar.f132291a) && Intrinsics.d(this.f132292b, diVar.f132292b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132291a;
    }

    public final int hashCode() {
        int hashCode = this.f132291a.hashCode() * 31;
        String str = this.f132292b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132291a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132292b, ")");
    }
}
