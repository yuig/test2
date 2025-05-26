package a9;

import a7.m0;
import a7.o0;
import a7.q;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a implements m0 {

    /* renamed from: g, reason: collision with root package name */
    public static final androidx.media3.common.b f1558g;

    /* renamed from: h, reason: collision with root package name */
    public static final androidx.media3.common.b f1559h;

    /* renamed from: a, reason: collision with root package name */
    public final String f1560a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1561b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1562c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1563d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f1564e;

    /* renamed from: f, reason: collision with root package name */
    public int f1565f;

    static {
        q qVar = new q();
        qVar.f1181n = o0.r("application/id3");
        f1558g = qVar.a();
        q qVar2 = new q();
        qVar2.f1181n = o0.r("application/x-scte35");
        f1559h = qVar2.a();
    }

    public a(String str, String str2, long j13, long j14, byte[] bArr) {
        this.f1560a = str;
        this.f1561b = str2;
        this.f1562c = j13;
        this.f1563d = j14;
        this.f1564e = bArr;
    }

    @Override // a7.m0
    public final androidx.media3.common.b a() {
        String str = this.f1560a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f1559h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f1558g;
            default:
                return null;
        }
    }

    @Override // a7.m0
    public final byte[] c() {
        if (a() != null) {
            return this.f1564e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1562c == aVar.f1562c && this.f1563d == aVar.f1563d && Objects.equals(this.f1560a, aVar.f1560a) && Objects.equals(this.f1561b, aVar.f1561b) && Arrays.equals(this.f1564e, aVar.f1564e);
    }

    public final int hashCode() {
        if (this.f1565f == 0) {
            String str = this.f1560a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f1561b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j13 = this.f1562c;
            int i13 = (hashCode2 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f1563d;
            this.f1565f = Arrays.hashCode(this.f1564e) + ((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31);
        }
        return this.f1565f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f1560a + ", id=" + this.f1563d + ", durationMs=" + this.f1562c + ", value=" + this.f1561b;
    }
}
