package zz1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f143202j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f143203k = new k(1);

    /* renamed from: l, reason: collision with root package name */
    public static final k f143204l = new k(2);

    /* renamed from: m, reason: collision with root package name */
    public static final k f143205m = new k(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f143206i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(1);
        this.f143206i = i13;
    }

    public final ao1.b b(ao1.b it) {
        switch (this.f143206i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return ao1.b.e(it, null, null, null, null, null, false, 0, 0, 0, false, false, false, fm1.c.GONE, false, null, null, null, null, null, 0, 4186111);
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f143206i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], yz1.c.gbl_urgent_confirm_email), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], yz1.c.gbl_urgent_copy_header), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f143206i) {
            case 0:
                return e((rn1.a) obj);
            case 1:
                return b((ao1.b) obj);
            case 2:
                return b((ao1.b) obj);
            default:
                return e((rn1.a) obj);
        }
    }
}
