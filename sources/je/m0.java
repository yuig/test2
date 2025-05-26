package je;

/* loaded from: classes3.dex */
public final class m0 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final float f75694a;

    /* renamed from: b, reason: collision with root package name */
    public final g2 f75695b;

    public m0(float f13, g2 g2Var) {
        this.f75694a = f13;
        this.f75695b = g2Var;
    }

    public final float a(float f13) {
        float f14;
        float f15;
        int i13 = y.f75819a[this.f75695b.ordinal()];
        float f16 = this.f75694a;
        if (i13 == 1) {
            return f16;
        }
        switch (i13) {
            case 4:
                return f16 * f13;
            case 5:
                f14 = f16 * f13;
                f15 = 2.54f;
                break;
            case 6:
                f14 = f16 * f13;
                f15 = 25.4f;
                break;
            case 7:
                f14 = f16 * f13;
                f15 = 72.0f;
                break;
            case 8:
                f14 = f16 * f13;
                f15 = 6.0f;
                break;
            default:
                return f16;
        }
        return f14 / f15;
    }

    public final float b(t2 t2Var) {
        float sqrt;
        if (this.f75695b != g2.percent) {
            return g(t2Var);
        }
        r2 r2Var = t2Var.f75777c;
        z zVar = r2Var.f75765g;
        if (zVar == null) {
            zVar = r2Var.f75764f;
        }
        float f13 = this.f75694a;
        if (zVar == null) {
            return f13;
        }
        float f14 = zVar.f75825c;
        if (f14 == zVar.f75826d) {
            sqrt = f13 * f14;
        } else {
            sqrt = f13 * ((float) (Math.sqrt((r0 * r0) + (f14 * f14)) / 1.414213562373095d));
        }
        return sqrt / 100.0f;
    }

    public final float c(t2 t2Var, float f13) {
        return this.f75695b == g2.percent ? (this.f75694a * f13) / 100.0f : g(t2Var);
    }

    public final float g(t2 t2Var) {
        float f13;
        float f14;
        int i13 = y.f75819a[this.f75695b.ordinal()];
        float f15 = this.f75694a;
        switch (i13) {
            case 2:
                return t2Var.f75777c.f75762d.getTextSize() * f15;
            case 3:
                return (t2Var.f75777c.f75762d.getTextSize() / 2.0f) * f15;
            case 4:
                t2Var.getClass();
                return f15 * 96.0f;
            case 5:
                t2Var.getClass();
                f13 = f15 * 96.0f;
                f14 = 2.54f;
                break;
            case 6:
                t2Var.getClass();
                f13 = f15 * 96.0f;
                f14 = 25.4f;
                break;
            case 7:
                t2Var.getClass();
                f13 = f15 * 96.0f;
                f14 = 72.0f;
                break;
            case 8:
                t2Var.getClass();
                f13 = f15 * 96.0f;
                f14 = 6.0f;
                break;
            case 9:
                r2 r2Var = t2Var.f75777c;
                z zVar = r2Var.f75765g;
                if (zVar == null) {
                    zVar = r2Var.f75764f;
                }
                if (zVar != null) {
                    f13 = f15 * zVar.f75825c;
                    f14 = 100.0f;
                    break;
                } else {
                    return f15;
                }
            default:
                return f15;
        }
        return f13 / f14;
    }

    public final float h(t2 t2Var) {
        if (this.f75695b != g2.percent) {
            return g(t2Var);
        }
        r2 r2Var = t2Var.f75777c;
        z zVar = r2Var.f75765g;
        if (zVar == null) {
            zVar = r2Var.f75764f;
        }
        float f13 = this.f75694a;
        return zVar == null ? f13 : (f13 * zVar.f75826d) / 100.0f;
    }

    public final boolean i() {
        return this.f75694a < 0.0f;
    }

    public final boolean j() {
        return this.f75694a == 0.0f;
    }

    public final String toString() {
        return String.valueOf(this.f75694a) + this.f75695b;
    }

    public m0(float f13) {
        this.f75694a = f13;
        this.f75695b = g2.px;
    }
}
