package com.pinterest.feature.boardpreview.export.watermark.exception;

import kotlin.Metadata;
import kotlin.text.t;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/MuxerException;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/TranscoderException;", "gi2/b", "InvalidParams", "IoFailure", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/MuxerException$InvalidParams;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/MuxerException$IoFailure;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class MuxerException extends TranscoderException {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/MuxerException$InvalidParams;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/MuxerException;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class InvalidParams extends MuxerException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/MuxerException$IoFailure;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/MuxerException;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class IoFailure extends MuxerException {
    }

    @Override // com.pinterest.feature.boardpreview.export.watermark.exception.TranscoderException, java.lang.Throwable
    public final String toString() {
        return t.b("\n               " + super.toString() + "\n               null\n               Output file path: null\n               ");
    }
}
