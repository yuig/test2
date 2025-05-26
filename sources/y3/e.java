package y3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f136704j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f136705k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f136706l = new e(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136707i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f136707i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f136707i;
        switch (i13) {
            case 0:
                ((Number) obj).longValue();
                return Unit.f80348a;
            case 1:
                n nVar = (n) obj;
                switch (i13) {
                    case 1:
                        return Integer.valueOf(nVar.f136730b);
                    default:
                        n4.i iVar = nVar.f136731c;
                        return Integer.valueOf(iVar.f89185d - iVar.f89183b);
                }
            default:
                n nVar2 = (n) obj;
                switch (i13) {
                    case 1:
                        return Integer.valueOf(nVar2.f136730b);
                    default:
                        n4.i iVar2 = nVar2.f136731c;
                        return Integer.valueOf(iVar2.f89185d - iVar2.f89183b);
                }
        }
    }
}
