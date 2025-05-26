package el;

import il.i4;

/* loaded from: classes.dex */
public class q implements uk.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f59517a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f59518b;

    /* renamed from: c, reason: collision with root package name */
    public final i4 f59519c;

    public q(String str, Class cls, i4 i4Var) {
        this.f59517a = str;
        this.f59518b = cls;
        this.f59519c = i4Var;
    }

    public static p a(String str, Class cls) {
        return new p(str, cls, i4.ASYMMETRIC_PRIVATE);
    }
}
