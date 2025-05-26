package s71;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111363i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f111364j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(l lVar, int i13) {
        super(1);
        this.f111363i = i13;
        this.f111364j = lVar;
    }

    public final rm1.d b(rm1.d displayState) {
        int i13 = this.f111363i;
        l lVar = this.f111364j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                return rm1.d.e(displayState, new rm1.f(lVar.f111380i, lVar.f111381j), null, null, 0, null, 30);
            default:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                return rm1.d.e(displayState, null, lVar.f111377f ? rm1.c.DEFAULT : rm1.c.DARK, null, 0, null, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f111363i) {
        }
        return b((rm1.d) obj);
    }
}
