package pr1;

import android.app.Application;
import android.content.Context;
import com.google.android.recaptcha.RecaptchaAction;
import com.pinterest.api.model.wy0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import uj2.b0;

/* loaded from: classes2.dex */
public final class h extends f {

    /* renamed from: h, reason: collision with root package name */
    public final String f101199h;

    /* renamed from: i, reason: collision with root package name */
    public final String f101200i;

    /* renamed from: j, reason: collision with root package name */
    public final b60.b f101201j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String email, String password, b60.b activeUserManager) {
        super("", false, qr1.j.f105010b);
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f101199h = email;
        this.f101200i = password;
        this.f101201j = activeUserManager;
    }

    @Override // or1.p
    public final String a() {
        return "PinterestLogin";
    }

    @Override // pr1.f
    public final Map c() {
        LinkedHashMap r13 = z0.r(super.c());
        r13.put("username_or_email", this.f101199h);
        r13.put("password", this.f101200i);
        return z0.n(r13);
    }

    @Override // pr1.f
    public final b0 e() {
        if (this.f101189c) {
            return super.e();
        }
        RecaptchaAction recaptchaAction = com.pinterest.security.h.f51752a;
        Context context = kb0.a.f79058b;
        Application W = f0.W();
        RecaptchaAction recaptchaAction2 = com.pinterest.security.h.f51752a;
        ox.b bVar = this.f101191e;
        if (bVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        wy0 f13 = ((b60.d) this.f101201j).f();
        String uid = f13 != null ? f13.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        return com.pinterest.security.h.c(W, recaptchaAction2, bVar, uid, new zn1.d(this, 3));
    }
}
