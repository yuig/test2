package r42;

import android.content.Context;
import com.google.android.recaptcha.RecaptchaAction;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f106192a;

    public j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f106192a = new WeakReference(context);
    }

    public final b0 a(RecaptchaAction action, ox.b bVar, String userId, kl2.l fnLogEvent) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(fnLogEvent, "fnLogEvent");
        Context context = (Context) this.f106192a.get();
        if (context != null) {
            RecaptchaAction recaptchaAction = com.pinterest.security.h.f51752a;
            return com.pinterest.security.h.c(context, action, bVar, userId, fnLogEvent);
        }
        kk2.b j13 = b0.j("default");
        Intrinsics.checkNotNullExpressionValue(j13, "just(...)");
        return j13;
    }
}
