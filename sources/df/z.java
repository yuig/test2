package df;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.FacebookException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54888a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f54889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f54890c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f54891d;

    public /* synthetic */ z(Context context, String str, String str2) {
        this.f54889b = context;
        this.f54890c = str;
        this.f54891d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        int i13 = 0;
        switch (this.f54888a) {
            case 0:
                String applicationId = this.f54890c;
                Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
                Context context = this.f54889b;
                Intrinsics.checkNotNullParameter(context, "$context");
                String gateKeepersKey = this.f54891d;
                Intrinsics.checkNotNullParameter(gateKeepersKey, "$gateKeepersKey");
                JSONObject a13 = a0.a();
                if (a13.length() != 0) {
                    a0.d(applicationId, a13);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, a13.toString()).apply();
                    a0.f54700d = Long.valueOf(System.currentTimeMillis());
                }
                a0.e();
                a0.f54697a.set(false);
                return;
            default:
                Context context2 = this.f54889b;
                String settingsKey = this.f54890c;
                String applicationId2 = this.f54891d;
                e0 e0Var = e0.f54743a;
                Intrinsics.checkNotNullParameter(context2, "$context");
                Intrinsics.checkNotNullParameter(settingsKey, "$settingsKey");
                Intrinsics.checkNotNullParameter(applicationId2, "$applicationId");
                SharedPreferences sharedPreferences = context2.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                c0 c0Var = null;
                String string = sharedPreferences.getString(settingsKey, null);
                boolean V0 = j1.V0(string);
                e0 e0Var2 = e0.f54743a;
                if (!V0) {
                    if (string == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                        le.v vVar = le.v.f83104a;
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        c0Var = e0.d(applicationId2, jSONObject);
                    }
                }
                JSONObject a14 = e0.a();
                e0.d(applicationId2, a14);
                sharedPreferences.edit().putString(settingsKey, a14.toString()).apply();
                if (c0Var != null) {
                    String str = c0Var.f54735l;
                    if (!e0.f54749g && str != null && str.length() > 0) {
                        e0.f54749g = true;
                        Log.w(e0.f54744b, str);
                    }
                }
                AtomicBoolean atomicBoolean = a0.f54697a;
                Intrinsics.checkNotNullParameter(applicationId2, "applicationId");
                JSONObject a15 = a0.a();
                le.v.a().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(t3.s1.d(new Object[]{applicationId2}, 1, "com.facebook.internal.APP_GATEKEEPERS.%s", "java.lang.String.format(format, *args)"), a15.toString()).apply();
                a0.d(applicationId2, a15);
                me.r rVar = ue.g.f121953a;
                Context a16 = le.v.a();
                String applicationId3 = le.v.b();
                if (le.o0.b()) {
                    if (a16 instanceof Application) {
                        wc.b bVar = me.l.f86994b;
                        Application context3 = (Application) a16;
                        Intrinsics.checkNotNullParameter(context3, "application");
                        wc.j jVar = me.m.f86996c;
                        Intrinsics.checkNotNullParameter(context3, "application");
                        if (!le.v.f83119p.get()) {
                            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
                        }
                        String str2 = me.c.f86971a;
                        if (!me.c.f86974d) {
                            wc.b bVar2 = me.r.f87019b;
                            if (me.m.b() == null) {
                                wc.j.y();
                            }
                            ScheduledThreadPoolExecutor b13 = me.m.b();
                            if (b13 == null) {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            b13.execute(new v.h(6));
                        }
                        me.w wVar = me.w.f87032a;
                        if (!p001if.a.b(me.w.class)) {
                            try {
                                if (!me.w.f87035d.get()) {
                                    me.w.f87032a.b();
                                }
                            } catch (Throwable th3) {
                                p001if.a.a(me.w.class, th3);
                            }
                        }
                        le.v vVar2 = le.v.f83104a;
                        if (!p001if.a.b(le.v.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(context3, "context");
                                Intrinsics.checkNotNullParameter(applicationId3, "applicationId");
                                le.v.d().execute(new le.u(i13, context3.getApplicationContext(), applicationId3));
                                y yVar = y.f54881a;
                                if (y.b(v.OnDeviceEventProcessing) && we.a.a()) {
                                    we.a.b(applicationId3);
                                }
                            } catch (Throwable th4) {
                                p001if.a.a(le.v.class, th4);
                            }
                        }
                        ue.b.d(context3, applicationId3);
                    } else {
                        Log.w("ue.g", "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
                    }
                }
                e0.f54747e.set(e0.f54746d.containsKey(applicationId2) ? d0.SUCCESS : d0.ERROR);
                e0Var2.e();
                return;
        }
    }

    public /* synthetic */ z(String str, Context context, String str2) {
        this.f54890c = str;
        this.f54889b = context;
        this.f54891d = str2;
    }
}
