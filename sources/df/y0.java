package df;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a */
    public static final y0 f54883a;

    /* renamed from: b */
    public static final String f54884b;

    /* renamed from: c */
    public static final ArrayList f54885c;

    /* renamed from: d */
    public static final AtomicBoolean f54886d;

    /* renamed from: e */
    public static final Integer[] f54887e;

    static {
        y0 y0Var = new y0();
        f54883a = y0Var;
        String name = y0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "NativeProtocol::class.java.name");
        f54884b = name;
        f54885c = y0Var.a();
        ArrayList arrayList = null;
        if (!p001if.a.b(y0Var)) {
            try {
                ArrayList d2 = kotlin.collections.f0.d(new v0(0));
                d2.addAll(y0Var.a());
                arrayList = d2;
            } catch (Throwable th3) {
                p001if.a.a(y0Var, th3);
            }
        }
        y0 y0Var2 = f54883a;
        if (!p001if.a.b(y0Var2)) {
            try {
                HashMap hashMap = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new v0(2));
                ArrayList arrayList3 = f54885c;
                hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
                hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
                hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList);
                hashMap.put("com.facebook.platform.action.request.SHARE_STORY", arrayList3);
            } catch (Throwable th4) {
                p001if.a.a(y0Var2, th4);
            }
        }
        f54886d = new AtomicBoolean(false);
        f54887e = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final int b(TreeSet treeSet, int i13, int[] versionSpec) {
        if (p001if.a.b(y0.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator descendingIterator = treeSet.descendingIterator();
            int i14 = -1;
            while (descendingIterator.hasNext()) {
                Integer fbAppVersion = (Integer) descendingIterator.next();
                Intrinsics.checkNotNullExpressionValue(fbAppVersion, "fbAppVersion");
                i14 = Math.max(i14, fbAppVersion.intValue());
                while (length >= 0 && versionSpec[length] > fbAppVersion.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == fbAppVersion.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(i14, i13);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th3) {
            p001if.a.a(y0.class, th3);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[LOOP:0: B:7:0x0015->B:16:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Intent d(android.content.Context r7) {
        /*
            java.lang.String r0 = "context"
            java.lang.Class<df.y0> r1 = df.y0.class
            boolean r2 = p001if.a.b(r1)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayList r2 = df.y0.f54885c     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L6a
        L15:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L6a
            df.x0 r4 = (df.x0) r4     // Catch: java.lang.Throwable -> L6a
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = "com.facebook.platform.PLATFORM_SERVICE"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = r4.c()     // Catch: java.lang.Throwable -> L6a
            android.content.Intent r4 = r5.setPackage(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = "android.intent.category.DEFAULT"
            android.content.Intent r4 = r4.addCategory(r5)     // Catch: java.lang.Throwable -> L6a
            boolean r5 = p001if.a.b(r1)     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L3e
        L3c:
            r4 = r3
            goto L67
        L3e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)     // Catch: java.lang.Throwable -> L62
            if (r4 != 0) goto L44
            goto L3c
        L44:
            android.content.pm.PackageManager r5 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L62
            r6 = 0
            android.content.pm.ResolveInfo r5 = r5.resolveService(r4, r6)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L50
            goto L3c
        L50:
            java.util.HashSet r6 = df.q.f54832a     // Catch: java.lang.Throwable -> L62
            android.content.pm.ServiceInfo r5 = r5.serviceInfo     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = r5.packageName     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = "resolveInfo.serviceInfo.packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: java.lang.Throwable -> L62
            boolean r5 = df.q.a(r7, r5)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L67
            goto L3c
        L62:
            r4 = move-exception
            p001if.a.a(r1, r4)     // Catch: java.lang.Throwable -> L6a
            goto L3c
        L67:
            if (r4 == 0) goto L15
            return r4
        L6a:
            r7 = move-exception
            goto L6d
        L6c:
            return r3
        L6d:
            p001if.a.a(r1, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: df.y0.d(android.content.Context):android.content.Intent");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[Catch: all -> 0x0094, TryCatch #1 {all -> 0x0094, blocks: (B:6:0x000a, B:12:0x004b, B:14:0x0067, B:17:0x0090, B:24:0x008c, B:25:0x0096, B:27:0x009b, B:46:0x0044, B:32:0x001e, B:34:0x0028, B:36:0x002e, B:39:0x003f, B:43:0x0037, B:19:0x0071, B:21:0x0083), top: B:5:0x000a, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Intent e(android.content.Intent r8, android.os.Bundle r9, com.facebook.FacebookException r10) {
        /*
            java.lang.Class<df.y0> r0 = df.y0.class
            boolean r1 = p001if.a.b(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.lang.String r1 = "requestIntent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)     // Catch: java.lang.Throwable -> L94
            boolean r1 = p001if.a.b(r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r3 = "action_id"
            java.lang.String r4 = "com.facebook.platform.protocol.BRIDGE_ARGS"
            if (r1 == 0) goto L1b
        L19:
            r1 = r2
            goto L48
        L1b:
            if (r8 != 0) goto L1e
            goto L19
        L1e:
            int r1 = i(r8)     // Catch: java.lang.Throwable -> L33
            boolean r1 = j(r1)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L37
            android.os.Bundle r1 = r8.getBundleExtra(r4)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            java.lang.String r1 = r1.getString(r3)     // Catch: java.lang.Throwable -> L33
            goto L3d
        L33:
            r1 = move-exception
            goto L44
        L35:
            r1 = r2
            goto L3d
        L37:
            java.lang.String r1 = "com.facebook.platform.protocol.CALL_ID"
            java.lang.String r1 = r8.getStringExtra(r1)     // Catch: java.lang.Throwable -> L33
        L3d:
            if (r1 == 0) goto L19
            java.util.UUID r1 = java.util.UUID.fromString(r1)     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.Throwable -> L33
            goto L48
        L44:
            p001if.a.a(r0, r1)     // Catch: java.lang.Throwable -> L94
            goto L19
        L48:
            if (r1 != 0) goto L4b
            return r2
        L4b:
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L94
            r5.<init>()     // Catch: java.lang.Throwable -> L94
            java.lang.String r6 = "com.facebook.platform.protocol.PROTOCOL_VERSION"
            int r8 = i(r8)     // Catch: java.lang.Throwable -> L94
            r5.putExtra(r6, r8)     // Catch: java.lang.Throwable -> L94
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L94
            r8.<init>()     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L94
            r8.putString(r3, r1)     // Catch: java.lang.Throwable -> L94
            if (r10 == 0) goto L96
            java.lang.String r1 = "error"
            boolean r3 = p001if.a.b(r0)     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L71
        L6f:
            r3 = r2
            goto L90
        L71:
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> L8b
            r3.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = "error_description"
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Throwable -> L8b
            r3.putString(r6, r7)     // Catch: java.lang.Throwable -> L8b
            boolean r10 = r10 instanceof com.facebook.FacebookOperationCanceledException     // Catch: java.lang.Throwable -> L8b
            if (r10 == 0) goto L90
            java.lang.String r10 = "error_type"
            java.lang.String r6 = "UserCanceled"
            r3.putString(r10, r6)     // Catch: java.lang.Throwable -> L8b
            goto L90
        L8b:
            r10 = move-exception
            p001if.a.a(r0, r10)     // Catch: java.lang.Throwable -> L94
            goto L6f
        L90:
            r8.putBundle(r1, r3)     // Catch: java.lang.Throwable -> L94
            goto L96
        L94:
            r8 = move-exception
            goto La1
        L96:
            r5.putExtra(r4, r8)     // Catch: java.lang.Throwable -> L94
            if (r9 == 0) goto La0
            java.lang.String r8 = "com.facebook.platform.protocol.RESULT_ARGS"
            r5.putExtra(r8, r9)     // Catch: java.lang.Throwable -> L94
        La0:
            return r5
        La1:
            p001if.a.a(r0, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: df.y0.e(android.content.Intent, android.os.Bundle, com.facebook.FacebookException):android.content.Intent");
    }

    public static final Bundle h(Intent intent) {
        if (p001if.a.b(y0.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return !j(i(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th3) {
            p001if.a.a(y0.class, th3);
            return null;
        }
    }

    public static final int i(Intent intent) {
        if (p001if.a.b(y0.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th3) {
            p001if.a.a(y0.class, th3);
            return 0;
        }
    }

    public static final boolean j(int i13) {
        if (p001if.a.b(y0.class)) {
            return false;
        }
        try {
            return kotlin.collections.c0.y(f54887e, Integer.valueOf(i13)) && i13 >= 20140701;
        } catch (Throwable th3) {
            p001if.a.a(y0.class, th3);
            return false;
        }
    }

    public static final void k() {
        if (p001if.a.b(y0.class)) {
            return;
        }
        try {
            if (f54886d.compareAndSet(false, true)) {
                le.v.d().execute(new com.appsflyer.internal.p(7));
            }
        } catch (Throwable th3) {
            p001if.a.a(y0.class, th3);
        }
    }

    public final ArrayList a() {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            return kotlin.collections.f0.d(new v0(1), new v0(3));
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final Intent c(x0 x0Var, String str, Collection collection, String str2, boolean z13, com.facebook.login.c cVar, String str3, String str4, boolean z14, String str5, boolean z15, com.facebook.login.c0 c0Var, boolean z16, boolean z17, String str6) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            String b13 = x0Var.b();
            if (b13 == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(x0Var.c(), b13).putExtra("client_id", str);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            le.v vVar = le.v.f83104a;
            putExtra.putExtra("facebook_sdk_version", "15.0.2");
            if (collection != null && !collection.isEmpty()) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!j1.V0(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra(AnimatedTarget.PROPERTY_STATE, str3);
            putExtra.putExtra("response_type", x0Var.d());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", "true");
            if (z13) {
                putExtra.putExtra("default_audience", cVar.getNativeProtocolAudience());
            }
            putExtra.putExtra("legacy_override", le.v.e());
            putExtra.putExtra("auth_type", str4);
            if (z14) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z15);
            if (z16) {
                putExtra.putExtra("fx_app", c0Var.toString());
            }
            if (z17) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(11:46|47|48|9|10|11|12|13|(4:15|16|17|(2:(3:25|22|23)|26))(1:39)|(1:20)|21)|9|10|11|12|13|(0)(0)|(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0069, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
    
        android.util.Log.e(r2, "Failed to query content resolver.", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006d, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #3 {all -> 0x00aa, blocks: (B:6:0x000e, B:32:0x00b2, B:33:0x00af, B:20:0x00a6, B:51:0x004a, B:47:0x0029), top: B:5:0x000e, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[EXC_TOP_SPLITTER, LOOP:0: B:22:0x0087->B:25:0x008d, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.TreeSet f(df.x0 r14) {
        /*
            r13 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            java.lang.String r2 = df.y0.f54884b
            boolean r3 = p001if.a.b(r13)
            r4 = 0
            if (r3 == 0) goto Le
            return r4
        Le:
            java.util.TreeSet r3 = new java.util.TreeSet     // Catch: java.lang.Throwable -> Laa
            r3.<init>()     // Catch: java.lang.Throwable -> Laa
            android.content.Context r5 = le.v.a()     // Catch: java.lang.Throwable -> Laa
            android.content.ContentResolver r6 = r5.getContentResolver()     // Catch: java.lang.Throwable -> Laa
            java.lang.String[] r8 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> Laa
            java.lang.String r5 = "content://"
            boolean r7 = p001if.a.b(r13)     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L29
        L27:
            r7 = r4
            goto L4e
        L29:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r14.c()     // Catch: java.lang.Throwable -> L49
            r7.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = ".provider.PlatformProvider/versions"
            r7.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L49
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)     // Catch: java.lang.Throwable -> L49
            r7 = r5
            goto L4e
        L49:
            r5 = move-exception
            p001if.a.a(r13, r5)     // Catch: java.lang.Throwable -> Laa
            goto L27
        L4e:
            android.content.Context r5 = le.v.a()     // Catch: java.lang.Throwable -> L66
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L66
            java.lang.String r14 = r14.c()     // Catch: java.lang.Throwable -> L66
            java.lang.String r9 = ".provider.PlatformProvider"
            java.lang.String r14 = kotlin.jvm.internal.Intrinsics.n(r9, r14)     // Catch: java.lang.Throwable -> L66
            r9 = 0
            android.content.pm.ProviderInfo r14 = r5.resolveContentProvider(r14, r9)     // Catch: java.lang.Throwable -> L66 java.lang.RuntimeException -> L69
            goto L6e
        L66:
            r14 = move-exception
            r0 = r4
            goto Lac
        L69:
            r14 = move-exception
            android.util.Log.e(r2, r1, r14)     // Catch: java.lang.Throwable -> L66
            r14 = r4
        L6e:
            if (r14 == 0) goto La2
            r11 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r14 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L66 java.lang.IllegalArgumentException -> L78 java.lang.SecurityException -> L7d java.lang.NullPointerException -> L81
            goto L85
        L78:
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L66
        L7b:
            r14 = r4
            goto L85
        L7d:
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L66
            goto L7b
        L81:
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L66
            goto L7b
        L85:
            if (r14 == 0) goto La3
        L87:
            boolean r1 = r14.moveToNext()     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto La3
            int r1 = r14.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L9d
            int r1 = r14.getInt(r1)     // Catch: java.lang.Throwable -> L9d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L9d
            r3.add(r1)     // Catch: java.lang.Throwable -> L9d
            goto L87
        L9d:
            r0 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
            goto Lac
        La2:
            r14 = r4
        La3:
            if (r14 != 0) goto La6
            goto La9
        La6:
            r14.close()     // Catch: java.lang.Throwable -> Laa
        La9:
            return r3
        Laa:
            r14 = move-exception
            goto Lb3
        Lac:
            if (r0 != 0) goto Laf
            goto Lb2
        Laf:
            r0.close()     // Catch: java.lang.Throwable -> Laa
        Lb2:
            throw r14     // Catch: java.lang.Throwable -> Laa
        Lb3:
            p001if.a.a(r13, r14)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: df.y0.f(df.x0):java.util.TreeSet");
    }

    public final a10.e g(ArrayList arrayList, int[] iArr) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            k();
            if (arrayList == null) {
                a10.e eVar = new a10.e();
                eVar.f254a = -1;
                return eVar;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                x0 x0Var = (x0) it.next();
                TreeSet treeSet = x0Var.f54880a;
                int i13 = 0;
                if (treeSet == null || !Intrinsics.d(Boolean.valueOf(treeSet.isEmpty()), Boolean.FALSE)) {
                    x0Var.a(false);
                }
                TreeSet treeSet2 = x0Var.f54880a;
                if (!p001if.a.b(y0.class)) {
                    try {
                        i13 = f54887e[0].intValue();
                    } catch (Throwable th3) {
                        p001if.a.a(y0.class, th3);
                    }
                }
                int b13 = b(treeSet2, i13, iArr);
                if (b13 != -1) {
                    a10.e eVar2 = new a10.e();
                    eVar2.f254a = b13;
                    return eVar2;
                }
            }
            a10.e eVar3 = new a10.e();
            eVar3.f254a = -1;
            return eVar3;
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
            return null;
        }
    }
}
