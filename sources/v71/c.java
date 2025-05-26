package v71;

import kotlin.jvm.internal.Intrinsics;
import nm.o;
import xk2.m;
import xk2.v;
import z71.i;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final gi2.b f124392a;

    /* renamed from: b, reason: collision with root package name */
    public final v f124393b;

    /* renamed from: c, reason: collision with root package name */
    public final v f124394c;

    public c(gi2.b collageGson) {
        Intrinsics.checkNotNullParameter(collageGson, "collageGson");
        this.f124392a = collageGson;
        this.f124393b = m.b(new b(this, 1));
        this.f124394c = m.b(new b(this, 0));
    }

    public final String a(i iVar) {
        return ((o) this.f124393b.getValue()).k(iVar);
    }
}
