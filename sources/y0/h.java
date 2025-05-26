package y0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface h extends AutoCloseable {
    long F0();

    MediaCodec.BufferInfo Y();

    long size();

    ByteBuffer t0();
}
