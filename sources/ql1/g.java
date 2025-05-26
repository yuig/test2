package ql1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rl1.c0;
import rl1.r;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f104081j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f104082k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f104083l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f104084m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f104085n = new g(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104086i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f104086i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f104086i) {
            case 0:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f108892g = fm1.c.VISIBLE;
                return Unit.f80348a;
            case 1:
                c0 bind2 = (c0) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                bind2.f108536i = l.attribution_pinner_avatar;
                r size = r.XS;
                Intrinsics.checkNotNullParameter(size, "size");
                bind2.f108531d = size;
                return Unit.f80348a;
            case 2:
                e checkAndApplyDiff = (e) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f104078a;
            case 3:
                e checkAndApplyDiff2 = (e) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.f104079b;
            default:
                e checkAndApplyDiff3 = (e) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff3.f104080c);
        }
    }
}
