package im1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class l extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f72657j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f72658k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f72659l = new l(2);

    /* renamed from: m, reason: collision with root package name */
    public static final l f72660m = new l(3);

    /* renamed from: n, reason: collision with root package name */
    public static final l f72661n = new l(4);

    /* renamed from: o, reason: collision with root package name */
    public static final l f72662o = new l(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72663i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f72663i = i13;
    }

    public final void b(Unit it) {
        switch (this.f72663i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f72663i) {
            case 0:
                b((Unit) obj);
                break;
            case 1:
                b((Unit) obj);
                break;
            case 2:
                b((Unit) obj);
                break;
            case 3:
                b((Unit) obj);
                break;
            case 4:
                ((Number) obj).intValue();
                break;
            case 5:
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
