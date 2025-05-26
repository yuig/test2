package il1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import bs1.c;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.l;
import com.pinterest.framework.screens.m;
import com.pinterest.framework.screens.n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import me.o;
import p91.v;
import tb0.h;

/* loaded from: classes2.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final wk2.a f72555a;

    /* renamed from: b, reason: collision with root package name */
    public final h f72556b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f72557c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f72558d;

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantReadWriteLock f72559e;

    public b(bf2.a fragmentFactoryProvider, h crashReporting) {
        Intrinsics.checkNotNullParameter(fragmentFactoryProvider, "fragmentFactoryProvider");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f72555a = fragmentFactoryProvider;
        this.f72556b = crashReporting;
        this.f72557c = new HashMap();
        this.f72558d = new HashMap();
        this.f72559e = new ReentrantReadWriteLock();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f A[LOOP:1: B:20:0x004d->B:21:0x004f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.pinterest.framework.screens.ScreenDescription r8) {
        /*
            r7 = this;
            java.lang.String r0 = "screenDescription"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r7.f72559e
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L18
            int r2 = r0.getReadHoldCount()
            goto L19
        L18:
            r2 = r3
        L19:
            r4 = r3
        L1a:
            if (r4 >= r2) goto L22
            r1.unlock()
            int r4 = r4 + 1
            goto L1a
        L22:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            com.pinterest.framework.screens.m r4 = r7.h(r8)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L38
            r5 = r4
            jl1.a r5 = (jl1.a) r5     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.f76940d     // Catch: java.lang.Throwable -> L3a
            r6 = 1
            if (r5 != r6) goto L38
            goto L3c
        L38:
            r6 = r3
            goto L3c
        L3a:
            r8 = move-exception
            goto L59
        L3c:
            r7.c(r8)     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L48
            if (r4 == 0) goto L48
            jl1.a r4 = (jl1.a) r4     // Catch: java.lang.Throwable -> L3a
            r4.M6()     // Catch: java.lang.Throwable -> L3a
        L48:
            r7.b(r8)     // Catch: java.lang.Throwable -> L3a
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L3a
        L4d:
            if (r3 >= r2) goto L55
            r1.lock()
            int r3 = r3 + 1
            goto L4d
        L55:
            r0.unlock()
            return
        L59:
            if (r3 >= r2) goto L61
            r1.lock()
            int r3 = r3 + 1
            goto L59
        L61:
            r0.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.b.a(com.pinterest.framework.screens.ScreenDescription):void");
    }

    public final void b(ScreenDescription screenDescription) {
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f72559e;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i13 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i14 = 0; i14 < readHoldCount; i14++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
        } finally {
            while (i13 < readHoldCount) {
                readLock.lock();
                i13++;
            }
            writeLock.unlock();
        }
    }

    public final void c(ScreenDescription screenDescription) {
        m h10;
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f72559e;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i13 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i14 = 0; i14 < readHoldCount; i14++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            if (this.f72558d.remove(screenDescription) != null && (h10 = h(screenDescription)) != null) {
                Intrinsics.checkNotNullParameter(h10, "<this>");
                if (((jl1.a) h10).f76939c) {
                    h10.unbind();
                }
            }
            Unit unit = Unit.f80348a;
            while (i13 < readHoldCount) {
                readLock.lock();
                i13++;
            }
            writeLock.unlock();
        } catch (Throwable th3) {
            while (i13 < readHoldCount) {
                readLock.lock();
                i13++;
            }
            writeLock.unlock();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View d(ScreenDescription screenDescription, ViewGroup container) {
        m g13 = g(screenDescription);
        int i13 = 0;
        if (g13 == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.f72559e;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i14 = 0; i14 < readHoldCount; i14++) {
                readLock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                m e13 = e(screenDescription.getScreenClass(), container);
                k(screenDescription, e13);
                Intrinsics.g(e13, "null cannot be cast to non-null type android.view.View");
                return (View) e13;
            } finally {
                while (i13 < readHoldCount) {
                    readLock.lock();
                    i13++;
                }
                writeLock.unlock();
            }
        }
        Context activity = container.getContext();
        Intrinsics.checkNotNullExpressionValue(activity, "getContext(...)");
        Bundle f49208d = screenDescription.getF49208d();
        Intrinsics.checkNotNullParameter(g13, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        jl1.a target = (jl1.a) g13;
        if (!target.f76939c) {
            g13.x3(activity, screenDescription, f49208d);
        }
        Context activity2 = container.getContext();
        Intrinsics.checkNotNullExpressionValue(activity2, "getContext(...)");
        Bundle f49208d2 = screenDescription.getF49208d();
        Intrinsics.checkNotNullParameter(activity2, "activity");
        Intrinsics.checkNotNullParameter(container, "container");
        LayoutInflater inflater = LayoutInflater.from(activity2);
        if (target.f76943g) {
            Intrinsics.f(inflater);
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(container, "container");
            if (o.f87006c == null) {
                Method declaredMethod = Fragment.class.getDeclaredMethod("performCreateView", LayoutInflater.class, ViewGroup.class, Bundle.class);
                o.f87006c = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
            }
            Method method = o.f87006c;
            if (method != null) {
                method.invoke(target, inflater, container, f49208d2);
            }
        }
        target.onViewCreated(target.requireView(), f49208d2);
        if (target.f76943g) {
            Intrinsics.checkNotNullParameter(target, "target");
            if (o.f87007d == null) {
                Method declaredMethod2 = Fragment.class.getDeclaredMethod("performActivityCreated", Bundle.class);
                o.f87007d = declaredMethod2;
                if (declaredMethod2 != null) {
                    declaredMethod2.setAccessible(true);
                }
            }
            try {
                new n(target, f49208d2, i13).invoke();
            } catch (Exception unused) {
            }
        }
        View requireView = target.requireView();
        Intrinsics.checkNotNullExpressionValue(requireView, "requireView(...)");
        return requireView;
    }

    public final m e(Class cls, ViewGroup viewGroup) {
        this.f72556b.h("Instantiating " + cls.getName() + " with Class loader");
        Constructor constructor = cls.getConstructor(Context.class);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Object newInstance = constructor.newInstance(c.k0(context));
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return (m) newInstance;
    }

    public final boolean f(ScreenDescription screenDescription) {
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        return j(screenDescription) != null;
    }

    /* JADX WARN: Finally extract failed */
    public final m g(ScreenDescription screenDescription) {
        m mVar;
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f72559e;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            m mVar2 = (m) this.f72557c.get(screenDescription);
            if (mVar2 != null) {
                return mVar2;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i13 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i14 = 0; i14 < readHoldCount; i14++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                m l13 = l(screenDescription);
                if (l13 != null) {
                    k(screenDescription, l13);
                    mVar = l13;
                } else {
                    mVar = null;
                }
                while (i13 < readHoldCount) {
                    readLock2.lock();
                    i13++;
                }
                writeLock.unlock();
                return mVar;
            } catch (Throwable th3) {
                while (i13 < readHoldCount) {
                    readLock2.lock();
                    i13++;
                }
                writeLock.unlock();
                throw th3;
            }
        } finally {
            readLock.unlock();
        }
    }

    public final m h(ScreenDescription screenDescription) {
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        ReentrantReadWriteLock.ReadLock readLock = this.f72559e.readLock();
        readLock.lock();
        try {
            return (m) this.f72557c.get(screenDescription);
        } finally {
            readLock.unlock();
        }
    }

    public final View i(ScreenDescription screenDescription, ViewGroup parentView) {
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f72559e;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        HashMap hashMap = this.f72558d;
        try {
            View view = (View) hashMap.get(screenDescription);
            if (view != null) {
                return view;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i13 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i14 = 0; i14 < readHoldCount; i14++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                View d2 = d(screenDescription, parentView);
                hashMap.put(screenDescription, d2);
                return d2;
            } finally {
                while (i13 < readHoldCount) {
                    readLock2.lock();
                    i13++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }

    public final View j(ScreenDescription screenDescription) {
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        ReentrantReadWriteLock.ReadLock readLock = this.f72559e.readLock();
        readLock.lock();
        try {
            return (View) this.f72558d.get(screenDescription);
        } finally {
            readLock.unlock();
        }
    }

    public final void k(ScreenDescription screenDescription, m mVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f72559e;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i13 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i14 = 0; i14 < readHoldCount; i14++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f72557c.put(screenDescription, mVar);
            Unit unit = Unit.f80348a;
        } finally {
            while (i13 < readHoldCount) {
                readLock.lock();
                i13++;
            }
            writeLock.unlock();
        }
    }

    public final m l(ScreenDescription screenDescription) {
        Object obj;
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        Class fragmentClass = screenDescription.getScreenClass();
        String k13 = a.a.k("Instantiating ", fragmentClass.getName(), " with Factory");
        h hVar = this.f72556b;
        hVar.h(k13);
        try {
            mu1.a aVar = (mu1.a) ((a) this.f72555a.get());
            aVar.getClass();
            Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
            obj = aVar.f(fragmentClass);
        } catch (IllegalStateException unused) {
            hVar.h("Fragment " + fragmentClass.getName() + " is missing from the map");
            obj = null;
        }
        if (obj == null) {
            obj = new v(26, this, screenDescription);
        }
        m mVar = obj instanceof m ? (m) obj : null;
        if (mVar == null) {
            return null;
        }
        if (mVar instanceof com.pinterest.framework.screens.h) {
        }
        return mVar;
    }
}
