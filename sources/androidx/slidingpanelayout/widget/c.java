package androidx.slidingpanelayout.widget;

import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import do2.i;
import do2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nt.f1;

/* loaded from: classes3.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f19789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19790c;

    public /* synthetic */ c(i iVar, Object obj, int i13) {
        this.f19788a = i13;
        this.f19789b = iVar;
        this.f19790c = obj;
    }

    @Override // do2.i
    public final Object collect(j jVar, bl2.c cVar) {
        int i13 = this.f19788a;
        i iVar = this.f19789b;
        Object obj = this.f19790c;
        switch (i13) {
            case 0:
                Object collect = iVar.collect(new o1.f(5, jVar, (m.h) obj), cVar);
                if (collect != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = iVar.collect(new o1.f(6, jVar, (pc.f) obj), cVar);
                if (collect2 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = iVar.collect(new o1.f(7, jVar, (bd.d) obj), cVar);
                if (collect3 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = iVar.collect(new o1.f(9, jVar, (SbaAdsLeadGenExpandView) obj), cVar);
                if (collect4 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = iVar.collect(new o1.f(10, jVar, (f1) obj), cVar);
                if (collect5 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = iVar.collect(new o1.f(11, jVar, (String) obj), cVar);
                if (collect6 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = iVar.collect(new o1.f(12, jVar, (d6.g) obj), cVar);
                if (collect7 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect8 = iVar.collect(new o1.f(21, jVar, (Function2) obj), cVar);
                if (collect8 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
