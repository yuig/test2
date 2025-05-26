package qr;

import com.pinterest.activity.webhook.WebhookActivity;
import h32.f1;
import h32.i0;
import h32.w0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements he0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebhookActivity f104954a;

    public j(WebhookActivity webhookActivity) {
        this.f104954a = webhookActivity;
    }

    @Override // he0.a
    public final w0 a(f1 et2, String str, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(et2, "et");
        return this.f104954a.getPinalytics().a(et2, str, z13, z14);
    }

    @Override // he0.a
    public final w0 b(i0 i0Var, f1 et2, String str, HashMap hashMap, boolean z13) {
        Intrinsics.checkNotNullParameter(et2, "et");
        return this.f104954a.getPinalytics().U(i0Var, et2, str, null, hashMap, z13);
    }
}
