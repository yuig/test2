package ads_mobile_sdk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class hs2 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f6071b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs2(String str, Throwable th3) {
        super(0);
        this.f6070a = str;
        this.f6071b = th3;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Trapped exception (" + this.f6070a + "): " + this.f6071b;
    }
}
