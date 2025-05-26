package n8;

import a7.j1;
import android.content.Context;
import pk.c1;
import pk.v2;
import pk.y0;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f89847a;

    /* renamed from: b, reason: collision with root package name */
    public final x f89848b;

    /* renamed from: c, reason: collision with root package name */
    public q f89849c;

    /* renamed from: d, reason: collision with root package name */
    public r f89850d;

    /* renamed from: e, reason: collision with root package name */
    public final v2 f89851e;

    /* renamed from: f, reason: collision with root package name */
    public final v5.x f89852f;

    /* renamed from: g, reason: collision with root package name */
    public d7.e f89853g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f89854h;

    public m(Context context, x xVar) {
        this.f89847a = context.getApplicationContext();
        this.f89848b = xVar;
        y0 y0Var = c1.f100372b;
        this.f89851e = v2.f100502e;
        this.f89852f = j1.Sm;
        this.f89853g = d7.e.f53809a;
    }

    public final s a() {
        bf.b.t(!this.f89854h);
        if (this.f89850d == null) {
            if (this.f89849c == null) {
                this.f89849c = new q();
            }
            this.f89850d = new r(this.f89849c);
        }
        s sVar = new s(this);
        this.f89854h = true;
        return sVar;
    }
}
