package av;

import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.ads.feature.owc.view.story.AdsStoryScrollingModule;
import cu.i;
import i32.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.s0;
import ur0.g;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lav/d;", "Lcu/m;", "Lbu/b;", "Lav/a;", "Ljt/b;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends f<bu.b, a> implements jt.b {
    public static final /* synthetic */ int G0 = 0;
    public s0 A0;
    public kt.a B0;
    public jt.a C0;
    public final v D0 = m.b(new b(this, 2));
    public final v E0 = m.b(new b(this, 0));
    public final v F0 = m.b(new b(this, 1));

    @Override // av.f, yk1.k
    public final yk1.m V7() {
        s0 s0Var = this.A0;
        if (s0Var != null) {
            return (bu.b) g8(new c(s0Var));
        }
        Intrinsics.r("adsStoryPresenterFactory");
        throw null;
    }

    @Override // cu.m
    public final void Y7() {
        jt.a aVar = this.C0;
        if (aVar != null) {
            String str = (String) this.D0.getValue();
            Intrinsics.checkNotNullExpressionValue(str, "<get-storyPinId>(...)");
            ((bu.b) aVar).G3(str);
        }
    }

    @Override // cu.m
    public final i a8() {
        return (a) this.E0.getValue();
    }

    @Override // cu.m
    public final BaseAdsScrollingModule d8() {
        return (AdsStoryScrollingModule) this.F0.getValue();
    }

    @Override // at.b
    public final void z6(y0 placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        g.d(placement, this, null);
    }
}
