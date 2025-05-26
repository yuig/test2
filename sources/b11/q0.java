package b11;

import com.pinterest.feature.pin.closeup.view.UnifiedPinActionBarView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21076i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ UnifiedPinActionBarView f21077j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(UnifiedPinActionBarView unifiedPinActionBarView, int i13) {
        super(1);
        this.f21076i = i13;
        this.f21077j = unifiedPinActionBarView;
    }

    public final rm1.d b(rm1.d it) {
        int i13 = this.f21076i;
        UnifiedPinActionBarView unifiedPinActionBarView = this.f21077j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, new rm1.f(rm1.q.SPEECH_HEART, rm1.i.XXL), unifiedPinActionBarView.f47047n, null, 0, null, 28);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, null, unifiedPinActionBarView.f47047n, null, 0, null, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f21076i) {
        }
        return b((rm1.d) obj);
    }
}
