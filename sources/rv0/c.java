package rv0;

import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.w;
import xk2.o;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110092i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f110093j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(1);
        this.f110092i = i13;
        this.f110093j = eVar;
    }

    public final void b(int i13) {
        hg1.b bVar;
        hg1.d dVar;
        int i14 = this.f110092i;
        e eVar = this.f110093j;
        int i15 = 0;
        switch (i14) {
            case 0:
                hg1.b.Companion.getClass();
                hg1.b[] values = hg1.b.values();
                int length = values.length;
                while (true) {
                    if (i15 < length) {
                        bVar = values[i15];
                        if (bVar.ordinal() != i13) {
                            i15++;
                        }
                    } else {
                        bVar = null;
                    }
                }
                int i16 = bVar != null ? b.f110091a[bVar.ordinal()] : -1;
                if (i16 == 1) {
                    eVar.f110098d.X(u0.FEEDBACK_OPTION);
                    w wVar = eVar.f110099e;
                    if (wVar == null) {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                    a.c.y(wVar);
                    eVar.f110097c.M2(bVar);
                    return;
                }
                if (i16 != 2) {
                    return;
                }
                eVar.f110098d.X(u0.HELP_CENTER_OPTION);
                w wVar2 = eVar.f110099e;
                if (wVar2 == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                a.c.y(wVar2);
                eVar.f110097c.M2(bVar);
                return;
            default:
                hg1.d.Companion.getClass();
                hg1.d[] values2 = hg1.d.values();
                int length2 = values2.length;
                while (true) {
                    if (i15 < length2) {
                        dVar = values2[i15];
                        if (dVar.ordinal() != i13) {
                            i15++;
                        }
                    } else {
                        dVar = null;
                    }
                }
                switch (dVar != null ? d.f110094a[dVar.ordinal()] : -1) {
                    case -1:
                        throw new o(null, 1, null);
                    case 0:
                    default:
                        return;
                    case 1:
                        eVar.f110098d.X(u0.HOW_TO_CREATE_PINS_OPTION);
                        e.a(eVar, dVar);
                        return;
                    case 2:
                        eVar.f110098d.X(u0.BEST_PRACTICES_SITE_OPTION);
                        e.a(eVar, dVar);
                        return;
                    case 3:
                        eVar.f110098d.X(u0.STORY_PIN_EXAMPLES_OPTION);
                        e.a(eVar, dVar);
                        return;
                    case 4:
                        eVar.f110098d.X(u0.CREATOR_RESOURCES_OPTION);
                        e.a(eVar, dVar);
                        return;
                    case 5:
                        eVar.f110098d.X(u0.CREATOR_CODE_OPTION);
                        e.a(eVar, dVar);
                        return;
                    case 6:
                        eVar.f110098d.X(u0.BEST_PRACTICES_IN_PRODUCT_OPTION);
                        e.a(eVar, dVar);
                        return;
                    case 7:
                        eVar.f110098d.X(u0.ANALYTICS_HELP_CENTER_OPTION);
                        e.a(eVar, dVar);
                        return;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f110092i) {
            case 0:
                b(((Number) obj).intValue());
                break;
            default:
                b(((Number) obj).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
