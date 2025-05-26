package om1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f96631j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f96632k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f96633l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f96634m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f96635n = new a(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96636i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f96636i = i13;
    }

    public final c b(c it) {
        switch (this.f96636i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return c.e(it, null, null, null, fm1.c.GONE, null, false, 0, 1015);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return c.e(it, null, null, null, fm1.c.INVISIBLE, null, false, 0, 1015);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return c.e(it, null, null, null, fm1.c.VISIBLE, null, false, 0, 1015);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f96636i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, vn1.g.UI_100, 0, null, null, null, null, false, v.icon_button_label, null, null, null, null, null, false, null, null, 2095087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f96636i) {
        }
        return e((rn1.a) obj);
    }
}
