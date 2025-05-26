package qm;

import java.util.Date;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: b, reason: collision with root package name */
    public static final f f104162b = new f(Date.class);

    /* renamed from: a, reason: collision with root package name */
    public final Class f104163a;

    public g(Class cls) {
        this.f104163a = cls;
    }

    public final c1 a(int i13, int i14) {
        return n1.a(this.f104163a, new h(this, i13, i14));
    }

    public final c1 b(String str) {
        return n1.a(this.f104163a, new h(this, str));
    }

    public abstract Date c(Date date);
}
