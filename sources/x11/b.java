package x11;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import vn1.g;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f131573j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f131574k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131575i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f131575i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f131575i) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            default:
                yl1.b it2 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return yl1.b.f(it2, bs1.c.j2(new String[0], x0.remove), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }
}
