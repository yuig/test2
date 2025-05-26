package gb;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import l0.v;
import u5.j;

/* loaded from: classes3.dex */
public final class c implements fb.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f64666a;

    /* renamed from: b, reason: collision with root package name */
    public final cb.b f64667b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f64668c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f64669d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f64670e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f64671f;

    public c(WindowLayoutComponent component, cb.b consumerAdapter) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(consumerAdapter, "consumerAdapter");
        this.f64666a = component;
        this.f64667b = consumerAdapter;
        this.f64668c = new ReentrantLock();
        this.f64669d = new LinkedHashMap();
        this.f64670e = new LinkedHashMap();
        this.f64671f = new LinkedHashMap();
    }

    @Override // fb.a
    public final void a(Activity context, j executor, v callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f64668c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f64669d;
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f64670e;
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
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(f0.g()));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f64671f.put(multicastConsumer2, this.f64667b.a(this.f64666a, k0.a(WindowLayoutInfo.class), context, new b(multicastConsumer2)));
                }
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
        ReentrantLock reentrantLock = this.f64668c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f64670e;
        try {
            Context context = (Context) linkedHashMap.get(callback);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f64669d;
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap2.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            multicastConsumer.c(callback);
            linkedHashMap.remove(callback);
            if (multicastConsumer.f19986d.isEmpty()) {
                linkedHashMap2.remove(context);
                db.e eVar = (db.e) this.f64671f.remove(multicastConsumer);
                if (eVar != null) {
                    eVar.f54268a.invoke(eVar.f54269b, eVar.f54270c);
                }
            }
            Unit unit = Unit.f80348a;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
