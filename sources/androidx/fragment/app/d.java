package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.pinterest.identity.core.error.UnauthException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements j5.c, k8.n, df.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18301c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18302d;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f18299a = obj;
        this.f18300b = obj2;
        this.f18301c = obj3;
        this.f18302d = obj4;
    }

    @Override // df.z0
    public final void b(Bundle bundle) {
        String loggerRef = (String) this.f18299a;
        com.facebook.login.r logger = (com.facebook.login.r) this.f18300b;
        le.h0 responseCallback = (le.h0) this.f18301c;
        String applicationId = (String) this.f18302d;
        wc.j jVar = com.facebook.login.x.f30074j;
        Intrinsics.checkNotNullParameter(loggerRef, "$loggerRef");
        Intrinsics.checkNotNullParameter(logger, "$logger");
        Intrinsics.checkNotNullParameter(responseCallback, "$responseCallback");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        if (bundle == null) {
            logger.a(loggerRef);
            ((hr1.i) responseCallback).a();
            return;
        }
        String string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        String string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        if (string != null) {
            FacebookException exception = new FacebookException(string + ": " + ((Object) string2));
            logger.getClass();
            if (!p001if.a.b(logger)) {
                try {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    ScheduledExecutorService scheduledExecutorService = com.facebook.login.r.f30036d;
                    Bundle b13 = wc.b.b(loggerRef);
                    b13.putString("2_result", com.facebook.login.l.ERROR.getLoggingValue());
                    b13.putString("5_error_message", exception.toString());
                    logger.f30038b.c("fb_mobile_login_status_complete", b13);
                } catch (Throwable th3) {
                    p001if.a.a(logger, th3);
                }
            }
            hr1.i iVar = (hr1.i) responseCallback;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(exception, "exception");
            ((fk2.f) iVar.f69997a).a(new UnauthException.ThirdParty.Facebook.LoginStatusFailure(exception));
            return;
        }
        String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date g03 = df.j1.g0(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string4 = bundle.getString("signed request");
        String string5 = bundle.getString("graph_domain");
        Date g04 = df.j1.g0(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        String m03 = (string4 == null || string4.length() == 0) ? null : gi2.b.m0(string4);
        if (string3 == null || string3.length() == 0 || stringArrayList == null || stringArrayList.isEmpty() || m03 == null || m03.length() == 0) {
            logger.a(loggerRef);
            ((hr1.i) responseCallback).a();
            return;
        }
        AccessToken accessToken = new AccessToken(string3, applicationId, m03, stringArrayList, null, null, null, g03, null, g04, string5);
        le.e.f83036f.t().d(accessToken, true);
        String str = Profile.f29917h;
        com.bugsnag.android.a0.o();
        logger.getClass();
        if (!p001if.a.b(logger)) {
            try {
                ScheduledExecutorService scheduledExecutorService2 = com.facebook.login.r.f30036d;
                Bundle b14 = wc.b.b(loggerRef);
                b14.putString("2_result", com.facebook.login.l.SUCCESS.getLoggingValue());
                logger.f30038b.c("fb_mobile_login_status_complete", b14);
            } catch (Throwable th4) {
                p001if.a.a(logger, th4);
            }
        }
        hr1.i iVar2 = (hr1.i) responseCallback;
        iVar2.getClass();
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        ((fk2.f) iVar2.f69997a).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    @Override // k8.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pk.v2 e(int r21, a7.c1 r22, int[] r23) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d.e(int, a7.c1, int[]):pk.v2");
    }

    @Override // j5.c
    public final void onCancel() {
        View view = (View) this.f18299a;
        k this$0 = (k) this.f18300b;
        f animationInfo = (f) this.f18301c;
        z1 operation = (z1) this.f18302d;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        view.clearAnimation();
        this$0.f18361a.endViewTransition(view);
        animationInfo.a();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
        }
    }
}
