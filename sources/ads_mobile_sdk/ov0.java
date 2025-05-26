package ads_mobile_sdk;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class ov0 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f9461a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov0(Context context) {
        super(0);
        this.f9461a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return bs1.c.P(this.f9461a, "google_mobile_ads_inspector_settings.pb");
    }
}
