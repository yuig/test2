package ti1;

import android.content.Context;
import android.graphics.Rect;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ua2.b1;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117754i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SbaPinRep f117755j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(SbaPinRep sbaPinRep, int i13) {
        super(0);
        this.f117754i = i13;
        this.f117755j = sbaPinRep;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        q legacyGestureListener;
        u50.r rVar;
        u50.r rVar2;
        p pVar;
        u50.r rVar3;
        int i13 = this.f117754i;
        int i14 = 2;
        SbaPinRep pinRepView = this.f117755j;
        switch (i13) {
            case 0:
                return new kj1.f(pinRepView, pinRepView.getImageCache());
            case 1:
                Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
                qj1.a aVar = new qj1.a(pinRepView);
                aVar.f104017n = bs1.c.W(pinRepView, wy1.b.grid_cell_expand_tappable_size);
                aVar.f104018o = new Rect();
                w eventIntake = new w(pinRepView, 0);
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                return aVar;
            case 2:
                return new bj1.a(pinRepView);
            case 3:
                return new jj1.c(pinRepView);
            case 4:
                Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
                return new rj1.a(pinRepView);
            case 5:
                Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
                return new nj1.b(pinRepView, b1.FIXED);
            case 6:
                return new lj1.a(pinRepView);
            case 7:
                Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
                return new tj1.a(pinRepView);
            case 8:
                return new oj1.b(pinRepView);
            case 9:
                return new yj1.a(pinRepView);
            case 10:
                uj1.a aVar2 = new uj1.a(pinRepView);
                w eventIntake2 = new w(pinRepView, i14);
                Intrinsics.checkNotNullParameter(eventIntake2, "eventIntake");
                return aVar2;
            case 11:
                Context context = pinRepView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                legacyGestureListener = pinRepView.getLegacyGestureListener();
                y92.c cVar = new y92.c(context, legacyGestureListener);
                cVar.f138290e = 200;
                return cVar;
            case 12:
                rVar = pinRepView.eventIntake;
                return rVar;
            case 13:
                Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
                pj1.a aVar3 = new pj1.a(pinRepView);
                v eventIntake3 = new v(pinRepView, 12);
                Intrinsics.checkNotNullParameter(eventIntake3, "eventIntake");
                return aVar3;
            case 14:
                m60.w eventManager = pinRepView.getEventManager();
                rVar2 = pinRepView.eventIntake;
                pVar = pinRepView.legacyGestureContract;
                return new q(eventManager, rVar2, pVar, pinRepView.getExperiments());
            case 15:
                SbaPinRep sbaPinRep = this.f117755j;
                return new zj1.a(sbaPinRep, new z(0, sbaPinRep, SbaPinRep.class, "getViewBasedConstructorArgs", "getViewBasedConstructorArgs()Lcom/pinterest/featurelibrary/pingridcell/sba/zones/trailingaccessory/TrailingAccessoryZoneEvent$ViewBasedConstructorArgs;", 0));
            case 16:
                return new zi1.b(pinRepView, pinRepView.getImageCache());
            case 17:
                rVar3 = pinRepView.eventIntake;
                return new yi1.s(pinRepView, new ri1.b(rVar3, i14), pinRepView.getImageCache());
            case 18:
                Context context2 = pinRepView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new hj1.a(pinRepView, context2, rm1.c.DEFAULT);
            case 19:
                Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
                fj1.b bVar = new fj1.b(pinRepView);
                bVar.f62245n = fj1.a.END;
                return bVar;
            case 20:
                Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
                return new gj1.a(pinRepView);
            case 21:
                return new dj1.b(pinRepView);
            case 22:
                return new sa2.c(pinRepView, pinRepView.getImageCache(), new w(pinRepView, 3));
            default:
                return new xj1.a(pinRepView);
        }
    }
}
