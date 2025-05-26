package je;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final v f75797c = new v(t.none, null);

    /* renamed from: d, reason: collision with root package name */
    public static final v f75798d = new v(t.xMidYMid, u.meet);

    /* renamed from: a, reason: collision with root package name */
    public final t f75799a;

    /* renamed from: b, reason: collision with root package name */
    public final u f75800b;

    static {
        t tVar = t.none;
        t tVar2 = t.none;
        t tVar3 = t.none;
        t tVar4 = t.none;
        u uVar = u.meet;
    }

    public v(t tVar, u uVar) {
        this.f75799a = tVar;
        this.f75800b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.f75799a == vVar.f75799a && this.f75800b == vVar.f75800b;
    }

    public final String toString() {
        return this.f75799a + " " + this.f75800b;
    }
}
