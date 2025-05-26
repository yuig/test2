package rn1;

import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import kotlin.collections.e0;
import u50.i0;

/* loaded from: classes2.dex */
public abstract class e implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f108873a;

    /* renamed from: b, reason: collision with root package name */
    public final List f108874b;

    /* renamed from: c, reason: collision with root package name */
    public final b f108875c;

    /* renamed from: d, reason: collision with root package name */
    public final vn1.d f108876d;

    /* renamed from: e, reason: collision with root package name */
    public final fm1.a f108877e;

    /* renamed from: f, reason: collision with root package name */
    public final fm1.b f108878f;

    public e() {
        bs1.c.h2("");
        ps0.m mVar = vn1.h.f126275a;
        this.f108873a = e0.b(vn1.h.f126276b);
        this.f108874b = e0.b(vn1.h.f126279e);
        mVar.e();
        b bVar = GestaltText.f49638g;
        this.f108875c = GestaltText.f49638g;
        this.f108876d = vn1.d.NONE;
        this.f108877e = fm1.a.AUTO;
        this.f108878f = fm1.b.INHERIT;
    }

    public abstract List e();

    public vn1.g f() {
        return null;
    }

    public vn1.g g() {
        return null;
    }

    public abstract int getId();

    public abstract vn1.c h();

    public abstract i0 i();

    public b j() {
        return this.f108875c;
    }

    public abstract rm1.d k();

    public vn1.d l() {
        return this.f108876d;
    }

    public abstract u50.n m();

    public fm1.a n() {
        return this.f108877e;
    }

    public abstract Integer o();

    public abstract int p();

    public abstract rm1.d q();

    public abstract List r();

    public abstract boolean s();

    public abstract i0 t();

    public fm1.b u() {
        return this.f108878f;
    }

    public abstract vn1.g v();

    public abstract fm1.c w();

    public boolean x() {
        return false;
    }
}
