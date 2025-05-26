package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class rl0 {

    /* renamed from: a, reason: collision with root package name */
    public String f41621a;

    /* renamed from: b, reason: collision with root package name */
    public List f41622b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f41623c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f41624d;

    public /* synthetic */ rl0(int i13) {
        this();
    }

    private rl0() {
        this.f41624d = new boolean[3];
    }

    private rl0(@NonNull ul0 ul0Var) {
        String str;
        List list;
        Integer num;
        str = ul0Var.f42580a;
        this.f41621a = str;
        list = ul0Var.f42581b;
        this.f41622b = list;
        num = ul0Var.f42582c;
        this.f41623c = num;
        boolean[] zArr = ul0Var.f42583d;
        this.f41624d = Arrays.copyOf(zArr, zArr.length);
    }
}
