package q4;

import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f102319j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f102320k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f102321l = new e(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102322i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(0);
        this.f102322i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f102322i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return UUID.randomUUID();
                    default:
                        return UUID.randomUUID();
                }
            case 1:
                return "DEFAULT_TEST_TAG";
            default:
                switch (i13) {
                    case 0:
                        return UUID.randomUUID();
                    default:
                        return UUID.randomUUID();
                }
        }
    }
}
