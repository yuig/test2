package lo1;

import c60.d;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.wy0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.pushnotification.l;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final TimeUnit f84164c = TimeUnit.SECONDS;

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f84165a;

    /* renamed from: b, reason: collision with root package name */
    public final l f84166b;

    public a(b60.b activeUserManager, l pushTokenRegistrationScheduler) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pushTokenRegistrationScheduler, "pushTokenRegistrationScheduler");
        this.f84165a = activeUserManager;
        this.f84166b = pushTokenRegistrationScheduler;
    }

    public final boolean a(byte[] bArr) {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        vd0.c cVar = new vd0.c(new String(bArr, forName));
        String d2 = cVar.d("version");
        if (!Intrinsics.d(d2, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE) && !Intrinsics.d(d2, "2")) {
            return false;
        }
        String d13 = cVar.d("auth_token");
        vd0.c m13 = cVar.m("user");
        if (d13 == null || m13 == null) {
            return false;
        }
        c60.a aVar = Intrinsics.d(d2, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE) ? new c60.a(d13, null, null) : new c60.a(d13, cVar.d("v5_access_token"), cVar.d("v5_refresh_token"));
        d dVar = d.f26513a;
        d.d(aVar);
        UserDeserializer.f36811e.getClass();
        UserDeserializer userDeserializer = UserDeserializer.f36812f;
        if (userDeserializer == null) {
            Intrinsics.r("INSTANCE");
            throw null;
        }
        wy0 e13 = userDeserializer.e(m13, true, true);
        ((b60.d) this.f84165a).j(e13);
        a60.a aVar2 = a60.a.f905a;
        String uid = e13.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        aVar2.e(aVar, uid, m13);
        return true;
    }
}
