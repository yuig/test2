package mp;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f87829j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f87830k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f87831l = new a(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87832i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f87832i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f87832i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, e0.b(vn1.b.CENTER_HORIZONTAL), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097147);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f87832i) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                om1.c it2 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
        }
        return b((rn1.a) obj);
    }
}
