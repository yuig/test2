package com.pinterest.feature.boardpreview.export.watermark.exception;

import a.a;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/TranscoderException;", "gi2/b", "DecoderConfigurationError", "DecoderNotFound", "EncoderConfigurationError", "EncoderNotFound", "SourceTrackMimeTypeNotFound", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException$DecoderConfigurationError;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException$DecoderNotFound;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException$EncoderConfigurationError;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException$EncoderNotFound;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException$SourceTrackMimeTypeNotFound;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class TrackTranscodingException extends TranscoderException {

    /* renamed from: a, reason: collision with root package name */
    public final String f45322a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaFormat f45323b;

    /* renamed from: c, reason: collision with root package name */
    public final MediaCodec f45324c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecList f45325d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException$DecoderConfigurationError;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class DecoderConfigurationError extends TrackTranscodingException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException$DecoderNotFound;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class DecoderNotFound extends TrackTranscodingException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException$EncoderConfigurationError;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class EncoderConfigurationError extends TrackTranscodingException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException$EncoderNotFound;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class EncoderNotFound extends TrackTranscodingException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException$SourceTrackMimeTypeNotFound;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/TrackTranscodingException;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class SourceTrackMimeTypeNotFound extends TrackTranscodingException {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackTranscodingException(String str, MediaFormat mediaFormat, Exception exc, int i13) {
        super(exc);
        mediaFormat = (i13 & 2) != 0 ? null : mediaFormat;
        this.f45322a = str;
        this.f45323b = mediaFormat;
        this.f45324c = null;
        this.f45325d = null;
    }

    public static String a(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        boolean isEncoder = mediaCodecInfo.isEncoder();
        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
        Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
        String M = c0.M(supportedTypes, null, null, null, 0, null, null, 63);
        StringBuilder sb3 = new StringBuilder("MediaCodecInfo: name=");
        sb3.append(name);
        sb3.append(" isEncoder=");
        sb3.append(isEncoder);
        sb3.append(" supportedTypes=");
        return a.p(sb3, M, "}");
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f45322a;
    }

    @Override // com.pinterest.feature.boardpreview.export.watermark.exception.TranscoderException, java.lang.Throwable
    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder(super.toString());
        MediaFormat mediaFormat = this.f45323b;
        if (mediaFormat != null) {
            sb3.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
            sb3.append("Media format: " + mediaFormat);
        }
        MediaCodec mediaCodec = this.f45324c;
        if (mediaCodec != null) {
            sb3.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
            try {
                MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                Intrinsics.checkNotNullExpressionValue(codecInfo, "getCodecInfo(...)");
                str = a(codecInfo);
            } catch (IllegalStateException unused) {
                Objects.toString(mediaCodec);
                str = "";
            }
            sb3.append("Selected media codec info: " + str);
        }
        MediaCodecList mediaCodecList = this.f45325d;
        if (mediaCodecList != null) {
            sb3.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
            StringBuilder sb4 = new StringBuilder();
            try {
                MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
                Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
                for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                    if (mediaCodecInfo != null) {
                        sb4.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb4, "append(...)");
                        sb4.append(a(mediaCodecInfo));
                    }
                }
            } catch (IllegalStateException unused2) {
                Objects.toString(mediaCodecList);
            }
            String sb5 = sb4.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
            sb3.append("Available media codec info list (Name, IsEncoder, Supported Types): " + sb5);
        }
        if (getCause() != null) {
            sb3.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
            Throwable cause = getCause();
            sb3.append("Diagnostic info: " + (!(cause instanceof MediaCodec.CodecException) ? null : ((MediaCodec.CodecException) cause).getDiagnosticInfo()));
        }
        String sb6 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb6, "toString(...)");
        return sb6;
    }
}
