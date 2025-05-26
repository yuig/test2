package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class kv0 {

    /* renamed from: a, reason: collision with root package name */
    public String f39551a;

    /* renamed from: b, reason: collision with root package name */
    public String f39552b;

    /* renamed from: c, reason: collision with root package name */
    public String f39553c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f39554d;

    /* renamed from: e, reason: collision with root package name */
    public List f39555e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f39556f;

    public /* synthetic */ kv0(int i13) {
        this();
    }

    public /* synthetic */ kv0(nv0 nv0Var, int i13) {
        this(nv0Var);
    }

    private kv0() {
        this.f39556f = new boolean[5];
    }

    private kv0(@NonNull nv0 nv0Var) {
        String str;
        String str2;
        String str3;
        Integer num;
        List list;
        str = nv0Var.f40508a;
        this.f39551a = str;
        str2 = nv0Var.f40509b;
        this.f39552b = str2;
        str3 = nv0Var.f40510c;
        this.f39553c = str3;
        num = nv0Var.f40511d;
        this.f39554d = num;
        list = nv0Var.f40512e;
        this.f39555e = list;
        boolean[] zArr = nv0Var.f40513f;
        this.f39556f = Arrays.copyOf(zArr, zArr.length);
    }
}
