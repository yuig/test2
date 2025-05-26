package gb1;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64700i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f64701j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(o oVar, int i13) {
        super(1);
        this.f64700i = i13;
        this.f64701j = oVar;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f64700i;
        o oVar = this.f64701j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = oVar.f64718f;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return yl1.b.f(it, new k0(i14, new ArrayList(0)), false, fm1.c.GONE, null, null, null, null, null, 0, null, 1018);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = oVar.f64719g;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                return yl1.b.f(it, new k0(i15, new ArrayList(0)), false, fm1.c.GONE, null, null, null, null, null, 0, null, 1018);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                int i16 = oVar.f64718f;
                String[] formatArgs3 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs3, "formatArgs");
                return yl1.b.f(it, new k0(i16, new ArrayList(0)), false, fm1.c.GONE, null, null, null, null, null, 0, null, 1018);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int i17 = oVar.f64719g;
                String[] formatArgs4 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs4, "formatArgs");
                return yl1.b.f(it, new k0(i17, new ArrayList(0)), false, fm1.c.GONE, null, null, null, null, null, 0, null, 1018);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f64700i) {
        }
        return b((yl1.b) obj);
    }
}
