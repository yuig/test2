package q8;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f102942a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f102943b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102944c;

    /* renamed from: d, reason: collision with root package name */
    public final int f102945d;

    public j0(int i13, int i14, int i15, byte[] bArr) {
        this.f102942a = i13;
        this.f102943b = bArr;
        this.f102944c = i14;
        this.f102945d = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f102942a == j0Var.f102942a && this.f102944c == j0Var.f102944c && this.f102945d == j0Var.f102945d && Arrays.equals(this.f102943b, j0Var.f102943b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f102943b) + (this.f102942a * 31)) * 31) + this.f102944c) * 31) + this.f102945d;
    }
}
