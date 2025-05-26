package ads_mobile_sdk;

import a.q2;
import android.content.Context;
import ao2.j0;

/* loaded from: classes2.dex */
public final class o50 {

    /* renamed from: a, reason: collision with root package name */
    public xv0 f9136a;

    /* renamed from: b, reason: collision with root package name */
    public xv0 f9137b;

    /* renamed from: c, reason: collision with root package name */
    public xv0 f9138c;

    /* renamed from: d, reason: collision with root package name */
    public a.o8 f9139d;

    /* renamed from: e, reason: collision with root package name */
    public xv0 f9140e;

    /* renamed from: f, reason: collision with root package name */
    public a.o8 f9141f;

    /* renamed from: g, reason: collision with root package name */
    public a.o8 f9142g;

    public o50(Context context, Integer num, Long l13, q2 q2Var, yp0 yp0Var, j0 j0Var) {
        a(context, num, l13, q2Var, yp0Var, j0Var);
    }

    public final void a(Context context, Integer num, Long l13, q2 q2Var, yp0 yp0Var, j0 j0Var) {
        this.f9136a = xv0.a(context);
        this.f9137b = xv0.a(j0Var);
        this.f9138c = xv0.a(num);
        a.o8 o8Var = a.bb.f16g;
        Object obj = u90.f11887c;
        if (!(o8Var instanceof u90)) {
            o8Var = new u90(o8Var);
        }
        this.f9139d = o8Var;
        this.f9140e = xv0.a(l13);
        a.o8 yp1Var = new yp1(this.f9136a, this.f9138c, this.f9140e, xv0.a(q2Var));
        if (!(yp1Var instanceof u90)) {
            yp1Var = new u90(yp1Var);
        }
        this.f9141f = yp1Var;
        a.o8 dx2Var = new dx2(this.f9137b, xv0.a(yp0Var));
        a.o8 op1Var = new op1(this.f9136a, this.f9137b, this.f9138c, this.f9139d, this.f9141f, dx2Var instanceof u90 ? dx2Var : new u90(dx2Var));
        if (!(op1Var instanceof u90)) {
            op1Var = new u90(op1Var);
        }
        this.f9142g = op1Var;
    }
}
