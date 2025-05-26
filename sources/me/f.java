package me;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.AccessToken;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import df.c1;
import df.j1;
import df.k1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import le.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t3.s1;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a */
    public final /* synthetic */ int f86985a;

    public /* synthetic */ f(int i13) {
        this.f86985a = i13;
    }

    public static final int a(int[] iArr) {
        int i13 = ve.a.f125644d;
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i14 = iArr[0];
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i15 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                i14 *= iArr[i15];
                if (i15 == length) {
                    break;
                }
                i15++;
            }
        }
        return i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r4.equals("r5") == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        r5 = new kotlin.text.Regex("[^a-z]+").replace(r5, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r4.equals("r4") == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.util.HashMap r3, java.lang.String r4, java.lang.String r5) {
        /*
            me.f r0 = ne.d.f90439e
            int r0 = r4.hashCode()
            r1 = 0
            switch(r0) {
                case 3585: goto L5e;
                case 3586: goto L47;
                case 3587: goto L3e;
                case 3588: goto Lc;
                default: goto La;
            }
        La:
            goto L84
        Lc:
            java.lang.String r0 = "r6"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L16
            goto L84
        L16:
            java.lang.String r0 = "-"
            boolean r2 = kotlin.text.StringsKt.E(r5, r0, r1)
            if (r2 == 0) goto L84
            kotlin.text.Regex r2 = new kotlin.text.Regex
            r2.<init>(r0)
            java.util.List r5 = r2.f(r1, r5)
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.Object[] r5 = r5.toArray(r0)
            if (r5 == 0) goto L36
            java.lang.String[] r5 = (java.lang.String[]) r5
            r5 = r5[r1]
            goto L84
        L36:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
            r3.<init>(r4)
            throw r3
        L3e:
            java.lang.String r0 = "r5"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L50
            goto L84
        L47:
            java.lang.String r0 = "r4"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L50
            goto L84
        L50:
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "[^a-z]+"
            r0.<init>(r1)
            java.lang.String r1 = ""
            java.lang.String r5 = r0.replace(r5, r1)
            goto L84
        L5e:
            java.lang.String r0 = "r3"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L67
            goto L84
        L67:
            java.lang.String r0 = "m"
            boolean r2 = kotlin.text.z.p(r5, r0, r1)
            if (r2 != 0) goto L83
            java.lang.String r2 = "b"
            boolean r2 = kotlin.text.z.p(r5, r2, r1)
            if (r2 != 0) goto L83
            java.lang.String r2 = "ge"
            boolean r5 = kotlin.text.z.p(r5, r2, r1)
            if (r5 == 0) goto L80
            goto L83
        L80:
            java.lang.String r5 = "f"
            goto L84
        L83:
            r5 = r0
        L84:
            r3.put(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.f.b(java.util.HashMap, java.lang.String, java.lang.String):void");
    }

    public static final boolean c(String pathID, String str) {
        HashSet hashSet = ye.f.f138834e;
        ye.b bVar = ye.b.f138819a;
        String str2 = null;
        if (!p001if.a.b(ye.b.class)) {
            try {
                Intrinsics.checkNotNullParameter(pathID, "pathID");
                LinkedHashMap linkedHashMap = ye.b.f138820b;
                if (linkedHashMap.containsKey(pathID)) {
                    str2 = (String) linkedHashMap.get(pathID);
                }
            } catch (Throwable th3) {
                p001if.a.a(ye.b.class, th3);
            }
        }
        if (str2 == null) {
            return false;
        }
        int i13 = 1;
        if (!Intrinsics.d(str2, "other")) {
            j1.x1(new v(str2, str, i13));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.view.View r6, android.view.View r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "hostView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "activityName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r6.hashCode()
            java.util.HashSet r1 = ye.f.f138834e
            java.lang.Class<ye.f> r1 = ye.f.class
            boolean r2 = p001if.a.b(r1)
            r3 = 0
            if (r2 == 0) goto L20
        L1e:
            r2 = r3
            goto L28
        L20:
            java.util.HashSet r2 = ye.f.f138834e     // Catch: java.lang.Throwable -> L23
            goto L28
        L23:
            r2 = move-exception
            p001if.a.a(r1, r2)
            goto L1e
        L28:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L9f
            qe.h r2 = qe.h.f103629a
            ye.f r2 = new ye.f
            r2.<init>(r6, r7, r8)
            java.lang.Class<qe.h> r7 = qe.h.class
            boolean r8 = p001if.a.b(r7)
            if (r8 == 0) goto L42
            goto L8a
        L42:
            java.lang.String r8 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)     // Catch: java.lang.Throwable -> L60
            java.lang.String r8 = "android.view.View"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L60 java.lang.Throwable -> L62 java.lang.Exception -> L8a
            java.lang.String r4 = "mListenerInfo"
            java.lang.reflect.Field r8 = r8.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L60 java.lang.Throwable -> L62 java.lang.Exception -> L8a
            java.lang.String r4 = "android.view.View$ListenerInfo"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L60 java.lang.Throwable -> L63 java.lang.Exception -> L8a
            java.lang.String r5 = "mOnClickListener"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L60 java.lang.Throwable -> L63 java.lang.Exception -> L8a
            goto L64
        L60:
            r6 = move-exception
            goto L87
        L62:
            r8 = r3
        L63:
            r4 = r3
        L64:
            if (r8 == 0) goto L83
            if (r4 != 0) goto L69
            goto L83
        L69:
            r5 = 1
            r8.setAccessible(r5)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L8a
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L8a
            r8.setAccessible(r5)     // Catch: java.lang.Throwable -> L60 java.lang.IllegalAccessException -> L78 java.lang.Exception -> L8a
            java.lang.Object r8 = r8.get(r6)     // Catch: java.lang.Throwable -> L60 java.lang.IllegalAccessException -> L78 java.lang.Exception -> L8a
            goto L79
        L78:
            r8 = r3
        L79:
            if (r8 != 0) goto L7f
            r6.setOnClickListener(r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L8a
            goto L8a
        L7f:
            r4.set(r8, r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L8a
            goto L8a
        L83:
            r6.setOnClickListener(r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L8a
            goto L8a
        L87:
            p001if.a.a(r7, r6)
        L8a:
            boolean r6 = p001if.a.b(r1)
            if (r6 == 0) goto L91
            goto L98
        L91:
            java.util.HashSet r3 = ye.f.f138834e     // Catch: java.lang.Throwable -> L94
            goto L98
        L94:
            r6 = move-exception
            p001if.a.a(r1, r6)
        L98:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r3.add(r6)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.f.d(android.view.View, android.view.View, java.lang.String):void");
    }

    public static a0 e(String str, AccessToken accessToken, String str2) {
        String str3;
        Intrinsics.checkNotNullParameter("app_indexing", "requestType");
        String str4 = a0.f83002j;
        int i13 = 1;
        a0 B = wc.b.B(accessToken, s1.e(new Object[]{str2}, 1, Locale.US, "%s/app_indexing", "java.lang.String.format(locale, format, *args)"), null, null);
        Bundle bundle = B.f83009d;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("tree", str);
        Context a13 = le.v.a();
        try {
            str3 = a13.getPackageManager().getPackageInfo(a13.getPackageName(), 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str3, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
        } catch (PackageManager.NameNotFoundException unused) {
            str3 = "";
        }
        bundle.putString("app_version", str3);
        bundle.putString("platform", "android");
        bundle.putString("request_type", "app_indexing");
        if (Intrinsics.d("app_indexing", "app_indexing")) {
            bundle.putString("device_session_id", pe.d.a());
        }
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        B.f83009d = bundle;
        B.k(new oe.e(i13));
        return B;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(android.content.Context r26) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.f.f(android.content.Context):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r8.getClass().getSimpleName(), (java.lang.String) ep.b.i(r11, 1)) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
    
        if (r1.f103622c != r8.getId()) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0109, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r6, r5) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r7, r6) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0160, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r7, r6) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r1, r11) == false) goto L167;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList g(android.view.View r8, java.util.List r9, int r10, int r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.f.g(android.view.View, java.util.List, int, int, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList h(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                View child = viewGroup.getChildAt(i13);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    arrayList.add(child);
                }
                if (i14 >= childCount) {
                    break;
                }
                i13 = i14;
            }
        }
        return arrayList;
    }

    public static qe.c j(JSONObject mapping) {
        int length;
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        String eventName = mapping.getString("event_name");
        String string = mapping.getString("method");
        Intrinsics.checkNotNullExpressionValue(string, "mapping.getString(\"method\")");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = string.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        qe.b valueOf = qe.b.valueOf(upperCase);
        String string2 = mapping.getString("event_type");
        Intrinsics.checkNotNullExpressionValue(string2, "mapping.getString(\"event_type\")");
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase2 = string2.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
        qe.a valueOf2 = qe.a.valueOf(upperCase2);
        String appVersion = mapping.getString("app_version");
        JSONArray jSONArray = mapping.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        int length2 = jSONArray.length();
        int i13 = 0;
        if (length2 > 0) {
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                JSONObject jsonPath = jSONArray.getJSONObject(i14);
                Intrinsics.checkNotNullExpressionValue(jsonPath, "jsonPath");
                arrayList.add(new qe.f(jsonPath));
                if (i15 >= length2) {
                    break;
                }
                i14 = i15;
            }
        }
        String pathType = mapping.optString("path_type", "absolute");
        JSONArray optJSONArray = mapping.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            while (true) {
                int i16 = i13 + 1;
                JSONObject jsonParameter = optJSONArray.getJSONObject(i13);
                Intrinsics.checkNotNullExpressionValue(jsonParameter, "jsonParameter");
                arrayList2.add(new qe.d(jsonParameter));
                if (i16 >= length) {
                    break;
                }
                i13 = i16;
            }
        }
        String componentId = mapping.optString("component_id");
        String activityName = mapping.optString("activity_name");
        Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
        Intrinsics.checkNotNullExpressionValue(appVersion, "appVersion");
        Intrinsics.checkNotNullExpressionValue(componentId, "componentId");
        Intrinsics.checkNotNullExpressionValue(pathType, "pathType");
        Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
        return new qe.c(eventName, valueOf, valueOf2, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
    }

    public static Bundle k(qe.c cVar, View rootView, View hostView) {
        ArrayList g13;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Bundle bundle = new Bundle();
        if (cVar == null) {
            return bundle;
        }
        List<qe.d> unmodifiableList = Collections.unmodifiableList(cVar.f103614c);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(parameters)");
        if (unmodifiableList != null) {
            for (qe.d dVar : unmodifiableList) {
                String str = dVar.f103617b;
                String str2 = dVar.f103616a;
                if (str == null || str.length() <= 0) {
                    ArrayList arrayList = dVar.f103618c;
                    if (arrayList.size() > 0) {
                        if (Intrinsics.d(dVar.f103619d, "relative")) {
                            String simpleName = hostView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName, "hostView.javaClass.simpleName");
                            g13 = g(hostView, arrayList, 0, -1, simpleName);
                        } else {
                            String simpleName2 = rootView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName2, "rootView.javaClass.simpleName");
                            g13 = g(rootView, arrayList, 0, -1, simpleName2);
                        }
                        Iterator it = g13.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                pe.e eVar = (pe.e) it.next();
                                if (eVar.a() != null) {
                                    qe.h hVar = qe.h.f103629a;
                                    String i13 = qe.h.i(eVar.a());
                                    if (i13.length() > 0) {
                                        bundle.putString(str2, i13);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    bundle.putString(str2, dVar.f103617b);
                }
            }
        }
        return bundle;
    }

    public static Uri l(String str, int i13, int i14, String str2) {
        k1.e(str, "userId");
        int max = Math.max(i13, 0);
        int max2 = Math.max(i14, 0);
        if (max == 0 && max2 == 0) {
            throw new IllegalArgumentException("Either width or height must be greater than 0".toString());
        }
        Uri.Builder path = Uri.parse(c1.c()).buildUpon().path(s1.e(new Object[]{le.v.e(), str}, 2, Locale.US, "%s/%s/picture", "java.lang.String.format(locale, format, *args)"));
        if (max2 != 0) {
            path.appendQueryParameter("height", String.valueOf(max2));
        }
        if (max != 0) {
            path.appendQueryParameter("width", String.valueOf(max));
        }
        path.appendQueryParameter("migration_overrides", "{october_2012:true}");
        if (!j1.V0(str2)) {
            path.appendQueryParameter("access_token", str2);
        } else if (j1.V0(le.v.c()) || j1.V0(le.v.b())) {
            Log.d("ImageRequest", "Needs access token to fetch profile picture. Without an access token a default silhoutte picture is returned");
        } else {
            path.appendQueryParameter("access_token", le.v.b() + '|' + le.v.c());
        }
        Uri build = path.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    public static ConcurrentHashMap m() {
        f fVar = se.g.f112334s;
        if (p001if.a.b(se.g.class)) {
            return null;
        }
        try {
            return se.g.f112338w;
        } catch (Throwable th3) {
            p001if.a.a(se.g.class, th3);
            return null;
        }
    }

    public static Uri n(String action, Bundle bundle) {
        Intrinsics.checkNotNullParameter(action, "action");
        return j1.u(c1.a(), le.v.e() + "/dialog/" + action, bundle);
    }

    public static AtomicBoolean o() {
        f fVar = se.g.f112334s;
        if (p001if.a.b(se.g.class)) {
            return null;
        }
        try {
            return se.g.f112337v;
        } catch (Throwable th3) {
            p001if.a.a(se.g.class, th3);
            return null;
        }
    }

    public static void p(String event, String str, float[] fArr) {
        ye.d dVar = ye.d.f138825a;
        if (!p001if.a.b(ye.d.class)) {
            try {
                Intrinsics.checkNotNullParameter(event, "event");
                if (ye.d.f138827c.contains(event)) {
                    m mVar = new r(le.v.a()).f87020a;
                    mVar.getClass();
                    if (p001if.a.b(mVar)) {
                        return;
                    }
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("_is_suggested_event", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
                        bundle.putString("_button_text", str);
                        mVar.d(event, bundle);
                        return;
                    } catch (Throwable th3) {
                        p001if.a.a(mVar, th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                p001if.a.a(ye.d.class, th4);
            }
        }
        ye.d dVar2 = ye.d.f138825a;
        if (p001if.a.b(ye.d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (ye.d.f138828d.contains(event)) {
                Bundle bundle2 = new Bundle();
                try {
                    bundle2.putString("event_name", event);
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder sb3 = new StringBuilder();
                    int length = fArr.length;
                    int i13 = 0;
                    while (i13 < length) {
                        float f13 = fArr[i13];
                        i13++;
                        sb3.append(f13);
                        sb3.append(",");
                    }
                    jSONObject.put("dense", sb3.toString());
                    jSONObject.put("button_text", str);
                    bundle2.putString("metadata", jSONObject.toString());
                    String str2 = a0.f83002j;
                    String format = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{le.v.b()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                    a0 B = wc.b.B(null, format, null, null);
                    Intrinsics.checkNotNullParameter(bundle2, "<set-?>");
                    B.f83009d = bundle2;
                    B.d();
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th5) {
            p001if.a.a(ye.d.class, th5);
        }
    }

    public static void s(Activity activity) {
        View v13;
        Intrinsics.checkNotNullParameter(activity, "activity");
        int hashCode = activity.hashCode();
        f fVar = ye.e.f138829d;
        HashMap hashMap = null;
        if (!p001if.a.b(ye.e.class)) {
            try {
                hashMap = ye.e.f138830e;
            } catch (Throwable th3) {
                p001if.a.a(ye.e.class, th3);
            }
        }
        ye.e eVar = (ye.e) hashMap.remove(Integer.valueOf(hashCode));
        if (eVar == null || p001if.a.b(ye.e.class)) {
            return;
        }
        try {
            if (!p001if.a.b(eVar)) {
                try {
                    if (eVar.f138833c.getAndSet(false) && (v13 = ue.c.v((Activity) eVar.f138831a.get())) != null) {
                        ViewTreeObserver viewTreeObserver = v13.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnGlobalLayoutListener(eVar);
                        }
                    }
                } catch (Throwable th4) {
                    p001if.a.a(eVar, th4);
                }
            }
        } catch (Throwable th5) {
            p001if.a.a(ye.e.class, th5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #3 {all -> 0x002e, blocks: (B:3:0x0001, B:8:0x0018, B:14:0x002a, B:15:0x0030, B:21:0x0044, B:22:0x004b, B:28:0x003d, B:33:0x0012, B:30:0x000e, B:11:0x0026, B:25:0x0039), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #3 {all -> 0x002e, blocks: (B:3:0x0001, B:8:0x0018, B:14:0x002a, B:15:0x0030, B:21:0x0044, B:22:0x004b, B:28:0x003d, B:33:0x0012, B:30:0x000e, B:11:0x0026, B:25:0x0039), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized pe.g i() {
        /*
            r4 = this;
            monitor-enter(r4)
            me.f r0 = pe.g.f99907f     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<pe.g> r0 = pe.g.class
            boolean r1 = p001if.a.b(r0)     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            if (r1 == 0) goto Le
        Lc:
            r0 = r2
            goto L16
        Le:
            pe.g r0 = pe.g.f99908g     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r1 = move-exception
            p001if.a.a(r0, r1)     // Catch: java.lang.Throwable -> L2e
            goto Lc
        L16:
            if (r0 != 0) goto L30
            pe.g r0 = new pe.g     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<pe.g> r1 = pe.g.class
            boolean r3 = p001if.a.b(r1)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L26
            goto L30
        L26:
            pe.g.f99908g = r0     // Catch: java.lang.Throwable -> L29
            goto L30
        L29:
            r0 = move-exception
            p001if.a.a(r1, r0)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r0 = move-exception
            goto L4c
        L30:
            java.lang.Class<pe.g> r0 = pe.g.class
            boolean r1 = p001if.a.b(r0)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L39
            goto L40
        L39:
            pe.g r2 = pe.g.f99908g     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r1 = move-exception
            p001if.a.a(r0, r1)     // Catch: java.lang.Throwable -> L2e
        L40:
            if (r2 == 0) goto L44
            monitor-exit(r4)
            return r2
        L44:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L2e
        L4c:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: me.f.i():pe.g");
    }

    public final synchronized void q(int i13, com.facebook.login.s callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        HashMap hashMap = df.j.f54764c;
        if (hashMap.containsKey(Integer.valueOf(i13))) {
            return;
        }
        hashMap.put(Integer.valueOf(i13), callback);
    }

    public final void r(Activity activity) {
        View v13;
        View v14;
        HashMap hashMap = null;
        switch (this.f86985a) {
            case 3:
                Intrinsics.checkNotNullParameter(activity, "activity");
                int hashCode = activity.hashCode();
                f fVar = ne.d.f90439e;
                if (!p001if.a.b(ne.d.class)) {
                    try {
                        hashMap = ne.d.f90440f;
                    } catch (Throwable th3) {
                        p001if.a.a(ne.d.class, th3);
                    }
                }
                Integer valueOf = Integer.valueOf(hashCode);
                Object obj = hashMap.get(valueOf);
                if (obj == null) {
                    obj = new ne.d(activity);
                    hashMap.put(valueOf, obj);
                }
                ne.d dVar = (ne.d) obj;
                if (!p001if.a.b(ne.d.class)) {
                    try {
                        if (!p001if.a.b(dVar)) {
                            try {
                                if (!dVar.f90444d.getAndSet(true) && (v13 = ue.c.v((Activity) dVar.f90443c.get())) != null) {
                                    ViewTreeObserver viewTreeObserver = v13.getViewTreeObserver();
                                    if (viewTreeObserver.isAlive()) {
                                        viewTreeObserver.addOnGlobalFocusChangeListener(dVar);
                                        break;
                                    }
                                }
                            } catch (Throwable th4) {
                                p001if.a.a(dVar, th4);
                                return;
                            }
                        }
                    } catch (Throwable th5) {
                        p001if.a.a(ne.d.class, th5);
                        return;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                int hashCode2 = activity.hashCode();
                f fVar2 = ye.e.f138829d;
                if (!p001if.a.b(ye.e.class)) {
                    try {
                        hashMap = ye.e.f138830e;
                    } catch (Throwable th6) {
                        p001if.a.a(ye.e.class, th6);
                    }
                }
                Integer valueOf2 = Integer.valueOf(hashCode2);
                Object obj2 = hashMap.get(valueOf2);
                if (obj2 == null) {
                    obj2 = new ye.e(activity);
                    hashMap.put(valueOf2, obj2);
                }
                ye.e eVar = (ye.e) obj2;
                if (!p001if.a.b(ye.e.class)) {
                    try {
                        if (!p001if.a.b(eVar)) {
                            try {
                                if (!eVar.f138833c.getAndSet(true) && (v14 = ue.c.v((Activity) eVar.f138831a.get())) != null) {
                                    ViewTreeObserver viewTreeObserver2 = v14.getViewTreeObserver();
                                    if (viewTreeObserver2.isAlive()) {
                                        viewTreeObserver2.addOnGlobalLayoutListener(eVar);
                                        eVar.a();
                                    }
                                }
                            } catch (Throwable th7) {
                                p001if.a.a(eVar, th7);
                            }
                        }
                        break;
                    } catch (Throwable th8) {
                        p001if.a.a(ye.e.class, th8);
                        return;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13, int i14) {
        this(0);
        this.f86985a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
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
