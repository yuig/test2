package rh1;

import com.pinterest.feature.unifiedcomments.view.PinCommentReactionHeaderView;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class z1 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinCommentReactionHeaderView f108334a;

    public z1(PinCommentReactionHeaderView pinCommentReactionHeaderView) {
        this.f108334a = pinCommentReactionHeaderView;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.o event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = event.f84703b;
        int i14 = PinCommentReactionHeaderView.f48945o;
        PinCommentReactionHeaderView pinCommentReactionHeaderView = this.f108334a;
        pinCommentReactionHeaderView.getClass();
        pinCommentReactionHeaderView.f48948f.i(new ed1.m(i13 > 0 ? qb0.j.b(i13) : "", pinCommentReactionHeaderView, i13 > 0 ? qb0.j.b(i13) : "0", 17));
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.f event) {
        Integer num;
        Intrinsics.checkNotNullParameter(event, "event");
        PinCommentReactionHeaderView pinCommentReactionHeaderView = this.f108334a;
        if (!pinCommentReactionHeaderView.f48955m || (num = pinCommentReactionHeaderView.f48951i) == null) {
            return;
        }
        pinCommentReactionHeaderView.L(num.intValue() + 1);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.g event) {
        Integer num;
        Intrinsics.checkNotNullParameter(event, "event");
        PinCommentReactionHeaderView pinCommentReactionHeaderView = this.f108334a;
        if (!pinCommentReactionHeaderView.f48955m || (num = pinCommentReactionHeaderView.f48951i) == null) {
            return;
        }
        pinCommentReactionHeaderView.L(num.intValue() - 1);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.h event) {
        Integer num;
        Intrinsics.checkNotNullParameter(event, "event");
        PinCommentReactionHeaderView pinCommentReactionHeaderView = this.f108334a;
        if (!pinCommentReactionHeaderView.f48955m || (num = pinCommentReactionHeaderView.f48951i) == null) {
            return;
        }
        pinCommentReactionHeaderView.L(num.intValue() + 1);
    }
}
