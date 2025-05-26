package com.pinterest.qrCodeLogin;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f50311a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f50312b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50313c;

    /* renamed from: d, reason: collision with root package name */
    public final fm1.c f50314d;

    /* renamed from: e, reason: collision with root package name */
    public final int f50315e;

    /* renamed from: f, reason: collision with root package name */
    public final cm1.d f50316f;

    public /* synthetic */ i(int i13, u50.k0 k0Var, int i14, fm1.c cVar, int i15, int i16) {
        this((i16 & 1) != 0 ? m0.qr_login_confirm : i13, (i16 & 2) != 0 ? u50.h0.f120562a : k0Var, (i16 & 4) != 0 ? fm1.c.GONE.getVisibility() : i14, (i16 & 8) != 0 ? fm1.c.GONE : cVar, (i16 & 16) != 0 ? fm1.c.GONE.getVisibility() : i15, new cm1.d(new yl1.b(u50.g0.b(new String[0], m0.qr_login_confirm_button), false, null, null, null, null, null, null, 0, null, 1022), new yl1.b(u50.g0.b(new String[0], m0.qr_login_reject_button), false, null, null, null, null, null, null, 0, null, 1022), null, null, null, fm1.c.VISIBLE, 0, 92));
    }

    public final int a() {
        return this.f50315e;
    }

    public final int b() {
        return this.f50313c;
    }

    public i(int i13, u50.i0 i0Var, int i14, fm1.c cVar, int i15, cm1.d dVar) {
        this.f50311a = i13;
        this.f50312b = i0Var;
        this.f50313c = i14;
        this.f50314d = cVar;
        this.f50315e = i15;
        this.f50316f = dVar;
    }
}
