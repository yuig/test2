package se;

import android.content.Context;
import androidx.media3.ui.z;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: u */
    public static g f112336u;

    /* renamed from: a */
    public final Context f112340a;

    /* renamed from: b */
    public final Object f112341b;

    /* renamed from: c */
    public final Class f112342c;

    /* renamed from: d */
    public final Class f112343d;

    /* renamed from: e */
    public final Class f112344e;

    /* renamed from: f */
    public final Class f112345f;

    /* renamed from: g */
    public final Class f112346g;

    /* renamed from: h */
    public final Class f112347h;

    /* renamed from: i */
    public final Class f112348i;

    /* renamed from: j */
    public final Method f112349j;

    /* renamed from: k */
    public final Method f112350k;

    /* renamed from: l */
    public final Method f112351l;

    /* renamed from: m */
    public final Method f112352m;

    /* renamed from: n */
    public final Method f112353n;

    /* renamed from: o */
    public final Method f112354o;

    /* renamed from: p */
    public final Method f112355p;

    /* renamed from: q */
    public final k f112356q;

    /* renamed from: r */
    public final CopyOnWriteArraySet f112357r = new CopyOnWriteArraySet();

    /* renamed from: s */
    public static final me.f f112334s = new me.f(11, 0);

    /* renamed from: t */
    public static final AtomicBoolean f112335t = new AtomicBoolean(false);

    /* renamed from: v */
    public static final AtomicBoolean f112337v = new AtomicBoolean(false);

    /* renamed from: w */
    public static final ConcurrentHashMap f112338w = new ConcurrentHashMap();

    /* renamed from: x */
    public static final ConcurrentHashMap f112339x = new ConcurrentHashMap();

    public g(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, k kVar) {
        this.f112340a = context;
        this.f112341b = obj;
        this.f112342c = cls;
        this.f112343d = cls2;
        this.f112344e = cls3;
        this.f112345f = cls4;
        this.f112346g = cls5;
        this.f112347h = cls6;
        this.f112348i = cls7;
        this.f112349j = method;
        this.f112350k = method2;
        this.f112351l = method3;
        this.f112352m = method4;
        this.f112353n = method5;
        this.f112354o = method6;
        this.f112355p = method7;
        this.f112356q = kVar;
    }

    public static final /* synthetic */ g a() {
        if (p001if.a.b(g.class)) {
            return null;
        }
        try {
            return f112336u;
        } catch (Throwable th3) {
            p001if.a.a(g.class, th3);
            return null;
        }
    }

    public final void b(v.h querySkuRunnable) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter("inapp", "skuType");
            Intrinsics.checkNotNullParameter(querySkuRunnable, "querySkuRunnable");
            Object h10 = l.h(this.f112343d, l.h(this.f112342c, this.f112341b, this.f112349j, "inapp"), this.f112350k, new Object[0]);
            List list = h10 instanceof List ? (List) h10 : null;
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object h13 = l.h(this.f112344e, it.next(), this.f112351l, new Object[0]);
                    String str = h13 instanceof String ? (String) h13 : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String skuID = jSONObject.getString("productId");
                            arrayList.add(skuID);
                            ConcurrentHashMap concurrentHashMap = f112338w;
                            Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                            concurrentHashMap.put(skuID, jSONObject);
                        }
                    }
                }
                d(arrayList, querySkuRunnable);
            } catch (JSONException unused) {
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void c(z zVar) {
        Class cls = this.f112348i;
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new f(this, zVar, 0));
            Intrinsics.checkNotNullExpressionValue(newProxyInstance, "newProxyInstance(\n            purchaseHistoryResponseListenerClazz.classLoader,\n            arrayOf(purchaseHistoryResponseListenerClazz),\n            PurchaseHistoryResponseListenerWrapper(runnable))");
            l.h(this.f112342c, this.f112341b, this.f112355p, "inapp", newProxyInstance);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        Class cls = this.f112347h;
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new f(this, runnable, 1));
            Intrinsics.checkNotNullExpressionValue(newProxyInstance, "newProxyInstance(\n            skuDetailsResponseListenerClazz.classLoader,\n            arrayOf(skuDetailsResponseListenerClazz),\n            SkuDetailsResponseListenerWrapper(runnable))");
            Object a13 = this.f112356q.a(arrayList);
            l.h(this.f112342c, this.f112341b, this.f112354o, a13, newProxyInstance);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void e() {
        Method d2;
        Class cls = this.f112342c;
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Class b13 = l.b("com.android.billingclient.api.BillingClientStateListener");
            if (b13 == null || (d2 = l.d(cls, "startConnection", b13)) == null) {
                return;
            }
            Object newProxyInstance = Proxy.newProxyInstance(b13.getClassLoader(), new Class[]{b13}, new e(0));
            Intrinsics.checkNotNullExpressionValue(newProxyInstance, "newProxyInstance(\n            listenerClazz.classLoader, arrayOf(listenerClazz), BillingClientStateListenerWrapper())");
            l.h(cls, this.f112341b, d2, newProxyInstance);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
