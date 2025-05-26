package p00;

import ey.e2;
import ey.f2;
import java.io.BufferedReader;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import pq2.p;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final rz.d f98346a;

    public a(rz.d adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f98346a = adapter;
    }

    @Override // pq2.p
    public final Object a(Object obj) {
        ResponseBody value = (ResponseBody) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        new e2().i();
        try {
            vd0.c cVar = new vd0.c(new BufferedReader(value.charStream()));
            new f2().i();
            Object b13 = this.f98346a.b(cVar);
            dl2.b.J(value, null);
            return b13;
        } finally {
        }
    }
}
