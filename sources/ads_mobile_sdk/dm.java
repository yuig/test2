package ads_mobile_sdk;

import android.content.Intent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class dm extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ em f4335a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(em emVar) {
        super(1);
        this.f4335a = emVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            return Intent.parseUri(it, 0);
        } catch (Exception e13) {
            ((ks2) this.f4335a.f4886b).a("Invalid intent Uri for canOpenIntents gmsg", e13);
            return null;
        }
    }
}
