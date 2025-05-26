package d92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y implements z {

    /* renamed from: a, reason: collision with root package name */
    public final String f54197a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54198b;

    public y(String str, int i13) {
        this.f54197a = str;
        this.f54198b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f54197a, yVar.f54197a) && this.f54198b == yVar.f54198b;
    }

    public final int hashCode() {
        String str = this.f54197a;
        return Integer.hashCode(this.f54198b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnWebViewError(failReason=");
        sb3.append(this.f54197a);
        sb3.append(", errorCode=");
        return a.a.n(sb3, this.f54198b, ")");
    }
}
