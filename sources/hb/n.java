package hb;

import android.app.Activity;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.media3.ui.z;
import eb.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import l0.v;
import t3.a4;

/* loaded from: classes3.dex */
public final class n implements fb.a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile n f68507c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f68508d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final b f68509a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f68510b = new CopyOnWriteArrayList();

    public n(k kVar) {
        this.f68509a = kVar;
        if (kVar != null) {
            kVar.h(new l(this));
        }
    }

    @Override // fb.a
    public final void a(Activity activity, u5.j executor, v callback) {
        Object obj;
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(activity, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Unit unit = null;
        r1 = null;
        IBinder iBinder = null;
        if (!(activity instanceof Activity)) {
            activity = null;
        }
        if (activity != null) {
            ReentrantLock reentrantLock = f68508d;
            reentrantLock.lock();
            try {
                b bVar = this.f68509a;
                if (bVar == null) {
                    callback.accept(new p(q0.f80391a));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f68510b;
                boolean z13 = false;
                if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (Intrinsics.d(((m) it.next()).f68503a, activity)) {
                            z13 = true;
                            break;
                        }
                    }
                }
                m mVar = new m(activity, executor, callback);
                copyOnWriteArrayList.add(mVar);
                if (z13) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (Intrinsics.d(activity, ((m) obj).f68503a)) {
                                break;
                            }
                        }
                    }
                    m mVar2 = (m) obj;
                    p newLayoutInfo = mVar2 != null ? mVar2.f68506d : null;
                    if (newLayoutInfo != null) {
                        Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayoutInfo");
                        mVar.f68506d = newLayoutInfo;
                        mVar.f68504b.execute(new z(5, mVar, newLayoutInfo));
                    }
                } else {
                    k kVar = (k) bVar;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        kVar.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new a4(kVar, activity));
                    }
                }
                Unit unit2 = Unit.f80348a;
                reentrantLock.unlock();
                unit = Unit.f80348a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (unit == null) {
            callback.accept(new p(q0.f80391a));
        }
    }

    @Override // fb.a
    public final void b(p5.a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (f68508d) {
            try {
                if (this.f68509a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f68510b.iterator();
                while (it.hasNext()) {
                    m callbackWrapper = (m) it.next();
                    if (callbackWrapper.f68505c == callback) {
                        Intrinsics.checkNotNullExpressionValue(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                this.f68510b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((m) it2.next()).f68503a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f68510b;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (Intrinsics.d(((m) it3.next()).f68503a, activity)) {
                                break;
                            }
                        }
                    }
                    b bVar = this.f68509a;
                    if (bVar != null) {
                        ((k) bVar).f(activity);
                    }
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
