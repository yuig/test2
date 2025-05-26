package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yd implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f133740a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133741b;

    public yd(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f133740a = message;
        this.f133741b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f133741b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd)) {
            return false;
        }
        yd ydVar = (yd) obj;
        return Intrinsics.d(this.f133740a, ydVar.f133740a) && Intrinsics.d(this.f133741b, ydVar.f133741b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f133740a;
    }

    public final int hashCode() {
        int hashCode = this.f133740a.hashCode() * 31;
        String str = this.f133741b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f133740a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f133741b, ")");
    }
}
