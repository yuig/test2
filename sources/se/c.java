package se;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import le.v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f112322a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f112323b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f112324c;

    /* renamed from: d, reason: collision with root package name */
    public static a f112325d;

    /* renamed from: e, reason: collision with root package name */
    public static b f112326e;

    /* renamed from: f, reason: collision with root package name */
    public static Intent f112327f;

    /* renamed from: g, reason: collision with root package name */
    public static Object f112328g;

    public static final void a(Context context, ArrayList arrayList, boolean z13) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String purchase = (String) it.next();
            try {
                String sku = new JSONObject(purchase).getString("productId");
                Intrinsics.checkNotNullExpressionValue(sku, "sku");
                Intrinsics.checkNotNullExpressionValue(purchase, "purchase");
                hashMap.put(sku, purchase);
                arrayList2.add(sku);
            } catch (JSONException e13) {
                Log.e("se.c", "Error parsing in-app purchase data.", e13);
            }
        }
        h hVar = h.f112358a;
        for (Map.Entry entry : h.h(context, arrayList2, f112328g, z13).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) hashMap.get(str);
            if (str3 != null) {
                ue.g.b(str3, str2, z13);
            }
        }
    }

    public static final void b() {
        if (f112323b == null) {
            int i13 = 0;
            Boolean valueOf = Boolean.valueOf(l.b("com.android.vending.billing.IInAppBillingService$Stub") != null);
            f112323b = valueOf;
            if (!Intrinsics.d(valueOf, Boolean.FALSE)) {
                f112324c = Boolean.valueOf(l.b("com.android.billingclient.api.ProxyBillingActivity") != null);
                h.a();
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                Intrinsics.checkNotNullExpressionValue(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
                f112327f = intent;
                f112325d = new a();
                f112326e = new b(i13);
            }
        }
        if (!Intrinsics.d(f112323b, Boolean.FALSE) && ue.g.a()) {
            c();
        }
    }

    public static void c() {
        if (f112322a.compareAndSet(false, true)) {
            Context a13 = v.a();
            if (a13 instanceof Application) {
                Application application = (Application) a13;
                b bVar = f112326e;
                if (bVar == null) {
                    Intrinsics.r("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(bVar);
                Intent intent = f112327f;
                if (intent == null) {
                    Intrinsics.r("intent");
                    throw null;
                }
                a aVar = f112325d;
                if (aVar != null) {
                    a13.bindService(intent, aVar, 1);
                } else {
                    Intrinsics.r("serviceConnection");
                    throw null;
                }
            }
        }
    }
}
