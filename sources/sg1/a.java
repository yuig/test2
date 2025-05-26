package sg1;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import vn1.c;
import vn1.e;
import vn1.g;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f112870j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f112871k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112872i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f112872i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f112872i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                g gVar = g.UI_400;
                return rn1.a.y(it, null, c.INVERSE, e0.b(vn1.b.CENTER), e0.b(e.BOLD), gVar, 2, fm1.c.GONE, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096897);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                g gVar2 = g.HEADING_XL;
                return rn1.a.y(it, null, c.INVERSE, e0.b(vn1.b.CENTER), e0.b(e.BOLD), gVar2, 0, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096993);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f112872i) {
        }
        return b((rn1.a) obj);
    }
}
