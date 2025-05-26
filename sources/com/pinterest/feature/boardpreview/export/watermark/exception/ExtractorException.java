package com.pinterest.feature.boardpreview.export.watermark.exception;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.text.t;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/TranscoderException;", "gi2/b", "DataSource", "EmptyPlayList", "NoAudioTrack", "NoDuration", "NoVideoTrack", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException$DataSource;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException$EmptyPlayList;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException$NoAudioTrack;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException$NoDuration;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException$NoVideoTrack;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class ExtractorException extends TranscoderException {

    /* renamed from: a, reason: collision with root package name */
    public final String f45320a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f45321b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException$DataSource;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class DataSource extends ExtractorException {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException$EmptyPlayList;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException;", "()V", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EmptyPlayList extends ExtractorException {
        static {
            new EmptyPlayList();
        }

        private EmptyPlayList() {
            super("empty play list", (Uri) null, 6);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException$NoAudioTrack;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class NoAudioTrack extends ExtractorException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException$NoDuration;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class NoDuration extends ExtractorException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException$NoVideoTrack;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/ExtractorException;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class NoVideoTrack extends ExtractorException {
    }

    public ExtractorException(String str, Uri uri, Throwable th3) {
        super(th3);
        this.f45320a = str;
        this.f45321b = uri;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Failed to create media source due to:  " + this.f45320a;
    }

    @Override // com.pinterest.feature.boardpreview.export.watermark.exception.TranscoderException, java.lang.Throwable
    public final String toString() {
        return t.b("\n            " + super.toString() + "\n            Uri: " + this.f45321b + "\n            ");
    }

    public /* synthetic */ ExtractorException(String str, Uri uri, int i13) {
        this(str, (i13 & 2) != 0 ? null : uri, new Throwable());
    }
}
