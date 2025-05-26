package androidx.compose.foundation;

import k1.q0;
import o1.l;
import s3.e1;
import u2.n;
import u2.p;
import u2.q;

/* loaded from: classes2.dex */
public abstract class c {
    static {
        new e1() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public final boolean equals(Object obj) {
                return this == obj;
            }

            public final int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // s3.e1
            public final p l() {
                return new q0();
            }

            @Override // s3.e1
            public final /* bridge */ /* synthetic */ void m(p pVar) {
            }
        };
    }

    public static final q a(l lVar, q qVar, boolean z13) {
        return qVar.j(z13 ? new FocusableElement(lVar) : n.f120041b);
    }
}
