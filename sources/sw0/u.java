package sw0;

import java.util.Comparator;

/* loaded from: classes5.dex */
public final class u implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115577a;

    public /* synthetic */ u(int i13) {
        this.f115577a = i13;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f115577a) {
            case 14:
                ke2.d dVar = (ke2.d) obj;
                double d2 = 2;
                ke2.d dVar2 = (ke2.d) obj2;
                break;
            case 15:
                mc2.j jVar = (mc2.j) obj;
                mc2.j jVar2 = (mc2.j) obj2;
                break;
        }
        return al2.a.b(fn2.d.g((am2.g) obj).b(), fn2.d.g((am2.g) obj2).b());
    }
}
