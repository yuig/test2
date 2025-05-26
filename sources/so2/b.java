package so2;

import kh2.p2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends p2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f114756k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f114757l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f114758m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f114759n;

    public b(c cVar, String str) {
        this.f114757l = cVar;
        this.f114758m = str;
        this.f114759n = cVar.f114761b.f108977b;
    }

    @Override // kh2.p2, po2.d
    public final void C(int i13) {
        switch (this.f114756k) {
            case 1:
                xk2.a0 a0Var = xk2.b0.f135200b;
                k1(Integer.toUnsignedString(i13));
                return;
            default:
                a0(Integer.valueOf(i13));
                throw null;
        }
    }

    @Override // kh2.p2, po2.d
    public final void F(String value) {
        switch (this.f114756k) {
            case 0:
                Intrinsics.checkNotNullParameter(value, "value");
                this.f114757l.M(this.f114758m, new ro2.v(value, false, (oo2.g) this.f114759n));
                return;
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                a0(value);
                throw null;
        }
    }

    @Override // po2.d
    public final to2.d c() {
        switch (this.f114756k) {
            case 0:
                return this.f114757l.f114761b.f108977b;
            default:
                return (to2.d) this.f114759n;
        }
    }

    @Override // kh2.p2, po2.d
    public final void g(byte b13) {
        switch (this.f114756k) {
            case 1:
                k1(xk2.y.a(b13));
                return;
            default:
                a0(Byte.valueOf(b13));
                throw null;
        }
    }

    public final void k1(String s13) {
        Intrinsics.checkNotNullParameter(s13, "s");
        this.f114757l.M(this.f114758m, new ro2.v(s13, false, null));
    }

    @Override // kh2.p2, po2.d
    public final void q(long j13) {
        switch (this.f114756k) {
            case 1:
                xk2.d0 d0Var = xk2.e0.f135207b;
                k1(Long.toUnsignedString(j13));
                return;
            default:
                a0(Long.valueOf(j13));
                throw null;
        }
    }

    @Override // kh2.p2, po2.d
    public final void t(short s13) {
        switch (this.f114756k) {
            case 1:
                xk2.h0 h0Var = xk2.i0.f135212b;
                k1(String.valueOf(s13 & 65535));
                return;
            default:
                a0(Short.valueOf(s13));
                throw null;
        }
    }

    public b(c cVar, String str, oo2.g gVar) {
        this.f114757l = cVar;
        this.f114758m = str;
        this.f114759n = gVar;
    }
}
