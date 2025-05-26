package yl0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f139291j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f139292k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f139293l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f139294m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f139295n = new b(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b f139296o = new b(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139297i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f139297i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f139297i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
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
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return yl1.b.f(it, null, true, null, null, null, null, null, null, 0, null, 1021);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f139297i) {
        }
        return b((yl1.b) obj);
    }
}
