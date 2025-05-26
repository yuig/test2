package o6;

import android.view.View;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class d implements hq2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f92918d;

    public abstract d a(d dVar);

    public abstract d b();

    public int c() {
        return w().bitLength();
    }

    public abstract d d(d dVar);

    public abstract int e(View view, int i13, int i14);

    public h f() {
        return new h();
    }

    public abstract String g();

    public abstract int h();

    public abstract int i(View view, int i13);

    public int j(int i13, int i14) {
        return i13;
    }

    public abstract d k();

    public boolean l() {
        return c() == 1;
    }

    public boolean m() {
        return w().signum() == 0;
    }

    public abstract d n(d dVar);

    public d o(d dVar, d dVar2, d dVar3) {
        return n(dVar).u(dVar2.n(dVar3));
    }

    public d p(d dVar, d dVar2, d dVar3) {
        return n(dVar).a(dVar2.n(dVar3));
    }

    public abstract d q();

    public abstract d r();

    public abstract d s();

    public d t(d dVar, d dVar2) {
        return s().a(dVar.n(dVar2));
    }

    public final String toString() {
        switch (this.f92918d) {
            case 0:
                return "Alignment:" + g();
            case 1:
            default:
                return super.toString();
            case 2:
                return w().toString(16);
        }
    }

    public abstract d u(d dVar);

    public boolean v() {
        return w().testBit(0);
    }

    public abstract BigInteger w();
}
