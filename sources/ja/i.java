package ja;

import androidx.recyclerview.widget.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class i extends c3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d0 database, int i13) {
        super(database);
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(database, "database");
        } else {
            Intrinsics.checkNotNullParameter(database, "database");
            super(database);
        }
    }

    public abstract void l(oa.i iVar, Object obj);

    public final void m(Object obj) {
        oa.i a13 = a();
        try {
            l(a13, obj);
            a13.G();
        } finally {
            j(a13);
        }
    }

    public final void n(Object obj) {
        oa.i a13 = a();
        try {
            l(a13, obj);
            a13.Q0();
        } finally {
            j(a13);
        }
    }

    public final long o(Object obj) {
        oa.i a13 = a();
        try {
            l(a13, obj);
            return a13.Q0();
        } finally {
            j(a13);
        }
    }
}
