package o7;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import d7.n0;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class l0 extends b7.g {

    /* renamed from: i, reason: collision with root package name */
    public int f93137i;

    /* renamed from: j, reason: collision with root package name */
    public int f93138j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f93139k;

    /* renamed from: l, reason: collision with root package name */
    public int f93140l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f93141m;

    /* renamed from: n, reason: collision with root package name */
    public int f93142n;

    /* renamed from: o, reason: collision with root package name */
    public long f93143o;

    @Override // b7.g
    public final b7.e a(b7.e eVar) {
        int i13 = eVar.f22040c;
        if (i13 != 2 && i13 != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(eVar);
        }
        this.f93139k = true;
        return (this.f93137i == 0 && this.f93138j == 0) ? b7.e.f22037e : eVar;
    }

    @Override // b7.g
    public final void b() {
        if (this.f93139k) {
            this.f93139k = false;
            int i13 = this.f93138j;
            int i14 = this.f22043b.f22041d;
            this.f93141m = new byte[i13 * i14];
            this.f93140l = this.f93137i * i14;
        }
        this.f93142n = 0;
    }

    @Override // b7.g
    public final void c() {
        if (this.f93139k) {
            if (this.f93142n > 0) {
                this.f93143o += r0 / this.f22043b.f22041d;
            }
            this.f93142n = 0;
        }
    }

    @Override // b7.g, b7.f
    public final ByteBuffer e() {
        int i13;
        if (super.i() && (i13 = this.f93142n) > 0) {
            k(i13).put(this.f93141m, 0, this.f93142n).flip();
            this.f93142n = 0;
        }
        return super.e();
    }

    @Override // b7.f
    public final void f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i13 = limit - position;
        if (i13 == 0) {
            return;
        }
        int min = Math.min(i13, this.f93140l);
        this.f93143o += min / this.f22043b.f22041d;
        this.f93140l -= min;
        byteBuffer.position(position + min);
        if (this.f93140l > 0) {
            return;
        }
        int i14 = i13 - min;
        int length = (this.f93142n + i14) - this.f93141m.length;
        ByteBuffer k13 = k(length);
        int i15 = n0.i(length, 0, this.f93142n);
        k13.put(this.f93141m, 0, i15);
        int i16 = n0.i(length - i15, 0, i14);
        byteBuffer.limit(byteBuffer.position() + i16);
        k13.put(byteBuffer);
        byteBuffer.limit(limit);
        int i17 = i14 - i16;
        int i18 = this.f93142n - i15;
        this.f93142n = i18;
        byte[] bArr = this.f93141m;
        System.arraycopy(bArr, i15, bArr, 0, i18);
        byteBuffer.get(this.f93141m, this.f93142n, i17);
        this.f93142n += i17;
        k13.flip();
    }

    @Override // b7.g, b7.f
    public final boolean i() {
        return super.i() && this.f93142n == 0;
    }

    @Override // b7.g
    public final void j() {
        this.f93141m = n0.f53868c;
    }
}
