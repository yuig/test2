package rf1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.wo0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.c1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107758i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f107759j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f30 f107760k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f107761l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(p pVar, f30 f30Var, Long l13, int i13) {
        super(0);
        this.f107758i = i13;
        this.f107759j = pVar;
        this.f107760k = f30Var;
        this.f107761l = l13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f107758i) {
            case 0:
                m244invoke();
                break;
            default:
                m244invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m244invoke() {
        String str;
        int i13 = this.f107758i;
        Long l13 = this.f107761l;
        p pVar = this.f107759j;
        switch (i13) {
            case 0:
                String b13 = pVar.f107814l.b(this.f107760k);
                nx.d0 d0Var = pVar.getPresenterPinalytics().f122379a;
                wo0 wo0Var = pVar.f107820r;
                f30 f30Var = wo0Var.f43312c;
                String id3 = f30Var != null ? f30Var.getId() : null;
                String str2 = id3 == null ? "" : id3;
                f30 f30Var2 = wo0Var.f43312c;
                ph.a.B0(d0Var, str2, this.f107761l, f30Var2 != null ? f30Var2.B4() : null, b13, true);
                pVar.f107822t = ((pb0.g) pVar.f107813k).a();
                sf1.t tVar = (sf1.t) pVar.getView();
                nx.d0 d0Var2 = pVar.getPresenterPinalytics().f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                a11.n clickthroughHelper = pVar.f107812j.a(d0Var2);
                f30 f30Var3 = wo0Var.f43312c;
                String id4 = f30Var3 != null ? f30Var3.getId() : null;
                str = id4 != null ? id4 : "";
                f30 f30Var4 = wo0Var.f43312c;
                c1 eventData = ph.a.r(str, f30Var4 != null ? f30Var4.B4() : null, l13);
                ((sf1.s) tVar).getClass();
                f30 productPin = this.f107760k;
                Intrinsics.checkNotNullParameter(productPin, "productPin");
                Intrinsics.checkNotNullParameter(clickthroughHelper, "clickthroughHelper");
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                a11.e.d(clickthroughHelper, productPin, 0, 0, eventData, false, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL);
                return;
            default:
                sf1.t tVar2 = (sf1.t) pVar.getView();
                wo0 wo0Var2 = pVar.f107820r;
                f30 f30Var5 = wo0Var2.f43312c;
                String id5 = f30Var5 != null ? f30Var5.getId() : null;
                str = id5 != null ? id5 : "";
                f30 f30Var6 = wo0Var2.f43312c;
                c1 eventData2 = ph.a.r(str, f30Var6 != null ? f30Var6.B4() : null, l13);
                sf1.s sVar = (sf1.s) tVar2;
                sVar.getClass();
                f30 pin = this.f107760k;
                Intrinsics.checkNotNullParameter(pin, "pin");
                Intrinsics.checkNotNullParameter(eventData2, "eventData");
                gs0.k kVar = sVar.f112712s;
                if (kVar != null) {
                    if (sVar.f112708o != null) {
                        gs0.k.a(kVar, pin, jo1.c.a(null), false, false, null, null, false, null, null, false, null, null, true, eventData2, null, null, false, false, false, false, null, null, false, 8376312).showFeedBack();
                        return;
                    } else {
                        Intrinsics.r("baseGridActionUtils");
                        throw null;
                    }
                }
                Intrinsics.r("pinOverflowMenuModalProvider");
                throw null;
        }
    }
}
