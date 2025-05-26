package cp1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class m extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final m f53007j = new m(0);

    /* renamed from: k, reason: collision with root package name */
    public static final m f53008k = new m(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53009i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i13) {
        super(1);
        this.f53009i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f53009i) {
            case 0:
                return Boolean.valueOf(((Number) obj).intValue() >= 0);
            default:
                return Unit.f80348a;
        }
    }
}
