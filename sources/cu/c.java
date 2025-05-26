package cu;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f53176j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f53177k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f53178l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f53179m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f53180n = new c(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f53181o = new c(5);

    /* renamed from: p, reason: collision with root package name */
    public static final c f53182p = new c(6);

    /* renamed from: q, reason: collision with root package name */
    public static final c f53183q = new c(7);

    /* renamed from: r, reason: collision with root package name */
    public static final c f53184r = new c(8);

    /* renamed from: s, reason: collision with root package name */
    public static final c f53185s = new c(9);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53186i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f53186i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f53186i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, new rm1.d(new rm1.f(rm1.q.MUSIC_OFF, rm1.i.XS), rm1.c.LIGHT, null, 0, null, 28), null, false, 0, null, null, null, null, null, false, null, null, 2096895);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, new rm1.d(new rm1.f(rm1.q.MUSIC_OFF, rm1.i.XS), rm1.c.LIGHT, null, 0, null, 28), false, 0, null, null, null, null, null, false, null, null, 2096639);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 4:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.c cVar = vn1.c.LIGHT;
                rm1.d dVar = it.f108857o;
                return rn1.a.y(it, null, cVar, null, null, null, 0, null, null, dVar != null ? rm1.d.e(dVar, null, rm1.c.LIGHT, null, 0, null, 29) : null, null, false, 0, null, null, null, null, null, false, null, null, 2096893);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f53186i) {
            case 4:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(rm1.c.LIGHT);
                break;
        }
        return b((rn1.a) obj);
    }
}
