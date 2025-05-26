package s3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f110765j = new e(1);

    /* renamed from: k, reason: collision with root package name */
    public static final e f110766k = new e(2);

    /* renamed from: l, reason: collision with root package name */
    public static final e f110767l = new e(3);

    /* renamed from: m, reason: collision with root package name */
    public static final e f110768m = new e(4);

    /* renamed from: n, reason: collision with root package name */
    public static final e f110769n = new e(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110770i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f110770i = i13;
    }

    public final void b(b bVar) {
        switch (this.f110770i) {
            case 2:
                bVar.c().f110726d = false;
                break;
            case 3:
                bVar.c().f110727e = bVar.c().f110726d;
                break;
            default:
                bVar.c().f110725c = false;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f110770i;
        switch (i13) {
            case 0:
                d dVar = (d) obj;
                switch (i13) {
                    case 0:
                        dVar.getClass();
                        com.bumptech.glide.c.k0(dVar);
                        break;
                    default:
                        dVar.P0();
                        break;
                }
                return Unit.f80348a;
            case 1:
                d dVar2 = (d) obj;
                switch (i13) {
                    case 0:
                        dVar2.getClass();
                        com.bumptech.glide.c.k0(dVar2);
                        break;
                    default:
                        dVar2.P0();
                        break;
                }
                return Unit.f80348a;
            case 2:
                b((b) obj);
                return Unit.f80348a;
            case 3:
                b((b) obj);
                return Unit.f80348a;
            case 4:
                b((b) obj);
                return Unit.f80348a;
            default:
                Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((b2) obj).X());
        }
    }
}
