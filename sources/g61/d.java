package g61;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.f;
import rm1.q;
import vn1.g;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f63727j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f63728k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f63729l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63730i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f63730i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f63730i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, g.BODY_300, 0, null, null, new rm1.d(new f(q.ARROW_UP_RIGHT), null, null, 0, null, 30), null, false, 0, null, null, null, null, null, false, null, null, 2096879);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.BOLD), g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097127);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.BOLD), g.BODY_300, 2, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096967);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f63730i) {
        }
        return b((rn1.a) obj);
    }
}
