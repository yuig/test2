package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public String f35603a;

    /* renamed from: b, reason: collision with root package name */
    public String f35604b;

    /* renamed from: c, reason: collision with root package name */
    public String f35605c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f35606d;

    /* renamed from: e, reason: collision with root package name */
    public List f35607e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35608f;

    public /* synthetic */ a1(int i13) {
        this();
    }

    private a1() {
        this.f35608f = new boolean[5];
    }

    private a1(@NonNull b1 b1Var) {
        String str;
        String str2;
        String str3;
        Integer num;
        List list;
        str = b1Var.f35936a;
        this.f35603a = str;
        str2 = b1Var.f35937b;
        this.f35604b = str2;
        str3 = b1Var.f35938c;
        this.f35605c = str3;
        num = b1Var.f35939d;
        this.f35606d = num;
        list = b1Var.f35940e;
        this.f35607e = list;
        boolean[] zArr = b1Var.f35941f;
        this.f35608f = Arrays.copyOf(zArr, zArr.length);
    }
}
