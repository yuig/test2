package bz;

import h32.i0;
import h32.v0;
import h32.x3;

/* loaded from: classes.dex */
public abstract class a extends b {

    /* renamed from: h, reason: collision with root package name */
    public final i0 f24164h;

    /* renamed from: i, reason: collision with root package name */
    public final String f24165i;

    public a(i0 i0Var, String str) {
        this.f24164h = i0Var;
        this.f24165i = str;
    }

    @Override // bz.b
    public final void b(v0 v0Var) {
        String str;
        i0 i0Var = this.f24164h;
        v0Var.f67285h = i0Var;
        x3 x3Var = i0Var.f67083c;
        if (x3Var == null || (str = x3Var.f67402f) == null) {
            return;
        }
        v0Var.f67295r = str;
    }
}
