package m90;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import o82.m3;

/* loaded from: classes5.dex */
public final /* synthetic */ class y implements m3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6.b f86713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f86714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es.a f86715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es.h f86716e;

    public /* synthetic */ y(j6.b bVar, n1 n1Var, es.a aVar, es.h hVar, int i13) {
        this.f86712a = i13;
        this.f86713b = bVar;
        this.f86714c = n1Var;
        this.f86715d = aVar;
        this.f86716e = hVar;
    }

    @Override // o82.m3
    public final int a(int i13, l82.i0 i0Var) {
        int a13;
        int a14;
        int a15;
        switch (this.f86712a) {
            case 0:
                k1 item = (k1) i0Var;
                j6.b autoplayQualifier = this.f86713b;
                Intrinsics.checkNotNullParameter(autoplayQualifier, "$autoplayQualifier");
                n1 experiments = this.f86714c;
                Intrinsics.checkNotNullParameter(experiments, "$experiments");
                es.a adFormats = this.f86715d;
                Intrinsics.checkNotNullParameter(adFormats, "$adFormats");
                es.h adsCommonDisplay = this.f86716e;
                Intrinsics.checkNotNullParameter(adsCommonDisplay, "$adsCommonDisplay");
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof j1) {
                    j1 j1Var = (j1) item;
                    a13 = nr0.q.f91882a.a(j1Var.f86667a, i13, a0.a().f103256a.e(), autoplayQualifier, experiments, null, null, adFormats, adsCommonDisplay);
                    return a0.f86617a.contains(Integer.valueOf(a13)) ? a13 : pk.a0.j0(j1Var.f86667a);
                }
                if (item instanceof i1) {
                    return 4444;
                }
                if (item instanceof f1) {
                    return 5555;
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                p90.d1 item2 = (p90.d1) i0Var;
                Set set = p90.y.f99247a;
                j6.b autoplayQualifier2 = this.f86713b;
                Intrinsics.checkNotNullParameter(autoplayQualifier2, "$autoplayQualifier");
                n1 experiments2 = this.f86714c;
                Intrinsics.checkNotNullParameter(experiments2, "$experiments");
                es.a adFormats2 = this.f86715d;
                Intrinsics.checkNotNullParameter(adFormats2, "$adFormats");
                es.h adsCommonDisplay2 = this.f86716e;
                Intrinsics.checkNotNullParameter(adsCommonDisplay2, "$adsCommonDisplay");
                Intrinsics.checkNotNullParameter(item2, "item");
                if (!(item2 instanceof p90.c1)) {
                    throw new NoWhenBranchMatchedException();
                }
                a14 = nr0.q.f91882a.a(((p90.c1) item2).f99179a, i13, p90.y.a().f103256a.e(), autoplayQualifier2, experiments2, null, null, adFormats2, adsCommonDisplay2);
                if (p90.y.f99247a.contains(Integer.valueOf(a14))) {
                    return a14;
                }
                return 1;
            default:
                ea0.a0 item3 = (ea0.a0) i0Var;
                Set set2 = ea0.v.f58002a;
                j6.b autoplayQualifier3 = this.f86713b;
                Intrinsics.checkNotNullParameter(autoplayQualifier3, "$autoplayQualifier");
                n1 experiments3 = this.f86714c;
                Intrinsics.checkNotNullParameter(experiments3, "$experiments");
                es.a adFormats3 = this.f86715d;
                Intrinsics.checkNotNullParameter(adFormats3, "$adFormats");
                es.h adsCommonDisplay3 = this.f86716e;
                Intrinsics.checkNotNullParameter(adsCommonDisplay3, "$adsCommonDisplay");
                Intrinsics.checkNotNullParameter(item3, "item");
                if (item3 instanceof ea0.z) {
                    return 4444;
                }
                if (!(item3 instanceof ea0.w)) {
                    throw new NoWhenBranchMatchedException();
                }
                ea0.w wVar = (ea0.w) item3;
                a15 = nr0.q.f91882a.a(wVar.f58003a, i13, ea0.v.c().f103256a.e(), autoplayQualifier3, experiments3, null, null, adFormats3, adsCommonDisplay3);
                return ea0.v.f58002a.contains(Integer.valueOf(a15)) ? a15 : pk.a0.j0(wVar.f58003a);
        }
    }
}
