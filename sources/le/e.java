package le;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.AccessToken;
import df.j1;
import df.k1;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final wc.b f83036f = new wc.b(19, 0);

    /* renamed from: g, reason: collision with root package name */
    public static e f83037g;

    /* renamed from: a, reason: collision with root package name */
    public final z6.c f83038a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.messaging.s f83039b;

    /* renamed from: c, reason: collision with root package name */
    public AccessToken f83040c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f83041d;

    /* renamed from: e, reason: collision with root package name */
    public Date f83042e;

    public e(z6.c localBroadcastManager, com.google.firebase.messaging.s accessTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(accessTokenCache, "accessTokenCache");
        this.f83038a = localBroadcastManager;
        this.f83039b = accessTokenCache;
        this.f83041d = new AtomicBoolean(false);
        this.f83042e = new Date(0L);
    }

    public final void a() {
        if (Intrinsics.d(Looper.getMainLooper(), Looper.myLooper())) {
            b();
        } else {
            new Handler(Looper.getMainLooper()).post(new androidx.media3.ui.z(7, this, null));
        }
    }

    public final void b() {
        AccessToken accessToken = this.f83040c;
        if (accessToken == null) {
            return;
        }
        int i13 = 0;
        if (this.f83041d.compareAndSet(false, true)) {
            this.f83042e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            h0.i iVar = new h0.i(2);
            a0[] a0VarArr = new a0[2];
            b bVar = new b(atomicBoolean, hashSet, hashSet2, hashSet3, 0);
            Bundle a13 = n60.o.a("fields", "permission,status");
            String str = a0.f83002j;
            a0 A = wc.b.A(accessToken, "me/permissions", bVar);
            Intrinsics.checkNotNullParameter(a13, "<set-?>");
            A.f83009d = a13;
            f0 f0Var = f0.GET;
            A.l(f0Var);
            a0VarArr[0] = A;
            c cVar = new c(iVar, i13);
            String str2 = accessToken.f29857k;
            if (str2 == null) {
                str2 = "facebook";
            }
            df.b0 b0Var = Intrinsics.d(str2, "instagram") ? new df.b0(1) : new df.b0(0);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", b0Var.f54716b);
            bundle.putString("client_id", accessToken.f29854h);
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            a0 A2 = wc.b.A(accessToken, b0Var.f54715a, cVar);
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            A2.f83009d = bundle;
            A2.l(f0Var);
            a0VarArr[1] = A2;
            d0 requests = new d0(a0VarArr);
            d callback = new d(iVar, accessToken, atomicBoolean, hashSet, hashSet2, hashSet3, this);
            Intrinsics.checkNotNullParameter(callback, "callback");
            ArrayList arrayList = requests.f83035d;
            if (!arrayList.contains(callback)) {
                arrayList.add(callback);
            }
            Intrinsics.checkNotNullParameter(requests, "requests");
            k1.c(requests);
            new b0(requests).executeOnExecutor(v.d(), new Void[0]);
        }
    }

    public final void c(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(v.a(), (Class<?>) n.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f83038a.c(intent);
    }

    public final void d(AccessToken accessToken, boolean z13) {
        AccessToken accessToken2 = this.f83040c;
        this.f83040c = accessToken;
        this.f83041d.set(false);
        this.f83042e = new Date(0L);
        if (z13) {
            com.google.firebase.messaging.s sVar = this.f83039b;
            if (accessToken != null) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(accessToken, "accessToken");
                try {
                    sVar.f33811a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.e().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                sVar.f33811a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                j1.y(v.a());
            }
        }
        if (j1.p(accessToken2, accessToken)) {
            return;
        }
        c(accessToken2, accessToken);
        Context a13 = v.a();
        Date date = AccessToken.f29844l;
        AccessToken s13 = wc.j.s();
        AlarmManager alarmManager = (AlarmManager) a13.getSystemService("alarm");
        if (wc.j.z()) {
            if ((s13 == null ? null : s13.f29847a) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(a13, (Class<?>) n.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, s13.f29847a.getTime(), PendingIntent.getBroadcast(a13, 0, intent, 67108864));
            } catch (Exception unused2) {
            }
        }
    }
}
