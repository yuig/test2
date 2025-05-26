package com.bugsnag.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f29137a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f29138b = new WeakHashMap();

    public a(n nVar) {
        this.f29137a = nVar;
    }

    public static /* synthetic */ void b(a aVar, Activity activity, String str) {
        aVar.a(activity, str, new LinkedHashMap());
    }

    public final void a(Activity activity, String str, Map map) {
        WeakHashMap weakHashMap = this.f29138b;
        String str2 = (String) weakHashMap.get(activity);
        if (str2 != null) {
            map.put("previous", str2);
        }
        this.f29137a.invoke(((Object) activity.getClass().getSimpleName()) + '#' + str, map);
        weakHashMap.put(activity, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        r3 = r14.getIdentifier();
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityCreated(android.app.Activity r13, android.os.Bundle r14) {
        /*
            r12 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = 0
            r2 = 1
            if (r14 == 0) goto Lb
            r14 = r2
            goto Lc
        Lb:
            r14 = r1
        Lc:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            java.lang.String r3 = "hasBundle"
            r0.put(r3, r14)
            android.content.Intent r14 = r13.getIntent()
            if (r14 != 0) goto L1d
            goto Lbf
        L1d:
            java.lang.String r3 = r14.getAction()
            if (r3 != 0) goto L24
            goto L29
        L24:
            java.lang.String r4 = "action"
            r0.put(r4, r3)
        L29:
            java.util.Set r3 = r14.getCategories()
            if (r3 != 0) goto L30
            goto L45
        L30:
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r8 = 0
            r11 = 62
            java.lang.String r5 = ", "
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            java.lang.String r3 = kotlin.collections.CollectionsKt.Z(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r4 = "categories"
            r0.put(r4, r3)
        L45:
            java.lang.String r3 = r14.getType()
            if (r3 != 0) goto L4c
            goto L51
        L4c:
            java.lang.String r4 = "type"
            r0.put(r4, r3)
        L51:
            int r3 = r14.getFlags()
            if (r3 == 0) goto L75
            int r3 = r14.getFlags()
            r4 = 16
            int r4 = kotlin.text.CharsKt.checkRadix(r4)
            java.lang.String r3 = java.lang.Integer.toString(r3, r4)
            java.lang.String r4 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r4 = "0x"
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.n(r3, r4)
            java.lang.String r4 = "flags"
            r0.put(r4, r3)
        L75:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L87
            java.lang.String r3 = b3.b.f(r14)
            if (r3 != 0) goto L82
            goto L87
        L82:
            java.lang.String r4 = "id"
            r0.put(r4, r3)
        L87:
            android.net.Uri r3 = r14.getData()
            if (r3 == 0) goto L8e
            r1 = r2
        L8e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "hasData"
            r0.put(r2, r1)
            java.lang.String r1 = "hasExtras"
            android.os.Bundle r14 = r14.getExtras()     // Catch: java.lang.Exception -> Lbf
            if (r14 != 0) goto La2
        L9f:
            java.lang.Boolean r14 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> Lbf
            goto Lbc
        La2:
            java.util.Set r14 = r14.keySet()     // Catch: java.lang.Exception -> Lbf
            if (r14 != 0) goto La9
            goto L9f
        La9:
            r2 = r14
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Exception -> Lbf
            java.lang.String r3 = ", "
            r7 = 0
            r8 = 0
            r9 = 62
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r14 = kotlin.collections.CollectionsKt.Z(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lbf
            if (r14 != 0) goto Lbc
            goto L9f
        Lbc:
            r0.put(r1, r14)     // Catch: java.lang.Exception -> Lbf
        Lbf:
            kotlin.Unit r14 = kotlin.Unit.f80348a
            java.lang.String r14 = "onCreate()"
            r12.a(r13, r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.a.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(this, activity, "onDestroy()");
        this.f29138b.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(this, activity, "onPause()");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(this, activity, "onResume()");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        b(this, activity, "onSaveInstanceState()");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(this, activity, "onStart()");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        b(this, activity, "onStop()");
    }
}
