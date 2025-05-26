package a8;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f1355g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1356a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f1357b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1358c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1359d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1360e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f1361f;

    public i(h hVar) {
        this.f1356a = hVar.f1343a;
        this.f1357b = hVar.f1344b;
        this.f1358c = hVar.f1345c;
        this.f1359d = hVar.f1346d;
        this.f1360e = hVar.f1347e;
        int length = hVar.f1348f.length;
        this.f1361f = hVar.f1349g;
    }

    public static int a(int i13) {
        return kg.a.Y(i13 + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f1357b == iVar.f1357b && this.f1358c == iVar.f1358c && this.f1356a == iVar.f1356a && this.f1359d == iVar.f1359d && this.f1360e == iVar.f1360e;
    }

    public final int hashCode() {
        int i13 = (((((527 + this.f1357b) * 31) + this.f1358c) * 31) + (this.f1356a ? 1 : 0)) * 31;
        long j13 = this.f1359d;
        return ((i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f1360e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f1357b), Integer.valueOf(this.f1358c), Long.valueOf(this.f1359d), Integer.valueOf(this.f1360e), Boolean.valueOf(this.f1356a)};
        int i13 = d7.n0.f53866a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
