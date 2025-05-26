package oe2;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class m extends n {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f94362c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(r rVar, int i13) {
        super(rVar);
        this.f94362c = i13;
    }

    @Override // oe2.r
    public final /* bridge */ /* synthetic */ Object a(v vVar) {
        switch (this.f94362c) {
        }
        return e(vVar);
    }

    @Override // oe2.r
    public final void d(y yVar, Object obj) {
        int i13 = this.f94362c;
        r rVar = this.f94370a;
        switch (i13) {
            case 0:
                yVar.a();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    rVar.d(yVar, it.next());
                }
                ((x) yVar).q(1, 2, ']');
                break;
            default:
                yVar.a();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    rVar.d(yVar, it2.next());
                }
                ((x) yVar).q(1, 2, ']');
                break;
        }
    }
}
