package oh1;

import kotlin.jvm.functions.Function0;
import m60.x0;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94505i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f94506j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(m mVar, int i13) {
        super(0);
        this.f94505i = i13;
        this.f94506j = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f94505i;
        m mVar = this.f94506j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(mVar.isBound());
            default:
                yk1.v vVar = mVar.f94528j;
                return ((yk1.a) vVar).f139224a.getString(x0.notification_uploading);
        }
    }
}
