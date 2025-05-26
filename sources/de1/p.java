package de1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final p f54622j = new p(0);

    /* renamed from: k, reason: collision with root package name */
    public static final p f54623k = new p(1);

    /* renamed from: l, reason: collision with root package name */
    public static final p f54624l = new p(2);

    /* renamed from: m, reason: collision with root package name */
    public static final p f54625m = new p(3);

    /* renamed from: n, reason: collision with root package name */
    public static final p f54626n = new p(4);

    /* renamed from: o, reason: collision with root package name */
    public static final p f54627o = new p(5);

    /* renamed from: p, reason: collision with root package name */
    public static final p f54628p = new p(6);

    /* renamed from: q, reason: collision with root package name */
    public static final p f54629q = new p(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54630i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i13) {
        super(1);
        this.f54630i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f54630i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, null, kotlin.collections.e0.b(vn1.b.CENTER), null, null, 1, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097115);
    }

    public final yl1.b e(yl1.b it) {
        switch (this.f54630i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], mz1.g.product_filter_confirm_button), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], mz1.g.price_filter_reset_button), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f54630i;
        switch (i13) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return e((yl1.b) obj);
            case 2:
                return e((yl1.b) obj);
            case 3:
                zd1.g it = (zd1.g) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.f141716g;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.f141716g;
                }
            case 4:
                zd1.g it2 = (zd1.g) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2.f141716g;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2.f141716g;
                }
            case 5:
                rn1.k bind = (rn1.k) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.e(mz1.g.unified_filter_empty_header_text_calico);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.e(mz1.g.unified_filter_empty_sub_header_text_calico);
                        break;
                }
                return Unit.f80348a;
            case 6:
                rn1.k bind2 = (rn1.k) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.e(mz1.g.unified_filter_empty_header_text_calico);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.e(mz1.g.unified_filter_empty_sub_header_text_calico);
                        break;
                }
                return Unit.f80348a;
            default:
                return b((rn1.a) obj);
        }
    }
}
