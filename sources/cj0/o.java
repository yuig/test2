package cj0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final o f27848j = new o(0);

    /* renamed from: k, reason: collision with root package name */
    public static final o f27849k = new o(1);

    /* renamed from: l, reason: collision with root package name */
    public static final o f27850l = new o(2);

    /* renamed from: m, reason: collision with root package name */
    public static final o f27851m = new o(3);

    /* renamed from: n, reason: collision with root package name */
    public static final o f27852n = new o(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27853i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i13) {
        super(1);
        this.f27853i = i13;
    }

    public final g b(g it) {
        switch (this.f27853i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return g.e(it, 0, null, null, null, null, yk1.i.ERROR, false, 95);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return g.e(it, 0, null, null, null, null, null, true, 63);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return g.e(it, 0, gj0.c.e(it.f27824b, null, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK), null, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return g.e(it, 0, null, null, null, null, null, false, 63);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27853i) {
            case 0:
                i state = (i) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                break;
        }
        return b((g) obj);
    }
}
