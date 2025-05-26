package k8;

import a7.i1;
import java.util.Objects;
import m7.v1;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f78584a;

    /* renamed from: b, reason: collision with root package name */
    public final v1[] f78585b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f78586c;

    /* renamed from: d, reason: collision with root package name */
    public final i1 f78587d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f78588e;

    public z(v1[] v1VarArr, t[] tVarArr, i1 i1Var, Object obj) {
        bf.b.i(v1VarArr.length == tVarArr.length);
        this.f78585b = v1VarArr;
        this.f78586c = (t[]) tVarArr.clone();
        this.f78587d = i1Var;
        this.f78588e = obj;
        this.f78584a = v1VarArr.length;
    }

    public final boolean a(z zVar) {
        if (zVar != null) {
            int length = zVar.f78586c.length;
            t[] tVarArr = this.f78586c;
            if (length == tVarArr.length) {
                for (int i13 = 0; i13 < tVarArr.length; i13++) {
                    if (!b(zVar, i13)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean b(z zVar, int i13) {
        return zVar != null && Objects.equals(this.f78585b[i13], zVar.f78585b[i13]) && Objects.equals(this.f78586c[i13], zVar.f78586c[i13]);
    }

    public final boolean c(int i13) {
        return this.f78585b[i13] != null;
    }
}
