package rm1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public g f108709a;

    /* renamed from: b, reason: collision with root package name */
    public c f108710b;

    /* renamed from: c, reason: collision with root package name */
    public fm1.c f108711c;

    /* renamed from: d, reason: collision with root package name */
    public int f108712d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f108713e;

    public k(d displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f108709a = displayState.f108695a;
        this.f108710b = displayState.f108696b;
        this.f108711c = displayState.f108697c;
        this.f108712d = displayState.f108698d;
        this.f108713e = displayState.f108699e;
    }

    public final void a(c color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f108710b = color;
    }

    public final void b(Function1 init) {
        Intrinsics.checkNotNullParameter(init, "init");
        g gVar = this.f108709a;
        Intrinsics.g(gVar, "null cannot be cast to non-null type com.pinterest.gestalt.iconcomponent.GestaltIcon.IconAndSize.Standard");
        l lVar = new l((f) gVar);
        init.invoke(lVar);
        f iconAndSize = new f(lVar.f108714a, lVar.f108715b);
        Intrinsics.checkNotNullParameter(iconAndSize, "iconAndSize");
        this.f108709a = iconAndSize;
    }

    public final void c(fm1.c visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f108711c = visibility;
    }
}
