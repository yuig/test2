package zb0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.r;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r f141563i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f141564j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(r rVar, k kVar) {
        super(1);
        this.f141563i = rVar;
        this.f141564j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yb0.d dismissReason = (yb0.d) obj;
        Intrinsics.checkNotNullParameter(dismissReason, "dismissReason");
        this.f141563i.a(new d(dismissReason, ((j) this.f141564j).f141567b));
        return Unit.f80348a;
    }
}
