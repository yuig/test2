package j12;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends h {

    /* renamed from: d, reason: collision with root package name */
    public final String f74411d;

    /* renamed from: e, reason: collision with root package name */
    public final String f74412e;

    /* renamed from: f, reason: collision with root package name */
    public final List f74413f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String boardId, String boardSectionTitle, List pinIds) {
        super(boardId + ":" + boardSectionTitle + ":" + CollectionsKt.Z(pinIds, ",", null, null, 0, null, null, 62));
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSectionTitle, "boardSectionTitle");
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        this.f74411d = boardId;
        this.f74412e = boardSectionTitle;
        this.f74413f = pinIds;
    }

    public c(String str, String str2) {
        this(str, str2, q0.f80391a);
    }
}
