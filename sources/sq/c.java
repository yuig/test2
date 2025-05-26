package sq;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;

/* loaded from: classes3.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f114963i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f114964j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f114965k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f114966l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13, boolean z13, boolean z14, boolean z15) {
        super(1);
        this.f114963i = i13;
        this.f114964j = z13;
        this.f114965k = z14;
        this.f114966l = z15;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f114963i) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, e0.b(vn1.b.CENTER_VERTICAL), null, null, 0, null, null, this.f114964j ? new rm1.d(new rm1.f(q.LOCK), null, null, 0, null, 30) : this.f114965k ? new rm1.d(new rm1.f(q.CHECK_CIRCLE), rm1.c.INFO, null, 0, null, 28) : this.f114966l ? new rm1.d(new rm1.f(q.CHECK_CIRCLE), rm1.c.BRAND, null, 0, null, 28) : null, null, false, 0, null, null, null, null, null, false, null, null, 2096891);
            default:
                s80.j it2 = (s80.j) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                w80.b bVar = it2.f111594c;
                boolean z13 = this.f114966l;
                boolean z14 = this.f114964j;
                return s80.j.e(it2, null, null, w80.b.e(bVar, z14, this.f114965k, z13, z14, z14, false, 32), null, null, null, null, null, null, null, null, null, false, false, false, null, 131067);
        }
    }
}
