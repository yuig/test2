package q91;

import h32.a4;
import h32.d4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103172i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f103173j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, int i13) {
        super(0);
        this.f103172i = i13;
        this.f103173j = uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f103172i) {
            case 0:
                m239invoke();
                break;
            default:
                m239invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m239invoke() {
        int i13 = this.f103172i;
        u uVar = this.f103173j;
        switch (i13) {
            case 0:
                uVar.s7().t(new h32.i0(d4.SETTINGS, a4.SETTINGS_CONFIRM_EMAIL_CHANGE_MODAL, null, null, null, h32.u0.OKAY_BUTTON), null, null, h32.f1.TAP, null, null, false);
                break;
            default:
                uVar.s7().t(new h32.i0(d4.SETTINGS, a4.SETTINGS_CONFIRM_EMAIL_CHANGE_MODAL, null, null, null, null), null, null, h32.f1.VIEW, null, null, false);
                break;
        }
    }
}
