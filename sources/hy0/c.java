package hy0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import yl1.i;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f70581j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f70582k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f70583l = new c(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70584i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f70584i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f70584i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.done), false, fm1.c.GONE, null, null, null, null, null, 0, null, 1018);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, i.c(), null, null, null, 0, null, 1007);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f70584i) {
            case 0:
                return b((yl1.b) obj);
            case 1:
                return b((yl1.b) obj);
            default:
                ao1.b it = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, null, null, null, false, 0, 0, 0, false, false, false, fm1.c.VISIBLE, true, null, null, null, null, null, 0, 4169727);
        }
    }
}
