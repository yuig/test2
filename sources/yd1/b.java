package yd1;

import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rl1.q;
import vn1.g;
import vn1.h;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f138787j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f138788k = new b(2);

    /* renamed from: l, reason: collision with root package name */
    public static final b f138789l = new b(3);

    /* renamed from: m, reason: collision with root package name */
    public static final b f138790m = new b(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138791i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f138791i = i13;
    }

    public final q b(q it) {
        switch (this.f138791i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return q.e(it, null, null, false, null, null, false, false, fm1.c.GONE, 0, null, null, 1919);
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f138791i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, null, h.f126278d, g.UI_400, null, null, false, null, null, 2072575);
            case 2:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, f0.j(vn1.b.CENTER_VERTICAL, vn1.b.START), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097147);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, null, h.f126278d, g.UI_400, null, null, false, null, null, 2072575);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f138791i) {
        }
        return e((rn1.a) obj);
    }
}
