package pk;

import java.util.Map;

/* loaded from: classes3.dex */
public final class e0 extends t {

    /* renamed from: a */
    public final Object f100382a;

    /* renamed from: b */
    public int f100383b;

    /* renamed from: c */
    public final /* synthetic */ f0 f100384c;

    public e0(f0 f0Var, int i13) {
        this.f100384c = f0Var;
        Object obj = f0.f100386j;
        this.f100382a = f0Var.k()[i13];
        this.f100383b = i13;
    }

    public final void a() {
        int i13 = this.f100383b;
        Object obj = this.f100382a;
        f0 f0Var = this.f100384c;
        if (i13 != -1 && i13 < f0Var.size()) {
            if (kh2.g0.m(obj, f0Var.k()[this.f100383b])) {
                return;
            }
        }
        Object obj2 = f0.f100386j;
        this.f100383b = f0Var.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f100382a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        f0 f0Var = this.f100384c;
        Map c13 = f0Var.c();
        if (c13 != null) {
            return c13.get(this.f100382a);
        }
        a();
        int i13 = this.f100383b;
        if (i13 == -1) {
            return null;
        }
        return f0Var.m()[i13];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        f0 f0Var = this.f100384c;
        Map c13 = f0Var.c();
        Object obj2 = this.f100382a;
        if (c13 != null) {
            return c13.put(obj2, obj);
        }
        a();
        int i13 = this.f100383b;
        if (i13 == -1) {
            f0Var.put(obj2, obj);
            return null;
        }
        Object obj3 = f0Var.m()[i13];
        f0Var.m()[this.f100383b] = obj;
        return obj3;
    }
}
