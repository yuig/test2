package x7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface l {
    void a();

    void b(int i13, k7.c cVar, long j13, int i14);

    void c(Bundle bundle);

    void d(int i13, int i14, int i15, long j13);

    void e(n8.h hVar, Handler handler);

    MediaFormat f();

    void flush();

    void g();

    void h(int i13);

    ByteBuffer i(int i13);

    void j(Surface surface);

    default boolean k(h1.b bVar) {
        return false;
    }

    void l(int i13);

    void m(int i13, long j13);

    int n();

    int o(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer p(int i13);
}
