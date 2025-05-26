package h8;

import g7.y;
import lb.l0;

/* loaded from: classes.dex */
public final class o extends f {

    /* renamed from: j, reason: collision with root package name */
    public final i f68068j;

    /* renamed from: k, reason: collision with root package name */
    public h f68069k;

    /* renamed from: l, reason: collision with root package name */
    public long f68070l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f68071m;

    public o(g7.f fVar, g7.i iVar, androidx.media3.common.b bVar, int i13, Object obj, i iVar2) {
        super(fVar, iVar, 2, bVar, i13, obj, -9223372036854775807L, -9223372036854775807L);
        this.f68068j = iVar2;
    }

    @Override // l8.u
    public final void h() {
        if (this.f68070l == 0) {
            ((e) this.f68068j).b(this.f68069k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g7.i d2 = this.f68024b.d(this.f68070l);
            y yVar = this.f68031i;
            q8.o oVar = new q8.o(yVar, d2.f63791f, yVar.d(d2));
            while (!this.f68071m && ((e) this.f68068j).c(oVar)) {
                try {
                } finally {
                    this.f68070l = oVar.f102981d - this.f68024b.f63791f;
                    ((e) this.f68068j).a();
                }
            }
        } finally {
            l0.H(this.f68031i);
        }
    }

    @Override // l8.u
    public final void o() {
        this.f68071m = true;
    }
}
