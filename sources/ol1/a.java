package ol1;

import kotlin.jvm.internal.Intrinsics;
import wa2.p;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f96440a;

    /* renamed from: b, reason: collision with root package name */
    public final p f96441b;

    /* renamed from: c, reason: collision with root package name */
    public final String f96442c;

    public a(String id3, p feedbackState, String str) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(feedbackState, "feedbackState");
        this.f96440a = id3;
        this.f96441b = feedbackState;
        this.f96442c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f96440a, aVar.f96440a) && this.f96441b == aVar.f96441b && Intrinsics.d(this.f96442c, aVar.f96442c);
    }

    public final int hashCode() {
        int hashCode = (this.f96441b.hashCode() + (this.f96440a.hashCode() * 31)) * 31;
        String str = this.f96442c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Feedback(id=");
        sb3.append(this.f96440a);
        sb3.append(", feedbackState=");
        sb3.append(this.f96441b);
        sb3.append(", sourceId=");
        return a.a.p(sb3, this.f96442c, ")");
    }
}
