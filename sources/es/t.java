package es;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lh0.g1;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60005i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f60006j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(v vVar, int i13) {
        super(0);
        this.f60005i = i13;
        this.f60006j = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f60005i) {
            case 0:
                m137invoke();
                break;
            case 1:
                m137invoke();
                break;
            case 2:
                m137invoke();
                break;
            case 3:
                m137invoke();
                break;
            case 4:
                m137invoke();
                break;
            case 5:
                break;
            case 6:
                m137invoke();
                break;
            case 7:
                m137invoke();
                break;
            default:
                m137invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m137invoke() {
        int i13 = this.f60005i;
        v vVar = this.f60006j;
        switch (i13) {
            case 0:
                ((g1) vVar.f60008a.f83323a).c("ads_android_brand_name_reorder");
                break;
            case 1:
                ((g1) vVar.f60008a.f83323a).c("android_handshake_show_badge");
                break;
            case 2:
                ((g1) vVar.f60008a.f83323a).c("android_handshake_show_shipping");
                break;
            case 3:
                ((g1) vVar.f60008a.f83323a).c("android_handshake_show_price");
                break;
            case 4:
                ((g1) vVar.f60008a.f83323a).c("android_handshake_show_rating");
                break;
            case 5:
            default:
                ((g1) vVar.f60008a.f83323a).c("price_and_ratings_broad");
                break;
            case 6:
                ((g1) vVar.f60008a.f83323a).c("android_dynamic_corner_badge_killswitch");
                break;
            case 7:
                ((g1) vVar.f60008a.f83323a).c("price_and_ratings_broad");
                break;
        }
    }
}
