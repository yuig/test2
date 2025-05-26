package un0;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final e f122829i = new e(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v7 board = (v7) obj;
        ba boardSection = (ba) obj2;
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(boardSection, "boardSection");
        return new Pair(board, boardSection);
    }
}
