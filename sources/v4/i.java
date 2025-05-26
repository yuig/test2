package v4;

import java.util.Iterator;

/* loaded from: classes3.dex */
public class i extends h {

    /* renamed from: m, reason: collision with root package name */
    public int f124002m;

    public i(u uVar) {
        super(uVar);
        if (uVar instanceof n) {
            this.f123994e = g.HORIZONTAL_DIMENSION;
        } else {
            this.f123994e = g.VERTICAL_DIMENSION;
        }
    }

    @Override // v4.h
    public final void d(int i13) {
        if (this.f123999j) {
            return;
        }
        this.f123999j = true;
        this.f123996g = i13;
        Iterator it = this.f124000k.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.a(eVar);
        }
    }
}
