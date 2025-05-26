package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class o7 {

    /* renamed from: a, reason: collision with root package name */
    public String f40633a;

    /* renamed from: b, reason: collision with root package name */
    public String f40634b;

    /* renamed from: c, reason: collision with root package name */
    public List f40635c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f40636d;

    public /* synthetic */ o7(int i13) {
        this();
    }

    private o7() {
        this.f40636d = new boolean[3];
    }

    private o7(@NonNull p7 p7Var) {
        String str;
        String str2;
        List list;
        str = p7Var.f40895a;
        this.f40633a = str;
        str2 = p7Var.f40896b;
        this.f40634b = str2;
        list = p7Var.f40897c;
        this.f40635c = list;
        boolean[] zArr = p7Var.f40898d;
        this.f40636d = Arrays.copyOf(zArr, zArr.length);
    }
}
