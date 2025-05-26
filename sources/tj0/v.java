package tj0;

import com.pinterest.api.model.f30;
import com.pinterest.feature.board.common.newideas.view.OneTapSaveCarouselPinView;

/* loaded from: classes5.dex */
public final class v implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f30 f117897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vq0.h f117898c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f117899d;

    public /* synthetic */ v(vq0.h hVar, f30 f30Var, Object obj, int i13) {
        this.f117896a = i13;
        this.f117898c = hVar;
        this.f117897b = f30Var;
        this.f117899d = obj;
    }

    public final void a() {
        mj0.g gVar;
        mj0.g gVar2;
        int i13 = this.f117896a;
        f30 f30Var = this.f117897b;
        Object obj = this.f117899d;
        vq0.h hVar = this.f117898c;
        switch (i13) {
            case 0:
                w wVar = (w) hVar;
                int i14 = wVar.f117900a;
                Object obj2 = wVar.f117901b;
                switch (i14) {
                    case 0:
                        gVar = (mj0.g) obj2;
                        break;
                    default:
                        gVar = (mj0.g) obj2;
                        break;
                }
                gVar.l2(f30Var, ((OneTapSaveCarouselPinView) obj).getInternalCell());
                break;
            default:
                w wVar2 = (w) hVar;
                int i15 = wVar2.f117900a;
                Object obj3 = wVar2.f117901b;
                switch (i15) {
                    case 0:
                        gVar2 = (mj0.g) obj3;
                        break;
                    default:
                        gVar2 = (mj0.g) obj3;
                        break;
                }
                gVar2.l2(f30Var, ((d0) obj).getInternalCell());
                break;
        }
    }
}
