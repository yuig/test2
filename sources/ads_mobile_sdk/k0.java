package ads_mobile_sdk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class k0 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7030a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(String str) {
        super(0);
        this.f7030a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return a.a.j("Unknown ad config parameter: ", this.f7030a);
    }
}
