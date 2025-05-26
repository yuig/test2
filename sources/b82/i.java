package b82;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import lh0.g1;

/* loaded from: classes4.dex */
public final class i extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22191i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f22192j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, int i13) {
        super(0);
        this.f22191i = i13;
        this.f22192j = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f22191i) {
            case 0:
                m73invoke();
                break;
            case 1:
                m73invoke();
                break;
            default:
                m73invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m73invoke() {
        int i13 = this.f22191i;
        k kVar = this.f22192j;
        switch (i13) {
            case 0:
                ((g1) kVar.i().f83401a).c("android_collage_ads_beta");
                break;
            case 1:
                ((g1) kVar.i().f83401a).c("android_collage_ads_single_destination");
                break;
            default:
                kVar.f22218z = true;
                break;
        }
    }
}
