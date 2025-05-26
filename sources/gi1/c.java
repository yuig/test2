package gi1;

import com.pinterest.api.model.pc0;
import com.pinterest.feature.video.worker.base.BaseRegisterMediaWorker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65158i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ BaseRegisterMediaWorker f65159j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BaseRegisterMediaWorker baseRegisterMediaWorker, int i13) {
        super(0);
        this.f65158i = i13;
        this.f65159j = baseRegisterMediaWorker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f65158i;
        BaseRegisterMediaWorker baseRegisterMediaWorker = this.f65159j;
        switch (i13) {
            case 0:
                return Integer.valueOf(baseRegisterMediaWorker.f78963b.f19998b.d("REGISTER_MEDIA_ROTATION", 0));
            default:
                String h10 = baseRegisterMediaWorker.f78963b.f19998b.h("REGISTER_MEDIA_TYPE");
                return h10 == null ? pc0.REGISTER_TYPE_UNDEFINED.getValue() : h10;
        }
    }
}
