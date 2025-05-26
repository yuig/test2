package androidx.window.layout.adapter.extensions;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import eb.p;
import gb.e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l0.v;
import org.jetbrains.annotations.NotNull;
import p5.a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Lp5/a;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "Landroidx/window/extensions/core/util/function/Consumer;", "value", "", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class MulticastConsumer implements a, Consumer<WindowLayoutInfo> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19983a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f19984b;

    /* renamed from: c, reason: collision with root package name */
    public p f19985c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f19986d;

    public MulticastConsumer(Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f19983a = context;
        this.f19984b = new ReentrantLock();
        this.f19986d = new LinkedHashSet();
    }

    public final void a(v listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ReentrantLock reentrantLock = this.f19984b;
        reentrantLock.lock();
        try {
            p pVar = this.f19985c;
            if (pVar != null) {
                listener.accept(pVar);
            }
            this.f19986d.add(listener);
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final boolean b() {
        return this.f19986d.isEmpty();
    }

    public final void c(a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ReentrantLock reentrantLock = this.f19984b;
        reentrantLock.lock();
        try {
            this.f19986d.remove(listener);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p5.a
    public void accept(@NotNull WindowLayoutInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ReentrantLock reentrantLock = this.f19984b;
        reentrantLock.lock();
        try {
            p b13 = e.b(this.f19983a, value);
            this.f19985c = b13;
            Iterator it = this.f19986d.iterator();
            while (it.hasNext()) {
                ((a) it.next()).accept(b13);
            }
            Unit unit = Unit.f80348a;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
