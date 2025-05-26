package ads_mobile_sdk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class is2 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f6535a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is2(Throwable th3) {
        super(0);
        this.f6535a = th3;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Untrapped exception: " + this.f6535a;
    }
}
