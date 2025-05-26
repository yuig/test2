package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class lc0 {

    /* renamed from: a, reason: collision with root package name */
    public v7 f39704a;

    /* renamed from: b, reason: collision with root package name */
    public zs f39705b;

    /* renamed from: c, reason: collision with root package name */
    public f30 f39706c;

    /* renamed from: d, reason: collision with root package name */
    public String f39707d;

    /* renamed from: e, reason: collision with root package name */
    public String f39708e;

    /* renamed from: f, reason: collision with root package name */
    public Map f39709f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f39710g;

    public /* synthetic */ lc0(int i13) {
        this();
    }

    public final void a(v7 v7Var) {
        this.f39704a = v7Var;
        boolean[] zArr = this.f39710g;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void b(zs zsVar) {
        this.f39705b = zsVar;
        boolean[] zArr = this.f39710g;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void c(f30 f30Var) {
        this.f39706c = f30Var;
        boolean[] zArr = this.f39710g;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    private lc0() {
        this.f39710g = new boolean[6];
    }

    private lc0(@NonNull oc0 oc0Var) {
        v7 v7Var;
        zs zsVar;
        f30 f30Var;
        String str;
        String str2;
        Map map;
        v7Var = oc0Var.f40673a;
        this.f39704a = v7Var;
        zsVar = oc0Var.f40674b;
        this.f39705b = zsVar;
        f30Var = oc0Var.f40675c;
        this.f39706c = f30Var;
        str = oc0Var.f40676d;
        this.f39707d = str;
        str2 = oc0Var.f40677e;
        this.f39708e = str2;
        map = oc0Var.f40678f;
        this.f39709f = map;
        boolean[] zArr = oc0Var.f40679g;
        this.f39710g = Arrays.copyOf(zArr, zArr.length);
    }
}
