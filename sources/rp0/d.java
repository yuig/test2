package rp0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import java.util.Date;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes5.dex */
public abstract class d {
    public abstract f30 a();

    public abstract eb0.c b();

    public abstract boolean c();

    public abstract int d();

    public abstract boolean e();

    public abstract String f();

    public abstract String g();

    public abstract int h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public abstract boolean n();

    public abstract int o();

    public abstract f30 p();

    public abstract List q();

    public abstract String r();

    public abstract Date s();

    public final Pair t() {
        String l13;
        String m13 = m();
        if (m13 == null || (l13 = l()) == null) {
            return null;
        }
        return new Pair(m13, l13);
    }

    public final Pair u() {
        return new Pair(v(), k());
    }

    public abstract String v();

    public abstract wy0 w();

    public abstract boolean x();

    public abstract Boolean y();
}
