package k11;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f78145a;

    /* renamed from: b, reason: collision with root package name */
    public final String f78146b;

    /* renamed from: c, reason: collision with root package name */
    public final String f78147c;

    public j(String saveSessionId, String str, String str2) {
        Intrinsics.checkNotNullParameter(saveSessionId, "saveSessionId");
        this.f78145a = saveSessionId;
        this.f78146b = str;
        this.f78147c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f78145a, jVar.f78145a) && Intrinsics.d(this.f78146b, jVar.f78146b) && Intrinsics.d(this.f78147c, jVar.f78147c);
    }

    public final int hashCode() {
        int hashCode = this.f78145a.hashCode() * 31;
        String str = this.f78146b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f78147c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RepinSessionData(saveSessionId=");
        sb3.append(this.f78145a);
        sb3.append(", boardPickerSurfaceOrigin=");
        sb3.append(this.f78146b);
        sb3.append(", userAction=");
        return a.a.p(sb3, this.f78147c, ")");
    }

    public /* synthetic */ j() {
        this(cb.g("toString(...)"), null, null);
    }
}
