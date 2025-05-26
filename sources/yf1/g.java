package yf1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f138972j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f138973k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f138974l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f138975m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f138976n = new g(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138977i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f138977i = i13;
    }

    public final ao1.b b(ao1.b it) {
        switch (this.f138977i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, null, bs1.c.j2(new String[0], dq1.f.idea_pin_satisfied_feedback_hint), null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194287);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, null, bs1.c.j2(new String[0], dq1.f.pin_unsatisfied_feedback_hint), null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194287);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f138977i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f138977i) {
            case 0:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, q.ARROW_BACK, null, om1.f.TRANSPARENT_DARK_GRAY, null, null, false, 0, 1018);
            case 1:
                return e((rn1.a) obj);
            case 2:
                return b((ao1.b) obj);
            case 3:
                return e((rn1.a) obj);
            default:
                return b((ao1.b) obj);
        }
    }
}
