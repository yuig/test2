package kv0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.mq;
import dl1.v0;
import kh2.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80938i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f80939j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i13) {
        super(1);
        this.f80938i = i13;
        this.f80939j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f80938i;
        c cVar = this.f80939j;
        switch (i13) {
            case 0:
                mq block = (mq) obj;
                Intrinsics.checkNotNullParameter(block, "block");
                return cVar.f80942c.P(block.getPinId());
            case 1:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                return b0.R(cVar.f80941b, pin, false);
            default:
                v0 it = (v0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.d(((ln0) it.f55290b).getUid(), (String) cVar.f80944e));
        }
    }
}
