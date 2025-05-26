package com.modiface.mfemakeupkit.video;

import com.modiface.mfemakeupkit.video.MFEVideoRecordingError;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f34682a;

    static {
        int[] iArr = new int[MFEVideoRecordingError.Consequence.values().length];
        f34682a = iArr;
        try {
            iArr[MFEVideoRecordingError.Consequence.RecordingFailed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f34682a[MFEVideoRecordingError.Consequence.NoAudio.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f34682a[MFEVideoRecordingError.Consequence.SkippedVideoFrame.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f34682a[MFEVideoRecordingError.Consequence.SkippedAudioFrame.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
