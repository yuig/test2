package c2;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j4 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24858i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f24859j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f24860k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f24861l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f24862m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f24863n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(int i13, l82.e eVar, int i14, int i15, ArrayList arrayList) {
        super(1);
        this.f24859j = i13;
        this.f24862m = eVar;
        this.f24860k = i14;
        this.f24861l = i15;
        this.f24863n = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u50.i0 k0Var;
        yl1.b bVar;
        int i13 = this.f24861l;
        int i14 = this.f24860k;
        int i15 = this.f24859j;
        int i16 = this.f24858i;
        Object obj2 = this.f24863n;
        Object obj3 = this.f24862m;
        switch (i16) {
            case 0:
                q3.b1 b1Var = (q3.b1) obj;
                q3.b1.f(b1Var, (q3.c1) obj3, 0, i15);
                q3.b1.f(b1Var, (q3.c1) obj2, i14, i13);
                return Unit.f80348a;
            default:
                yy0.d it = (yy0.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (i15 == 1) {
                    k0Var = ((yy0.d) ((l82.e) obj3).f82218a).f140433c;
                } else if (i14 > 0) {
                    int i17 = jv1.g.use_case_picker_subtitle_before_minimum;
                    String[] formatArgs = {String.valueOf(i14)};
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    k0Var = new u50.j0(i17, i14, kotlin.collections.c0.b0(formatArgs));
                } else {
                    int i18 = jv1.h.use_case_picker_subtitle_after_minimum;
                    Intrinsics.checkNotNullParameter(new String[0], "formatArgs");
                    k0Var = new u50.k0(i18, new ArrayList(0));
                }
                switch (yy0.d.f140429g.f126366a) {
                    case 6:
                        bVar = ny0.f.f92582h;
                        break;
                    default:
                        bVar = yy0.d.f140430h;
                        break;
                }
                return yy0.d.e(it, (List) obj2, yl1.b.f(bVar, null, i13 >= i15, null, null, null, null, null, null, 0, null, 1021), k0Var, null, 8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(q3.c1 c1Var, int i13, q3.c1 c1Var2, int i14, int i15) {
        super(1);
        this.f24862m = c1Var;
        this.f24859j = i13;
        this.f24863n = c1Var2;
        this.f24860k = i14;
        this.f24861l = i15;
    }
}
