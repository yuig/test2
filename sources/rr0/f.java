package rr0;

import java.util.List;
import sq0.m;
import sq0.y;
import sq0.z;

/* loaded from: classes.dex */
public final class f implements z {

    /* renamed from: a, reason: collision with root package name */
    public final nr0.f f109886a;

    /* renamed from: b, reason: collision with root package name */
    public final sq0.f f109887b;

    /* renamed from: c, reason: collision with root package name */
    public final m f109888c;

    /* renamed from: d, reason: collision with root package name */
    public final int f109889d;

    public f(nr0.f fVar, sq0.f fVar2, m mVar, int i13) {
        this.f109886a = fVar;
        this.f109887b = fVar2;
        this.f109888c = mVar;
        this.f109889d = i13;
    }

    @Override // sq0.z
    public final void j3(int i13) {
    }

    @Override // sq0.z
    public final void r1(int i13, y yVar) {
        nr0.f fVar = this.f109886a;
        List d2 = fVar.d();
        this.f109887b.k(i13, this.f109889d, yVar, d2);
        m mVar = this.f109888c;
        if (mVar != null) {
            mVar.l(fVar, i13, yVar);
        }
    }
}
