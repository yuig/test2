package zp;

import com.pinterest.api.model.v7;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class m {
    static {
        pb0.i.DAYS.getMilliseconds();
    }

    public static final void a(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        long time = new Date().getTime();
        lb0.p pVar = lb0.n.f82725d;
        ((lb0.b) pVar.a()).m("PREF_BOARD_INVITE_UPSELL_WITH_NO_COLLAB_LAST_SEEN_MS_2023_V1", time);
        ((lb0.b) pVar.a()).l("PREF_BOARD_VIEW_INVITE_UPSELL_VIEW_COUNT_2024_V1", ((lb0.b) pVar.a()).f("PREF_BOARD_VIEW_INVITE_UPSELL_VIEW_COUNT_2024_V1", 0) + 1);
    }
}
