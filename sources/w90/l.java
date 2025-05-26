package w90;

import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f128561j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f128562k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f128563l = new l(2);

    /* renamed from: m, reason: collision with root package name */
    public static final l f128564m = new l(3);

    /* renamed from: n, reason: collision with root package name */
    public static final l f128565n = new l(4);

    /* renamed from: o, reason: collision with root package name */
    public static final l f128566o = new l(5);

    /* renamed from: p, reason: collision with root package name */
    public static final l f128567p = new l(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128568i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f128568i = i13;
    }

    public final b b(b it) {
        switch (this.f128568i) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return b.e(it, true, null, null, 6);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return b.e(it, false, null, null, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f128568i;
        switch (i13) {
            case 0:
                kn1.b it = (kn1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return kn1.b.e(it, false, false, hn1.q.Center, new u50.k0(m0.collage_draft_picker_title), null, null, null, 1970);
            case 1:
                in1.b it2 = (in1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return in1.b.e(it2, null, true, null, 13);
            case 2:
                ln1.l bind = (ln1.l) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.a(ln1.e.LOADING);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.a(ln1.e.NONE);
                        break;
                }
                return Unit.f80348a;
            case 3:
                ln1.l bind2 = (ln1.l) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.a(ln1.e.LOADING);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.a(ln1.e.NONE);
                        break;
                }
                return Unit.f80348a;
            case 4:
                return b((b) obj);
            case 5:
                return b((b) obj);
            default:
                h32.h0 update = (h32.h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0.CREATE_COLLAGE_BUTTON;
                update.f67045d = h32.g0.MODAL_DIALOG;
                return Unit.f80348a;
        }
    }
}
