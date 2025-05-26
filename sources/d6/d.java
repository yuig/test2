package d6;

import a6.j0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements a6.h {

    /* renamed from: a, reason: collision with root package name */
    public final a6.h f53730a;

    public d(j0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f53730a = delegate;
    }

    @Override // a6.h
    public final Object a(Function2 function2, bl2.c cVar) {
        return this.f53730a.a(new c(function2, null), cVar);
    }

    @Override // a6.h
    public final do2.i getData() {
        return this.f53730a.getData();
    }
}
