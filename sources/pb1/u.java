package pb1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final u f99481j = new u(0);

    /* renamed from: k, reason: collision with root package name */
    public static final u f99482k = new u(1);

    /* renamed from: l, reason: collision with root package name */
    public static final u f99483l = new u(2);

    /* renamed from: m, reason: collision with root package name */
    public static final u f99484m = new u(3);

    /* renamed from: n, reason: collision with root package name */
    public static final u f99485n = new u(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99486i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i13) {
        super(1);
        this.f99486i = i13;
    }

    public final a b(a ds2) {
        switch (this.f99486i) {
            case 0:
                Intrinsics.checkNotNullParameter(ds2, "ds");
                yn1.f passcodeInputVariant = yn1.f.DEFAULT;
                ds2.getClass();
                Intrinsics.checkNotNullParameter(passcodeInputVariant, "passcodeInputVariant");
                return new a(false, passcodeInputVariant, true, true);
            case 1:
                Intrinsics.checkNotNullParameter(ds2, "it");
                return a.e(ds2, false, null, false, 7);
            case 2:
                Intrinsics.checkNotNullParameter(ds2, "ds");
                yn1.f passcodeInputVariant2 = yn1.f.ERROR;
                ds2.getClass();
                Intrinsics.checkNotNullParameter(passcodeInputVariant2, "passcodeInputVariant");
                return new a(false, passcodeInputVariant2, true, true);
            case 3:
                Intrinsics.checkNotNullParameter(ds2, "it");
                yn1.f passcodeInputVariant3 = yn1.f.DEFAULT;
                ds2.getClass();
                Intrinsics.checkNotNullParameter(passcodeInputVariant3, "passcodeInputVariant");
                return new a(true, passcodeInputVariant3, false, false);
            default:
                Intrinsics.checkNotNullParameter(ds2, "it");
                return a.e(ds2, false, null, false, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f99486i) {
        }
        return b((a) obj);
    }
}
