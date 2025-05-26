package rg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final String f108051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(vd0.c cVar) {
        super(null, null);
        String o13 = cVar.o("board_preview_id", "");
        String boardPreviewId = o13 != null ? o13 : "";
        Intrinsics.checkNotNullParameter(boardPreviewId, "boardPreviewId");
        this.f108051c = boardPreviewId;
    }
}
