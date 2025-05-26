package oc2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f94059j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f94060k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f94061l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f94062m = new a(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94063i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f94063i = i13;
    }

    public final om1.c b(om1.c it) {
        switch (this.f94063i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, fm1.c.VISIBLE, null, false, 0, 983);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, fm1.c.VISIBLE, null, false, 0, 1015);
        }
    }

    public final rm1.d e(rm1.d icon) {
        switch (this.f94063i) {
            case 0:
                Intrinsics.checkNotNullParameter(icon, "icon");
                return rm1.d.e(icon, new rm1.f(q.SOUND, rm1.i.SM), rm1.c.LIGHT, null, 0, null, 28);
            default:
                Intrinsics.checkNotNullParameter(icon, "it");
                return rm1.d.e(icon, new rm1.f(q.MAXIMIZE, rm1.i.MD), rm1.c.LIGHT, null, 0, null, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f94063i) {
        }
        return b((om1.c) obj);
    }
}
