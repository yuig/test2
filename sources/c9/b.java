package c9;

import a7.k0;
import a7.m0;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class b implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f26964a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26965b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26966c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26967d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26968e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26969f;

    public b(int i13, int i14, String str, String str2, String str3, boolean z13) {
        bf.b.i(i14 == -1 || i14 > 0);
        this.f26964a = i13;
        this.f26965b = str;
        this.f26966c = str2;
        this.f26967d = str3;
        this.f26968e = z13;
        this.f26969f = i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c9.b d(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.b.d(java.util.Map):c9.b");
    }

    @Override // a7.m0
    public final void b(k0 k0Var) {
        String str = this.f26966c;
        if (str != null) {
            k0Var.D = str;
        }
        String str2 = this.f26965b;
        if (str2 != null) {
            k0Var.B = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f26964a == bVar.f26964a && Objects.equals(this.f26965b, bVar.f26965b) && Objects.equals(this.f26966c, bVar.f26966c) && Objects.equals(this.f26967d, bVar.f26967d) && this.f26968e == bVar.f26968e && this.f26969f == bVar.f26969f;
    }

    public final int hashCode() {
        int i13 = (527 + this.f26964a) * 31;
        String str = this.f26965b;
        int hashCode = (i13 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26966c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26967d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f26968e ? 1 : 0)) * 31) + this.f26969f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f26966c + "\", genre=\"" + this.f26965b + "\", bitrate=" + this.f26964a + ", metadataInterval=" + this.f26969f;
    }
}
