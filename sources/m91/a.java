package m91;

import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends l {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f86721h;

    /* renamed from: i, reason: collision with root package name */
    public final String f86722i;

    public a(String userContactName, int i13) {
        this.f86721h = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(userContactName, "userContactName");
            this.f86722i = userContactName;
            u();
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(userContactName, "userBusinessType");
            this.f86722i = userContactName;
            u();
        } else {
            Intrinsics.checkNotNullParameter(userContactName, "userEmail");
            this.f86722i = userContactName;
            u();
        }
    }

    public final void u() {
        int i13 = this.f86721h;
        String str = this.f86722i;
        switch (i13) {
            case 0:
                if (!h1.f("not_sure", "blogger", "consumer_good_product_or_service", "contractor_or_service_provider", "influencer_public_figure_or_celebrity", "institution_or_non_prof", "local_retail_store", "local_service", "online_retail_or_marketplace", "publisher_or_media").contains(str)) {
                    str = "other";
                }
                k(e0.b(new h(f0.j(new f(Intrinsics.d(str, "not_sure"), 10), new f(Intrinsics.d(str, "blogger"), 0), new f(Intrinsics.d(str, "consumer_good_product_or_service"), 1), new f(Intrinsics.d(str, "contractor_or_service_provider"), 2), new f(Intrinsics.d(str, "influencer_public_figure_or_celebrity"), 6), new f(Intrinsics.d(str, "institution_or_non_prof"), 7), new f(Intrinsics.d(str, "local_retail_store"), 8), new f(Intrinsics.d(str, "local_service"), 9), new f(Intrinsics.d(str, "online_retail_or_marketplace"), 11), new f(Intrinsics.d(str, "publisher_or_media"), 13), new f(Intrinsics.d(str, "other"), 12)))));
                break;
            case 1:
                k(e0.b(new i(str, 0)));
                break;
            default:
                k(e0.b(new i(str, 2)));
                break;
        }
    }
}
