package jh0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f76209i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f76210j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f76211k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(b bVar, e eVar, int i13) {
        super(0);
        this.f76209i = i13;
        this.f76210j = bVar;
        this.f76211k = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        e eVar = this.f76211k;
        b bVar = this.f76210j;
        int i13 = this.f76209i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        bVar.getClass();
                        eVar.f76214a.a(null, null);
                        ha.a aVar = eVar.f76215b;
                        if (aVar == null) {
                            Intrinsics.r("gestaltPopoverOverlay");
                            throw null;
                        }
                        aVar.d();
                        break;
                    default:
                        bVar.getClass();
                        break;
                }
                return Unit.f80348a;
            default:
                switch (i13) {
                    case 0:
                        bVar.getClass();
                        eVar.f76214a.a(null, null);
                        ha.a aVar2 = eVar.f76215b;
                        if (aVar2 == null) {
                            Intrinsics.r("gestaltPopoverOverlay");
                            throw null;
                        }
                        aVar2.d();
                        break;
                    default:
                        bVar.getClass();
                        break;
                }
                return Unit.f80348a;
        }
    }
}
