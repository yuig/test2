package ps0;

import android.content.Context;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101319i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f101320j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ HomeFeedFragment f101321k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Context context, HomeFeedFragment homeFeedFragment, int i13) {
        super(0);
        this.f101319i = i13;
        this.f101320j = context;
        this.f101321k = homeFeedFragment;
    }

    public final mz.e b() {
        int i13 = this.f101319i;
        Context context = this.f101320j;
        HomeFeedFragment homeFeedFragment = this.f101321k;
        switch (i13) {
            case 0:
                dz.a aVar = homeFeedFragment.f45762r1;
                if (aVar == null) {
                    Intrinsics.r("anketViewPagerAdapter");
                    throw null;
                }
                cz.e eVar = homeFeedFragment.f45761q1;
                if (eVar != null) {
                    return new mz.e(context, aVar, eVar);
                }
                Intrinsics.r("anketManager");
                throw null;
            default:
                dz.a aVar2 = homeFeedFragment.f45762r1;
                if (aVar2 == null) {
                    Intrinsics.r("anketViewPagerAdapter");
                    throw null;
                }
                cz.e eVar2 = homeFeedFragment.f45761q1;
                if (eVar2 != null) {
                    return new mz.e(context, aVar2, eVar2);
                }
                Intrinsics.r("anketManager");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f101319i) {
        }
        return b();
    }
}
