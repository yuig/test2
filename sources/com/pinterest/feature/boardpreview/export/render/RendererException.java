package com.pinterest.feature.boardpreview.export.render;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/boardpreview/export/render/RendererException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RendererException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RendererException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
