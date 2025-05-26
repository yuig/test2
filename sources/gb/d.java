package gb;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l0.v;
import u5.j;

/* loaded from: classes3.dex */
public final class d implements fb.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f64672a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f64673b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f64674c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f64675d;

    public d(WindowLayoutComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f64672a = component;
        this.f64673b = new ReentrantLock();
        this.f64674c = new LinkedHashMap();
        this.f64675d = new LinkedHashMap();
    }

    @Override // fb.a
    public final void a(Activity context, j executor, v callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f64673b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f64674c;
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f64675d;
            if (multicastConsumer != null) {
                multicastConsumer.a(callback);
                linkedHashMap2.put(callback, context);
                unit = Unit.f80348a;
            } else {
                unit = null;
            }
            if (unit == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(callback, context);
                multicastConsumer2.a(callback);
                this.f64672a.addWindowLayoutInfoListener(context, multicastConsumer2);
            }
            Unit unit2 = Unit.f80348a;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    @Override // fb.a
    public final void b(p5.a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f64673b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f64675d;
        try {
            Context context = (Context) linkedHashMap.get(callback);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f64674c;
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap2.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            multicastConsumer.c(callback);
            linkedHashMap.remove(callback);
            if (multicastConsumer.b()) {
                linkedHashMap2.remove(context);
                this.f64672a.removeWindowLayoutInfoListener(multicastConsumer);
            }
            Unit unit = Unit.f80348a;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
