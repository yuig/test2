package la0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c1 f82378j = new c1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c1 f82379k = new c1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c1 f82380l = new c1(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c1 f82381m = new c1(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c1 f82382n = new c1(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c1 f82383o = new c1(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82384i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(int i13) {
        super(1);
        this.f82384i = i13;
    }

    public final g b(g it) {
        switch (this.f82384i) {
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
        return g.e(it, null, null, null, null, null, false, 255);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f82384i) {
        }
        return b((g) obj);
    }
}
