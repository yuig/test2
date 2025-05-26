package sq;

import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f114954j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f114955k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f114956l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f114957m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f114958n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f114959o = new a(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f114960i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f114960i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f114960i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.BOLD), vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097127);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2096895);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2096895);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], n80.f.pin_attribution_you_saved_pin), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096127);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f114960i) {
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
            default:
                return Unit.f80348a;
        }
    }
}
