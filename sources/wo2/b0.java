package wo2;

import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b0 extends m {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f130671e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f130672f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(byte[][] segments, int[] directory) {
        super(m.f130712d.f130713a);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f130671e = segments;
        this.f130672f = directory;
    }

    private final Object writeReplace() {
        return new m(i());
    }

    @Override // wo2.m
    public final m a(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[][] bArr = this.f130671e;
        int length = bArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int[] iArr = this.f130672f;
            int i15 = iArr[length + i13];
            int i16 = iArr[i13];
            messageDigest.update(bArr[i13], i15, i16 - i14);
            i13++;
            i14 = i16;
        }
        byte[] digest = messageDigest.digest();
        Intrinsics.f(digest);
        return new m(digest);
    }

    @Override // wo2.m
    public final int b() {
        return this.f130672f[this.f130671e.length - 1];
    }

    @Override // wo2.m
    public final String c() {
        return new m(i()).c();
    }

    @Override // wo2.m
    public final byte[] d() {
        return i();
    }

    @Override // wo2.m
    public final byte e(int i13) {
        byte[][] bArr = this.f130671e;
        int length = bArr.length - 1;
        int[] iArr = this.f130672f;
        b.b(iArr[length], i13, 1L);
        int x23 = dl2.b.x2(this, i13);
        return bArr[x23][(i13 - (x23 == 0 ? 0 : iArr[x23 - 1])) + iArr[bArr.length + x23]];
    }

    @Override // wo2.m
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (mVar.b() == b() && g(mVar, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // wo2.m
    public final boolean f(int i13, int i14, int i15, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i13 < 0 || i13 > b() - i15 || i14 < 0 || i14 > other.length - i15) {
            return false;
        }
        int i16 = i15 + i13;
        int x23 = dl2.b.x2(this, i13);
        while (i13 < i16) {
            int[] iArr = this.f130672f;
            int i17 = x23 == 0 ? 0 : iArr[x23 - 1];
            int i18 = iArr[x23] - i17;
            byte[][] bArr = this.f130671e;
            int i19 = iArr[bArr.length + x23];
            int min = Math.min(i16, i18 + i17) - i13;
            if (!b.a((i13 - i17) + i19, i14, min, bArr[x23], other)) {
                return false;
            }
            i14 += min;
            i13 += min;
            x23++;
        }
        return true;
    }

    @Override // wo2.m
    public final boolean g(m other, int i13) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (b() - i13 < 0) {
            return false;
        }
        int x23 = dl2.b.x2(this, 0);
        int i14 = 0;
        int i15 = 0;
        while (i14 < i13) {
            int[] iArr = this.f130672f;
            int i16 = x23 == 0 ? 0 : iArr[x23 - 1];
            int i17 = iArr[x23] - i16;
            byte[][] bArr = this.f130671e;
            int i18 = iArr[bArr.length + x23];
            int min = Math.min(i13, i17 + i16) - i14;
            if (!other.f(i15, (i14 - i16) + i18, min, bArr[x23])) {
                return false;
            }
            i15 += min;
            i14 += min;
            x23++;
        }
        return true;
    }

    @Override // wo2.m
    public final m h() {
        return new m(i()).h();
    }

    @Override // wo2.m
    public final int hashCode() {
        int i13 = this.f130714b;
        if (i13 != 0) {
            return i13;
        }
        byte[][] bArr = this.f130671e;
        int length = bArr.length;
        int i14 = 0;
        int i15 = 1;
        int i16 = 0;
        while (i14 < length) {
            int[] iArr = this.f130672f;
            int i17 = iArr[length + i14];
            int i18 = iArr[i14];
            byte[] bArr2 = bArr[i14];
            int i19 = (i18 - i16) + i17;
            while (i17 < i19) {
                i15 = (i15 * 31) + bArr2[i17];
                i17++;
            }
            i14++;
            i16 = i18;
        }
        this.f130714b = i15;
        return i15;
    }

    @Override // wo2.m
    public final byte[] i() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.f130671e;
        int length = bArr2.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            int[] iArr = this.f130672f;
            int i16 = iArr[length + i13];
            int i17 = iArr[i13];
            int i18 = i17 - i14;
            kotlin.collections.z.f(i15, i16, i16 + i18, bArr2[i13], bArr);
            i15 += i18;
            i13++;
            i14 = i17;
        }
        return bArr;
    }

    @Override // wo2.m
    public final void k(j buffer, int i13) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int x23 = dl2.b.x2(this, 0);
        int i14 = 0;
        while (i14 < i13) {
            int[] iArr = this.f130672f;
            int i15 = x23 == 0 ? 0 : iArr[x23 - 1];
            int i16 = iArr[x23] - i15;
            byte[][] bArr = this.f130671e;
            int i17 = iArr[bArr.length + x23];
            int min = Math.min(i13, i16 + i15) - i14;
            int i18 = (i14 - i15) + i17;
            z zVar = new z(bArr[x23], i18, i18 + min, true, false);
            z zVar2 = buffer.f130710a;
            if (zVar2 == null) {
                zVar.f130758g = zVar;
                zVar.f130757f = zVar;
                buffer.f130710a = zVar;
            } else {
                z zVar3 = zVar2.f130758g;
                Intrinsics.f(zVar3);
                zVar3.b(zVar);
            }
            i14 += min;
            x23++;
        }
        buffer.f130711b += i13;
    }

    @Override // wo2.m
    public final String toString() {
        return new m(i()).toString();
    }
}
