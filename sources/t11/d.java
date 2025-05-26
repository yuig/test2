package t11;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final d f115795i = new d(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ba section = (ba) obj;
        v7 board = (v7) obj2;
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(board, "board");
        return new Pair(section, board);
    }
}
