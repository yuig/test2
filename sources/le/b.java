package le;

import android.util.Log;
import com.facebook.login.DeviceAuthDialog;
import df.j1;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f83017c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f83018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f83019e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f83015a = i13;
        this.f83016b = obj;
        this.f83017c = obj2;
        this.f83018d = obj3;
        this.f83019e = obj4;
    }

    @Override // le.x
    public final void a(e0 response) {
        JSONArray optJSONArray;
        int i13 = this.f83015a;
        Object obj = this.f83019e;
        Object obj2 = this.f83018d;
        Object obj3 = this.f83017c;
        Object obj4 = this.f83016b;
        switch (i13) {
            case 0:
                AtomicBoolean permissionsCallSucceeded = (AtomicBoolean) obj4;
                Set permissions = (Set) obj3;
                Set declinedPermissions = (Set) obj2;
                Set expiredPermissions = (Set) obj;
                Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
                Intrinsics.checkNotNullParameter(permissions, "$permissions");
                Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
                Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
                Intrinsics.checkNotNullParameter(response, "response");
                JSONObject jSONObject = response.f83047d;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                    permissionsCallSucceeded.set(true);
                    int length = optJSONArray.length();
                    if (length > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i14);
                            if (optJSONObject != null) {
                                String optString = optJSONObject.optString("permission");
                                String status = optJSONObject.optString("status");
                                if (!j1.V0(optString) && !j1.V0(status)) {
                                    Intrinsics.checkNotNullExpressionValue(status, "status");
                                    Locale locale = Locale.US;
                                    String status2 = ep.b.l(locale, "US", status, locale, "(this as java.lang.String).toLowerCase(locale)");
                                    Intrinsics.checkNotNullExpressionValue(status2, "status");
                                    int hashCode = status2.hashCode();
                                    if (hashCode == -1309235419) {
                                        if (status2.equals("expired")) {
                                            expiredPermissions.add(optString);
                                        }
                                        Log.w("AccessTokenManager", Intrinsics.n(status2, "Unexpected status: "));
                                    } else if (hashCode != 280295099) {
                                        if (hashCode == 568196142 && status2.equals("declined")) {
                                            declinedPermissions.add(optString);
                                        }
                                        Log.w("AccessTokenManager", Intrinsics.n(status2, "Unexpected status: "));
                                    } else {
                                        if (status2.equals("granted")) {
                                            permissions.add(optString);
                                        }
                                        Log.w("AccessTokenManager", Intrinsics.n(status2, "Unexpected status: "));
                                    }
                                }
                            }
                            if (i15 >= length) {
                                break;
                            } else {
                                i14 = i15;
                            }
                        }
                    }
                }
                break;
            case 1:
                me.b accessTokenAppId = (me.b) obj4;
                a0 postRequest = (a0) obj3;
                me.u appEvents = (me.u) obj2;
                ck2.a flushState = (ck2.a) obj;
                String str = me.i.f86987a;
                if (!p001if.a.b(me.i.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
                        Intrinsics.checkNotNullParameter(postRequest, "$postRequest");
                        Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
                        Intrinsics.checkNotNullParameter(flushState, "$flushState");
                        Intrinsics.checkNotNullParameter(response, "response");
                        me.i.e(flushState, postRequest, response, accessTokenAppId, appEvents);
                        break;
                    } catch (Throwable th3) {
                        p001if.a.a(me.i.class, th3);
                        return;
                    }
                }
                break;
            default:
                DeviceAuthDialog.T6((DeviceAuthDialog) obj4, (String) obj3, (Date) obj2, (Date) obj, response);
                break;
        }
    }
}
