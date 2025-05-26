package m30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f85749a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85750b;

    public e(String str, String str2) {
        this.f85749a = str;
        this.f85750b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f85749a, eVar.f85749a) && Intrinsics.d(this.f85750b, eVar.f85750b);
    }

    public final int hashCode() {
        String str = this.f85749a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f85750b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardTitleSuggestion(title=");
        sb3.append(this.f85749a);
        sb3.append(", metadata=");
        return a.a.p(sb3, this.f85750b, ")");
    }
}
