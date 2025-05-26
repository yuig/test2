package q3;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class w implements r0, s {

    /* renamed from: a, reason: collision with root package name */
    public final n4.k f102272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f102273b;

    public w(s sVar, n4.k kVar) {
        this.f102272a = kVar;
        this.f102273b = sVar;
    }

    @Override // n4.b
    public final long A(float f13) {
        return this.f102273b.A(f13);
    }

    @Override // q3.s
    public final boolean K() {
        return this.f102273b.K();
    }

    @Override // n4.b
    public final int R(float f13) {
        return this.f102273b.R(f13);
    }

    @Override // n4.b
    public final float T(long j13) {
        return this.f102273b.T(j13);
    }

    @Override // q3.r0
    public final q0 Y(int i13, int i14, Map map, Function1 function1) {
        if (i13 < 0) {
            i13 = 0;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if ((i13 & (-16777216)) == 0 && ((-16777216) & i14) == 0) {
            return new v(i13, i14, map);
        }
        jk.r.y("Size(" + i13 + " x " + i14 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // n4.b
    public final float b() {
        return this.f102273b.b();
    }

    @Override // n4.b
    public final float f0(int i13) {
        return this.f102273b.f0(i13);
    }

    @Override // n4.b
    public final float g0(float f13) {
        return this.f102273b.g0(f13);
    }

    @Override // q3.s
    public final n4.k getLayoutDirection() {
        return this.f102272a;
    }

    @Override // n4.b
    public final float j0() {
        return this.f102273b.j0();
    }

    @Override // n4.b
    public final float l0(float f13) {
        return this.f102273b.l0(f13);
    }

    @Override // n4.b
    public final long o(float f13) {
        return this.f102273b.o(f13);
    }

    @Override // n4.b
    public final long p(long j13) {
        return this.f102273b.p(j13);
    }

    @Override // n4.b
    public final float t(long j13) {
        return this.f102273b.t(j13);
    }

    @Override // n4.b
    public final long v0(long j13) {
        return this.f102273b.v0(j13);
    }
}
