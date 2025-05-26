package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class lb0 {

    /* renamed from: a, reason: collision with root package name */
    public String f39693a;

    /* renamed from: b, reason: collision with root package name */
    public String f39694b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f39695c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f39696d;

    /* renamed from: e, reason: collision with root package name */
    public List f39697e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f39698f;

    public /* synthetic */ lb0(int i13) {
        this();
    }

    private lb0() {
        this.f39698f = new boolean[5];
    }

    private lb0(@NonNull rb0 rb0Var) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        List list;
        str = rb0Var.f41534a;
        this.f39693a = str;
        str2 = rb0Var.f41535b;
        this.f39694b = str2;
        num = rb0Var.f41536c;
        this.f39695c = num;
        num2 = rb0Var.f41537d;
        this.f39696d = num2;
        list = rb0Var.f41538e;
        this.f39697e = list;
        boolean[] zArr = rb0Var.f41539f;
        this.f39698f = Arrays.copyOf(zArr, zArr.length);
    }
}
