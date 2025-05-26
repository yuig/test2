package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import ql2.j;
import ql2.k;
import ue.c;

/* loaded from: classes2.dex */
public class a implements Iterable, ll2.a {

    /* renamed from: d */
    @NotNull
    public static final j f80452d = new j(null);

    /* renamed from: a */
    public final int f80453a;

    /* renamed from: b */
    public final int f80454b;

    /* renamed from: c */
    public final int f80455c;

    public a(int i13, int i14, int i15) {
        if (i15 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i15 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f80453a = i13;
        this.f80454b = c.u(i13, i14, i15);
        this.f80455c = i15;
    }

    @Override // java.lang.Iterable
    /* renamed from: e */
    public final k iterator() {
        return new k(this.f80453a, this.f80454b, this.f80455c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f80453a != aVar.f80453a || this.f80454b != aVar.f80454b || this.f80455c != aVar.f80455c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f80453a * 31) + this.f80454b) * 31) + this.f80455c;
    }

    public boolean isEmpty() {
        int i13 = this.f80455c;
        int i14 = this.f80454b;
        int i15 = this.f80453a;
        if (i13 > 0) {
            if (i15 <= i14) {
                return false;
            }
        } else if (i15 >= i14) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb3;
        int i13 = this.f80454b;
        int i14 = this.f80453a;
        int i15 = this.f80455c;
        if (i15 > 0) {
            sb3 = new StringBuilder();
            sb3.append(i14);
            sb3.append("..");
            sb3.append(i13);
            sb3.append(" step ");
            sb3.append(i15);
        } else {
            sb3 = new StringBuilder();
            sb3.append(i14);
            sb3.append(" downTo ");
            sb3.append(i13);
            sb3.append(" step ");
            sb3.append(-i15);
        }
        return sb3.toString();
    }
}
