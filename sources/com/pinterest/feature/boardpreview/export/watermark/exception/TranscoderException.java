package com.pinterest.feature.boardpreview.export.watermark.exception;

import a.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/watermark/exception/TranscoderException;", "Ljava/lang/Exception;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class TranscoderException extends Exception {
    @Override // java.lang.Throwable
    public String toString() {
        return a.C(super.toString(), "Media transformation failed for job id: null");
    }
}
