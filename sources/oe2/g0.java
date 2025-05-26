package oe2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f94331a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f94332b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public boolean f94333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f94334d;

    public g0(h0 h0Var) {
        this.f94334d = h0Var;
    }

    public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        if (this.f94333c) {
            return illegalArgumentException;
        }
        this.f94333c = true;
        ArrayDeque arrayDeque = this.f94332b;
        if (arrayDeque.size() == 1 && ((f0) arrayDeque.getFirst()).f94325b == null) {
            return illegalArgumentException;
        }
        StringBuilder sb3 = new StringBuilder(illegalArgumentException.getMessage());
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            f0 f0Var = (f0) descendingIterator.next();
            sb3.append("\nfor ");
            sb3.append(f0Var.f94324a);
            String str = f0Var.f94325b;
            if (str != null) {
                sb3.append(' ');
                sb3.append(str);
            }
        }
        return new IllegalArgumentException(sb3.toString(), illegalArgumentException);
    }

    public final void b(boolean z13) {
        this.f94332b.removeLast();
        if (this.f94332b.isEmpty()) {
            this.f94334d.f94340b.remove();
            if (z13) {
                synchronized (this.f94334d.f94341c) {
                    try {
                        int size = this.f94331a.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            f0 f0Var = (f0) this.f94331a.get(i13);
                            r rVar = (r) this.f94334d.f94341c.put(f0Var.f94326c, f0Var.f94327d);
                            if (rVar != null) {
                                f0Var.f94327d = rVar;
                                this.f94334d.f94341c.put(f0Var.f94326c, rVar);
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
