package qz;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final u f105435j = new u(0);

    /* renamed from: k, reason: collision with root package name */
    public static final u f105436k = new u(1);

    /* renamed from: l, reason: collision with root package name */
    public static final u f105437l = new u(2);

    /* renamed from: m, reason: collision with root package name */
    public static final u f105438m = new u(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105439i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i13) {
        super(1);
        this.f105439i = i13;
    }

    public final Boolean b(String it) {
        switch (this.f105439i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(StringsKt.E(it, "as=image", false));
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(kotlin.text.z.j(it));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f105439i) {
            case 0:
                return Unit.f80348a;
            case 1:
                return b((String) obj);
            case 2:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String Z = StringsKt.Z('<', it, it);
                return StringsKt.d0('>', Z, Z);
            default:
                return b((String) obj);
        }
    }
}
