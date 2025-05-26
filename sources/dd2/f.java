package dd2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.k0;

/* loaded from: classes4.dex */
public final class f extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f54452j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f54453k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f54454l = new f(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f f54455m = new f(3);

    /* renamed from: n, reason: collision with root package name */
    public static final f f54456n = new f(4);

    /* renamed from: o, reason: collision with root package name */
    public static final f f54457o = new f(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54458i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f54458i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f54458i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, new k0(d.widget_upsell_try_it_button), false, null, null, null, null, null, null, 0, null, 1022);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, new k0(d.widget_upsell_first_button), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, new k0(d.widget_upsell_second_button), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1019);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f54458i) {
        }
        return b((yl1.b) obj);
    }
}
