package wc;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.p;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.login.x;
import df.c0;
import df.e0;
import df.j1;
import df.t0;
import df.u0;
import df.v;
import df.y;
import g4.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import le.g0;
import nd.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import td.r;
import wd.h0;

/* loaded from: classes.dex */
public final class j implements sd.c, nd.d, r, wd.n, h0, o, ae.g, ae.f, ie.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129091a;

    public /* synthetic */ j(int i13) {
        this.f129091a = i13;
    }

    public static boolean A(String str) {
        if (str != null) {
            return z.p(str, "publish", false) || z.p(str, "manage", false) || x.f30075k.contains(str);
        }
        return false;
    }

    public static final void n(me.e appEvent, me.b accessTokenAppId) {
        boolean z13;
        j jVar = me.m.f86996c;
        String str = me.i.f86987a;
        if (!p001if.a.b(me.i.class)) {
            try {
                Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
                Intrinsics.checkNotNullParameter(appEvent, "appEvent");
                me.i.f86990d.execute(new androidx.media3.ui.z(9, accessTokenAppId, appEvent));
            } catch (Throwable th3) {
                p001if.a.a(me.i.class, th3);
            }
        }
        y yVar = y.f54881a;
        boolean b13 = y.b(v.OnDevicePostInstallEventProcessing);
        String str2 = appEvent.f86983d;
        boolean z14 = appEvent.f86981b;
        if (b13 && we.a.a()) {
            String applicationId = accessTokenAppId.f86969a;
            if (!p001if.a.b(we.a.class)) {
                try {
                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                    Intrinsics.checkNotNullParameter(appEvent, "event");
                    we.a aVar = we.a.f129234a;
                    if (!p001if.a.b(aVar)) {
                        if (z14) {
                            try {
                                if (we.a.f129235b.contains(str2)) {
                                    z13 = true;
                                    if (!(!z14) || z13) {
                                        le.v.d().execute(new androidx.media3.ui.z(17, applicationId, appEvent));
                                    }
                                }
                            } catch (Throwable th4) {
                                p001if.a.a(aVar, th4);
                            }
                        }
                        z13 = false;
                        if (!(!z14)) {
                        }
                        le.v.d().execute(new androidx.media3.ui.z(17, applicationId, appEvent));
                    }
                } catch (Throwable th5) {
                    p001if.a.a(we.a.class, th5);
                }
            }
        }
        if (z14) {
            return;
        }
        j jVar2 = me.m.f86996c;
        if (!p001if.a.b(me.m.class)) {
            try {
                if (me.m.f87001h) {
                    return;
                }
            } catch (Throwable th6) {
                p001if.a.a(me.m.class, th6);
            }
        }
        if (!Intrinsics.d(str2, "fb_mobile_activate_app")) {
            b bVar = u0.f54860d;
            b.x(g0.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
        } else {
            if (p001if.a.b(me.m.class)) {
                return;
            }
            try {
                me.m.f87001h = true;
            } catch (Throwable th7) {
                p001if.a.a(me.m.class, th7);
            }
        }
    }

    public static ve.e o(JSONObject jSONObject) {
        float[] fArr;
        if (jSONObject == null) {
            return null;
        }
        try {
            String useCase = jSONObject.getString("use_case");
            String assetUri = jSONObject.getString("asset_uri");
            String optString = jSONObject.optString("rules_uri", null);
            int i13 = jSONObject.getInt("version_id");
            ve.g gVar = ve.g.f125671a;
            JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
            if (!p001if.a.b(ve.g.class)) {
                try {
                } catch (Throwable th3) {
                    p001if.a.a(ve.g.class, th3);
                }
                if (!p001if.a.b(gVar) && jSONArray != null) {
                    try {
                        fArr = new float[jSONArray.length()];
                        int length = jSONArray.length();
                        if (length > 0) {
                            int i14 = 0;
                            while (true) {
                                int i15 = i14 + 1;
                                try {
                                    String string = jSONArray.getString(i14);
                                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                                    fArr[i14] = Float.parseFloat(string);
                                } catch (JSONException unused) {
                                }
                                if (i15 >= length) {
                                    break;
                                }
                                i14 = i15;
                            }
                        }
                    } catch (Throwable th4) {
                        p001if.a.a(gVar, th4);
                    }
                    Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                    Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                    return new ve.e(useCase, assetUri, optString, i13, fArr);
                }
            }
            fArr = null;
            Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
            Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
            return new ve.e(useCase, assetUri, optString, i13, fArr);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static AccessToken p(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (jsonObject.getInt("version") > 1) {
            throw new FacebookException("Unknown AccessToken serialization format.");
        }
        String token = jsonObject.getString("token");
        Date date = new Date(jsonObject.getLong("expires_at"));
        JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
        JSONArray declinedPermissionsArray = jsonObject.getJSONArray("declined_permissions");
        JSONArray optJSONArray = jsonObject.optJSONArray("expired_permissions");
        Date date2 = new Date(jsonObject.getLong("last_refresh"));
        String string = jsonObject.getString("source");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(SOURCE_KEY)");
        le.g valueOf = le.g.valueOf(string);
        String applicationId = jsonObject.getString("application_id");
        String userId = jsonObject.getString("user_id");
        Date date3 = new Date(jsonObject.optLong("data_access_expiration_time", 0L));
        String optString = jsonObject.optString("graph_domain", null);
        Intrinsics.checkNotNullExpressionValue(token, "token");
        Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
        Intrinsics.checkNotNullExpressionValue(userId, "userId");
        Intrinsics.checkNotNullExpressionValue(permissionsArray, "permissionsArray");
        ArrayList h13 = j1.h1(permissionsArray);
        Intrinsics.checkNotNullExpressionValue(declinedPermissionsArray, "declinedPermissionsArray");
        return new AccessToken(token, applicationId, userId, h13, j1.h1(declinedPermissionsArray), optJSONArray == null ? new ArrayList() : j1.h1(optJSONArray), valueOf, date, date2, date3, optString);
    }

    public static void q(String str, String str2, ue.h hVar) {
        File file = new File(ve.i.a(), str2);
        if (str == null || file.exists()) {
            hVar.a(file);
        } else {
            new ue.i(str, file, hVar).execute(new String[0]);
        }
    }

    public static void r(ve.e master, ArrayList slaves) {
        File[] listFiles;
        Intrinsics.checkNotNullParameter(master, "master");
        Intrinsics.checkNotNullParameter(slaves, "slaves");
        String str = master.f125662a;
        File a13 = ve.i.a();
        int i13 = master.f125665d;
        if (a13 != null && (listFiles = a13.listFiles()) != null && listFiles.length != 0) {
            String str2 = str + '_' + i13;
            int length = listFiles.length;
            int i14 = 0;
            while (i14 < length) {
                File file = listFiles[i14];
                i14++;
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                if (z.p(name, str, false) && !z.p(name, str2, false)) {
                    file.delete();
                }
            }
        }
        q(master.f125663b, master.f125662a + '_' + i13, new m7.h0(slaves));
    }

    public static AccessToken s() {
        return le.e.f83036f.t().f83040c;
    }

    public static String v() {
        u callback = new u();
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!le.v.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
            InstallReferrerClient build = InstallReferrerClient.newBuilder(le.v.a()).build();
            try {
                build.startConnection(new t0(build, callback));
            } catch (Exception unused) {
            }
        }
        return le.v.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
    }

    public static void x(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (df.d.a() != null) {
            df.d.a();
            return;
        }
        df.d dVar = new df.d(context);
        if (!p001if.a.b(df.d.class)) {
            try {
                if (!p001if.a.b(dVar)) {
                    try {
                        z6.c a13 = z6.c.a(dVar.f54741a);
                        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(applicationContext)");
                        a13.b(dVar, new IntentFilter("com.parse.bolts.measurement_event"));
                    } catch (Throwable th3) {
                        p001if.a.a(dVar, th3);
                    }
                }
            } catch (Throwable th4) {
                p001if.a.a(df.d.class, th4);
            }
        }
        if (!p001if.a.b(df.d.class)) {
            try {
                df.d.f54740b = dVar;
            } catch (Throwable th5) {
                p001if.a.a(df.d.class, th5);
            }
        }
        df.d.a();
    }

    public static void y() {
        synchronized (me.m.c()) {
            if (me.m.b() != null) {
                return;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            if (!p001if.a.b(me.m.class)) {
                try {
                    me.m.f86997d = scheduledThreadPoolExecutor;
                } catch (Throwable th3) {
                    p001if.a.a(me.m.class, th3);
                }
            }
            Unit unit = Unit.f80348a;
            p pVar = new p(2);
            ScheduledThreadPoolExecutor b13 = me.m.b();
            if (b13 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            b13.scheduleAtFixedRate(pVar, 0L, 86400L, TimeUnit.SECONDS);
        }
    }

    public static boolean z() {
        AccessToken accessToken = le.e.f83036f.t().f83040c;
        return (accessToken == null || accessToken.d()) ? false : true;
    }

    @Override // td.r
    public final Class a() {
        return InputStream.class;
    }

    @Override // ae.f
    public final void b(Activity activity) {
    }

    @Override // td.r
    public final Object c(File file) {
        return new FileInputStream(file);
    }

    @Override // ie.a
    public final Object create() {
        return new ArrayList();
    }

    @Override // wd.n
    public final void d(Bitmap bitmap, qd.d dVar) {
    }

    @Override // nd.o
    public final nd.c e(nd.l lVar) {
        return nd.c.SOURCE;
    }

    @Override // wd.h0
    public final void f(MediaExtractor mediaExtractor, Object obj) {
        switch (this.f129091a) {
            case 9:
                mediaExtractor.setDataSource(new wd.g0((ByteBuffer) obj));
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // sd.c
    public final void g(Throwable th3) {
        if (Log.isLoggable("GlideExecutor", 6)) {
            Log.e("GlideExecutor", "Request threw uncaught throwable", th3);
        }
    }

    @Override // ae.g
    public final void h(ae.i iVar) {
        iVar.x();
    }

    @Override // wd.h0
    public final void i(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f129091a) {
            case 9:
                mediaMetadataRetriever.setDataSource(new wd.g0((ByteBuffer) obj));
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // wd.n
    public final void j() {
    }

    @Override // td.r
    public final void k(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // nd.d
    public final boolean l(Object obj, File file, nd.l lVar) {
        switch (this.f129091a) {
            case 6:
                try {
                    he.c.d((ByteBuffer) obj, file);
                    break;
                } catch (IOException e13) {
                    if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                        return false;
                    }
                    Log.d("ByteBufferEncoder", "Failed to write data", e13);
                    return false;
                }
            default:
                try {
                    he.c.d(((yd.c) ((pd.g0) obj).get()).f138714a.f138713a.b(), file);
                    break;
                } catch (IOException e14) {
                    if (!Log.isLoggable("GifEncoder", 5)) {
                        return false;
                    }
                    Log.w("GifEncoder", "Failed to encode GIF drawable data", e14);
                    return false;
                }
        }
        return false;
    }

    @Override // ae.g
    public final void m(ae.i iVar) {
    }

    public final synchronized df.p t() {
        e0 e0Var = e0.f54743a;
        c0 b13 = e0.b(le.v.b());
        if (b13 == null) {
            return df.p.f54819d.r();
        }
        return b13.f54731h;
    }

    public final me.k u() {
        me.k kVar;
        synchronized (me.m.c()) {
            kVar = null;
            if (!p001if.a.b(me.m.class)) {
                try {
                    kVar = me.m.f86998e;
                } catch (Throwable th3) {
                    p001if.a.a(me.m.class, th3);
                }
            }
        }
        return kVar;
    }

    public final x w() {
        if (x.f30077m == null) {
            synchronized (this) {
                x.f30077m = new x();
                Unit unit = Unit.f80348a;
            }
        }
        x xVar = x.f30077m;
        if (xVar != null) {
            return xVar;
        }
        Intrinsics.r("instance");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13, int i14) {
        this(0);
        this.f129091a = i13;
        int i15 = 2;
        if (i13 == 2) {
            this(i15);
            return;
        }
        int i16 = 17;
        if (i13 == 17) {
            this(i16);
            return;
        }
        switch (i13) {
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }
}
