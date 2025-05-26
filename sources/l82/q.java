package l82;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q implements u50.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u50.r f82246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f82247b;

    public q(c cVar, Function1 function1) {
        this.f82246a = cVar;
        this.f82247b = function1;
    }

    @Override // u50.r
    public final void a(Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f82246a.a((u50.s) this.f82247b.invoke((u50.s) event));
    }
}
