package kt1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final MediaMuxer f80871a;

    public a(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        MediaMuxer muxer = new MediaMuxer(path, 0);
        Intrinsics.checkNotNullParameter(muxer, "muxer");
        this.f80871a = muxer;
    }

    @Override // kt1.b
    public final void a() {
        this.f80871a.release();
    }

    @Override // kt1.b
    public final void b(int i13, MediaCodec.BufferInfo bufferInfo, ByteBuffer sampleData) {
        Intrinsics.checkNotNullParameter(sampleData, "sampleData");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        this.f80871a.writeSampleData(i13, sampleData, bufferInfo);
    }

    @Override // kt1.b
    public final int c(MediaFormat trackFormat) {
        Intrinsics.checkNotNullParameter(trackFormat, "trackFormat");
        return this.f80871a.addTrack(trackFormat);
    }

    @Override // kt1.b
    public final void start() {
        this.f80871a.start();
    }

    @Override // kt1.b
    public final void stop() {
        this.f80871a.stop();
    }
}
