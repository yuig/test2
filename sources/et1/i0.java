package et1;

import android.media.MediaCodec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f60029a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60030b;

    /* renamed from: c, reason: collision with root package name */
    public final long f60031c;

    /* renamed from: d, reason: collision with root package name */
    public final int f60032d;

    public i0(j0 sampleType, int i13, MediaCodec.BufferInfo bufferInfo) {
        long j13 = bufferInfo.presentationTimeUs;
        int i14 = bufferInfo.flags;
        Intrinsics.checkNotNullParameter(sampleType, "sampleType");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        this.f60029a = sampleType;
        this.f60030b = i13;
        this.f60031c = j13;
        this.f60032d = i14;
    }
}
