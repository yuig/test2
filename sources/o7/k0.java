package o7;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class k0 extends b7.g {

    /* renamed from: i, reason: collision with root package name */
    public static final int f93133i = Float.floatToIntBits(Float.NaN);

    public static void l(int i13, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i13 * 4.656612875245797E-10d));
        if (floatToIntBits == f93133i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // b7.g
    public final b7.e a(b7.e eVar) {
        int i13 = eVar.f22040c;
        if (i13 == 21 || i13 == 1342177280 || i13 == 22 || i13 == 1610612736 || i13 == 4) {
            return i13 != 4 ? new b7.e(eVar.f22038a, eVar.f22039b, 4) : b7.e.f22037e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(eVar);
    }

    @Override // b7.f
    public final void f(ByteBuffer byteBuffer) {
        ByteBuffer k13;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i13 = limit - position;
        int i14 = this.f22043b.f22040c;
        if (i14 == 21) {
            k13 = k((i13 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), k13);
                position += 3;
            }
        } else if (i14 == 22) {
            k13 = k(i13);
            while (position < limit) {
                l((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), k13);
                position += 4;
            }
        } else if (i14 == 1342177280) {
            k13 = k((i13 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), k13);
                position += 3;
            }
        } else {
            if (i14 != 1610612736) {
                throw new IllegalStateException();
            }
            k13 = k(i13);
            while (position < limit) {
                l((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), k13);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        k13.flip();
    }
}
