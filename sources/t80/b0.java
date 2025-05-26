package t80;

import h32.g0;
import h32.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b0 f116679j = new b0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b0 f116680k = new b0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b0 f116681l = new b0(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116682i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i13) {
        super(1);
        this.f116682i = i13;
    }

    public final d0 b(d0 it) {
        switch (this.f116682i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return d0.b(it, true, null, 29);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return d0.b(it, false, null, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f116682i) {
            case 0:
                return b((d0) obj);
            case 1:
                return b((d0) obj);
            default:
                h0 update = (h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = g0.COLLAGE_COMPOSER_CAROUSEL;
                return Unit.f80348a;
        }
    }
}
