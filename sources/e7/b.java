package e7;

import a7.m0;

/* loaded from: classes3.dex */
public final class b implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f57524a;

    public b(int i13) {
        this.f57524a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f57524a == ((b) obj).f57524a;
    }

    public final int hashCode() {
        return this.f57524a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f57524a;
    }
}
