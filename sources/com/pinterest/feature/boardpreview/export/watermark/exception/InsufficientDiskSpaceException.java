package com.pinterest.feature.boardpreview.export.watermark.exception;

import df.j1;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/InsufficientDiskSpaceException;", "Lcom/pinterest/feature/boardpreview/export/watermark/exception/TranscoderException;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class InsufficientDiskSpaceException extends TranscoderException {
    @Override // java.lang.Throwable
    public final String getMessage() {
        return j1.U("Insufficient disk space, estimated file size in bytes %d, available disk space in bytes %d", new Object[]{Locale.US, 0L, 0L});
    }
}
