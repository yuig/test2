package v7;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f124260a;

    /* renamed from: b, reason: collision with root package name */
    public final int f124261b;

    /* renamed from: c, reason: collision with root package name */
    public final double f124262c;

    /* renamed from: d, reason: collision with root package name */
    public final String f124263d;

    public d(String str, double d2) {
        this.f124260a = str;
        this.f124261b = 2;
        this.f124262c = d2;
        this.f124263d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f124261b == dVar.f124261b && Double.compare(this.f124262c, dVar.f124262c) == 0 && Objects.equals(this.f124260a, dVar.f124260a) && Objects.equals(this.f124263d, dVar.f124263d);
    }

    public final int hashCode() {
        return Objects.hash(this.f124260a, Integer.valueOf(this.f124261b), Double.valueOf(this.f124262c), this.f124263d);
    }

    public d(String str, String str2, int i13) {
        boolean z13 = true;
        if (i13 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z13 = false;
        }
        bf.b.t(z13);
        this.f124260a = str;
        this.f124261b = i13;
        this.f124263d = str2;
        this.f124262c = 0.0d;
    }
}
