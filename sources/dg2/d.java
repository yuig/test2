package dg2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import tc0.u;

/* loaded from: classes4.dex */
public final class d implements bi2.a {

    /* renamed from: a, reason: collision with root package name */
    public final e f54947a;

    public d(e eVar) {
        this.f54947a = eVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle extras;
        Set<String> keySet;
        Bundle bundle2;
        Map d2;
        Set J0;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = activity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || (keySet = extras.keySet()) == null || !keySet.containsAll(f0.j("from", "google.message_id")) || (bundle2 = activity.getIntent().getExtras()) == null) {
            return;
        }
        String string = bundle2.getString("from");
        String string2 = bundle2.getString("google.message_id");
        Intrinsics.checkNotNullParameter(bundle2, "bundle");
        Set<String> keySet2 = bundle2.keySet();
        if (keySet2 == null || (J0 = CollectionsKt.J0(keySet2)) == null) {
            d2 = z0.d();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : J0) {
                String it = (String) obj;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (!z.p(it, "google.", false) && !z.p(it, "gcm.", false) && !z.p(it, "com.google.firebase", false) && !Intrinsics.d(it, "from") && !Intrinsics.d(it, "message_type") && !Intrinsics.d(it, "collapse_key")) {
                    arrayList.add(obj);
                }
            }
            int a13 = y0.a(g0.q(arrayList, 10));
            if (a13 < 16) {
                a13 = 16;
            }
            d2 = new LinkedHashMap(a13);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                String string3 = bundle2.getString((String) next);
                if (string3 == null) {
                    string3 = "";
                }
                d2.put(next, string3);
            }
        }
        th2.l type = d2.isEmpty() ^ true ? th2.l.NOTIFICATION_AND_DATA : th2.l.NOTIFICATION;
        Intrinsics.checkNotNullParameter(type, "type");
        e eVar = this.f54947a;
        if (eVar != null) {
            Intrinsics.checkNotNullParameter(type, "type");
            eVar.e(uf2.c.f122114k, new u(eVar, (String) null, type, (String) null, string2, string, (Integer) null));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
