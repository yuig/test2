package dg;

import com.github.mustachejava.util.GuardException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class e implements gg.d {

    /* renamed from: c, reason: collision with root package name */
    public static final GuardException f54911c;

    /* renamed from: a, reason: collision with root package name */
    public final a[] f54912a;

    /* renamed from: b, reason: collision with root package name */
    public int f54913b;

    static {
        GuardException guardException = new GuardException();
        f54911c = guardException;
        guardException.setStackTrace(new StackTraceElement[0]);
    }

    public e(a[] aVarArr) {
        this.f54912a = aVarArr;
    }

    @Override // gg.d
    public Object a(List list) {
        b(list);
        return null;
    }

    public final void b(List list) {
        for (a aVar : this.f54912a) {
            if (!aVar.a(list)) {
                throw f54911c;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        a[] aVarArr = this.f54912a;
        return (aVarArr == null && eVar.f54912a == null) || Arrays.equals(eVar.f54912a, aVarArr);
    }

    public final int hashCode() {
        if (this.f54913b == 0) {
            for (a aVar : this.f54912a) {
                int i13 = this.f54913b;
                this.f54913b = aVar.hashCode() + (i13 * 43) + i13;
            }
            if (this.f54913b == 0) {
                this.f54913b = 1;
            }
        }
        return this.f54913b;
    }
}
