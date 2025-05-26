package d51;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import w01.e0;

/* loaded from: classes5.dex */
public final class n extends xk1.c implements nr0.j {

    /* renamed from: k, reason: collision with root package name */
    public final k22.m f53704k;

    /* renamed from: l, reason: collision with root package name */
    public final Function0 f53705l;

    /* renamed from: m, reason: collision with root package name */
    public String f53706m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k22.m userService, e0 onBoardSelected) {
        super(null);
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(onBoardSelected, "onBoardSelected");
        this.f53704k = userService;
        this.f53705l = onBoardSelected;
        this.f53706m = "";
        o(RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE, new h90.m(this, 16));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE;
    }

    @Override // xk1.c
    public final uj2.q k() {
        uj2.q u13 = this.f53704k.L(n00.b.a(n00.c.BOARD_METADATA_FIELDS)).k(new a(1, c.f53690m)).r(tk2.e.f118017c).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }
}
