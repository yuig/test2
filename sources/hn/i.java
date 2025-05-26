package hn;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f69604d;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f69605a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f69606b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f69607c;

    static {
        i iVar = new i();
        iVar.f69606b = false;
        iVar.f69607c = false;
        f69604d = iVar;
    }

    public final void a(boolean z13, boolean z14) {
        if ((z14 || z13) == (this.f69607c || this.f69606b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(c.f69594c.f69595a).iterator();
        while (it.hasNext()) {
            ((fn.i) it.next()).d().i(z14 || z13);
        }
    }
}
