package wc;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import com.google.firebase.messaging.s;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.c1;
import df.j1;
import df.k1;
import df.p;
import df.u0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import le.a0;
import le.d0;
import le.e0;
import le.f0;
import le.g0;
import le.i0;
import le.j0;
import le.v;
import le.w;
import le.x;
import le.y;
import le.z;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t3.s1;
import td.r;
import wd.c0;
import wd.h0;

/* loaded from: classes.dex */
public final class b implements sd.c, r, h0, zd.a, ae.n, ie.c {

    /* renamed from: a */
    public final /* synthetic */ int f129077a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b() {
        this(9);
        this.f129077a = 9;
    }

    public static a0 A(AccessToken accessToken, String str, x xVar) {
        return new a0(accessToken, str, null, null, xVar);
    }

    public static a0 B(AccessToken accessToken, String str, JSONObject jSONObject, x xVar) {
        a0 a0Var = new a0(accessToken, str, null, f0.POST, xVar);
        a0Var.f83008c = jSONObject;
        return a0Var;
    }

    public static HashMap C(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int length = optJSONArray.length();
        if (length > 0) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i13);
                if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = optJSONArray2.length();
                        if (length2 > 0) {
                            int i15 = 0;
                            while (true) {
                                int i16 = i15 + 1;
                                int optInt2 = optJSONArray2.optInt(i15);
                                if (optInt2 != 0) {
                                    hashSet.add(Integer.valueOf(optInt2));
                                }
                                if (i16 >= length2) {
                                    break;
                                }
                                i15 = i16;
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
                if (i14 >= length) {
                    break;
                }
                i13 = i14;
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void D(org.json.JSONObject r7, java.lang.String r8, le.y r9) {
        /*
            java.util.regex.Pattern r0 = le.a0.f83004l
            java.util.regex.Matcher r0 = r0.matcher(r8)
            boolean r1 = r0.matches()
            r2 = 1
            if (r1 == 0) goto L17
            java.lang.String r0 = r0.group(r2)
            java.lang.String r1 = "matcher.group(1)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L18
        L17:
            r0 = r8
        L18:
            java.lang.String r1 = "me/"
            r3 = 0
            boolean r1 = kotlin.text.z.p(r0, r1, r3)
            if (r1 != 0) goto L2c
            java.lang.String r1 = "/me/"
            boolean r0 = kotlin.text.z.p(r0, r1, r3)
            if (r0 == 0) goto L2a
            goto L2c
        L2a:
            r8 = r3
            goto L42
        L2c:
            java.lang.String r0 = ":"
            r1 = 6
            int r0 = kotlin.text.StringsKt.L(r8, r0, r3, r3, r1)
            java.lang.String r4 = "?"
            int r8 = kotlin.text.StringsKt.L(r8, r4, r3, r3, r1)
            r1 = 3
            if (r0 <= r1) goto L2a
            r1 = -1
            if (r8 == r1) goto L41
            if (r0 >= r8) goto L2a
        L41:
            r8 = r2
        L42:
            java.util.Iterator r0 = r7.keys()
        L46:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r7.opt(r1)
            if (r8 == 0) goto L62
            java.lang.String r5 = "image"
            boolean r5 = kotlin.text.z.i(r1, r5, r2)
            if (r5 == 0) goto L62
            r5 = r2
            goto L63
        L62:
            r5 = r3
        L63:
            java.lang.String r6 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            java.lang.String r6 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            E(r1, r4, r9, r5)
            goto L46
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.b.D(org.json.JSONObject, java.lang.String, le.y):void");
    }

    public static void E(String str, Object obj, y yVar, boolean z13) {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z13) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String d2 = s1.d(new Object[]{str, next}, 2, "%s[%s]", "java.lang.String.format(format, *args)");
                    Object opt = jSONObject.opt(next);
                    Intrinsics.checkNotNullExpressionValue(opt, "jsonObject.opt(propertyName)");
                    E(d2, opt, yVar, z13);
                }
                return;
            }
            if (jSONObject.has("id")) {
                String optString = jSONObject.optString("id");
                Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(\"id\")");
                E(str, optString, yVar, z13);
                return;
            } else if (jSONObject.has("url")) {
                String optString2 = jSONObject.optString("url");
                Intrinsics.checkNotNullExpressionValue(optString2, "jsonObject.optString(\"url\")");
                E(str, optString2, yVar, z13);
                return;
            } else {
                if (jSONObject.has("fbsdk:create_object")) {
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
                    E(str, jSONObject2, yVar, z13);
                    return;
                }
                return;
            }
        }
        if (!JSONArray.class.isAssignableFrom(cls)) {
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                yVar.e(str, obj.toString());
                return;
            }
            if (!Date.class.isAssignableFrom(cls)) {
                String str2 = a0.f83002j;
                v vVar = v.f83104a;
                return;
            } else {
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                Intrinsics.checkNotNullExpressionValue(format, "iso8601DateFormat.format(date)");
                yVar.e(str, format);
                return;
            }
        }
        JSONArray jSONArray = (JSONArray) obj;
        int length = jSONArray.length();
        if (length <= 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            String e13 = s1.e(new Object[]{str, Integer.valueOf(i13)}, 2, Locale.ROOT, "%s[%d]", "java.lang.String.format(locale, format, *args)");
            Object opt2 = jSONArray.opt(i13);
            Intrinsics.checkNotNullExpressionValue(opt2, "jsonArray.opt(i)");
            E(e13, opt2, yVar, z13);
            if (i14 >= length) {
                return;
            } else {
                i13 = i14;
            }
        }
    }

    public static void G(d0 requests, ArrayList responses) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(responses, "responses");
        int size = requests.f83034c.size();
        ArrayList arrayList = new ArrayList();
        if (size > 0) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                a0 a0Var = (a0) requests.f83034c.get(i13);
                if (a0Var.f83012g != null) {
                    arrayList.add(new Pair(a0Var.f83012g, responses.get(i13)));
                }
                if (i14 >= size) {
                    break;
                } else {
                    i13 = i14;
                }
            }
        }
        if (arrayList.size() > 0) {
            e5.k kVar = new e5.k(16, arrayList, requests);
            Handler handler = requests.f83032a;
            if ((handler == null ? null : Boolean.valueOf(handler.post(kVar))) == null) {
                kVar.run();
            }
        }
    }

    public static void H(HashMap hashMap, z zVar) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = a0.f83002j;
            if (v(((w) entry.getValue()).f83125b)) {
                zVar.i((String) entry.getKey(), ((w) entry.getValue()).f83125b, ((w) entry.getValue()).f83124a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0335  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void I(le.d0 r21, java.net.HttpURLConnection r22) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.b.I(le.d0, java.net.HttpURLConnection):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b3, code lost:
    
        r8 = new java.lang.String[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010b, code lost:
    
        r14 = "com.facebook.appevents.UserDataStore.internalUserData";
        r0 = df.j1.m1(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0115, code lost:
    
        if (p001if.a.b(r2) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0118, code lost:
    
        le.v.d().execute(new me.v(r14, r0, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0125, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0126, code lost:
    
        p001if.a.a(r2, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void J(java.util.HashMap r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.b.J(java.util.HashMap):void");
    }

    public static HttpURLConnection K(d0 requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(requests, "requests");
        Iterator<E> it = requests.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            if (f0.GET == a0Var.f83013h && j1.V0(a0Var.f83009d.getString("fields"))) {
                b bVar = u0.f54860d;
                g0 g0Var = g0.DEVELOPER_ERRORS;
                StringBuilder sb3 = new StringBuilder("GET requests for /");
                String str = a0Var.f83007b;
                if (str == null) {
                    str = "";
                }
                sb3.append(str);
                sb3.append(" should contain an explicit \"fields\" parameter.");
                z(g0Var, "Request", sb3.toString());
            }
        }
        try {
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = l(requests.f83034c.size() == 1 ? new URL(((a0) requests.f83034c.get(0)).h()) : new URL(c1.c()));
                I(requests, httpURLConnection);
                return httpURLConnection;
            } catch (IOException e13) {
                j1.N(httpURLConnection);
                throw new FacebookException("could not construct request body", e13);
            } catch (JSONException e14) {
                j1.N(httpURLConnection);
                throw new FacebookException("could not construct request body", e14);
            }
        } catch (MalformedURLException e15) {
            throw new FacebookException("could not construct URL for request", e15);
        }
    }

    public static final Bundle b(String str) {
        ScheduledExecutorService scheduledExecutorService = com.facebook.login.r.f30036d;
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    public static final String e(Object obj) {
        String str = a0.f83002j;
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (!(obj instanceof Date)) {
            throw new IllegalArgumentException("Unsupported parameter type.");
        }
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
        Intrinsics.checkNotNullExpressionValue(format, "iso8601DateFormat.format(value)");
        return format;
    }

    public static ArrayList h(List requests, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        List list = requests;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new e0((a0) it.next(), httpURLConnection, new FacebookRequestError(facebookException)));
        }
        return arrayList;
    }

    public static void j(JSONObject jSONObject) {
        List split$default;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(key);
            if (optJSONObject != null) {
                String k13 = optJSONObject.optString("k");
                String v13 = optJSONObject.optString("v");
                Intrinsics.checkNotNullExpressionValue(k13, "k");
                if (k13.length() != 0) {
                    CopyOnWriteArraySet a13 = ne.c.a();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    split$default = StringsKt__StringsKt.split$default(k13, new String[]{","}, false, 0, 6, null);
                    Intrinsics.checkNotNullExpressionValue(v13, "v");
                    a13.add(new ne.c(key, split$default, v13));
                }
            }
        }
    }

    public static HttpURLConnection l(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        if (a0.f83005m == null) {
            a0.f83005m = s1.d(new Object[]{"FBAndroidSDK", "15.0.2"}, 2, "%s.%s", "java.lang.String.format(format, *args)");
            if (!j1.V0(null)) {
                a0.f83005m = s1.e(new Object[]{a0.f83005m, null}, 2, Locale.ROOT, "%s/%s", "java.lang.String.format(locale, format, *args)");
            }
        }
        httpURLConnection.setRequestProperty("User-Agent", a0.f83005m);
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static le.e0 m(le.a0 r22, java.net.HttpURLConnection r23, java.lang.Object r24, java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.b.m(le.a0, java.net.HttpURLConnection, java.lang.Object, java.lang.Object):le.e0");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList n(java.io.InputStream r10, java.net.HttpURLConnection r11, le.d0 r12) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.b.n(java.io.InputStream, java.net.HttpURLConnection, le.d0):java.util.ArrayList");
    }

    public static ArrayList o(d0 requests) {
        Exception exc;
        HttpURLConnection connection;
        ArrayList h10;
        Intrinsics.checkNotNullParameter(requests, "requests");
        k1.c(requests);
        HttpURLConnection httpURLConnection = null;
        r1 = null;
        InputStream inputStream = null;
        try {
            connection = K(requests);
            exc = null;
        } catch (Exception e13) {
            exc = e13;
            connection = null;
        } catch (Throwable th3) {
            th = th3;
            j1.N(httpURLConnection);
            throw th;
        }
        try {
            if (connection != null) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                Intrinsics.checkNotNullParameter(requests, "requests");
                String str = e0.f83043e;
                Intrinsics.checkNotNullParameter(connection, "connection");
                Intrinsics.checkNotNullParameter(requests, "requests");
                try {
                    try {
                    } catch (FacebookException e14) {
                        b bVar = u0.f54860d;
                        y(g0.REQUESTS, "Response", "Response <Error>: %s", e14);
                        h10 = h(requests, connection, e14);
                    } catch (Exception e15) {
                        b bVar2 = u0.f54860d;
                        y(g0.REQUESTS, "Response", "Response <Error>: %s", e15);
                        h10 = h(requests, connection, new FacebookException(e15));
                    }
                    if (!v.h()) {
                        Log.e(e0.f83043e, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    }
                    inputStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                    h10 = n(inputStream, connection, requests);
                    j1.z(inputStream);
                    j1.N(connection);
                    int size = requests.f83034c.size();
                    if (size != h10.size()) {
                        String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(h10.size()), Integer.valueOf(size)}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                        throw new FacebookException(format);
                    }
                    G(requests, h10);
                    le.e t13 = le.e.f83036f.t();
                    AccessToken accessToken = t13.f83040c;
                    if (accessToken != null) {
                        long time = new Date().getTime();
                        if (accessToken.f29852f.canExtendToken() && time - t13.f83042e.getTime() > 3600000 && time - accessToken.f29853g.getTime() > 86400000) {
                            t13.a();
                        }
                    }
                } catch (Throwable th4) {
                    j1.z(null);
                    throw th4;
                }
            } else {
                String str2 = e0.f83043e;
                h10 = h(requests.f83034c, null, new FacebookException(exc));
                G(requests, h10);
            }
            j1.N(connection);
            return h10;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = connection;
            j1.N(httpURLConnection);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee A[Catch: all -> 0x0104, Exception -> 0x0107, TryCatch #8 {Exception -> 0x0107, all -> 0x0104, blocks: (B:29:0x00e0, B:31:0x00ee, B:33:0x00f2, B:36:0x0109, B:38:0x0123, B:40:0x0132, B:42:0x0153, B:46:0x0165, B:48:0x0169, B:50:0x0172, B:73:0x015b, B:75:0x013c, B:77:0x014b, B:79:0x01d4, B:80:0x01db), top: B:28:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165 A[Catch: all -> 0x0104, Exception -> 0x0107, TryCatch #8 {Exception -> 0x0107, all -> 0x0104, blocks: (B:29:0x00e0, B:31:0x00ee, B:33:0x00f2, B:36:0x0109, B:38:0x0123, B:40:0x0132, B:42:0x0153, B:46:0x0165, B:48:0x0169, B:50:0x0172, B:73:0x015b, B:75:0x013c, B:77:0x014b, B:79:0x01d4, B:80:0x01db), top: B:28:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0169 A[Catch: all -> 0x0104, Exception -> 0x0107, TryCatch #8 {Exception -> 0x0107, all -> 0x0104, blocks: (B:29:0x00e0, B:31:0x00ee, B:33:0x00f2, B:36:0x0109, B:38:0x0123, B:40:0x0132, B:42:0x0153, B:46:0x0165, B:48:0x0169, B:50:0x0172, B:73:0x015b, B:75:0x013c, B:77:0x014b, B:79:0x01d4, B:80:0x01db), top: B:28:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0172 A[Catch: all -> 0x0104, Exception -> 0x0107, TRY_LEAVE, TryCatch #8 {Exception -> 0x0107, all -> 0x0104, blocks: (B:29:0x00e0, B:31:0x00ee, B:33:0x00f2, B:36:0x0109, B:38:0x0123, B:40:0x0132, B:42:0x0153, B:46:0x0165, B:48:0x0169, B:50:0x0172, B:73:0x015b, B:75:0x013c, B:77:0x014b, B:79:0x01d4, B:80:0x01db), top: B:28:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015b A[Catch: all -> 0x0104, Exception -> 0x0107, TryCatch #8 {Exception -> 0x0107, all -> 0x0104, blocks: (B:29:0x00e0, B:31:0x00ee, B:33:0x00f2, B:36:0x0109, B:38:0x0123, B:40:0x0132, B:42:0x0153, B:46:0x0165, B:48:0x0169, B:50:0x0172, B:73:0x015b, B:75:0x013c, B:77:0x014b, B:79:0x01d4, B:80:0x01db), top: B:28:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d4 A[Catch: all -> 0x0104, Exception -> 0x0107, TRY_ENTER, TryCatch #8 {Exception -> 0x0107, all -> 0x0104, blocks: (B:29:0x00e0, B:31:0x00ee, B:33:0x00f2, B:36:0x0109, B:38:0x0123, B:40:0x0132, B:42:0x0153, B:46:0x0165, B:48:0x0169, B:50:0x0172, B:73:0x015b, B:75:0x013c, B:77:0x014b, B:79:0x01d4, B:80:0x01db), top: B:28:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static df.c q(android.content.Context r16) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.b.q(android.content.Context):df.c");
    }

    public static p s() {
        return new p(null, z0.f(new kotlin.Pair(2, null), new kotlin.Pair(4, null), new kotlin.Pair(9, null), new kotlin.Pair(17, null), new kotlin.Pair(341, null)), z0.f(new kotlin.Pair(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE), null), new kotlin.Pair(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE), null), new kotlin.Pair(412, null)), null, null, null);
    }

    public static boolean v(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof GraphRequest$ParcelableResourceWithMimeType);
    }

    public static boolean w(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public static void x(g0 behavior, String tag, String string) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
        z(behavior, tag, string);
    }

    public static void y(g0 behavior, String tag, String format, Object... args) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        v.i(behavior);
    }

    public static void z(g0 behavior, String tag, String string) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
        v.i(behavior);
    }

    public final synchronized void F(String original) {
        Intrinsics.checkNotNullParameter(original, "accessToken");
        v vVar = v.f83104a;
        v.i(g0.INCLUDE_ACCESS_TOKENS);
        synchronized (this) {
            Intrinsics.checkNotNullParameter(original, "original");
            Intrinsics.checkNotNullParameter("ACCESS_TOKEN_REMOVED", "replace");
            u0.f54861e.put(original, "ACCESS_TOKEN_REMOVED");
        }
    }

    @Override // td.r
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // td.r
    public final Object c(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // zd.a
    public final pd.g0 d(pd.g0 g0Var, nd.l lVar) {
        byte[] bArr;
        ByteBuffer b13 = ((yd.c) g0Var.get()).f138714a.f138713a.b();
        AtomicReference atomicReference = he.c.f68939a;
        he.b bVar = (b13.isReadOnly() || !b13.hasArray()) ? null : new he.b(b13.array(), b13.arrayOffset(), b13.limit());
        if (bVar != null && bVar.f68936b == 0 && bVar.f68937c == ((byte[]) bVar.f68938d).length) {
            bArr = b13.array();
        } else {
            ByteBuffer asReadOnlyBuffer = b13.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer.limit()];
            asReadOnlyBuffer.get(bArr2);
            bArr = bArr2;
        }
        return new c0(bArr);
    }

    @Override // wd.h0
    public final void f(MediaExtractor mediaExtractor, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // sd.c
    public final void g(Throwable th3) {
        switch (this.f129077a) {
            case 5:
                return;
            default:
                throw new RuntimeException("Request threw uncaught throwable", th3);
        }
    }

    @Override // wd.h0
    public final void i(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // td.r
    public final void k(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    public final String p(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        j jVar = me.m.f86996c;
        Intrinsics.checkNotNullParameter(context, "context");
        if (me.m.a() == null) {
            synchronized (me.m.c()) {
                try {
                    if (me.m.a() == null) {
                        String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                        if (!p001if.a.b(me.m.class)) {
                            try {
                                me.m.f87000g = string;
                            } catch (Throwable th3) {
                                p001if.a.a(me.m.class, th3);
                            }
                        }
                        if (me.m.a() == null) {
                            UUID randomUUID = UUID.randomUUID();
                            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
                            String n13 = Intrinsics.n(randomUUID, "XZ");
                            if (!p001if.a.b(me.m.class)) {
                                try {
                                    me.m.f87000g = n13;
                                } catch (Throwable th4) {
                                    p001if.a.a(me.m.class, th4);
                                }
                            }
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", me.m.a()).apply();
                        }
                    }
                    Unit unit = Unit.f80348a;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
        String a13 = me.m.a();
        if (a13 != null) {
            return a13;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final synchronized p r() {
        p pVar;
        try {
            if (p.f54820e == null) {
                p.f54820e = s();
            }
            pVar = p.f54820e;
            if (pVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return pVar;
    }

    public final le.e t() {
        le.e eVar;
        le.e eVar2 = le.e.f83037g;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (this) {
            eVar = le.e.f83037g;
            if (eVar == null) {
                z6.c a13 = z6.c.a(v.a());
                Intrinsics.checkNotNullExpressionValue(a13, "getInstance(applicationContext)");
                le.e eVar3 = new le.e(a13, new s());
                le.e.f83037g = eVar3;
                eVar = eVar3;
            }
        }
        return eVar;
    }

    public final synchronized j0 u() {
        j0 j0Var;
        try {
            if (j0.f83057e == null) {
                z6.c a13 = z6.c.a(v.a());
                Intrinsics.checkNotNullExpressionValue(a13, "getInstance(applicationContext)");
                j0.f83057e = new j0(a13, new i0());
            }
            j0Var = j0.f83057e;
            if (j0Var == null) {
                Intrinsics.r("instance");
                throw null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return j0Var;
    }

    public /* synthetic */ b(int i13) {
        this.f129077a = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13, int i14) {
        this(0);
        this.f129077a = i13;
        if (i13 == 1) {
            this(1);
            return;
        }
        if (i13 == 2) {
            this(2);
            return;
        }
        if (i13 != 3) {
            switch (i13) {
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
            return;
        }
        this(3);
    }
}
