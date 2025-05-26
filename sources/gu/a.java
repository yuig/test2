package gu;

import com.pinterest.ads.feature.owc.view.leadgen.bottomSheet.AdsLeadGenSuccessView;
import gm1.c;
import kotlin.jvm.internal.Intrinsics;
import nt.z;
import u50.r;
import z91.f;
import z91.w;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f66121b;

    public /* synthetic */ a(r rVar, int i13) {
        this.f66120a = i13;
        this.f66121b = rVar;
    }

    @Override // gm1.a
    public final void h3(c it) {
        int i13 = this.f66120a;
        r eventIntake = this.f66121b;
        switch (i13) {
            case 0:
                int i14 = AdsLeadGenSuccessView.f35376d;
                Intrinsics.checkNotNullParameter(it, "it");
                if (eventIntake != null) {
                    eventIntake.a(z.f92245d);
                    break;
                }
                break;
            case 1:
                int i15 = w.f141404d;
                Intrinsics.checkNotNullParameter(eventIntake, "$eventIntake");
                Intrinsics.checkNotNullParameter(it, "it");
                eventIntake.a(f.f141368a);
                break;
            default:
                int i16 = w.f141404d;
                Intrinsics.checkNotNullParameter(eventIntake, "$eventIntake");
                Intrinsics.checkNotNullParameter(it, "it");
                eventIntake.a(aa1.f.f1651a);
                break;
        }
    }
}
