package com.facebook.login;

import android.content.Intent;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v extends h.a {

    /* renamed from: a, reason: collision with root package name */
    public le.m f30044a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f30046c;

    public v(x this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f30046c = this$0;
        this.f30044a = null;
        this.f30045b = str;
    }

    @Override // h.a
    public final Intent a(androidx.activity.o context, Object obj) {
        Collection permissions = (Collection) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        n nVar = new n(permissions);
        x xVar = this.f30046c;
        LoginClient.Request a13 = xVar.a(nVar);
        String str = this.f30045b;
        if (str != null) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            a13.f29970e = str;
        }
        x.e(context, a13);
        Intent b13 = x.b(a13);
        if (le.v.a().getPackageManager().resolveActivity(b13, 0) != null) {
            return b13;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        l lVar = l.ERROR;
        xVar.getClass();
        x.c(context, lVar, null, facebookException, false, a13);
        throw facebookException;
    }

    @Override // h.a
    public final Object c(Intent intent, int i13) {
        this.f30046c.f(i13, intent, null);
        int requestCode = df.i.Login.toRequestCode();
        le.m mVar = this.f30044a;
        if (mVar != null) {
            ((df.j) mVar).a(requestCode, i13, intent);
        }
        return new le.l(requestCode, i13, intent);
    }
}
