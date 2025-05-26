package rx0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rn1.k;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f110178j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f110179k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f110180l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f110181m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f110182n = new b(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b f110183o = new b(5);

    /* renamed from: p, reason: collision with root package name */
    public static final b f110184p = new b(6);

    /* renamed from: q, reason: collision with root package name */
    public static final b f110185q = new b(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110186i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f110186i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f110186i) {
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
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, vn1.c.DARK, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f110186i) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
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
            case 6:
                return b((rn1.a) obj);
            default:
                k bind = (k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.e(zu1.e.news_hub_empty_state_secondary_text_unified_inbox_calico);
                bind.b(vn1.c.SUBTLE);
                return Unit.f80348a;
        }
    }
}
