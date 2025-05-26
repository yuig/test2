package e2;

import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.q1;
import i2.q2;
import i2.v3;
import i2.y3;
import j1.q0;
import java.util.Map;
import s3.m0;

/* loaded from: classes2.dex */
public final class a extends w implements q2, t {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f56821c;

    /* renamed from: d, reason: collision with root package name */
    public final float f56822d;

    /* renamed from: e, reason: collision with root package name */
    public final v3 f56823e;

    /* renamed from: f, reason: collision with root package name */
    public final v3 f56824f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f56825g;

    /* renamed from: h, reason: collision with root package name */
    public s f56826h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f56827i;

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f56828j;

    /* renamed from: k, reason: collision with root package name */
    public long f56829k;

    /* renamed from: l, reason: collision with root package name */
    public int f56830l;

    /* renamed from: m, reason: collision with root package name */
    public final q0 f56831m;

    public a(boolean z13, float f13, q1 q1Var, q1 q1Var2, ViewGroup viewGroup) {
        super(z13, q1Var2);
        this.f56821c = z13;
        this.f56822d = f13;
        this.f56823e = q1Var;
        this.f56824f = q1Var2;
        this.f56825g = viewGroup;
        y3 y3Var = y3.f71400a;
        this.f56827i = bs1.c.u1(null, y3Var);
        this.f56828j = bs1.c.u1(Boolean.TRUE, y3Var);
        this.f56829k = 0L;
        this.f56830l = -1;
        this.f56831m = new q0(this, 18);
    }

    @Override // i2.q2
    public final void a() {
    }

    @Override // i2.q2
    public final void b() {
        s sVar = this.f56826h;
        if (sVar != null) {
            d0();
            u uVar = sVar.f56904d;
            v vVar = (v) uVar.f56906a.get(this);
            if (vVar != null) {
                vVar.b();
                Map map = uVar.f56906a;
                v vVar2 = (v) map.get(this);
                if (vVar2 != null) {
                }
                map.remove(this);
                sVar.f56903c.add(vVar);
            }
        }
    }

    @Override // i2.q2
    public final void c() {
        s sVar = this.f56826h;
        if (sVar != null) {
            d0();
            u uVar = sVar.f56904d;
            v vVar = (v) uVar.f56906a.get(this);
            if (vVar != null) {
                vVar.b();
                Map map = uVar.f56906a;
                v vVar2 = (v) map.get(this);
                if (vVar2 != null) {
                }
                map.remove(this);
                sVar.f56903c.add(vVar);
            }
        }
    }

    @Override // k1.l1
    public final void d(d3.e eVar) {
        int R;
        float l03;
        m0 m0Var = (m0) eVar;
        this.f56829k = m0Var.f110840a.g();
        float f13 = this.f56822d;
        if (Float.isNaN(f13)) {
            R = ml2.c.c(r.a(eVar, this.f56821c, m0Var.f110840a.g()));
        } else {
            R = m0Var.f110840a.R(f13);
        }
        this.f56830l = R;
        long j13 = ((b3.w) this.f56823e.getValue()).f21392a;
        float f14 = ((i) this.f56824f.getValue()).f56868d;
        m0Var.a();
        if (Float.isNaN(f13)) {
            l03 = r.a(eVar, this.f56915a, m0Var.f110840a.g());
        } else {
            l03 = m0Var.l0(f13);
        }
        this.f56916b.d(eVar, l03, j13);
        b3.u a13 = m0Var.f110840a.f53652b.a();
        ((Boolean) this.f56828j.getValue()).booleanValue();
        v vVar = (v) this.f56827i.getValue();
        if (vVar != null) {
            vVar.c(m0Var.f110840a.g(), j13, f14);
            vVar.draw(b3.e.b(a13));
        }
    }

    @Override // e2.t
    public final void d0() {
        this.f56827i.setValue(null);
    }
}
