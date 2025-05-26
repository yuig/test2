package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class sz extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tz f11290a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz(tz tzVar) {
        super(1);
        this.f11290a = tzVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        synchronized (this.f11290a.f11748a.f()) {
            unit = Unit.f80348a;
        }
        return unit;
    }
}
