package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.w0;
import ja.c0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.w;
import pd.t;

/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: i, reason: collision with root package name */
    public static volatile b f29738i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile boolean f29739j;

    /* renamed from: a, reason: collision with root package name */
    public final t f29740a;

    /* renamed from: b, reason: collision with root package name */
    public final qd.d f29741b;

    /* renamed from: c, reason: collision with root package name */
    public final rd.g f29742c;

    /* renamed from: d, reason: collision with root package name */
    public final f f29743d;

    /* renamed from: e, reason: collision with root package name */
    public final qd.i f29744e;

    /* renamed from: f, reason: collision with root package name */
    public final ae.m f29745f;

    /* renamed from: g, reason: collision with root package name */
    public final wc.b f29746g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f29747h = new ArrayList();

    public b(Context context, t tVar, rd.g gVar, qd.d dVar, qd.i iVar, ae.m mVar, wc.b bVar, int i13, h1.b bVar2, g1.g gVar2, List list, ArrayList arrayList, w wVar, c0 c0Var) {
        g gVar3 = g.LOW;
        this.f29740a = tVar;
        this.f29741b = dVar;
        this.f29744e = iVar;
        this.f29742c = gVar;
        this.f29745f = mVar;
        this.f29746g = bVar;
        this.f29743d = new f(context, iVar, new m7.c(this, arrayList, wVar), new wc.j(15), bVar2, gVar2, list, tVar, c0Var, i13);
    }

    public static b a(Context context) {
        if (f29738i == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e13) {
                d(e13);
                throw null;
            } catch (InstantiationException e14) {
                d(e14);
                throw null;
            } catch (NoSuchMethodException e15) {
                d(e15);
                throw null;
            } catch (InvocationTargetException e16) {
                d(e16);
                throw null;
            }
            synchronized (b.class) {
                if (f29738i == null) {
                    if (f29739j) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f29739j = true;
                    try {
                        b(context, generatedAppGlideModule);
                        f29739j = false;
                    } catch (Throwable th3) {
                        f29739j = false;
                        throw th3;
                    }
                }
            }
        }
        return f29738i;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e A[LOOP:3: B:58:0x0138->B:60:0x013e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r25, com.bumptech.glide.GeneratedAppGlideModule r26) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.b(android.content.Context, com.bumptech.glide.GeneratedAppGlideModule):void");
    }

    public static void d(ReflectiveOperationException reflectiveOperationException) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", reflectiveOperationException);
    }

    public static o f(Context context) {
        d7.b.p(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f29745f.c(context);
    }

    public static o g(View view) {
        Context context = view.getContext();
        d7.b.p(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        ae.m mVar = a(context).f29745f;
        mVar.getClass();
        char[] cArr = he.n.f68959a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return mVar.c(view.getContext().getApplicationContext());
        }
        d7.b.p(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity a13 = ae.m.a(view.getContext());
        if (a13 != null && (a13 instanceof FragmentActivity)) {
            FragmentActivity fragmentActivity = (FragmentActivity) a13;
            g1.g gVar = mVar.f15021c;
            gVar.clear();
            ae.m.b(fragmentActivity.getSupportFragmentManager().f18451c.f(), gVar);
            View findViewById = fragmentActivity.findViewById(R.id.content);
            Fragment fragment = null;
            while (!view.equals(findViewById) && (fragment = (Fragment) gVar.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            gVar.clear();
            if (fragment == null) {
                return mVar.d(fragmentActivity);
            }
            d7.b.p(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
            if (!(Looper.myLooper() == Looper.getMainLooper())) {
                return mVar.c(fragment.getContext().getApplicationContext());
            }
            if (fragment.E4() != null) {
                mVar.f15022d.b(fragment.E4());
            }
            w0 childFragmentManager = fragment.getChildFragmentManager();
            Context context2 = fragment.getContext();
            return mVar.f15023e.a(context2, a(context2.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
        }
        return mVar.c(view.getContext().getApplicationContext());
    }

    public final boolean c(ee.i iVar) {
        synchronized (this.f29747h) {
            try {
                Iterator it = this.f29747h.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).h(iVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void e(o oVar) {
        synchronized (this.f29747h) {
            try {
                if (!this.f29747h.contains(oVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f29747h.remove(oVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        he.n.a();
        this.f29742c.e(0L);
        this.f29741b.q();
        qd.i iVar = this.f29744e;
        synchronized (iVar) {
            iVar.b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
        long j13;
        he.n.a();
        synchronized (this.f29747h) {
            try {
                Iterator it = this.f29747h.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).getClass();
                }
            } finally {
            }
        }
        rd.g gVar = this.f29742c;
        gVar.getClass();
        if (i13 >= 40) {
            gVar.e(0L);
        } else if (i13 >= 20 || i13 == 15) {
            synchronized (gVar) {
                j13 = gVar.f68953b;
            }
            gVar.e(j13 / 2);
        }
        this.f29741b.p(i13);
        qd.i iVar = this.f29744e;
        synchronized (iVar) {
            if (i13 >= 40) {
                synchronized (iVar) {
                    iVar.b(0);
                }
            } else if (i13 >= 20 || i13 == 15) {
                iVar.b(iVar.f103549e / 2);
            }
        }
    }
}
