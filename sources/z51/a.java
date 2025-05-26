package z51;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f140856j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f140857k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f140858l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f140859m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f140860n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f140861o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f140862p = new a(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140863i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f140863i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f140863i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, new rm1.d(new rm1.f(q.CLOCK), rm1.c.DEFAULT, null, 0, null, 28), false, 0, null, null, null, null, null, false, null, null, 2096639);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.INVERSE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.INVERSE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.SUBTLE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                List b13 = e0.b(vn1.b.CENTER_HORIZONTAL);
                return rn1.a.y(it, bs1.c.j2(new String[0], q22.c.scheduled_pin_feed_empty_state_title), vn1.c.SUBTLE, b13, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097144);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f140863i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return b((rn1.a) obj);
            case 3:
                return b((rn1.a) obj);
            case 4:
                return b((rn1.a) obj);
            case 5:
                return b((rn1.a) obj);
            default:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], q22.c.scheduled_pin_feed_empty_state_button_label), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }
}
