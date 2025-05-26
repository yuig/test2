package d9;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class f extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f54016b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54017c;

    /* renamed from: d, reason: collision with root package name */
    public final String f54018d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f54019e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f54016b = str;
        this.f54017c = str2;
        this.f54018d = str3;
        this.f54019e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.f54016b, fVar.f54016b) && Objects.equals(this.f54017c, fVar.f54017c) && Objects.equals(this.f54018d, fVar.f54018d) && Arrays.equals(this.f54019e, fVar.f54019e);
    }

    public final int hashCode() {
        String str = this.f54016b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f54017c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f54018d;
        return Arrays.hashCode(this.f54019e) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // d9.j
    public final String toString() {
        return this.f54025a + ": mimeType=" + this.f54016b + ", filename=" + this.f54017c + ", description=" + this.f54018d;
    }
}
