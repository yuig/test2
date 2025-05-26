package x91;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.unauth.sba.p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ni1.u0;
import ni1.y2;
import od1.n0;
import wr1.a1;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134318i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l82.c0 f134319j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(l82.c0 c0Var, int i13) {
        super(1);
        this.f134318i = i13;
        this.f134319j = c0Var;
    }

    public final ma1.w b(ma1.w it) {
        int i13 = this.f134318i;
        l82.c0 c0Var = this.f134319j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return ma1.w.b(it, (o82.j0) c0Var.f82213b);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f134318i;
        l82.c0 c0Var = this.f134319j;
        switch (i13) {
            case 0:
                k0 it = (k0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                o82.j0 multiSectionVMState = (o82.j0) c0Var.f82213b;
                zy.l0 pinalyticsVMState = it.f134329a;
                Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
                Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
                return new k0(pinalyticsVMState, multiSectionVMState);
            case 1:
                ma1.d it2 = (ma1.d) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        o82.a0 multiSectionDisplayState = (o82.a0) c0Var.f82212a;
                        it2.getClass();
                        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
                        return new ma1.d(multiSectionDisplayState);
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        o82.a0 multiSectionDisplayState2 = (o82.a0) c0Var.f82212a;
                        it2.getClass();
                        Intrinsics.checkNotNullParameter(multiSectionDisplayState2, "multiSectionDisplayState");
                        return new ma1.d(multiSectionDisplayState2);
                }
            case 2:
                return b((ma1.w) obj);
            case 3:
                ma1.d it3 = (ma1.d) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        o82.a0 multiSectionDisplayState3 = (o82.a0) c0Var.f82212a;
                        it3.getClass();
                        Intrinsics.checkNotNullParameter(multiSectionDisplayState3, "multiSectionDisplayState");
                        return new ma1.d(multiSectionDisplayState3);
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        o82.a0 multiSectionDisplayState4 = (o82.a0) c0Var.f82212a;
                        it3.getClass();
                        Intrinsics.checkNotNullParameter(multiSectionDisplayState4, "multiSectionDisplayState");
                        return new ma1.d(multiSectionDisplayState4);
                }
            case 4:
                return b((ma1.w) obj);
            case 5:
                kc1.n it4 = (kc1.n) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return kc1.n.e(it4, null, 0, null, (o82.a0) c0Var.f82212a, 7);
            case 6:
                kc1.u it5 = (kc1.u) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return kc1.u.b(it5, null, (o82.j0) c0Var.f82213b, 3);
            case 7:
                od1.b it6 = (od1.b) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return od1.b.e(it6, null, null, (o82.a0) c0Var.f82212a, RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE);
            case 8:
                n0 it7 = (n0) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return n0.b(it7, (o82.j0) c0Var.f82213b, null, 383);
            case 9:
                com.pinterest.feature.unauth.sba.i it8 = (com.pinterest.feature.unauth.sba.i) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                o82.a0 multiSectionDisplayState5 = (o82.a0) c0Var.f82212a;
                String title = it8.f48823a;
                Intrinsics.checkNotNullParameter(title, "title");
                String description = it8.f48824b;
                Intrinsics.checkNotNullParameter(description, "description");
                String interestOne = it8.f48825c;
                Intrinsics.checkNotNullParameter(interestOne, "interestOne");
                String interestTwo = it8.f48826d;
                Intrinsics.checkNotNullParameter(interestTwo, "interestTwo");
                String todayImageUrl = it8.f48827e;
                Intrinsics.checkNotNullParameter(todayImageUrl, "todayImageUrl");
                String imageUrlOne = it8.f48828f;
                Intrinsics.checkNotNullParameter(imageUrlOne, "imageUrlOne");
                String imageUrlTwo = it8.f48829g;
                Intrinsics.checkNotNullParameter(imageUrlTwo, "imageUrlTwo");
                String url = it8.f48830h;
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(multiSectionDisplayState5, "multiSectionDisplayState");
                return new com.pinterest.feature.unauth.sba.i(title, description, interestOne, interestTwo, todayImageUrl, imageUrlOne, imageUrlTwo, url, multiSectionDisplayState5);
            case 10:
                p0 it9 = (p0) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                o82.j0 multiSectionVMState2 = (o82.j0) c0Var.f82213b;
                String title2 = it9.f48849a;
                Intrinsics.checkNotNullParameter(title2, "title");
                String description2 = it9.f48850b;
                Intrinsics.checkNotNullParameter(description2, "description");
                String interestOne2 = it9.f48851c;
                Intrinsics.checkNotNullParameter(interestOne2, "interestOne");
                String interestTwo2 = it9.f48852d;
                Intrinsics.checkNotNullParameter(interestTwo2, "interestTwo");
                String todayImageUrl2 = it9.f48853e;
                Intrinsics.checkNotNullParameter(todayImageUrl2, "todayImageUrl");
                String imageUrlOne2 = it9.f48854f;
                Intrinsics.checkNotNullParameter(imageUrlOne2, "imageUrlOne");
                String imageUrlTwo2 = it9.f48855g;
                Intrinsics.checkNotNullParameter(imageUrlTwo2, "imageUrlTwo");
                String url2 = it9.f48856h;
                Intrinsics.checkNotNullParameter(url2, "url");
                Intrinsics.checkNotNullParameter(multiSectionVMState2, "multiSectionVMState");
                return new p0(title2, description2, interestOne2, interestTwo2, todayImageUrl2, imageUrlOne2, imageUrlTwo2, url2, multiSectionVMState2);
            case 11:
                wr1.q it10 = (wr1.q) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                return wr1.q.e(it10, null, null, null, (o82.a0) c0Var.f82212a, null, 23);
            case 12:
                a1 it11 = (a1) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                return a1.b(it11, null, (o82.j0) c0Var.f82213b, 11);
            case 13:
                r52.g it12 = (r52.g) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                return r52.g.e(it12, (o82.a0) c0Var.f82212a, null, false, 6);
            case 14:
                r52.d0 it13 = (r52.d0) obj;
                Intrinsics.checkNotNullParameter(it13, "it");
                return r52.d0.b(it13, (o82.j0) c0Var.f82213b, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
            case 15:
                v72.i sbaPinCollageDS = (v72.i) obj;
                Intrinsics.checkNotNullParameter(sbaPinCollageDS, "sbaPinCollageDS");
                return v72.i.e(sbaPinCollageDS, null, false, (u0) c0Var.f82212a, 3);
            case 16:
                v72.z pinRepVmState = (v72.z) obj;
                Intrinsics.checkNotNullParameter(pinRepVmState, "pinRepVmState");
                y2 pinRepViewModelState = (y2) c0Var.f82213b;
                String pinUid = pinRepVmState.f124459a;
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                Intrinsics.checkNotNullParameter(pinRepViewModelState, "pinRepViewModelState");
                return new v72.z(pinUid, pinRepVmState.f124460b, pinRepVmState.f124461c, pinRepVmState.f124462d, pinRepViewModelState);
            case 17:
                wc2.f webviewPinDS = (wc2.f) obj;
                Intrinsics.checkNotNullParameter(webviewPinDS, "webviewPinDS");
                return wc2.f.e(webviewPinDS, null, 0, (u0) c0Var.f82212a, 3);
            case 18:
                wc2.q webviewPinVMState = (wc2.q) obj;
                Intrinsics.checkNotNullParameter(webviewPinVMState, "webviewPinVMState");
                y2 pinRepVmState2 = (y2) c0Var.f82213b;
                String str = webviewPinVMState.f129147a;
                Intrinsics.checkNotNullParameter(pinRepVmState2, "pinRepVmState");
                return new wc2.q(str, webviewPinVMState.f129148b, pinRepVmState2);
            case 19:
                ad2.b it14 = (ad2.b) obj;
                Intrinsics.checkNotNullParameter(it14, "it");
                o82.a0 multiSectionDisplayState6 = (o82.a0) c0Var.f82212a;
                it14.getClass();
                Intrinsics.checkNotNullParameter(multiSectionDisplayState6, "multiSectionDisplayState");
                return new ad2.b(multiSectionDisplayState6);
            default:
                ad2.t it15 = (ad2.t) obj;
                Intrinsics.checkNotNullParameter(it15, "it");
                return ad2.t.b(it15, null, (o82.j0) c0Var.f82213b, 3);
        }
    }
}
