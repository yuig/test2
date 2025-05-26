package ek0;

import com.pinterest.error.NoConnectionErrorWithUrls;
import fk0.k;
import m60.x0;
import yk1.v;

/* loaded from: classes5.dex */
public final class d extends rk2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f59167b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.pinterest.feature.board.create.c f59168c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f59169d;

    public d(h hVar, boolean z13, com.pinterest.feature.board.create.c cVar) {
        this.f59169d = hVar;
        this.f59167b = z13;
        this.f59168c = cVar;
    }

    @Override // uj2.v
    public final void a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x002a  */
    @Override // uj2.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ek0.d.c(java.lang.Object):void");
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        boolean z13 = th3 instanceof NoConnectionErrorWithUrls;
        com.pinterest.feature.board.create.c cVar = this.f59168c;
        if (z13) {
            v vVar = this.f59169d.f59193r;
            k kVar = (k) cVar;
            kVar.h8(((yk1.a) vVar).f139224a.getString(x0.create_new_board_fail), true);
        }
        yk1.i iVar = yk1.i.LOADED;
        cVar.getClass();
    }
}
