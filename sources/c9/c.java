package c9;

import a7.k0;
import a7.m0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class c implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f26970a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26971b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26972c;

    public c(byte[] bArr, String str, String str2) {
        this.f26970a = bArr;
        this.f26971b = str;
        this.f26972c = str2;
    }

    @Override // a7.m0
    public final void b(k0 k0Var) {
        String str = this.f26971b;
        if (str != null) {
            k0Var.f1091a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f26970a, ((c) obj).f26970a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26970a);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f26971b + "\", url=\"" + this.f26972c + "\", rawMetadata.length=\"" + this.f26970a.length + "\"";
    }
}
