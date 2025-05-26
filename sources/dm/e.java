package dm;

import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import pd.s;
import sl.m;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f55311m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final nl.g f55312a;

    /* renamed from: b, reason: collision with root package name */
    public final fm.c f55313b;

    /* renamed from: c, reason: collision with root package name */
    public final qq2.c f55314c;

    /* renamed from: d, reason: collision with root package name */
    public final l f55315d;

    /* renamed from: e, reason: collision with root package name */
    public final m f55316e;

    /* renamed from: f, reason: collision with root package name */
    public final j f55317f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f55318g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f55319h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f55320i;

    /* renamed from: j, reason: collision with root package name */
    public String f55321j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f55322k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f55323l;

    static {
        new AtomicInteger(1);
    }

    public e(nl.g gVar, cm.a aVar, ExecutorService executorService, tl.k kVar) {
        gVar.b();
        fm.c cVar = new fm.c(gVar.f91217a, aVar);
        qq2.c cVar2 = new qq2.c(gVar);
        l a13 = l.a();
        m mVar = new m(new sl.d(gVar, 2));
        j jVar = new j();
        this.f55318g = new Object();
        this.f55322k = new HashSet();
        this.f55323l = new ArrayList();
        this.f55312a = gVar;
        this.f55313b = cVar;
        this.f55314c = cVar2;
        this.f55315d = a13;
        this.f55316e = mVar;
        this.f55317f = jVar;
        this.f55319h = executorService;
        this.f55320i = kVar;
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z13) {
        em.a q13;
        synchronized (f55311m) {
            try {
                nl.g gVar = this.f55312a;
                gVar.b();
                tb.l a13 = tb.l.a(gVar.f91217a);
                try {
                    q13 = this.f55314c.q();
                    em.c cVar = em.c.NOT_GENERATED;
                    em.c cVar2 = q13.f59572b;
                    if (cVar2 == cVar || cVar2 == em.c.ATTEMPT_MIGRATION) {
                        String f13 = f(q13);
                        qq2.c cVar3 = this.f55314c;
                        s a14 = q13.a();
                        a14.f99747a = f13;
                        a14.k(em.c.UNREGISTERED);
                        q13 = a14.g();
                        cVar3.m(q13);
                    }
                    if (a13 != null) {
                        a13.A();
                    }
                } catch (Throwable th3) {
                    if (a13 != null) {
                        a13.A();
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z13) {
            s a15 = q13.a();
            a15.f99749c = null;
            q13 = a15.g();
        }
        i(q13);
        this.f55320i.execute(new b(this, z13, 0));
    }

    public final em.a b(em.a aVar) {
        int responseCode;
        fm.b f13;
        nl.g gVar = this.f55312a;
        gVar.b();
        String str = gVar.f91219c.f91231a;
        String str2 = aVar.f59571a;
        nl.g gVar2 = this.f55312a;
        gVar2.b();
        String str3 = gVar2.f91219c.f91237g;
        String str4 = aVar.f59574d;
        fm.c cVar = this.f55313b;
        fm.e eVar = cVar.f62562c;
        if (!eVar.b()) {
            g gVar3 = g.BAD_CONFIG;
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a13 = fm.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i13 = 0; i13 <= 1; i13++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c13 = cVar.c(a13, str);
            try {
                try {
                    c13.setRequestMethod("POST");
                    c13.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c13.setDoOutput(true);
                    fm.c.h(c13);
                    responseCode = c13.getResponseCode();
                    eVar.c(responseCode);
                } catch (Throwable th3) {
                    c13.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th3;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f13 = fm.c.f(c13);
            } else {
                fm.c.b(c13, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    x92.b a14 = fm.b.a();
                    a14.f134367d = fm.f.AUTH_ERROR;
                    f13 = a14.o();
                } else {
                    if (responseCode == 429) {
                        g gVar4 = g.BAD_CONFIG;
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        x92.b a15 = fm.b.a();
                        a15.f134367d = fm.f.BAD_CONFIG;
                        f13 = a15.o();
                    }
                    c13.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            c13.disconnect();
            TrafficStats.clearThreadStatsTag();
            int i14 = d.f55310b[f13.f62557c.ordinal()];
            if (i14 == 1) {
                l lVar = this.f55315d;
                lVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                lVar.f55332a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                s a16 = aVar.a();
                a16.f99749c = f13.f62555a;
                a16.f99751e = Long.valueOf(f13.f62556b);
                a16.f99752f = Long.valueOf(seconds);
                return a16.g();
            }
            if (i14 == 2) {
                s a17 = aVar.a();
                a17.f99753g = "BAD CONFIG";
                a17.k(em.c.REGISTER_ERROR);
                return a17.g();
            }
            if (i14 != 3) {
                g gVar5 = g.BAD_CONFIG;
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.f55321j = null;
            }
            s a18 = aVar.a();
            a18.k(em.c.NOT_GENERATED);
            return a18.g();
        }
        g gVar6 = g.BAD_CONFIG;
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.f55321j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i iVar = new i(taskCompletionSource);
        synchronized (this.f55318g) {
            this.f55323l.add(iVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f55319h.execute(new androidx.activity.d(this, 23));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h hVar = new h(this.f55315d, taskCompletionSource);
        synchronized (this.f55318g) {
            this.f55323l.add(hVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f55319h.execute(new b(this, false, 1));
        return task;
    }

    public final void e() {
        nl.g gVar = this.f55312a;
        gVar.b();
        com.bumptech.glide.d.p("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", gVar.f91219c.f91232b);
        gVar.b();
        com.bumptech.glide.d.p("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", gVar.f91219c.f91237g);
        gVar.b();
        com.bumptech.glide.d.p("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", gVar.f91219c.f91231a);
        gVar.b();
        String str = gVar.f91219c.f91232b;
        Pattern pattern = l.f55330c;
        com.bumptech.glide.d.i("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.b();
        com.bumptech.glide.d.i("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", l.f55330c.matcher(gVar.f91219c.f91231a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f91218b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(em.a r6) {
        /*
            r5 = this;
            nl.g r0 = r5.f55312a
            r0.b()
            java.lang.String r0 = r0.f91218b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            nl.g r0 = r5.f55312a
            r0.b()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f91218b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L79
        L1e:
            em.c r0 = em.c.ATTEMPT_MIGRATION
            em.c r6 = r6.f59572b
            if (r6 != r0) goto L79
            sl.m r6 = r5.f55316e
            java.lang.Object r6 = r6.get()
            em.b r6 = (em.b) r6
            android.content.SharedPreferences r0 = r6.f59579a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f59579a     // Catch: java.lang.Throwable -> L40
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L40
            android.content.SharedPreferences r2 = r6.f59579a     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            goto L62
        L40:
            r6 = move-exception
            goto L77
        L42:
            android.content.SharedPreferences r1 = r6.f59579a     // Catch: java.lang.Throwable -> L40
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L40
            android.content.SharedPreferences r6 = r6.f59579a     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "|S||P|"
            java.lang.String r6 = r6.getString(r2, r4)     // Catch: java.lang.Throwable -> L51
            if (r6 != 0) goto L53
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            goto L60
        L51:
            r6 = move-exception
            goto L72
        L53:
            java.security.PublicKey r6 = em.b.b(r6)     // Catch: java.lang.Throwable -> L51
            if (r6 != 0) goto L5b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            goto L60
        L5b:
            java.lang.String r4 = em.b.a(r6)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            r2 = r4
        L62:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L71
            dm.j r6 = r5.f55317f
            r6.getClass()
            java.lang.String r2 = dm.j.a()
        L71:
            return r2
        L72:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            throw r6     // Catch: java.lang.Throwable -> L40
        L74:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L74
            throw r6     // Catch: java.lang.Throwable -> L40
        L77:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r6
        L79:
            dm.j r6 = r5.f55317f
            r6.getClass()
            java.lang.String r6 = dm.j.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dm.e.f(em.a):java.lang.String");
    }

    public final em.a g(em.a aVar) {
        int responseCode;
        fm.a aVar2;
        String str = aVar.f59571a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            em.b bVar = (em.b) this.f55316e.get();
            synchronized (bVar.f59579a) {
                try {
                    String[] strArr = em.b.f59578c;
                    int i13 = 0;
                    while (true) {
                        if (i13 < 4) {
                            String str3 = strArr[i13];
                            String string = bVar.f59579a.getString("|T|" + bVar.f59580b + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i13++;
                            } else if (string.startsWith("{")) {
                                try {
                                    str2 = new JSONObject(string).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        fm.c cVar = this.f55313b;
        nl.g gVar = this.f55312a;
        gVar.b();
        String str4 = gVar.f91219c.f91231a;
        String str5 = aVar.f59571a;
        nl.g gVar2 = this.f55312a;
        gVar2.b();
        String str6 = gVar2.f91219c.f91237g;
        nl.g gVar3 = this.f55312a;
        gVar3.b();
        String str7 = gVar3.f91219c.f91232b;
        fm.e eVar = cVar.f62562c;
        if (!eVar.b()) {
            g gVar4 = g.BAD_CONFIG;
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a13 = fm.c.a("projects/" + str6 + "/installations");
        for (int i14 = 0; i14 <= 1; i14++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c13 = cVar.c(a13, str4);
            try {
                try {
                    c13.setRequestMethod("POST");
                    c13.setDoOutput(true);
                    if (str2 != null) {
                        c13.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    fm.c.g(c13, str5, str7);
                    responseCode = c13.getResponseCode();
                    eVar.c(responseCode);
                } finally {
                    c13.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode < 200 || responseCode >= 300) {
                fm.c.b(c13, str7, str4, str6);
                if (responseCode == 429) {
                    g gVar5 = g.BAD_CONFIG;
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    fm.a aVar3 = new fm.a(null, null, null, null, fm.d.BAD_CONFIG);
                    c13.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar2 = aVar3;
                }
                c13.disconnect();
                TrafficStats.clearThreadStatsTag();
            } else {
                aVar2 = fm.c.e(c13);
                c13.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            int i15 = d.f55309a[aVar2.f62554e.ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    g gVar6 = g.BAD_CONFIG;
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                s a14 = aVar.a();
                a14.f99753g = "BAD CONFIG";
                a14.k(em.c.REGISTER_ERROR);
                return a14.g();
            }
            String str8 = aVar2.f62551b;
            String str9 = aVar2.f62552c;
            l lVar = this.f55315d;
            lVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            lVar.f55332a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            fm.b bVar2 = aVar2.f62553d;
            String str10 = bVar2.f62555a;
            long j13 = bVar2.f62556b;
            s a15 = aVar.a();
            a15.f99747a = str8;
            a15.k(em.c.REGISTERED);
            a15.f99749c = str10;
            a15.f99750d = str9;
            a15.f99751e = Long.valueOf(j13);
            a15.f99752f = Long.valueOf(seconds);
            return a15.g();
        }
        g gVar7 = g.BAD_CONFIG;
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f55318g) {
            try {
                Iterator it = this.f55323l.iterator();
                while (it.hasNext()) {
                    if (((k) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void i(em.a aVar) {
        synchronized (this.f55318g) {
            try {
                Iterator it = this.f55323l.iterator();
                while (it.hasNext()) {
                    if (((k) it.next()).b(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
