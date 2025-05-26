package nf2;

import io.embrace.android.embracesdk.internal.api.delegate.NoopEmbraceInternalInterface;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.chromium.net.y;

/* loaded from: classes4.dex */
public final class d extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f90491j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f90492k = new d(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90493i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(0);
        this.f90493i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f90493i) {
            case 0:
                return Boolean.FALSE;
            default:
                l lVar = f.f90496b;
                if (lVar == null) {
                    lVar = new y();
                }
                return new NoopEmbraceInternalInterface(lVar);
        }
    }
}
