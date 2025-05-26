package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f40 {

    /* renamed from: a, reason: collision with root package name */
    public Map f37562a;

    /* renamed from: b, reason: collision with root package name */
    public String f37563b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f37564c;

    public /* synthetic */ f40(int i13) {
        this();
    }

    public final i40 a() {
        return new i40(this.f37562a, this.f37563b, this.f37564c, 0);
    }

    public final void b(Map map) {
        this.f37562a = map;
        boolean[] zArr = this.f37564c;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(String str) {
        this.f37563b = str;
        boolean[] zArr = this.f37564c;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    private f40() {
        this.f37564c = new boolean[2];
    }

    private f40(@NonNull i40 i40Var) {
        Map map;
        String str;
        map = i40Var.f38644a;
        this.f37562a = map;
        str = i40Var.f38645b;
        this.f37563b = str;
        boolean[] zArr = i40Var.f38646c;
        this.f37564c = Arrays.copyOf(zArr, zArr.length);
    }
}
