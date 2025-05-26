package x;

import android.view.Surface;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f131254a;

    public o(Object obj) {
        this.f131254a = obj;
    }

    public abstract void a(Surface surface);

    public abstract void b();

    public abstract Object c();

    public abstract String d();

    public abstract Surface e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        return Objects.equals(this.f131254a, ((o) obj).f131254a);
    }

    public abstract void f(long j13);

    public void g(int i13) {
    }

    public abstract void h(String str);

    public final int hashCode() {
        return this.f131254a.hashCode();
    }

    public void i(long j13) {
    }
}
