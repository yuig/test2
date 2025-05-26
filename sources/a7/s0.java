package a7;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f1200a;

    public s0(p pVar) {
        this.f1200a = pVar;
    }

    public final boolean a(int... iArr) {
        p pVar = this.f1200a;
        pVar.getClass();
        for (int i13 : iArr) {
            if (pVar.f1162a.get(i13)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            return this.f1200a.equals(((s0) obj).f1200a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1200a.hashCode();
    }
}
