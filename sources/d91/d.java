package d91;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54055i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f54056j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(0);
        this.f54055i = i13;
        this.f54056j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f54055i) {
            case 0:
                m128invoke();
                break;
            default:
                m128invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m128invoke() {
        int i13 = this.f54055i;
        e eVar = this.f54056j;
        switch (i13) {
            case 0:
                a91.b bVar = eVar.f54065i;
                if (bVar != null) {
                    x20.a aVar = eVar.f54061e;
                    if (aVar != null) {
                        bVar.r3(aVar);
                        return;
                    } else {
                        Intrinsics.r("tryOnService");
                        throw null;
                    }
                }
                return;
            default:
                a91.b bVar2 = eVar.f54065i;
                if (bVar2 != null) {
                    if (bVar2.isBound()) {
                        bVar2.f1568b = true;
                        ((e) bVar2.getView()).a();
                        return;
                    } else {
                        bVar2.p3();
                        return;
                    }
                }
                return;
        }
    }
}
