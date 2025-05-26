package el;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final uk.i f59547a;

    /* renamed from: b, reason: collision with root package name */
    public final int f59548b;

    /* renamed from: c, reason: collision with root package name */
    public final String f59549c;

    /* renamed from: d, reason: collision with root package name */
    public final String f59550d;

    public w(uk.i iVar, int i13, String str, String str2) {
        this.f59547a = iVar;
        this.f59548b = i13;
        this.f59549c = str;
        this.f59550d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f59547a == wVar.f59547a && this.f59548b == wVar.f59548b && this.f59549c.equals(wVar.f59549c) && this.f59550d.equals(wVar.f59550d);
    }

    public final int hashCode() {
        return Objects.hash(this.f59547a, Integer.valueOf(this.f59548b), this.f59549c, this.f59550d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("(status=");
        sb3.append(this.f59547a);
        sb3.append(", keyId=");
        sb3.append(this.f59548b);
        sb3.append(", keyType='");
        sb3.append(this.f59549c);
        sb3.append("', keyPrefix='");
        return a.a.p(sb3, this.f59550d, "')");
    }
}
