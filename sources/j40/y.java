package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f74635a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74636b;

    public y(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f74635a = message;
        this.f74636b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f74636b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f74635a, yVar.f74635a) && Intrinsics.d(this.f74636b, yVar.f74636b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f74635a;
    }

    public final int hashCode() {
        int hashCode = this.f74635a.hashCode() * 31;
        String str = this.f74636b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f74635a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f74636b, ")");
    }
}
