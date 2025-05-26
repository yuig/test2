package ji0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f76250j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f76251k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f76252l = new f(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f f76253m = new f(3);

    /* renamed from: n, reason: collision with root package name */
    public static final f f76254n = new f(4);

    /* renamed from: o, reason: collision with root package name */
    public static final f f76255o = new f(5);

    /* renamed from: p, reason: collision with root package name */
    public static final f f76256p = new f(6);

    /* renamed from: q, reason: collision with root package name */
    public static final f f76257q = new f(7);

    /* renamed from: r, reason: collision with root package name */
    public static final f f76258r = new f(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f76259i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f76259i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f76259i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1019);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.f85950ok), false, null, null, null, null, null, null, 0, null, 1022);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.reset_password), false, null, null, null, null, null, null, 0, null, 1022);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.login_with_gplus), false, null, null, null, null, null, null, 0, null, 1022);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.login_with_facebook), false, null, null, null, null, null, null, 0, null, 1022);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
            case 6:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1019);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f76259i) {
            case 6:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return b((yl1.b) obj);
    }
}
