package ads_mobile_sdk;

import android.content.Intent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class am extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f2436a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(Intent intent) {
        super(1);
        this.f2436a = intent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return this.f2436a.setType(it);
    }
}
