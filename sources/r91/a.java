package r91;

import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import nx.d0;
import nx.j0;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106881i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f106882j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(j0 j0Var, int i13) {
        super(0);
        this.f106881i = i13;
        this.f106882j = j0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f106881i) {
            case 0:
                m243invoke();
                break;
            default:
                m243invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m243invoke() {
        switch (this.f106881i) {
            case 0:
                d0.B(this.f106882j, f1.UNIDIRECTIONAL_PASSCODE_CANCELED, null, null, null, 30);
                break;
            default:
                d0.B(this.f106882j, f1.VIEW, null, null, null, 30);
                break;
        }
    }
}
