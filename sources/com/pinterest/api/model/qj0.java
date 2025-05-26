package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.rj0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class qj0 {

    /* renamed from: a, reason: collision with root package name */
    public wy0 f41318a;

    /* renamed from: b, reason: collision with root package name */
    public wy0 f41319b;

    /* renamed from: c, reason: collision with root package name */
    public rj0.a f41320c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f41321d;

    public /* synthetic */ qj0(int i13) {
        this();
    }

    public final rj0 a() {
        return new rj0(this.f41318a, this.f41319b, this.f41320c, this.f41321d, 0);
    }

    public final void b(wy0 wy0Var) {
        this.f41318a = wy0Var;
        boolean[] zArr = this.f41321d;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(wy0 wy0Var) {
        this.f41319b = wy0Var;
        boolean[] zArr = this.f41321d;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(rj0.a aVar) {
        this.f41320c = aVar;
        boolean[] zArr = this.f41321d;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public /* synthetic */ qj0(rj0 rj0Var, int i13) {
        this(rj0Var);
    }

    private qj0() {
        this.f41321d = new boolean[3];
    }

    private qj0(@NonNull rj0 rj0Var) {
        wy0 wy0Var;
        wy0 wy0Var2;
        rj0.a aVar;
        wy0Var = rj0Var.f41613a;
        this.f41318a = wy0Var;
        wy0Var2 = rj0Var.f41614b;
        this.f41319b = wy0Var2;
        aVar = rj0Var.f41615c;
        this.f41320c = aVar;
        boolean[] zArr = rj0Var.f41616d;
        this.f41321d = Arrays.copyOf(zArr, zArr.length);
    }
}
