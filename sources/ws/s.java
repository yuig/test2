package ws;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends ru.b {
    public final /* synthetic */ int G0;
    public final u50.r H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet, int i13, mq.z eventIntake, l82.c eventIntakeLeadGen, int i14) {
        super(context, attributeSet, i13, eventIntake);
        this.G0 = i14;
        if (i14 != 1) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
            Intrinsics.checkNotNullParameter(eventIntakeLeadGen, "eventIntakeCarting");
            this.H0 = eventIntakeLeadGen;
            this.f35327n0 = new r();
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(eventIntakeLeadGen, "eventIntakeLeadGen");
        super(context, attributeSet, i13, eventIntake);
        this.H0 = eventIntakeLeadGen;
        this.f35327n0 = new mt.t(eventIntake, this);
    }

    @Override // ru.b, com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void K1() {
        int i13 = this.G0;
        u50.r rVar = this.H0;
        switch (i13) {
            case 0:
                rVar.a(new e(System.currentTimeMillis() * 1000000));
                break;
            default:
                rVar.a(new mt.e(System.currentTimeMillis() * 1000000));
                break;
        }
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void O1() {
        int i13 = this.G0;
        u50.r rVar = this.H0;
        switch (i13) {
            case 0:
                rVar.a(new g(System.currentTimeMillis() * 1000000));
                break;
            default:
                rVar.a(new mt.h(System.currentTimeMillis() * 1000000));
                break;
        }
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    /* renamed from: s1 */
    public final boolean getA0() {
        return false;
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final boolean y1() {
        switch (this.G0) {
            case 0:
                if (n1().f35422i <= this.f35322i0) {
                    break;
                }
                break;
            default:
                if (n1().f35422i <= this.f35322i0) {
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Context context, mq.z zVar, l82.c cVar, int i13) {
        this(context, null, 0, zVar, cVar, 0);
        this.G0 = i13;
        if (i13 != 1) {
        } else {
            this(context, null, 0, zVar, cVar, 1);
        }
    }
}
