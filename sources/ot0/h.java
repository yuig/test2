package ot0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import tb0.p;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97525i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f97526j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i13) {
        super(1);
        this.f97525i = i13;
        this.f97526j = iVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f97525i;
        i iVar = this.f97526j;
        switch (i13) {
            case 0:
                i92.k kVar = iVar.C0;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar.k(x0.oops_something_went_wrong);
                iVar.b6().q(th3, "Error getting storyPinLocalData while selecting from BoardStickerPickerFragment", p.IDEA_PINS_CREATION);
                return;
            default:
                i92.k kVar2 = iVar.C0;
                if (kVar2 == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar2.k(x0.oops_something_went_wrong);
                iVar.b6().q(th3, "Error getting board while selecting from BoardStickerPickerFragment", p.IDEA_PINS_CREATION);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f97525i) {
            case 0:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
