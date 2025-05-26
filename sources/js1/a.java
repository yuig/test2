package js1;

import android.os.Looper;
import j51.u;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import tb0.g;
import tb0.h;
import tb0.p;
import xa.i;

/* loaded from: classes4.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f77571a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public final h f77572b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f77573c;

    public a() {
        HashSet hashSet = h.f117076w;
        h hVar = g.f117075a;
        Intrinsics.checkNotNullExpressionValue(hVar, "getInstance(...)");
        this.f77572b = hVar;
    }

    @Override // xa.i
    public final void A5(int i13) {
        Iterator it = this.f77571a.iterator();
        while (it.hasNext()) {
            ((i) it.next()).A5(i13);
        }
        b();
    }

    public final void a(u listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f77571a.add(listener);
        b();
    }

    public final void b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        try {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        } catch (IllegalStateException e13) {
            String message = e13.getMessage();
            if (message == null) {
                message = "";
            }
            this.f77572b.q(e13, message, p.EXPERIENCES);
        }
    }

    @Override // xa.i
    public final void i(int i13, float f13, int i14) {
        Iterator it = this.f77571a.iterator();
        while (it.hasNext()) {
            ((i) it.next()).i(i13, f13, i14);
        }
        b();
    }

    @Override // xa.i
    public final void i5(int i13) {
        Iterator it = this.f77571a.iterator();
        while (it.hasNext()) {
            ((i) it.next()).i5(i13);
        }
        this.f77573c = Integer.valueOf(i13);
        b();
    }
}
