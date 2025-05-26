package gk1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.dd;

/* loaded from: classes2.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65257i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l82.e f65258j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i13, l82.e eVar) {
        super(0);
        this.f65257i = i13;
        this.f65258j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a aVar = a.f65212a;
        dd ddVar = dd.f113393a;
        l82.e eVar = this.f65258j;
        int i13 = this.f65257i;
        switch (i13) {
            case 0:
                break;
            case 1:
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        eVar.a(aVar);
                        break;
                    default:
                        eVar.a(new g0(ddVar));
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        eVar.a(aVar);
                        break;
                    default:
                        eVar.a(new g0(ddVar));
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
