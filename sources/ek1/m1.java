package ek1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final m1 f59280j = new m1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final m1 f59281k = new m1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final m1 f59282l = new m1(2);

    /* renamed from: m, reason: collision with root package name */
    public static final m1 f59283m = new m1(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59284i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(int i13) {
        super(1);
        this.f59284i = i13;
    }

    public final r b(r it) {
        switch (this.f59284i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return r.e(it, null, null, o.f59293a, false, null, 27);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return r.e(it, null, new az.b(), null, false, null, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f59284i) {
            case 0:
                r1 it = (r1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return r1.b(it, null, null, 0, null, null, null, false, false, null, 0, yi1.a.FailedToLoad, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -131073, 4194303);
            case 1:
                return b((r) obj);
            case 2:
                Throwable start = (Throwable) obj;
                Intrinsics.checkNotNullParameter(start, "$this$start");
                return Unit.f80348a;
            default:
                return b((r) obj);
        }
    }
}
