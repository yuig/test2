package k1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b3.s f78035i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f78036j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f78037k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d3.i f78038l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b3.s sVar, long j13, long j14, d3.i iVar) {
        super(1);
        this.f78035i = sVar;
        this.f78036j = j13;
        this.f78037k = j14;
        this.f78038l = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s3.m0 m0Var = (s3.m0) ((d3.e) obj);
        m0Var.a();
        d3.h.q(m0Var, this.f78035i, this.f78036j, this.f78037k, 0.0f, this.f78038l, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE);
        return Unit.f80348a;
    }
}
