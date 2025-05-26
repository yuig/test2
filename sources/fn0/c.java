package fn0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import ao2.i1;
import com.pinterest.feature.boardpreview.export.watermark.exception.TrackTranscodingException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f62607a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaCodec f62608b;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f62609c;

    /* renamed from: d, reason: collision with root package name */
    public final bn0.c f62610d;

    /* renamed from: e, reason: collision with root package name */
    public final Surface f62611e;

    public c(MediaFormat outFormat, String outputFilePath) {
        Intrinsics.checkNotNullParameter(outputFilePath, "outputFilePath");
        Intrinsics.checkNotNullParameter(outFormat, "outFormat");
        this.f62607a = outputFilePath;
        this.f62609c = kotlin.jvm.internal.r.c0("Encoder-worker");
        bn0.c cVar = new bn0.c();
        this.f62610d = cVar;
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
            Intrinsics.f(createEncoderByType);
            createEncoderByType.setCallback(cVar);
            try {
                createEncoderByType.configure(outFormat, (Surface) null, (MediaCrypto) null, 1);
                this.f62611e = createEncoderByType.createInputSurface();
                this.f62608b = createEncoderByType;
            } catch (Exception e13) {
                throw new TrackTranscodingException.EncoderConfigurationError("Failed to configure encoder codec.", null, e13, 14);
            }
        } catch (Exception e14) {
            throw new TrackTranscodingException.EncoderNotFound("No encoder found.", null, e14, 14);
        }
    }
}
