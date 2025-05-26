package lr;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yk1.v viewResources) {
        super(viewResources);
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        String string = ((yk1.a) viewResources).f139224a.getString(d70.g.pins_moved_toast_text);
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.f84518d = string;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yk1.v viewResources, String boardSectionTitle) {
        super(viewResources);
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(boardSectionTitle, "boardSectionTitle");
        String string = ((yk1.a) viewResources).f139224a.getString(k70.e.board_section_moving_toast_message);
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.f84518d = string;
    }
}
