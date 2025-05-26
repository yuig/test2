package ps0;

import android.view.LayoutInflater;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101284i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ HomeFeedFragment f101285j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(HomeFeedFragment homeFeedFragment, int i13) {
        super(0);
        this.f101284i = i13;
        this.f101285j = homeFeedFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f101284i;
        HomeFeedFragment homeFeedFragment = this.f101285j;
        switch (i13) {
            case 0:
                LayoutInflater.Factory E4 = homeFeedFragment.E4();
                ir.d dVar = E4 instanceof ir.d ? (ir.d) E4 : null;
                if (dVar == null) {
                    return null;
                }
                ir.c cVar = ((MainActivity) dVar).f35209x;
                if (cVar != null) {
                    return cVar;
                }
                Intrinsics.r("appLaunchAnimationController");
                throw null;
            case 1:
                return new pr0.g(homeFeedFragment.A1, new ky.d(homeFeedFragment.f7()), (pr0.c) homeFeedFragment.O1.getValue(), homeFeedFragment.f7(), null, ny.s.class, null, null, null, 464);
            case 2:
                return new q(homeFeedFragment);
            case 3:
                return new ky.a(homeFeedFragment.S1, homeFeedFragment.T1);
            default:
                return new u(homeFeedFragment);
        }
    }
}
