package qh2;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Map f103956a;

    /* renamed from: b, reason: collision with root package name */
    public final String f103957b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f103958c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f103959d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f103960e;

    public k(Map map, String str, byte[] bArr, Map map2, byte[] bArr2) {
        this.f103956a = map;
        this.f103957b = str;
        this.f103958c = bArr;
        this.f103959d = map2;
        this.f103960e = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f103956a, kVar.f103956a) && Intrinsics.d(this.f103957b, kVar.f103957b) && Intrinsics.d(this.f103958c, kVar.f103958c) && Intrinsics.d(this.f103959d, kVar.f103959d) && Intrinsics.d(this.f103960e, kVar.f103960e) && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        Map map = this.f103956a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.f103957b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        byte[] bArr = this.f103958c;
        int hashCode3 = (hashCode2 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        Map map2 = this.f103959d;
        int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        byte[] bArr2 = this.f103960e;
        return (hashCode4 + (bArr2 != null ? Arrays.hashCode(bArr2) : 0)) * 31;
    }

    public final String toString() {
        return "NetworkCaptureData(requestHeaders=" + this.f103956a + ", requestQueryParams=" + this.f103957b + ", capturedRequestBody=" + Arrays.toString(this.f103958c) + ", responseHeaders=" + this.f103959d + ", capturedResponseBody=" + Arrays.toString(this.f103960e) + ", dataCaptureErrorMessage=null)";
    }
}
