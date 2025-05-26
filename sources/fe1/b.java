package fe1;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f62043j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f62044k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f62045l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f62046m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f62047n = new b(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62048i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f62048i = i13;
    }

    public final em1.d b(em1.d it) {
        switch (this.f62048i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, em1.b.UNCHECKED, em1.e.ENABLED, null, null, null, null, 0, null, false, 0, 1020);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, em1.b.UNCHECKED, em1.e.ENABLED, null, null, null, null, 0, null, false, 0, 1020);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f62048i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.g gVar = vn1.g.UI_400;
                return rn1.a.y(it, null, null, e0.b(vn1.b.CENTER_VERTICAL), null, gVar, 1, null, rn1.b.END, null, null, false, 0, null, vn1.h.f126278d, gVar, null, null, false, null, null, 2072395);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.g gVar2 = vn1.g.UI_400;
                return rn1.a.y(it, null, null, null, null, gVar2, 1, null, rn1.b.END, null, null, false, 0, null, vn1.h.f126278d, gVar2, null, null, false, null, null, 2072399);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f62048i) {
        }
        return e((rn1.a) obj);
    }
}
