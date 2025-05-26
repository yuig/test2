package dt0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final y f56259j = new y(0);

    /* renamed from: k, reason: collision with root package name */
    public static final y f56260k = new y(1);

    /* renamed from: l, reason: collision with root package name */
    public static final y f56261l = new y(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56262i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i13) {
        super(1);
        this.f56262i = i13;
    }

    public final a b(a displayState) {
        switch (this.f56262i) {
            case 0:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                return a.e(displayState, xp1.d.homefeed_tuner_filter_title_selection_all, xp1.d.homefeed_tuner_filter_subtitle_selection_all, null, false, 28);
            case 1:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                return a.e(displayState, xp1.d.homefeed_tuner_filter_title_selection_saved, xp1.d.homefeed_tuner_filter_subtitle_selection_all, null, false, 28);
            default:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                return a.e(displayState, xp1.d.homefeed_tuner_filter_title_selection_viewed, xp1.d.homefeed_tuner_filter_subtitle_selection_all, null, false, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f56262i) {
        }
        return b((a) obj);
    }
}
