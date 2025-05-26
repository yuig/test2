package lm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final sk0.d f83856a = new sk0.d();

    /* renamed from: b, reason: collision with root package name */
    public static final um0.e f83857b;

    static {
        zy.l0 pinalyticsVMState = new zy.l0((h32.i0) null, 3);
        kotlin.collections.q0 boardToolList = kotlin.collections.q0.f80391a;
        String boardId = (127 & 2) != 0 ? "" : null;
        Intrinsics.checkNotNullParameter(boardToolList, "boardToolList");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        f83857b = new um0.e();
        tk0.i0 organizeToolsState = (31 & 4) != 0 ? um0.o0.f122748b : null;
        um0.a1 pinSelectionState = um0.o0.f122750d;
        zy.l0 pinalyticsState = (31 & 16) != 0 ? new zy.l0((h32.i0) null, 3) : null;
        Intrinsics.checkNotNullParameter(organizeToolsState, "organizeToolsState");
        Intrinsics.checkNotNullParameter(pinSelectionState, "pinSelectionState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        v7 v7Var = organizeToolsState.f117974d;
        int i13 = pinSelectionState.f122686c;
    }

    public static final i a(tk0.q event) {
        Intrinsics.checkNotNullParameter(event, "event");
        tk0.e eVar = um0.o0.f122747a;
        Intrinsics.checkNotNullParameter(event, "event");
        return new i(new um0.q(event));
    }
}
