package d91;

import java.util.ArrayList;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.k0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f54048j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f54049k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f54050l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f54051m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f54052n = new c(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f54053o = new c(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54054i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f54054i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f54054i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], vc2.f.try_on_permissions_description_pdp), vn1.c.DARK, e0.b(vn1.b.CENTER), null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097128);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], vc2.f.try_on_permissions_allow_in_settings), vn1.c.DARK, null, e0.b(vn1.e.BOLD), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097140);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], vc2.f.try_on_pdp_cta), vn1.c.DARK, e0.b(vn1.b.CENTER), null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097128);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.g gVar = vn1.g.UI_400;
                vn1.g gVar2 = vn1.g.BODY_300;
                rn1.b bVar = rn1.b.END;
                int i13 = w50.a.more_like_this_look;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(it, new k0(i13, new ArrayList(0)), null, null, null, gVar, 1, null, bVar, null, null, false, 0, null, gVar2, gVar, null, null, false, null, null, 2072398);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.c cVar = vn1.c.LIGHT;
                vn1.g gVar3 = vn1.g.UI_400;
                return rn1.a.y(it, null, cVar, null, null, gVar3, 0, null, null, null, null, false, 0, null, vn1.g.BODY_300, gVar3, null, null, false, null, null, 2072557);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f54054i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return b((rn1.a) obj);
            case 3:
                return b((rn1.a) obj);
            case 4:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, yl1.i.b(), yl1.c.SMALL, null, null, 0, null, 975);
            default:
                return b((rn1.a) obj);
        }
    }
}
