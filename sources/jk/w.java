package jk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class w extends kk.t {

    /* renamed from: j, reason: collision with root package name */
    public static w f76359j;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f76360g;

    /* renamed from: h, reason: collision with root package name */
    public final o f76361h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f76362i;

    public w(Context context, s sVar) {
        super(new fi.b("SplitInstallListenerRegistry", 1), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f76360g = new Handler(Looper.getMainLooper());
        this.f76362i = new LinkedHashSet();
        this.f76361h = sVar;
    }

    public static synchronized w b(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f76359j == null) {
                    f76359j = new w(context, s.INSTANCE);
                }
                wVar = f76359j;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return wVar;
    }

    public final synchronized void c(d dVar) {
        try {
            Iterator it = new LinkedHashSet(this.f76362i).iterator();
            while (it.hasNext()) {
                ((c91.b) ((c) it.next())).b(dVar);
            }
            synchronized (this) {
                Iterator it2 = new HashSet(this.f79901d).iterator();
                while (it2.hasNext()) {
                    ((c91.b) ((c) it2.next())).b(dVar);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
