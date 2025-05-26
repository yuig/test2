package q7;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f102600a;

    /* renamed from: b, reason: collision with root package name */
    public final String f102601b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102602c;

    /* renamed from: d, reason: collision with root package name */
    public final int f102603d;

    public b(String str, int i13, int i14, String str2) {
        this.f102600a = str;
        this.f102601b = str2;
        this.f102602c = i13;
        this.f102603d = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f102602c == bVar.f102602c && this.f102603d == bVar.f102603d && Objects.equals(this.f102600a, bVar.f102600a) && Objects.equals(this.f102601b, bVar.f102601b);
    }

    public final int hashCode() {
        return Objects.hash(this.f102600a, this.f102601b, Integer.valueOf(this.f102602c), Integer.valueOf(this.f102603d));
    }
}
