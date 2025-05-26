package fz0;

/* loaded from: classes5.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f63119a;

    public c(int i13) {
        this.f63119a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f63119a == ((c) obj).f63119a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63119a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("QuizAnswered(pickedAnswer="), this.f63119a, ")");
    }
}
