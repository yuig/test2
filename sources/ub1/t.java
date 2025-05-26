package ub1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final t f121739j = new t(0);

    /* renamed from: k, reason: collision with root package name */
    public static final t f121740k = new t(1);

    /* renamed from: l, reason: collision with root package name */
    public static final t f121741l = new t(2);

    /* renamed from: m, reason: collision with root package name */
    public static final t f121742m = new t(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121743i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i13) {
        super(1);
        this.f121743i = i13;
    }

    public final a b(a it) {
        switch (this.f121743i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return a.e(it, false, true, false, 4);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return a.e(it, true, false, false, 6);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return a.e(it, false, false, false, 5);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return a.e(it, false, false, true, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f121743i) {
        }
        return b((a) obj);
    }
}
