package ho;

import java.io.Serializable;
import java.util.Comparator;
import jo.n;

/* loaded from: classes3.dex */
public final class f implements Comparator, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69670a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f() {
        this(0);
        this.f69670a = 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f69670a;
        switch (i17) {
            case 0:
                n nVar = (n) obj;
                n nVar2 = (n) obj2;
                switch (i17) {
                    case 0:
                        i13 = nVar.f77174b;
                        i14 = nVar2.f77174b;
                        break;
                    default:
                        int i18 = nVar.f77174b - nVar2.f77174b;
                        if (i18 == 0) {
                            i13 = nVar.f77175c;
                            i14 = nVar2.f77175c;
                            break;
                        } else {
                            return i18;
                        }
                }
                return i13 - i14;
            default:
                n nVar3 = (n) obj;
                n nVar4 = (n) obj2;
                switch (i17) {
                    case 0:
                        i15 = nVar3.f77174b;
                        i16 = nVar4.f77174b;
                        break;
                    default:
                        int i19 = nVar3.f77174b - nVar4.f77174b;
                        if (i19 == 0) {
                            i15 = nVar3.f77175c;
                            i16 = nVar4.f77175c;
                            break;
                        } else {
                            return i19;
                        }
                }
                return i15 - i16;
        }
    }

    public /* synthetic */ f(int i13) {
        this.f69670a = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj) {
        this(1);
        this.f69670a = 1;
    }
}
