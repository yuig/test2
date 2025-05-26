package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class gt0 {

    /* renamed from: a, reason: collision with root package name */
    public String f38137a;

    /* renamed from: b, reason: collision with root package name */
    public String f38138b;

    /* renamed from: c, reason: collision with root package name */
    public List f38139c;

    /* renamed from: d, reason: collision with root package name */
    public List f38140d;

    /* renamed from: e, reason: collision with root package name */
    public List f38141e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f38142f;

    public /* synthetic */ gt0(int i13) {
        this();
    }

    private gt0() {
        this.f38142f = new boolean[5];
    }

    private gt0(@NonNull jt0 jt0Var) {
        String str;
        String str2;
        List list;
        List list2;
        List list3;
        str = jt0Var.f39147a;
        this.f38137a = str;
        str2 = jt0Var.f39148b;
        this.f38138b = str2;
        list = jt0Var.f39149c;
        this.f38139c = list;
        list2 = jt0Var.f39150d;
        this.f38140d = list2;
        list3 = jt0Var.f39151e;
        this.f38141e = list3;
        boolean[] zArr = jt0Var.f39152f;
        this.f38142f = Arrays.copyOf(zArr, zArr.length);
    }
}
