package ck2;

import uj2.o;
import uj2.v;

/* loaded from: classes2.dex */
public final class g implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27917a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27918b;

    public /* synthetic */ g(Object obj, int i13) {
        this.f27917a = i13;
        this.f27918b = obj;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f27917a;
        Object obj = this.f27918b;
        switch (i13) {
            case 0:
                ((ak2.e) obj).accept(o.f122340b);
                break;
            case 1:
                ((xp2.b) obj).a();
                break;
            default:
                ((v) obj).a();
                break;
        }
    }
}
