package ads_mobile_sdk;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class u80 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y80 f11884a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u80(y80 y80Var) {
        super(0);
        this.f11884a = y80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/d"));
        intent.setPackage("com.android.vending");
        return Boolean.valueOf(intent.resolveActivity(this.f11884a.f14136f) != null);
    }
}
