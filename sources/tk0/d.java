package tk0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f117951j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f117952k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f117953l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117954i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f117954i = i13;
    }

    public final e b(e it) {
        switch (this.f117954i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return e.e(it, null, null, a.e(it.f117957c, false, 0, null, 62), false, 11);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return e.e(it, null, null, null, false, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f117954i) {
            case 0:
                break;
        }
        return b((e) obj);
    }
}
