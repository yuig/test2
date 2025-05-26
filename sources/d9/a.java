package d9;

import a7.k0;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f53997b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53998c;

    /* renamed from: d, reason: collision with root package name */
    public final int f53999d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f54000e;

    public a(int i13, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f53997b = str;
        this.f53998c = str2;
        this.f53999d = i13;
        this.f54000e = bArr;
    }

    @Override // a7.m0
    public final void b(k0 k0Var) {
        k0Var.a(this.f53999d, this.f54000e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f53999d == aVar.f53999d && Objects.equals(this.f53997b, aVar.f53997b) && Objects.equals(this.f53998c, aVar.f53998c) && Arrays.equals(this.f54000e, aVar.f54000e);
    }

    public final int hashCode() {
        int i13 = (527 + this.f53999d) * 31;
        String str = this.f53997b;
        int hashCode = (i13 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f53998c;
        return Arrays.hashCode(this.f54000e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // d9.j
    public final String toString() {
        return this.f54025a + ": mimeType=" + this.f53997b + ", description=" + this.f53998c;
    }
}
