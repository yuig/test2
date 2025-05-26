package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class y80 {

    /* renamed from: a, reason: collision with root package name */
    public Map f43973a;

    /* renamed from: b, reason: collision with root package name */
    public String f43974b;

    /* renamed from: c, reason: collision with root package name */
    public String f43975c;

    /* renamed from: d, reason: collision with root package name */
    public b01 f43976d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f43977e;

    public /* synthetic */ y80(int i13) {
        this();
    }

    public final void a(Map map) {
        this.f43973a = map;
        boolean[] zArr = this.f43977e;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void b(String str) {
        this.f43974b = str;
        boolean[] zArr = this.f43977e;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void c(String str) {
        this.f43975c = str;
        boolean[] zArr = this.f43977e;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void d(b01 b01Var) {
        this.f43976d = b01Var;
        boolean[] zArr = this.f43977e;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    private y80() {
        this.f43977e = new boolean[4];
    }

    private y80(@NonNull b90 b90Var) {
        Map map;
        String str;
        String str2;
        b01 b01Var;
        map = b90Var.f36019a;
        this.f43973a = map;
        str = b90Var.f36020b;
        this.f43974b = str;
        str2 = b90Var.f36021c;
        this.f43975c = str2;
        b01Var = b90Var.f36022d;
        this.f43976d = b01Var;
        boolean[] zArr = b90Var.f36023e;
        this.f43977e = Arrays.copyOf(zArr, zArr.length);
    }
}
