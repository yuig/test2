package ix1;

import com.pinterest.partnerAnalytics.feature.audience.top.locations.TopLocationsView;
import java.util.Date;
import jc0.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lx1.j;
import m60.w;
import nx.d0;

/* loaded from: classes4.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73798i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f73799j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ gx1.e f73800k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, gx1.e eVar, int i13) {
        super(0);
        this.f73798i = i13;
        this.f73799j = fVar;
        this.f73800k = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f73798i) {
            case 0:
                m157invoke();
                break;
            default:
                m157invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m157invoke() {
        int i13 = this.f73798i;
        gx1.e eVar = this.f73800k;
        f fVar = this.f73799j;
        switch (i13) {
            case 0:
                w f73 = fVar.f7();
                d0 s73 = fVar.s7();
                gx1.f fVar2 = eVar.f66287c;
                f73.d(new v(new j(s73, fVar2.f66298g, eVar.f66291g, fVar2.f66300i, fVar.f7()), false, 0L, 30));
                return;
            default:
                w f74 = fVar.f7();
                d0 s74 = fVar.s7();
                gx1.f fVar3 = eVar.f66287c;
                Date date = fVar3.f66298g;
                TopLocationsView topLocationsView = fVar.f73809j0;
                if (topLocationsView != null) {
                    f74.d(new v(new nx1.a(s74, date, topLocationsView.f50164i, eVar.f66291g, fVar3.f66301j, fVar.f7()), false, 0L, 30));
                    return;
                }
                Intrinsics.r("topLocationsCard");
                throw null;
        }
    }
}
