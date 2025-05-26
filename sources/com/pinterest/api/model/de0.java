package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class de0 {

    /* renamed from: a, reason: collision with root package name */
    public String f36736a;

    /* renamed from: b, reason: collision with root package name */
    public String f36737b;

    /* renamed from: c, reason: collision with root package name */
    public String f36738c;

    /* renamed from: d, reason: collision with root package name */
    public String f36739d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f36740e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f36741f;

    public /* synthetic */ de0(int i13) {
        this();
    }

    private de0() {
        this.f36741f = new boolean[5];
    }

    private de0(@NonNull ge0 ge0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        str = ge0Var.f38050a;
        this.f36736a = str;
        str2 = ge0Var.f38051b;
        this.f36737b = str2;
        str3 = ge0Var.f38052c;
        this.f36738c = str3;
        str4 = ge0Var.f38053d;
        this.f36739d = str4;
        num = ge0Var.f38054e;
        this.f36740e = num;
        boolean[] zArr = ge0Var.f38055f;
        this.f36741f = Arrays.copyOf(zArr, zArr.length);
    }
}
