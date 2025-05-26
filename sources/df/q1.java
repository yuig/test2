package df;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class q1 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final String f54834a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f54835b;

    /* renamed from: c, reason: collision with root package name */
    public Exception[] f54836c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1 f54837d;

    public q1(t1 this$0, String action, Bundle parameters) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f54837d = this$0;
        this.f54834a = action;
        this.f54835b = parameters;
        this.f54836c = new Exception[0];
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [df.p1] */
    public final String[] a(Void... p03) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            if (p001if.a.b(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(p03, "p0");
                String[] stringArray = this.f54835b.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.f54836c = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                Date date = AccessToken.f29844l;
                AccessToken s13 = wc.j.s();
                try {
                    int length = stringArray.length - 1;
                    if (length >= 0) {
                        final int i13 = 0;
                        while (true) {
                            int i14 = i13 + 1;
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((le.b0) it.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri uri = Uri.parse(stringArray[i13]);
                            if (j1.g1(uri)) {
                                strArr[i13] = uri.toString();
                                countDownLatch.countDown();
                            } else {
                                ?? r102 = new le.x() { // from class: df.p1
                                    @Override // le.x
                                    public final void a(le.e0 response) {
                                        FacebookRequestError facebookRequestError;
                                        String str;
                                        int i15 = i13;
                                        String[] results = strArr;
                                        Intrinsics.checkNotNullParameter(results, "$results");
                                        q1 this$0 = this;
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        CountDownLatch latch = countDownLatch;
                                        Intrinsics.checkNotNullParameter(latch, "$latch");
                                        Intrinsics.checkNotNullParameter(response, "response");
                                        try {
                                            facebookRequestError = response.f83046c;
                                            str = "Error staging photo.";
                                        } catch (Exception e13) {
                                            this$0.f54836c[i15] = e13;
                                        }
                                        if (facebookRequestError != null) {
                                            String a13 = facebookRequestError.a();
                                            if (a13 != null) {
                                                str = a13;
                                            }
                                            throw new FacebookGraphResponseException(response, str);
                                        }
                                        JSONObject jSONObject = response.f83045b;
                                        if (jSONObject == null) {
                                            throw new FacebookException("Error staging photo.");
                                        }
                                        String optString = jSONObject.optString("uri");
                                        if (optString == null) {
                                            throw new FacebookException("Error staging photo.");
                                        }
                                        results[i15] = optString;
                                        latch.countDown();
                                    }
                                };
                                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                                concurrentLinkedQueue.add(kh2.d.S0(s13, uri, r102).e());
                            }
                            if (i14 > length) {
                                break;
                            }
                            i13 = i14;
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((le.b0) it2.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
                return null;
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
            return null;
        }
    }

    public final void b(String[] strArr) {
        Bundle bundle = this.f54835b;
        t1 t1Var = this.f54837d;
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (p001if.a.b(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = t1Var.f54851e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                Exception[] excArr = this.f54836c;
                int length = excArr.length;
                int i13 = 0;
                while (i13 < length) {
                    Exception exc = excArr[i13];
                    i13++;
                    if (exc != null) {
                        t1Var.e(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    t1Var.e(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                List d2 = kotlin.collections.z.d(strArr);
                if (d2.contains(null)) {
                    t1Var.e(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                j1.r1(bundle, new JSONArray((Collection) d2));
                t1Var.f54847a = j1.u(c1.a(), le.v.e() + "/dialog/" + this.f54834a, bundle).toString();
                ImageView imageView = t1Var.f54852f;
                if (imageView == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                t1Var.f((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            if (p001if.a.b(this)) {
                return null;
            }
            try {
                return a((Void[]) objArr);
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
                return null;
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (p001if.a.b(this)) {
                return;
            }
            try {
                b((String[]) obj);
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }
}
