package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class sq0 {

    /* renamed from: a, reason: collision with root package name */
    public Map f41967a;

    /* renamed from: b, reason: collision with root package name */
    public Map f41968b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f41969c;

    public /* synthetic */ sq0(int i13) {
        this();
    }

    public final vq0 a() {
        return new vq0(this.f41967a, this.f41968b, this.f41969c, 0);
    }

    public final void b(Map map) {
        this.f41967a = map;
        boolean[] zArr = this.f41969c;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(Map map) {
        this.f41968b = map;
        boolean[] zArr = this.f41969c;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    private sq0() {
        this.f41969c = new boolean[2];
    }

    private sq0(@NonNull vq0 vq0Var) {
        Map map;
        Map map2;
        map = vq0Var.f42955a;
        this.f41967a = map;
        map2 = vq0Var.f42956b;
        this.f41968b = map2;
        boolean[] zArr = vq0Var.f42957c;
        this.f41969c = Arrays.copyOf(zArr, zArr.length);
    }
}
