package ro0;

import java.util.HashSet;
import m60.x0;
import tb0.h;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f108937b;

    public /* synthetic */ b(e eVar, int i13) {
        this.f108936a = i13;
        this.f108937b = eVar;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        int i13 = this.f108936a;
        e eVar = this.f108937b;
        switch (i13) {
            case 0:
                eVar.getClass();
                HashSet hashSet = h.f117076w;
                tb0.g.f117075a.o("PinMarkletFailure", (Throwable) obj);
                eVar.x3(x0.pinmarklet_generic_error);
                break;
            default:
                m60.a aVar = (m60.a) obj;
                eVar.getClass();
                if (aVar == m60.a.BACKGROUND) {
                    eVar.t3();
                    break;
                }
                break;
        }
    }
}
