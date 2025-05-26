package j12;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends g {

    /* renamed from: d, reason: collision with root package name */
    public final String f74416d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String boardSectionUid, String newTitle) {
        super(boardSectionUid);
        Intrinsics.checkNotNullParameter(boardSectionUid, "boardSectionUid");
        Intrinsics.checkNotNullParameter(newTitle, "newTitle");
        this.f74416d = newTitle;
    }
}
