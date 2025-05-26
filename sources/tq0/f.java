package tq0;

import com.pinterest.feature.pincarouselads.view.CarouselIndexView;
import h32.c1;
import h32.f1;
import h32.x1;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f118997c;

    /* renamed from: d, reason: collision with root package name */
    public final com.pinterest.feature.pincarouselads.view.e f118998d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f118999e;

    /* renamed from: f, reason: collision with root package name */
    public final c1 f119000f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f119001g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(pb0.a clock, d0 pinalytics, HashMap hashMap, CarouselIndexView carouselIndexView, Integer num, c1 c1Var) {
        super(clock, pinalytics);
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f118997c = hashMap;
        this.f118998d = carouselIndexView;
        this.f118999e = num;
        this.f119000f = c1Var;
        this.f119001g = new ArrayList();
    }

    @Override // tq0.b
    public final void i() {
        this.f119001g.clear();
    }

    @Override // tq0.b
    public final void l(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        if (impression instanceof x1) {
            this.f119001g.add(impression);
        }
    }

    @Override // tq0.b
    public final void p() {
        ArrayList arrayList = this.f119001g;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int i13 = 0;
            String str = ((x1) arrayList2.get(0)).f67380a;
            com.pinterest.feature.pincarouselads.view.e eVar = this.f118998d;
            if (eVar != null) {
                i13 = ((CarouselIndexView) eVar).f47323b;
            } else {
                Integer num = this.f118999e;
                if (num != null) {
                    i13 = num.intValue();
                }
            }
            String valueOf = String.valueOf(i13);
            f1 f1Var = f1.PIN_CAROUSEL_SLOT_IMPRESSION_ONE_PIXEL;
            HashMap hashMap = this.f118997c;
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            HashMap hashMap2 = hashMap;
            hashMap2.put("image_count", valueOf);
            Unit unit = Unit.f80348a;
            this.f118989b.j0(f1Var, str, arrayList2, hashMap2, this.f119000f);
        }
    }
}
