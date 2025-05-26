package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class y50 {

    /* renamed from: a, reason: collision with root package name */
    public String f43954a;

    /* renamed from: b, reason: collision with root package name */
    public String f43955b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f43956c;

    /* renamed from: d, reason: collision with root package name */
    public String f43957d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f43958e;

    public /* synthetic */ y50(int i13) {
        this();
    }

    private y50() {
        this.f43958e = new boolean[4];
    }

    private y50(@NonNull b60 b60Var) {
        String str;
        String str2;
        Integer num;
        String str3;
        str = b60Var.f35997a;
        this.f43954a = str;
        str2 = b60Var.f35998b;
        this.f43955b = str2;
        num = b60Var.f35999c;
        this.f43956c = num;
        str3 = b60Var.f36000d;
        this.f43957d = str3;
        boolean[] zArr = b60Var.f36001e;
        this.f43958e = Arrays.copyOf(zArr, zArr.length);
    }
}
