package nl1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s3.q1;
import s3.s;
import u2.p;

/* loaded from: classes5.dex */
public final class h extends p implements s {

    /* renamed from: n, reason: collision with root package name */
    public Function1 f91302n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f91303o;

    @Override // s3.s
    public final void E(q1 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        a3.d d2 = androidx.compose.ui.layout.b.d(coordinates);
        boolean z13 = this.f120054m && d2.d() > 0.0f && d2.c() > 0.0f;
        if (this.f91303o != z13) {
            long j13 = coordinates.f102180c;
            float d13 = d2.d() / ((int) (j13 >> 32));
            float c13 = d2.c() / ((int) (4294967295L & j13));
            if (z13) {
                this.f91302n.invoke(new j(d2, j13, d13, c13));
            } else {
                this.f91302n.invoke(i.f91304a);
            }
            this.f91303o = z13;
        }
    }

    @Override // u2.p
    public final void E0() {
        this.f91302n.invoke(i.f91304a);
        this.f91303o = false;
    }
}
