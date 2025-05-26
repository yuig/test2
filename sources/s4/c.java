package s4;

import com.google.firebase.messaging.q;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public final b f111072d;

    /* renamed from: a, reason: collision with root package name */
    public j f111069a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f111070b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f111071c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f111073e = false;

    public c(q qVar) {
        this.f111072d = new a(this, qVar);
    }

    public final void a(d dVar, int i13) {
        this.f111072d.a(dVar.l(i13), 1.0f);
        this.f111072d.a(dVar.l(i13), -1.0f);
    }

    public final void b(j jVar, int i13) {
        this.f111069a = jVar;
        float f13 = i13;
        jVar.f111104e = f13;
        this.f111070b = f13;
        this.f111073e = true;
    }

    public final void c(j jVar, j jVar2, j jVar3, j jVar4, float f13) {
        this.f111072d.a(jVar, -1.0f);
        this.f111072d.a(jVar2, 1.0f);
        this.f111072d.a(jVar3, f13);
        this.f111072d.a(jVar4, -f13);
    }

    public final void d(j jVar, int i13) {
        if (i13 < 0) {
            this.f111070b = i13 * (-1);
            this.f111072d.a(jVar, 1.0f);
        } else {
            this.f111070b = i13;
            this.f111072d.a(jVar, -1.0f);
        }
    }

    public final void e(j jVar, j jVar2, j jVar3, int i13) {
        boolean z13;
        if (i13 != 0) {
            if (i13 < 0) {
                i13 *= -1;
                z13 = true;
            } else {
                z13 = false;
            }
            this.f111070b = i13;
            if (z13) {
                this.f111072d.a(jVar, 1.0f);
                this.f111072d.a(jVar2, -1.0f);
                this.f111072d.a(jVar3, -1.0f);
                return;
            }
        }
        this.f111072d.a(jVar, -1.0f);
        this.f111072d.a(jVar2, 1.0f);
        this.f111072d.a(jVar3, 1.0f);
    }

    public final void f(j jVar, j jVar2, j jVar3, int i13) {
        boolean z13;
        if (i13 != 0) {
            if (i13 < 0) {
                i13 *= -1;
                z13 = true;
            } else {
                z13 = false;
            }
            this.f111070b = i13;
            if (z13) {
                this.f111072d.a(jVar, 1.0f);
                this.f111072d.a(jVar2, -1.0f);
                this.f111072d.a(jVar3, 1.0f);
                return;
            }
        }
        this.f111072d.a(jVar, -1.0f);
        this.f111072d.a(jVar2, 1.0f);
        this.f111072d.a(jVar3, -1.0f);
    }

    public j g(boolean[] zArr) {
        return j(zArr, null);
    }

    public boolean h() {
        return this.f111069a == null && this.f111070b == 0.0f && this.f111072d.g() == 0;
    }

    public final j i(j jVar) {
        return j(null, jVar);
    }

    public final j j(boolean[] zArr, j jVar) {
        i iVar;
        int g13 = this.f111072d.g();
        j jVar2 = null;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < g13; i13++) {
            float j13 = this.f111072d.j(i13);
            if (j13 < 0.0f) {
                j b13 = this.f111072d.b(i13);
                if ((zArr == null || !zArr[b13.f111101b]) && b13 != jVar && (((iVar = b13.f111108i) == i.SLACK || iVar == i.ERROR) && j13 < f13)) {
                    f13 = j13;
                    jVar2 = b13;
                }
            }
        }
        return jVar2;
    }

    public final void k(j jVar) {
        j jVar2 = this.f111069a;
        if (jVar2 != null) {
            this.f111072d.a(jVar2, -1.0f);
            this.f111069a.f111102c = -1;
            this.f111069a = null;
        }
        float i13 = this.f111072d.i(jVar, true) * (-1.0f);
        this.f111069a = jVar;
        if (i13 == 1.0f) {
            return;
        }
        this.f111070b /= i13;
        this.f111072d.k(i13);
    }

    public final void l(d dVar, j jVar, boolean z13) {
        if (jVar == null || !jVar.f111105f) {
            return;
        }
        float d2 = this.f111072d.d(jVar);
        this.f111070b = (jVar.f111104e * d2) + this.f111070b;
        this.f111072d.i(jVar, z13);
        if (z13) {
            jVar.b(this);
        }
        if (this.f111072d.g() == 0) {
            this.f111073e = true;
            dVar.f111076a = true;
        }
    }

    public void m(d dVar, c cVar, boolean z13) {
        float h10 = this.f111072d.h(cVar, z13);
        this.f111070b = (cVar.f111070b * h10) + this.f111070b;
        if (z13) {
            cVar.f111069a.b(this);
        }
        if (this.f111069a == null || this.f111072d.g() != 0) {
            return;
        }
        this.f111073e = true;
        dVar.f111076a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            s4.j r0 = r10.f111069a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            s4.j r1 = r10.f111069a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = a.a.C(r0, r1)
            float r1 = r10.f111070b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = n60.o.i(r0)
            float r1 = r10.f111070b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            s4.b r5 = r10.f111072d
            int r5 = r5.g()
        L3c:
            if (r4 >= r5) goto L9c
            s4.b r6 = r10.f111072d
            s4.j r6 = r6.b(r4)
            if (r6 != 0) goto L47
            goto L99
        L47:
            s4.b r7 = r10.f111072d
            float r7 = r7.j(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = a.a.C(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = a.a.C(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = a.a.C(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = a.a.C(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r3
        L99:
            int r4 = r4 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = a.a.C(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.c.toString():java.lang.String");
    }
}
