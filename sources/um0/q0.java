package um0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final q0 f122754j = new q0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final q0 f122755k = new q0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final q0 f122756l = new q0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final q0 f122757m = new q0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final q0 f122758n = new q0(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122759i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i13) {
        super(1);
        this.f122759i = i13;
    }

    public final w0 b(w0 it) {
        switch (this.f122759i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(it, "<this>");
                a1 a1Var = it.f122774d;
                kotlin.collections.s0 pinsRemovedFromBulkSelection = kotlin.collections.s0.f80394a;
                a1Var.getClass();
                Intrinsics.checkNotNullParameter(pinsRemovedFromBulkSelection, "selectedPins");
                Intrinsics.checkNotNullParameter(pinsRemovedFromBulkSelection, "pinsRemovedFromBulkSelection");
                return w0.b(it, false, false, null, new a1(pinsRemovedFromBulkSelection, pinsRemovedFromBulkSelection), 23);
            case 1:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return w0.b(it, false, true, null, null, 29);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return w0.b(it, true, false, null, null, 30);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return w0.b(it, false, false, null, null, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f122759i) {
            case 1:
                e it = (e) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(it, "<this>");
                xm0.d headerState = kh2.a1.H0(it.f122697c.f122780a, 0, false);
                Intrinsics.checkNotNullParameter(headerState, "headerState");
                break;
        }
        return b((w0) obj);
    }
}
