package o7;

import a.cb;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import d7.n0;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class j0 extends b7.g {

    /* renamed from: n, reason: collision with root package name */
    public int f93120n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f93121o;

    /* renamed from: p, reason: collision with root package name */
    public int f93122p;

    /* renamed from: q, reason: collision with root package name */
    public long f93123q;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f93125s;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f93128v;

    /* renamed from: r, reason: collision with root package name */
    public int f93124r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f93126t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f93127u = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f93118l = 100000;

    /* renamed from: i, reason: collision with root package name */
    public final float f93115i = 0.2f;

    /* renamed from: m, reason: collision with root package name */
    public final long f93119m = 2000000;

    /* renamed from: k, reason: collision with root package name */
    public final int f93117k = 10;

    /* renamed from: j, reason: collision with root package name */
    public final short f93116j = 1024;

    public j0() {
        byte[] bArr = n0.f53868c;
        this.f93125s = bArr;
        this.f93128v = bArr;
    }

    @Override // b7.g
    public final b7.e a(b7.e eVar) {
        if (eVar.f22040c == 2) {
            return eVar.f22038a == -1 ? b7.e.f22037e : eVar;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(eVar);
    }

    @Override // b7.g
    public final void b() {
        if (isActive()) {
            int i13 = this.f22043b.f22039b * 2;
            this.f93120n = i13;
            int i14 = ((((int) ((this.f93118l * r0.f22038a) / 1000000)) / 2) / i13) * i13 * 2;
            if (this.f93125s.length != i14) {
                this.f93125s = new byte[i14];
                this.f93128v = new byte[i14];
            }
        }
        this.f93122p = 0;
        this.f93123q = 0L;
        this.f93124r = 0;
        this.f93126t = 0;
        this.f93127u = 0;
    }

    @Override // b7.g
    public final void c() {
        if (this.f93127u > 0) {
            m(true);
            this.f93124r = 0;
        }
    }

    @Override // b7.f
    public final void f(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.f22048g.hasRemaining()) {
            int i13 = this.f93122p;
            short s13 = this.f93116j;
            if (i13 == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.f93125s.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & 255)) > s13) {
                        int i14 = this.f93120n;
                        position = cb.c(limit3, i14, i14, i14);
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.f93122p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException();
                }
                bf.b.t(this.f93126t < this.f93125s.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s13) {
                        int i15 = this.f93120n;
                        limit = (position2 / i15) * i15;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i16 = this.f93126t;
                int i17 = this.f93127u;
                int i18 = i16 + i17;
                byte[] bArr = this.f93125s;
                if (i18 < bArr.length) {
                    i16 = bArr.length;
                } else {
                    i18 = i17 - (bArr.length - i16);
                }
                int i19 = i16 - i18;
                boolean z13 = limit < limit4;
                int min = Math.min(position3, i19);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.f93125s, i18, min);
                int i23 = this.f93127u + min;
                this.f93127u = i23;
                bf.b.t(i23 <= this.f93125s.length);
                boolean z14 = z13 && position3 < i19;
                m(z14);
                if (z14) {
                    this.f93122p = 0;
                    this.f93124r = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    @Override // b7.g, b7.f
    public final boolean isActive() {
        return super.isActive() && this.f93121o;
    }

    @Override // b7.g
    public final void j() {
        this.f93121o = false;
        byte[] bArr = n0.f53868c;
        this.f93125s = bArr;
        this.f93128v = bArr;
    }

    public final int l(int i13) {
        int length = ((((int) ((this.f93119m * this.f22043b.f22038a) / 1000000)) - this.f93124r) * this.f93120n) - (this.f93125s.length / 2);
        bf.b.t(length >= 0);
        int min = (int) Math.min((i13 * this.f93115i) + 0.5f, length);
        int i14 = this.f93120n;
        return (min / i14) * i14;
    }

    public final void m(boolean z13) {
        int length;
        int l13;
        int i13 = this.f93127u;
        byte[] bArr = this.f93125s;
        if (i13 == bArr.length || z13) {
            if (this.f93124r == 0) {
                if (z13) {
                    n(i13, 3);
                    length = i13;
                } else {
                    bf.b.t(i13 >= bArr.length / 2);
                    length = this.f93125s.length / 2;
                    n(length, 0);
                }
                l13 = length;
            } else if (z13) {
                int length2 = i13 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int l14 = l(length2) + (this.f93125s.length / 2);
                n(l14, 2);
                l13 = l14;
                length = length3;
            } else {
                length = i13 - (bArr.length / 2);
                l13 = l(length);
                n(l13, 1);
            }
            bf.b.s("bytesConsumed is not aligned to frame size: %s" + length, length % this.f93120n == 0);
            bf.b.t(i13 >= l13);
            this.f93127u -= length;
            int i14 = this.f93126t + length;
            this.f93126t = i14;
            this.f93126t = i14 % this.f93125s.length;
            this.f93124r = (l13 / this.f93120n) + this.f93124r;
            this.f93123q += (length - l13) / r2;
        }
    }

    public final void n(int i13, int i14) {
        if (i13 == 0) {
            return;
        }
        bf.b.i(this.f93127u >= i13);
        if (i14 == 2) {
            int i15 = this.f93126t;
            int i16 = this.f93127u;
            int i17 = i15 + i16;
            byte[] bArr = this.f93125s;
            if (i17 <= bArr.length) {
                System.arraycopy(bArr, i17 - i13, this.f93128v, 0, i13);
            } else {
                int length = i16 - (bArr.length - i15);
                if (length >= i13) {
                    System.arraycopy(bArr, length - i13, this.f93128v, 0, i13);
                } else {
                    int i18 = i13 - length;
                    System.arraycopy(bArr, bArr.length - i18, this.f93128v, 0, i18);
                    System.arraycopy(this.f93125s, 0, this.f93128v, i18, length);
                }
            }
        } else {
            int i19 = this.f93126t;
            int i23 = i19 + i13;
            byte[] bArr2 = this.f93125s;
            if (i23 <= bArr2.length) {
                System.arraycopy(bArr2, i19, this.f93128v, 0, i13);
            } else {
                int length2 = bArr2.length - i19;
                System.arraycopy(bArr2, i19, this.f93128v, 0, length2);
                System.arraycopy(this.f93125s, 0, this.f93128v, length2, i13 - length2);
            }
        }
        bf.b.h("sizeToOutput is not aligned to frame size: " + i13, i13 % this.f93120n == 0);
        bf.b.t(this.f93126t < this.f93125s.length);
        byte[] bArr3 = this.f93128v;
        bf.b.h("byteOutput size is not aligned to frame size " + i13, i13 % this.f93120n == 0);
        if (i14 != 3) {
            for (int i24 = 0; i24 < i13; i24 += 2) {
                int i25 = i24 + 1;
                int i26 = (bArr3[i25] << 8) | (bArr3[i24] & 255);
                int i27 = this.f93117k;
                if (i14 == 0) {
                    i27 = ((((i24 * 1000) / (i13 - 1)) * (i27 - 100)) / 1000) + 100;
                } else if (i14 == 2) {
                    i27 += (((i24 * 1000) * (100 - i27)) / (i13 - 1)) / 1000;
                }
                int i28 = (i26 * i27) / 100;
                if (i28 >= 32767) {
                    bArr3[i24] = -1;
                    bArr3[i25] = Byte.MAX_VALUE;
                } else if (i28 <= -32768) {
                    bArr3[i24] = 0;
                    bArr3[i25] = Byte.MIN_VALUE;
                } else {
                    bArr3[i24] = (byte) (i28 & 255);
                    bArr3[i25] = (byte) (i28 >> 8);
                }
            }
        }
        k(i13).put(bArr3, 0, i13).flip();
    }
}
