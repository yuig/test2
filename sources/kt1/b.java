package kt1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public interface b {
    void a();

    void b(int i13, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer);

    int c(MediaFormat mediaFormat);

    void start();

    void stop();
}
