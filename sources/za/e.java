package za;

import androidx.recyclerview.widget.d2;
import o82.q2;

/* loaded from: classes3.dex */
public final class e extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f141458b;

    public e(Object obj, int i13) {
        this.f141457a = i13;
        this.f141458b = obj;
    }

    @Override // androidx.recyclerview.widget.d2
    public final void a() {
        int i13 = this.f141457a;
        Object obj = this.f141458b;
        switch (i13) {
            case 0:
                ((f) obj).b(true);
                break;
            case 1:
                ((ek.l) obj).a();
                break;
            default:
                ((q2) obj).h();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.d2
    public final void b(int i13, int i14) {
        int i15 = this.f141457a;
        Object obj = this.f141458b;
        switch (i15) {
            case 0:
                a();
                break;
            case 1:
                ((ek.l) obj).a();
                break;
            default:
                ((q2) obj).l(i13, i14);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.d2
    public final void c(int i13, Object obj, int i14) {
        int i15 = this.f141457a;
        Object obj2 = this.f141458b;
        switch (i15) {
            case 0:
                a();
                break;
            case 1:
                ((ek.l) obj2).a();
                break;
            default:
                ((q2) obj2).m(i13, obj, i14);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.d2
    public final void d(int i13, int i14) {
        int i15 = this.f141457a;
        Object obj = this.f141458b;
        switch (i15) {
            case 0:
                a();
                break;
            case 1:
                ((ek.l) obj).a();
                break;
            default:
                ((q2) obj).n(i13, i14);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.d2
    public final void e(int i13, int i14) {
        int i15 = this.f141457a;
        Object obj = this.f141458b;
        switch (i15) {
            case 0:
                a();
                break;
            case 1:
                ((ek.l) obj).a();
                break;
            default:
                ((q2) obj).k(i13, i14);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.d2
    public final void f(int i13, int i14) {
        int i15 = this.f141457a;
        Object obj = this.f141458b;
        switch (i15) {
            case 0:
                a();
                break;
            case 1:
                ((ek.l) obj).a();
                break;
            default:
                ((q2) obj).o(i13, i14);
                break;
        }
    }

    public e(f fVar) {
        this.f141457a = 0;
        this.f141458b = fVar;
    }
}
