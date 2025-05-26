package b4;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f21599a;

    public static String a(int i13) {
        if (i13 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i13 == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i13 == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i13 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f21599a == ((k) obj).f21599a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21599a);
    }

    public final String toString() {
        return a(this.f21599a);
    }
}
