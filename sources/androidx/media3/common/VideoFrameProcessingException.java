package androidx.media3.common;

import androidx.media3.common.util.GlUtil$GlException;

/* loaded from: classes3.dex */
public final class VideoFrameProcessingException extends Exception {
    public VideoFrameProcessingException(GlUtil$GlException glUtil$GlException) {
        super(glUtil$GlException);
    }

    public static VideoFrameProcessingException a(Exception exc) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc);
    }
}
