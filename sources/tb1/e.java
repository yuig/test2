package tb1;

import h32.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117132i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f117133j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, int i13) {
        super(0);
        this.f117132i = i13;
        this.f117133j = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f117132i;
        h hVar = this.f117133j;
        switch (i13) {
            case 0:
                int i14 = d.f117131a[hVar.f117149s0.ordinal()];
                if (i14 == 1) {
                    return g0.PASSCODE_REQUIRED_MODAL;
                }
                if (i14 == 2) {
                    return g0.PARENTAL_PASSCODE_DISABLING;
                }
                throw new NoWhenBranchMatchedException();
            default:
                return Float.valueOf(hVar.getResources().getDimension(c52.a.settings_header_elevation));
        }
    }
}
