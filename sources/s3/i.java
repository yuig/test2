package s3;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j */
    public static final i f110788j = new i(1);

    /* renamed from: k */
    public static final i f110789k = new i(2);

    /* renamed from: i */
    public final /* synthetic */ int f110790i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(0);
        this.f110790i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f110790i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return new k0(true, 2, 0);
                    default:
                        return new k0(false, 3, 0);
                }
            case 1:
                return new LinkedHashMap();
            default:
                switch (i13) {
                    case 0:
                        return new k0(true, 2, 0);
                    default:
                        return new k0(false, 3, 0);
                }
        }
    }
}
