package o7;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import d7.n0;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r extends b7.g {

    /* renamed from: i, reason: collision with root package name */
    public int[] f93189i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f93190j;

    @Override // b7.g
    public final b7.e a(b7.e eVar) {
        int[] iArr = this.f93189i;
        if (iArr == null) {
            return b7.e.f22037e;
        }
        int i13 = eVar.f22040c;
        if (i13 != 2 && i13 != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(eVar);
        }
        int length = iArr.length;
        int i14 = eVar.f22039b;
        boolean z13 = i14 != length;
        int i15 = 0;
        while (i15 < iArr.length) {
            int i16 = iArr[i15];
            if (i16 >= i14) {
                throw new AudioProcessor$UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", eVar);
            }
            z13 |= i16 != i15;
            i15++;
        }
        if (z13) {
            return new b7.e(eVar.f22038a, iArr.length, i13);
        }
        return b7.e.f22037e;
    }

    @Override // b7.g
    public final void b() {
        this.f93190j = this.f93189i;
    }

    @Override // b7.f
    public final void f(ByteBuffer byteBuffer) {
        int[] iArr = this.f93190j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k13 = k(((limit - position) / this.f22043b.f22041d) * this.f22044c.f22041d);
        while (position < limit) {
            for (int i13 : iArr) {
                int u13 = (n0.u(this.f22043b.f22040c) * i13) + position;
                int i14 = this.f22043b.f22040c;
                if (i14 == 2) {
                    k13.putShort(byteBuffer.getShort(u13));
                } else {
                    if (i14 != 4) {
                        throw new IllegalStateException("Unexpected encoding: " + this.f22043b.f22040c);
                    }
                    k13.putFloat(byteBuffer.getFloat(u13));
                }
            }
            position += this.f22043b.f22041d;
        }
        byteBuffer.position(limit);
        k13.flip();
    }

    @Override // b7.g
    public final void j() {
        this.f93190j = null;
        this.f93189i = null;
    }
}
