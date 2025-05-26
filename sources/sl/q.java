package sl;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Class f113165a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f113166b;

    public q(Class cls, Class cls2) {
        this.f113165a = cls;
        this.f113166b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f113166b.equals(qVar.f113166b)) {
            return this.f113165a.equals(qVar.f113165a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f113165a.hashCode() + (this.f113166b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f113166b;
        Class cls2 = this.f113165a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
