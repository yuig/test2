package yq;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f139644a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139645b;

    public h(String wordToReplace, int i13) {
        Intrinsics.checkNotNullParameter(wordToReplace, "wordToReplace");
        this.f139644a = wordToReplace;
        this.f139645b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f139644a, hVar.f139644a) && this.f139645b == hVar.f139645b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139645b) + (this.f139644a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReplaceableText(wordToReplace=");
        sb3.append(this.f139644a);
        sb3.append(", drawable=");
        return a.a.n(sb3, this.f139645b, ")");
    }
}
