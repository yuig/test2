package eu;

import com.pinterest.ads.feature.owc.view.collection.AdsCollectionScrollingModule;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdsCollectionScrollingModule f60134b;

    public /* synthetic */ g(AdsCollectionScrollingModule adsCollectionScrollingModule, int i13) {
        this.f60133a = i13;
        this.f60134b = adsCollectionScrollingModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f60133a;
        AdsCollectionScrollingModule this$0 = this.f60134b;
        switch (i13) {
            case 0:
                int i14 = AdsCollectionScrollingModule.U0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.w2(this$0.N0);
                break;
            default:
                int i15 = AdsCollectionScrollingModule.U0;
                cu.i K0 = this$0.K0();
                float y13 = this$0.k2().getY() + this$0.k2().getHeight();
                Intrinsics.checkNotNullExpressionValue(K0.getResources(), "getResources(...)");
                Intrinsics.checkNotNullParameter(K0, "<this>");
                float O0 = (y13 + m2.O0(r3)) - bs1.c.W(K0, eo1.c.space_400);
                int y14 = (int) (K0.getY() - O0);
                if (y14 > 0) {
                    a0.k1(K0.f53208j, K0.j() + y14);
                    K0.C(K0.j() + y14);
                }
                if (y14 < 0) {
                    K0.setY(O0);
                }
                this$0.M0 = O0;
                this$0.V1();
                break;
        }
    }
}
