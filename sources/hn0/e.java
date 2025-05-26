package hn0;

import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import com.pinterest.feature.boardpreview.export.watermark.exception.TrackTranscodingException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final fn0.e f69618a;

    /* renamed from: b, reason: collision with root package name */
    public final h f69619b;

    /* renamed from: c, reason: collision with root package name */
    public final MediaCodec f69620c;

    /* renamed from: d, reason: collision with root package name */
    public final bn0.c f69621d;

    public e(fn0.e mediaExtractor, h renderer) {
        MediaCodec createDecoderByType;
        Intrinsics.checkNotNullParameter(mediaExtractor, "mediaExtractor");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        this.f69618a = mediaExtractor;
        this.f69619b = renderer;
        MediaFormat format = mediaExtractor.a();
        Objects.toString(format);
        this.f69621d = new bn0.c();
        String findDecoderForFormat = new MediaCodecList(1).findDecoderForFormat(format);
        try {
            if (findDecoderForFormat != null) {
                try {
                    createDecoderByType = MediaCodec.createByCodecName(findDecoderForFormat);
                } catch (Exception unused) {
                    createDecoderByType = MediaCodec.createDecoderByType("video/avc");
                }
            } else {
                createDecoderByType = MediaCodec.createDecoderByType("video/avc");
            }
            Intrinsics.f(createDecoderByType);
            createDecoderByType.setCallback(this.f69621d);
            try {
                createDecoderByType.configure(format, this.f69619b.a().f65805d, (MediaCrypto) null, 0);
                this.f69620c = createDecoderByType;
            } catch (Exception e13) {
                Intrinsics.checkNotNullParameter(format, "format");
                throw new TrackTranscodingException.DecoderConfigurationError("Failed to configure decoder codec.", format, e13, 12);
            }
        } catch (Exception e14) {
            Intrinsics.checkNotNullParameter(format, "format");
            throw new TrackTranscodingException.DecoderNotFound("No decoder found.", format, e14, 12);
        }
    }
}
