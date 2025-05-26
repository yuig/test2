package pq2;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class d0 extends wo2.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f101008b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, wo2.l lVar) {
        super(lVar);
        this.f101008b = e0Var;
    }

    @Override // wo2.p, wo2.e0
    public final long read(wo2.j jVar, long j13) {
        try {
            return super.read(jVar, j13);
        } catch (IOException e13) {
            this.f101008b.f101021f = e13;
            throw e13;
        }
    }
}
