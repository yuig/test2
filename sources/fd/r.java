package fd;

import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import kotlin.Unit;
import nt.f1;

/* loaded from: classes3.dex */
public final class r implements do2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ do2.i f61800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61801c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f61802d;

    public /* synthetic */ r(do2.i iVar, Object obj, Object obj2, int i13) {
        this.f61799a = i13;
        this.f61800b = iVar;
        this.f61801c = obj;
        this.f61802d = obj2;
    }

    @Override // do2.i
    public final Object collect(do2.j jVar, bl2.c cVar) {
        int i13 = this.f61799a;
        do2.i iVar = this.f61800b;
        Object obj = this.f61802d;
        Object obj2 = this.f61801c;
        switch (i13) {
            case 0:
                Object collect = iVar.collect(new q(jVar, (pc.f) obj2, (bd.d) obj, 0), cVar);
                if (collect != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = iVar.collect(new q(jVar, (SbaAdsLeadGenExpandView) obj2, (f1) obj, 1), cVar);
                if (collect2 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect3 = iVar.collect(new q(jVar, (by1.i) obj2, (u50.r) obj, 5), cVar);
                if (collect3 != cl2.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
