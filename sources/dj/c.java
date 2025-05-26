package dj;

import kh2.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends w {

    /* renamed from: a, reason: collision with root package name */
    public final b f55118a;

    /* renamed from: b, reason: collision with root package name */
    public final String f55119b;

    public c(b code, String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f55118a = code;
        this.f55119b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f55118a == cVar.f55118a && Intrinsics.d(this.f55119b, cVar.f55119b);
    }

    public final int hashCode() {
        return this.f55119b.hashCode() + (this.f55118a.hashCode() * 31);
    }

    public final String toString() {
        return "SignalError(code=" + this.f55118a + ", message=" + this.f55119b + ")";
    }
}
