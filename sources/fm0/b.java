package fm0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import om1.c;
import om1.f;
import rm1.d;
import rm1.i;
import rm1.q;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62571i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f62572j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f62573k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(q qVar, boolean z13, int i13) {
        super(1);
        this.f62571i = i13;
        this.f62572j = qVar;
        this.f62573k = z13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f62571i;
        boolean z13 = this.f62573k;
        switch (i13) {
            case 0:
                c it = (c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return c.e(it, this.f62572j, null, f.TRANSPARENT_DARK_GRAY, z13 ? fm1.c.VISIBLE : fm1.c.INVISIBLE, null, false, 0, 1010);
            default:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rn1.a.y(it2, null, null, null, null, null, 0, null, null, new d(new rm1.f(this.f62572j, i.LG), z13 ? rm1.c.LIGHT : rm1.c.DARK, null, 0, null, 28), null, false, 0, null, null, null, null, null, false, null, null, 2096895);
        }
    }
}
