package ny1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final q f92689j = new q(0);

    /* renamed from: k, reason: collision with root package name */
    public static final q f92690k = new q(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92691i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i13) {
        super(1);
        this.f92691i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f92691i) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(it, "<this>");
                return StringsKt.c0(it, ".");
            default:
                ((Boolean) obj).getClass();
                return Unit.f80348a;
        }
    }
}
