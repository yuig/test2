package ae;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;
import java.util.List;
import wd.u;

/* loaded from: classes.dex */
public final class m implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    public static final wc.j f15018f = new wc.j(14);

    /* renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.o f15019a;

    /* renamed from: b, reason: collision with root package name */
    public final wc.j f15020b;

    /* renamed from: c, reason: collision with root package name */
    public final g1.g f15021c = new g1.g();

    /* renamed from: d, reason: collision with root package name */
    public final f f15022d;

    /* renamed from: e, reason: collision with root package name */
    public final k f15023e;

    public m(wc.j jVar) {
        jVar = jVar == null ? f15018f : jVar;
        this.f15020b = jVar;
        this.f15023e = new k(jVar);
        this.f15022d = (u.f129206f && u.f129205e) ? new e() : new wc.j(13);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void b(List list, g1.g gVar) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                gVar.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager().f18451c.f(), gVar);
            }
        }
    }

    public final com.bumptech.glide.o c(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = he.n.f68959a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return d((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return c(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f15019a == null) {
            synchronized (this) {
                try {
                    if (this.f15019a == null) {
                        com.bumptech.glide.b a13 = com.bumptech.glide.b.a(context.getApplicationContext());
                        wc.j jVar = this.f15020b;
                        wc.j jVar2 = new wc.j(12);
                        wc.b bVar = new wc.b(14);
                        Context applicationContext = context.getApplicationContext();
                        jVar.getClass();
                        this.f15019a = new com.bumptech.glide.o(a13, jVar2, bVar, applicationContext);
                    }
                } finally {
                }
            }
        }
        return this.f15019a;
    }

    public final com.bumptech.glide.o d(FragmentActivity fragmentActivity) {
        char[] cArr = he.n.f68959a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f15022d.b(fragmentActivity);
        Activity a13 = a(fragmentActivity);
        return this.f15023e.a(fragmentActivity, com.bumptech.glide.b.a(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), a13 == null || !a13.isFinishing());
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
