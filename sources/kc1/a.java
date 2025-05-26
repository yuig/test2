package kc1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f79131a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79132b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f79133c;

    public a(String str, String pronoun, boolean z13) {
        Intrinsics.checkNotNullParameter(pronoun, "pronoun");
        this.f79131a = str;
        this.f79132b = pronoun;
        this.f79133c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f79131a, aVar.f79131a) && Intrinsics.d(this.f79132b, aVar.f79132b) && this.f79133c == aVar.f79133c;
    }

    public final int hashCode() {
        String str = this.f79131a;
        return Boolean.hashCode(this.f79133c) + cb.d(this.f79132b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChipDisplayState(id=");
        sb3.append(this.f79131a);
        sb3.append(", pronoun=");
        sb3.append(this.f79132b);
        sb3.append(", isSelected=");
        return a.a.r(sb3, this.f79133c, ")");
    }
}
