package ue;

import android.content.Context;
import android.util.Log;
import df.j1;
import df.u0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import le.g0;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f121949a = z0.f(new Pair(d.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), new Pair(d.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    public static final JSONObject a(d activityType, df.c cVar, String str, boolean z13, Context context) {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f121949a.get(activityType));
        wc.b bVar = me.l.f86994b;
        String str2 = me.c.f86971a;
        if (!me.c.f86974d) {
            Log.w(me.c.f86971a, "initStore should have been called before calling setUserID");
            me.c.a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = me.c.f86972b;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str3 = me.c.f86973c;
            reentrantReadWriteLock.readLock().unlock();
            if (str3 != null) {
                jSONObject.put("app_user_id", str3);
            }
            j1.z1(jSONObject, cVar, str, z13, context);
            try {
                j1.A1(jSONObject, context);
            } catch (Exception e13) {
                wc.b bVar2 = u0.f54860d;
                wc.b.y(g0.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e13.toString());
            }
            JSONObject j03 = j1.j0();
            if (j03 != null) {
                Iterator<String> keys = j03.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, j03.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th3) {
            me.c.f86972b.readLock().unlock();
            throw th3;
        }
    }
}
