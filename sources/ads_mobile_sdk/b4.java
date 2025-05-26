package ads_mobile_sdk;

import a.gh;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.n;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class b4 {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f2698k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static b4 f2699l;

    /* renamed from: a, reason: collision with root package name */
    public final as0 f2700a;

    /* renamed from: b, reason: collision with root package name */
    public final ol2 f2701b;

    /* renamed from: c, reason: collision with root package name */
    public final bn2 f2702c;

    /* renamed from: d, reason: collision with root package name */
    public final bt2 f2703d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2704e;

    /* renamed from: f, reason: collision with root package name */
    public final a.n5 f2705f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2706g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2707h = System.currentTimeMillis();

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2708i;

    /* renamed from: j, reason: collision with root package name */
    public final long f2709j;

    public b4(l00 l00Var) {
        this.f2700a = l00Var.a();
        this.f2701b = l00Var.d();
        this.f2702c = l00Var.e();
        this.f2703d = l00Var.f();
        this.f2705f = l00Var.b();
        this.f2704e = l00Var.c().I();
        this.f2706g = l00Var.c().s();
        this.f2708i = l00Var.c().x();
        this.f2709j = l00Var.c().t();
    }

    public final String a(Context context, String str, View view, Activity activity) {
        com.google.common.util.concurrent.c0 c0Var;
        bt2 bt2Var = this.f2703d;
        bs2 bs2Var = new bs2(xb0.EVENT_ID_SIGNAL_CLICK, bt2Var.f3596b, bt2Var.f3595a);
        try {
            try {
                try {
                    try {
                        try {
                            bs2Var.b();
                            as0 as0Var = this.f2700a;
                            synchronized (as0Var) {
                                c0Var = as0Var.f2529d;
                                c0Var.getClass();
                            }
                            String str2 = (String) com.google.common.util.concurrent.g.B(c0Var, new a4(this, context, str, view, activity), com.google.common.util.concurrent.r.INSTANCE).get(this.f2704e, TimeUnit.MILLISECONDS);
                            bs2Var.a();
                            return str2;
                        } catch (InterruptedException e13) {
                            Thread.currentThread().interrupt();
                            bs2Var.a(e13);
                            bs2Var.a();
                            return "";
                        }
                    } catch (TimeoutException e14) {
                        bs2Var.a(e14);
                        String num = Integer.toString(17);
                        bs2Var.a();
                        return num;
                    }
                } catch (ExecutionException e15) {
                    e = e15;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    bs2Var.a(e);
                    String num2 = Integer.toString(3);
                    bs2Var.a();
                    return num2;
                }
            } catch (Throwable th3) {
                bs2Var.a(th3);
                throw th3;
            }
        } catch (Throwable th4) {
            bs2Var.a();
            throw th4;
        }
    }

    public final String b(Context context, String str, View view, Activity activity) {
        com.google.common.util.concurrent.c0 c0Var;
        bt2 bt2Var = this.f2703d;
        bs2 bs2Var = new bs2(xb0.EVENT_ID_SIGNAL_VIEW, bt2Var.f3596b, bt2Var.f3595a);
        try {
            try {
                try {
                    try {
                        try {
                            bs2Var.b();
                            as0 as0Var = this.f2700a;
                            synchronized (as0Var) {
                                c0Var = as0Var.f2529d;
                                c0Var.getClass();
                            }
                            String str2 = (String) com.google.common.util.concurrent.g.B(c0Var, new z3(this, context, str, view, activity), com.google.common.util.concurrent.r.INSTANCE).get(this.f2704e, TimeUnit.MILLISECONDS);
                            bs2Var.a();
                            return str2;
                        } catch (InterruptedException e13) {
                            Thread.currentThread().interrupt();
                            bs2Var.a(e13);
                            bs2Var.a();
                            return "";
                        }
                    } catch (TimeoutException e14) {
                        bs2Var.a(e14);
                        String num = Integer.toString(17);
                        bs2Var.a();
                        return num;
                    }
                } catch (ExecutionException e15) {
                    e = e15;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    bs2Var.a(e);
                    String num2 = Integer.toString(3);
                    bs2Var.a();
                    return num2;
                }
            } catch (Throwable th3) {
                bs2Var.a(th3);
                throw th3;
            }
        } catch (Throwable th4) {
            bs2Var.a();
            throw th4;
        }
    }

    public final String a(boolean z13) {
        String num;
        if (z13) {
            db1 db1Var = (db1) this.f2705f.get();
            long j13 = this.f2707h;
            bt2 bt2Var = db1Var.f4223b;
            bs2 bs2Var = new bs2(xb0.EVENT_ID_MINIMAL_SIGNAL_QUERY, bt2Var.f3596b, bt2Var.f3595a);
            try {
                try {
                    bs2Var.b();
                    num = db1Var.a(j13);
                } catch (UnsupportedEncodingException e13) {
                    bs2Var.a(e13);
                    num = Integer.toString(7);
                } catch (Throwable th3) {
                    bs2Var.a(th3);
                    throw th3;
                }
                bs2Var.a();
                return num;
            } catch (Throwable th4) {
                bs2Var.a();
                throw th4;
            }
        }
        return Integer.toString(17);
    }

    public final void a() {
        as0 as0Var = this.f2700a;
        synchronized (as0Var) {
            try {
                if (as0Var.f2529d != null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(as0Var.f2527b.size());
                Iterator it = as0Var.f2527b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((gh) it.next()).a());
                }
                as0Var.f2529d = as0Var.f2528c.a(xb0.EVENT_ID_INITIALIZATION, com.google.common.util.concurrent.g.A(new n(pk.c1.r(arrayList)), new ok.u(null), com.google.common.util.concurrent.r.INSTANCE));
                Iterator it2 = as0Var.f2526a.iterator();
                while (it2.hasNext()) {
                    ((gh) it2.next()).a();
                }
                as0Var.f2529d.getClass();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
