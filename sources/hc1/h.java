package hc1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f68716j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f68717k = new h(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68718i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f68718i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f68718i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.done), false, null, null, null, null, null, null, 0, null, 1020);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.done), false, null, bs1.c.j2(new String[0], x0.done), null, null, null, null, 0, null, 1012);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f68718i) {
        }
        return b((yl1.b) obj);
    }
}
