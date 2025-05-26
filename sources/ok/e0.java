package ok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f95420a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f95421b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f95422c;

    /* renamed from: d, reason: collision with root package name */
    public final int f95423d;

    public e0(d0 d0Var) {
        this(d0Var, false, n.f95439b, Integer.MAX_VALUE);
    }

    public static e0 a(char c13) {
        return new e0(new rd.j(new l(c13), 17));
    }

    public final b0 b(CharSequence charSequence) {
        charSequence.getClass();
        return new b0(this, charSequence);
    }

    public final List c(CharSequence charSequence) {
        charSequence.getClass();
        Iterator c13 = this.f95422c.c(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            c0 c0Var = (c0) c13;
            if (!c0Var.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) c0Var.next());
        }
    }

    public e0(d0 d0Var, boolean z13, p pVar, int i13) {
        this.f95422c = d0Var;
        this.f95421b = z13;
        this.f95420a = pVar;
        this.f95423d = i13;
    }
}
