package je;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a */
    public float f75823a;

    /* renamed from: b */
    public float f75824b;

    /* renamed from: c */
    public float f75825c;

    /* renamed from: d */
    public float f75826d;

    public z(float f13, float f14, float f15, float f16) {
        this.f75823a = f13;
        this.f75824b = f14;
        this.f75825c = f15;
        this.f75826d = f16;
    }

    public final float a() {
        return this.f75823a + this.f75825c;
    }

    public final float b() {
        return this.f75824b + this.f75826d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(this.f75823a);
        sb3.append(" ");
        sb3.append(this.f75824b);
        sb3.append(" ");
        sb3.append(this.f75825c);
        sb3.append(" ");
        return d7.g.i(sb3, this.f75826d, "]");
    }

    public z(z zVar) {
        this.f75823a = zVar.f75823a;
        this.f75824b = zVar.f75824b;
        this.f75825c = zVar.f75825c;
        this.f75826d = zVar.f75826d;
    }
}
