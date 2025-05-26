package i8;

import g7.i;
import g7.y;
import h8.f;
import lb.l0;
import q8.o;
import q8.s;

/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: j, reason: collision with root package name */
    public final h8.e f71702j;

    /* renamed from: k, reason: collision with root package name */
    public long f71703k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f71704l;

    public a(g7.f fVar, i iVar, androidx.media3.common.b bVar, int i13, Object obj, h8.e eVar) {
        super(fVar, iVar, 2, bVar, i13, obj, -9223372036854775807L, -9223372036854775807L);
        this.f71702j = eVar;
    }

    @Override // l8.u
    public final void h() {
        h8.e eVar = this.f71702j;
        s sVar = eVar.f68014a;
        if (sVar instanceof j9.i) {
            ((j9.i) sVar).M = true;
        }
        if (this.f71703k == 0) {
            eVar.b(null, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            i d2 = this.f68024b.d(this.f71703k);
            y yVar = this.f68031i;
            o oVar = new o(yVar, d2.f63791f, yVar.d(d2));
            while (!this.f71704l && this.f71702j.c(oVar) && (this.f71702j.a() == null || this.f71702j.f68022i == null)) {
                try {
                } finally {
                    this.f71703k = oVar.f102981d - this.f68024b.f63791f;
                }
            }
        } finally {
            s sVar2 = this.f71702j.f68014a;
            if (sVar2 instanceof j9.i) {
                ((j9.i) sVar2).M = false;
            }
            l0.H(this.f68031i);
        }
    }

    @Override // l8.u
    public final void o() {
        this.f71704l = true;
    }
}
