package nl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e implements com.google.android.gms.common.api.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f91212a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z13) {
        synchronized (g.f91215j) {
            try {
                Iterator it = new ArrayList(g.f91216k.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f91221e.get()) {
                        g.a(gVar, z13);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
