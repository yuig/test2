package di2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class i extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f55086j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f55087k = new i(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55088i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(0);
        this.f55088i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f55088i) {
            case 0:
                return Boolean.FALSE;
            default:
                return kh2.d.x();
        }
    }
}
