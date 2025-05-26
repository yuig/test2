package ks0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f80779j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f80780k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f80781l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f80782m = new c(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80783i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f80783i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f80783i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 1, null, rn1.b.END, null, null, false, 0, null, vn1.g.BODY_100, vn1.g.HEADING_700, null, null, false, null, null, 2072415);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, rn1.b.END, null, null, false, 0, null, vn1.g.BODY_100, vn1.g.UI_400, null, null, false, null, null, 2072447);
        }
    }

    public final yl1.b e(yl1.b it) {
        switch (this.f80783i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return yl1.b.f(it, null, false, fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f80783i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return e((yl1.b) obj);
            case 2:
                return e((yl1.b) obj);
            default:
                return b((rn1.a) obj);
        }
    }
}
