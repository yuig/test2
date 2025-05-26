package l81;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f82121j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f82122k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f82123l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f82124m = new e(3);

    /* renamed from: n, reason: collision with root package name */
    public static final e f82125n = new e(4);

    /* renamed from: o, reason: collision with root package name */
    public static final e f82126o = new e(5);

    /* renamed from: p, reason: collision with root package name */
    public static final e f82127p = new e(6);

    /* renamed from: q, reason: collision with root package name */
    public static final e f82128q = new e(7);

    /* renamed from: r, reason: collision with root package name */
    public static final e f82129r = new e(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82130i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f82130i = i13;
    }

    public final om1.c b(om1.c it) {
        switch (this.f82130i) {
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
            case 5:
            case 6:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return om1.c.e(it, null, null, null, fm1.c.VISIBLE, null, false, 0, 1015);
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f82130i) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f82130i) {
        }
        return b((om1.c) obj);
    }
}
