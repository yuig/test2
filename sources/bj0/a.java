package bj0;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rl1.q;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f22938j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f22939k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f22940l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f22941m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f22942n = new a(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22943i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f22943i = i13;
    }

    public final q b(q it) {
        switch (this.f22943i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, null, null, false, null, null, false, false, fm1.c.GONE, 0, null, null, 1919);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, null, null, false, null, null, false, false, fm1.c.VISIBLE, 0, null, null, 1919);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f22943i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, null, null, vn1.g.HEADING_700, 3, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096973);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.g gVar = vn1.g.BODY_300;
                return rn1.a.y(it, null, vn1.c.LIGHT, null, e0.b(vn1.e.BOLD), gVar, 3, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096965);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22943i) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return b((q) obj);
    }
}
