package d9;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class c extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f54002b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54003c;

    /* renamed from: d, reason: collision with root package name */
    public final int f54004d;

    /* renamed from: e, reason: collision with root package name */
    public final long f54005e;

    /* renamed from: f, reason: collision with root package name */
    public final long f54006f;

    /* renamed from: g, reason: collision with root package name */
    public final j[] f54007g;

    public c(String str, int i13, int i14, long j13, long j14, j[] jVarArr) {
        super("CHAP");
        this.f54002b = str;
        this.f54003c = i13;
        this.f54004d = i14;
        this.f54005e = j13;
        this.f54006f = j14;
        this.f54007g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f54003c == cVar.f54003c && this.f54004d == cVar.f54004d && this.f54005e == cVar.f54005e && this.f54006f == cVar.f54006f && Objects.equals(this.f54002b, cVar.f54002b) && Arrays.equals(this.f54007g, cVar.f54007g);
    }

    public final int hashCode() {
        int i13 = (((((((527 + this.f54003c) * 31) + this.f54004d) * 31) + ((int) this.f54005e)) * 31) + ((int) this.f54006f)) * 31;
        String str = this.f54002b;
        return i13 + (str != null ? str.hashCode() : 0);
    }
}
