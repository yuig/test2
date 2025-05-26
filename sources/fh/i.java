package fh;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final k0.a f62144a = new k0.a("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        j.a(context).b();
        Set set = com.google.android.gms.common.api.i.f30771a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((com.google.android.gms.common.api.i) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        com.google.android.gms.common.api.internal.f.a();
    }
}
