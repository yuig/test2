package lg1;

import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.EGLContext;
import android.util.Size;
import jg1.k;
import jg1.v;
import kotlin.jvm.internal.Intrinsics;
import xk2.w;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final eq1.a f83230a;

    /* renamed from: b, reason: collision with root package name */
    public MediaMuxer f83231b;

    /* renamed from: c, reason: collision with root package name */
    public f f83232c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f83233d;

    public c(eq1.a imageToVideoEncoderFactory) {
        Intrinsics.checkNotNullParameter(imageToVideoEncoderFactory, "imageToVideoEncoderFactory");
        this.f83230a = imageToVideoEncoderFactory;
    }

    public final void a(tb0.h crashReporting, String inputPath, String outputPath, Size outputResolution, long j13, k videoFormatMimeType, EGLContext shareContext) {
        f fVar;
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(inputPath, "inputPath");
        Intrinsics.checkNotNullParameter(outputPath, "outputPath");
        Intrinsics.checkNotNullParameter(outputResolution, "outputResolution");
        Intrinsics.checkNotNullParameter(videoFormatMimeType, "videoFormatMimeType");
        Intrinsics.checkNotNullParameter(shareContext, "shareContext");
        try {
            MediaMuxer mediaMuxer = new MediaMuxer(outputPath, 0);
            this.f83231b = mediaMuxer;
            v vVar = new v(mediaMuxer);
            w e13 = mg1.b.e(crashReporting, videoFormatMimeType, 30, outputResolution);
            this.f83232c = this.f83230a.a(inputPath, vVar, (MediaFormat) e13.f135234a, (Size) e13.f135235b, (String) e13.f135236c, j13, shareContext);
            while (!this.f83233d && ((fVar = this.f83232c) == null || !fVar.f83243j)) {
                if (fVar == null || !fVar.c()) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            try {
                MediaMuxer mediaMuxer2 = this.f83231b;
                if (mediaMuxer2 != null) {
                    mediaMuxer2.stop();
                }
            } catch (IllegalStateException unused2) {
            }
            try {
                f fVar2 = this.f83232c;
                if (fVar2 != null) {
                    fVar2.a();
                }
                this.f83232c = null;
            } catch (RuntimeException e14) {
                e14.getMessage();
            }
            try {
                MediaMuxer mediaMuxer3 = this.f83231b;
                if (mediaMuxer3 != null) {
                    mediaMuxer3.release();
                }
                this.f83231b = null;
            } catch (RuntimeException e15) {
                e15.getMessage();
            }
        } catch (Throwable th3) {
            try {
                f fVar3 = this.f83232c;
                if (fVar3 != null) {
                    fVar3.a();
                }
                this.f83232c = null;
            } catch (RuntimeException e16) {
                e16.getMessage();
            }
            try {
                MediaMuxer mediaMuxer4 = this.f83231b;
                if (mediaMuxer4 != null) {
                    mediaMuxer4.release();
                }
                this.f83231b = null;
                throw th3;
            } catch (RuntimeException e17) {
                e17.getMessage();
                throw th3;
            }
        }
    }
}
