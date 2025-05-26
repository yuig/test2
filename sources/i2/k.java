package i2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f71141j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f71142k = new k(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71143i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(2);
        this.f71143i = i13;
    }

    public final void b(o oVar, int i13) {
        switch (this.f71143i) {
            case 0:
                if ((i13 & 3) == 2) {
                    s sVar = (s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                break;
            default:
                if ((i13 & 3) == 2) {
                    s sVar2 = (s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f71143i) {
            case 0:
                b((o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
