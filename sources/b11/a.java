package b11;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20963i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m60.w f20964j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(m60.w wVar, int i13) {
        super(0);
        this.f20963i = i13;
        this.f20964j = wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        m60.w wVar = this.f20964j;
        int i13 = this.f20963i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        wVar.d(new jc0.q(true));
                        break;
                    default:
                        wVar.d(new dc0.h(false));
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        wVar.d(new jc0.q(true));
                        break;
                    default:
                        wVar.d(new dc0.h(false));
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
