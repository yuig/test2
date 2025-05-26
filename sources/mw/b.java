package mw;

import ew.d;
import g1.r;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends r {

    /* renamed from: g, reason: collision with root package name */
    public final Function2 f88418g;

    public b(d dVar) {
        super(24);
        this.f88418g = dVar;
    }

    @Override // g1.r
    public final void b(boolean z13, Object key, Object oldValue, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        super.b(z13, key, oldValue, obj);
        Function2 function2 = this.f88418g;
        if (function2 != null) {
            function2.invoke(key, oldValue);
        }
    }
}
