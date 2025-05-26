package im1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class m extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final m f72664j = new m(0);

    /* renamed from: k, reason: collision with root package name */
    public static final m f72665k = new m(1);

    /* renamed from: l, reason: collision with root package name */
    public static final m f72666l = new m(2);

    /* renamed from: m, reason: collision with root package name */
    public static final m f72667m = new m(3);

    /* renamed from: n, reason: collision with root package name */
    public static final m f72668n = new m(4);

    /* renamed from: o, reason: collision with root package name */
    public static final m f72669o = new m(5);

    /* renamed from: p, reason: collision with root package name */
    public static final m f72670p = new m(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72671i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i13) {
        super(1);
        this.f72671i = i13;
    }

    public final void b(Unit it) {
        switch (this.f72671i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f72671i) {
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
                b((Unit) obj);
                break;
            case 5:
                ((Boolean) obj).getClass();
                break;
            default:
                b((Unit) obj);
                break;
        }
        return Unit.f80348a;
    }
}
