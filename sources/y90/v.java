package y90;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements ek.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f138256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f138257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f138258c;

    public v(Function1 function1, Function1 function12, Function1 function13) {
        this.f138256a = function1;
        this.f138257b = function12;
        this.f138258c = function13;
    }

    @Override // ek.c
    public final void a(ek.e tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.f138257b.invoke(tab);
    }

    @Override // ek.c
    public final void b(ek.e tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.f138258c.invoke(tab);
    }

    @Override // ek.c
    public final void c(ek.e tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.f138256a.invoke(tab);
    }
}
