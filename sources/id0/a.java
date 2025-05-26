package id0;

import android.content.Context;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.c1;
import kg.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import nx.d0;

/* loaded from: classes5.dex */
public final /* synthetic */ class a extends p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj, int i13) {
        super(0, obj, e.class, "onSeeMoreButtonTapped", "onSeeMoreButtonTapped()V", 0);
        this.f72125a = i13;
        if (i13 != 1) {
        } else {
            super(0, obj, e.class, "onRecentPinsEmptyStateTapped", "onRecentPinsEmptyStateTapped()V", 0);
        }
    }

    public final void h() {
        switch (this.f72125a) {
            case 0:
                e eVar = (e) this.receiver;
                kd0.b bVar = (kd0.b) ((fd0.b) eVar.getView());
                bVar.getClass();
                NavigationImpl w13 = Navigation.w1(c1.d());
                Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
                bVar.M1(w13);
                eVar.t3(md0.a.STATS_SEE_MORE_TAPPED);
                break;
            default:
                e eVar2 = (e) this.receiver;
                kd0.b bVar2 = (kd0.b) ((fd0.b) eVar2.getView());
                d0 s73 = bVar2.s7();
                Context requireContext = bVar2.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                t.M0(s73, requireContext, ou1.e.CREATOR_HUB_TOOLS, null, null, 0, 56);
                eVar2.t3(md0.a.RECENT_PINS_EMPTY_STATE_TAPPED);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f72125a) {
            case 0:
                h();
                break;
            default:
                h();
                break;
        }
        return Unit.f80348a;
    }
}
