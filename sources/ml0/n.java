package ml0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final n f87479j = new n(0);

    /* renamed from: k, reason: collision with root package name */
    public static final n f87480k = new n(1);

    /* renamed from: l, reason: collision with root package name */
    public static final n f87481l = new n(2);

    /* renamed from: m, reason: collision with root package name */
    public static final n f87482m = new n(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87483i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13) {
        super(1);
        this.f87483i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f87483i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, true, null, null, null, null, null, null, 0, null, 1021);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, null, null, null, null, 0, null, 1021);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f87483i) {
            case 0:
                break;
            case 1:
                t0 itemPin = (t0) obj;
                Intrinsics.checkNotNullParameter(itemPin, "itemPin");
                break;
        }
        return b((yl1.b) obj);
    }
}
