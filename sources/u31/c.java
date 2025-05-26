package u31;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f120154j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f120155k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f120156l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f120157m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f120158n = new c(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120159i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f120159i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f120159i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], nz1.f.profile_section_your_pins), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], nz1.f.no_pins_yet), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], nz1.f.inspire_with_a_pin), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f120159i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return b((rn1.a) obj);
            case 3:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], nz1.f.empty_state_create_idea_pin), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            default:
                return Unit.f80348a;
        }
    }
}
