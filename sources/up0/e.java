package up0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import so.oa;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f122946j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f122947k = new e(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122948i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(0);
        this.f122948i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f122948i) {
            case 0:
                return (l) ((oa) ((w92.a) w92.c.f128606a.getValue())).Rc.get();
            default:
                return Unit.f80348a;
        }
    }
}
