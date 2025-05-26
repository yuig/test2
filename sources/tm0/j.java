package tm0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class j extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f118132j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f118133k = new j(1);

    /* renamed from: l, reason: collision with root package name */
    public static final j f118134l = new j(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118135i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(1);
        this.f118135i = i13;
    }

    public final Boolean b(dl0.a enabledIf) {
        boolean z13 = false;
        switch (this.f118135i) {
            case 0:
                Intrinsics.checkNotNullParameter(enabledIf, "$this$enabledIf");
                if (enabledIf.f55178f && !enabledIf.f55184l) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 1:
                Intrinsics.checkNotNullParameter(enabledIf, "$this$enabledIf");
                if (enabledIf.f55178f && enabledIf.f55177e && enabledIf.f55188p <= 10) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            default:
                Intrinsics.checkNotNullParameter(enabledIf, "$this$enabledIf");
                if (enabledIf.f55178f && enabledIf.b()) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f118135i) {
        }
        return b((dl0.a) obj);
    }
}
