package gs0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.k0;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f66024j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f66025k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66026i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f66026i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f66026i) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List b13 = e0.b(vn1.b.CENTER);
                vn1.g gVar = vn1.g.BODY_100;
                vn1.g gVar2 = vn1.g.BODY_200;
                vn1.c cVar = vn1.c.SUBTLE;
                rn1.b bVar = rn1.b.END;
                int i13 = bz1.c.sponsored;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(it, new k0(i13, new ArrayList(0)), cVar, b13, null, null, 0, null, bVar, null, null, false, 0, null, gVar, gVar2, null, null, false, null, null, 2072440);
            default:
                on1.s bind = (on1.s) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f96762b = false;
                return Unit.f80348a;
        }
    }
}
