package gb2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f64744b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String boardSectionUid, String boardUid) {
        super(boardSectionUid);
        Intrinsics.checkNotNullParameter(boardSectionUid, "boardSectionUid");
        Intrinsics.checkNotNullParameter(boardUid, "boardUid");
        this.f64744b = boardUid;
    }
}
