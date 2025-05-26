package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class s90 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f41832a;

    /* renamed from: b, reason: collision with root package name */
    public String f41833b;

    /* renamed from: c, reason: collision with root package name */
    public List f41834c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f41835d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f41836e;

    public /* synthetic */ s90(int i13) {
        this();
    }

    private s90() {
        this.f41836e = new boolean[4];
    }

    private s90(@NonNull v90 v90Var) {
        Integer num;
        String str;
        List list;
        Integer num2;
        num = v90Var.f42795a;
        this.f41832a = num;
        str = v90Var.f42796b;
        this.f41833b = str;
        list = v90Var.f42797c;
        this.f41834c = list;
        num2 = v90Var.f42798d;
        this.f41835d = num2;
        boolean[] zArr = v90Var.f42799e;
        this.f41836e = Arrays.copyOf(zArr, zArr.length);
    }
}
