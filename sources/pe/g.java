package pe;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.FacebookException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    public static final me.f f99907f = new me.f(4, 0);

    /* renamed from: g, reason: collision with root package name */
    public static g f99908g;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f99909a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final Set f99910b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f99911c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f99912d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f99913e;

    public g() {
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f99910b = newSetFromMap;
        this.f99911c = new LinkedHashSet();
        this.f99912d = new HashSet();
        this.f99913e = new HashMap();
    }

    public final void a(Activity activity) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (se.l.i()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.f99910b.add(activity);
            this.f99912d.clear();
            HashSet hashSet = (HashSet) this.f99913e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.f99912d = hashSet;
            }
            if (p001if.a.b(this)) {
                return;
            }
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    b();
                } else {
                    this.f99909a.post(new com.airbnb.lottie.k(this, 9));
                }
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }

    public final void b() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            for (Activity activity : this.f99910b) {
                if (activity != null) {
                    View v13 = ue.c.v(activity);
                    String simpleName = activity.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "activity.javaClass.simpleName");
                    this.f99911c.add(new f(v13, this.f99909a, this.f99912d, simpleName));
                }
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void c(Activity activity) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (se.l.i()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.f99910b.remove(activity);
            this.f99911c.clear();
            this.f99913e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f99912d.clone());
            this.f99912d.clear();
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
