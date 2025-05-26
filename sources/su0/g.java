package su0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f115195j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f115196k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f115197l = new g(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115198i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f115198i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f115198i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, null, null, null, null, 0, null, 1021);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, true, null, null, null, null, null, null, 0, null, 1021);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.done), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f115198i) {
        }
        return b((yl1.b) obj);
    }
}
