package kt1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final b f80872a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f80873b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f80874c;

    public c(a muxer) {
        Intrinsics.checkNotNullParameter(muxer, "muxer");
        this.f80872a = muxer;
        this.f80874c = new HashSet();
    }

    @Override // kt1.b
    public final void a() {
        this.f80873b = true;
        this.f80872a.a();
    }

    @Override // kt1.b
    public final void b(int i13, MediaCodec.BufferInfo bufferInfo, ByteBuffer sampleData) {
        Intrinsics.checkNotNullParameter(sampleData, "sampleData");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        if (this.f80873b) {
            return;
        }
        HashSet hashSet = this.f80874c;
        if (hashSet.contains(Integer.valueOf(i13))) {
            return;
        }
        if ((bufferInfo.flags & 4) != 0) {
            hashSet.add(Integer.valueOf(i13));
        }
        this.f80872a.b(i13, bufferInfo, sampleData);
    }

    @Override // kt1.b
    public final int c(MediaFormat trackFormat) {
        Intrinsics.checkNotNullParameter(trackFormat, "trackFormat");
        return this.f80872a.c(trackFormat);
    }

    @Override // kt1.b
    public final void start() {
        this.f80872a.start();
    }

    @Override // kt1.b
    public final void stop() {
        this.f80873b = true;
        this.f80872a.stop();
    }
}
