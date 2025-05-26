package at1;

import android.content.Context;
import android.util.SparseArray;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.r0;
import pd.s;
import xk2.m;
import xk2.v;
import yk1.q;

/* loaded from: classes2.dex */
public abstract class d extends kb0.a implements a, b {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f20439o = 0;

    /* renamed from: f, reason: collision with root package name */
    public i f20441f;

    /* renamed from: g, reason: collision with root package name */
    public tb0.h f20442g;

    /* renamed from: h, reason: collision with root package name */
    public bk.f f20443h;

    /* renamed from: k, reason: collision with root package name */
    public q f20446k;

    /* renamed from: m, reason: collision with root package name */
    public nl.g f20448m;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20440e = true;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f20444i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final ReentrantLock f20445j = new ReentrantLock();

    /* renamed from: l, reason: collision with root package name */
    public final v f20447l = m.b(new r0(this, 28));

    /* renamed from: n, reason: collision with root package name */
    public final v f20449n = m.b(c.f20438i);

    @Override // kb0.a, android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        i managedContext = new i(base);
        managedContext.f20459a = Executors.newCachedThreadPool();
        SparseArray sparseArray = new SparseArray(32);
        managedContext.f20461c = sparseArray;
        managedContext.f20462d = 0;
        this.f20441f = managedContext;
        Intrinsics.checkNotNullParameter(managedContext, "managedContext");
        bk.f fVar = ((m60.m) this).f85921p;
        fVar.getClass();
        if (sparseArray.indexOfKey(1) >= 0) {
            throw new IllegalStateException("ResourceDescription with id: 1 already exists");
        }
        if (sparseArray.size() >= 32) {
            throw new IllegalStateException("No more ResourceDescription can be added. Maximum capacity of 32 has been reached.");
        }
        sparseArray.put(1, new f(fVar));
        super.attachBaseContext(managedContext);
    }

    public abstract void b();

    public final synchronized void c() {
        if (this.f20448m == null) {
            s sVar = new s();
            if (this.f20443h == null) {
                Intrinsics.r("appBuildConfigProvider");
                throw null;
            }
            com.bumptech.glide.d.p("ApplicationId must be set.", "1:694505692171:android:a18443d2fc4fe5de");
            sVar.f99748b = "1:694505692171:android:a18443d2fc4fe5de";
            com.bumptech.glide.d.p("ApiKey must be set.", "AIzaSyANhfIQ0LIce4JOW4oly6kkLgXgCM3HFoI");
            sVar.f99747a = "AIzaSyANhfIQ0LIce4JOW4oly6kkLgXgCM3HFoI";
            sVar.f99753g = "pinterest-android";
            Intrinsics.checkNotNullExpressionValue(sVar, "setProjectId(...)");
            try {
                try {
                    this.f20448m = nl.g.f(this, sVar.h());
                } catch (IllegalStateException unused) {
                    this.f20448m = nl.g.c();
                }
            } catch (IllegalStateException unused2) {
                d().h("Firebase failed to init!");
            }
        }
    }

    public final tb0.h d() {
        tb0.h hVar = this.f20442g;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("crashReporting");
        throw null;
    }

    public abstract void e();

    public final void f(k listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        vb0.j.f125466a.N(listener, "listener cannot be null.", new Object[0]);
        ReentrantLock reentrantLock = this.f20445j;
        reentrantLock.lock();
        try {
            this.f20444i.put(listener, Boolean.TRUE);
            Unit unit = Unit.f80348a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        i iVar = this.f20441f;
        Intrinsics.f(iVar);
        Context baseContext = iVar.getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        return baseContext;
    }
}
