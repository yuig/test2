package jg1;

import android.media.MediaCodec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final t f76060a;

    /* renamed from: b, reason: collision with root package name */
    public final int f76061b;

    /* renamed from: c, reason: collision with root package name */
    public final long f76062c;

    /* renamed from: d, reason: collision with root package name */
    public final int f76063d;

    public s(t sampleType, int i13, MediaCodec.BufferInfo bufferInfo) {
        long j13 = bufferInfo.presentationTimeUs;
        int i14 = bufferInfo.flags;
        Intrinsics.checkNotNullParameter(sampleType, "sampleType");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        this.f76060a = sampleType;
        this.f76061b = i13;
        this.f76062c = j13;
        this.f76063d = i14;
    }
}
