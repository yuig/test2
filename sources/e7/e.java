package e7;

import androidx.appcompat.app.x0;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57529a;

    /* renamed from: b, reason: collision with root package name */
    public int f57530b;

    public e() {
        this.f57529a = 1;
    }

    public static String h(int i13) {
        return "" + ((char) ((i13 >> 24) & 255)) + ((char) ((i13 >> 16) & 255)) + ((char) ((i13 >> 8) & 255)) + ((char) (i13 & 255));
    }

    public final void e(int i13) {
        this.f57530b = i13 | this.f57530b;
    }

    public abstract void f(pa.c cVar);

    public abstract void g(pa.c cVar);

    public final boolean i(int i13) {
        return (this.f57530b & i13) == i13;
    }

    public abstract void j(pa.c cVar);

    public abstract void k(pa.c cVar);

    public abstract void l(pa.c cVar);

    public abstract x0 m(pa.c cVar);

    public String toString() {
        switch (this.f57529a) {
            case 0:
                return h(this.f57530b);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        this(i13, 0);
        this.f57529a = 0;
    }

    public /* synthetic */ e(int i13, int i14) {
        this.f57529a = i14;
        this.f57530b = i13;
    }
}
