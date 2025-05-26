package p7;

import android.net.Uri;
import g7.y;
import g8.v;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Map;
import l8.w;
import l8.z;

/* loaded from: classes3.dex */
public final class i implements l8.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98982a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f98983b;

    public /* synthetic */ i(Object obj, int i13) {
        this.f98982a = i13;
        this.f98983b = obj;
    }

    @Override // l8.r
    public final void d(l8.u uVar, long j13, long j14) {
        boolean z13;
        int i13 = this.f98982a;
        Object obj = this.f98983b;
        switch (i13) {
            case 0:
                z zVar = (z) uVar;
                j jVar = (j) obj;
                jVar.getClass();
                long j15 = zVar.f82100a;
                y yVar = zVar.f82103d;
                Uri uri = yVar.f63853c;
                Map map = yVar.f63854d;
                long j16 = yVar.f63852b;
                v vVar = new v(uri, map, j14);
                jVar.f98991n.getClass();
                jVar.f98995r.d(vVar, zVar.f82102c);
                jVar.M = ((Long) zVar.f82105f).longValue() - j13;
                jVar.C(true);
                return;
            default:
                m8.b bVar = (m8.b) obj;
                if (bVar != null) {
                    synchronized (m8.c.f86527b) {
                        z13 = m8.c.f86528c;
                    }
                    if (z13) {
                        ((t5.e) bVar).v();
                        return;
                    }
                    IOException iOException = new IOException(new ConcurrentModificationException());
                    j jVar2 = (j) ((t5.e) bVar).f116429b;
                    int i14 = j.R;
                    jVar2.B(iOException);
                    return;
                }
                return;
        }
    }

    @Override // l8.r
    public final l8.s e(l8.u uVar, long j13, long j14, IOException iOException, int i13) {
        l8.s sVar = w.f82095e;
        int i14 = this.f98982a;
        Object obj = this.f98983b;
        switch (i14) {
            case 0:
                z zVar = (z) uVar;
                j jVar = (j) obj;
                jVar.getClass();
                long j15 = zVar.f82100a;
                y yVar = zVar.f82103d;
                Uri uri = yVar.f63853c;
                Map map = yVar.f63854d;
                long j16 = yVar.f63852b;
                jVar.f98995r.g(new v(uri, map, j14), zVar.f82102c, iOException, true);
                jVar.f98991n.getClass();
                jVar.B(iOException);
                break;
            default:
                m8.b bVar = (m8.b) obj;
                if (bVar != null) {
                    j jVar2 = (j) ((t5.e) bVar).f116429b;
                    int i15 = j.R;
                    jVar2.B(iOException);
                    break;
                }
                break;
        }
        return sVar;
    }

    @Override // l8.r
    public final void s(l8.u uVar, long j13, long j14, boolean z13) {
        switch (this.f98982a) {
            case 0:
                ((j) this.f98983b).A((z) uVar, j13, j14);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar) {
        this(jVar, 0);
        this.f98982a = 0;
    }
}
