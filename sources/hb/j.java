package hb;

import android.app.Activity;
import eb.p;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j implements a {

    /* renamed from: a, reason: collision with root package name */
    public final a f68494a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f68495b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f68496c;

    public j(l callbackInterface) {
        Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
        this.f68494a = callbackInterface;
        this.f68495b = new ReentrantLock();
        this.f68496c = new WeakHashMap();
    }

    @Override // hb.a
    public final void a(Activity activity, p newLayout) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(newLayout, "newLayout");
        ReentrantLock reentrantLock = this.f68495b;
        reentrantLock.lock();
        WeakHashMap weakHashMap = this.f68496c;
        try {
            if (Intrinsics.d(newLayout, (p) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            this.f68494a.a(activity, newLayout);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ReentrantLock reentrantLock = this.f68495b;
        reentrantLock.lock();
        try {
            this.f68496c.put(activity, null);
            Unit unit = Unit.f80348a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
