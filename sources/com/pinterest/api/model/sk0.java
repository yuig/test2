package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class sk0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f41932a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f41933b;

    public /* synthetic */ sk0(int i13) {
        this();
    }

    private sk0() {
        this.f41933b = new boolean[1];
    }

    private sk0(@NonNull vk0 vk0Var) {
        Integer num;
        num = vk0Var.f42910a;
        this.f41932a = num;
        boolean[] zArr = vk0Var.f42911b;
        this.f41933b = Arrays.copyOf(zArr, zArr.length);
    }
}
