package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class vb0 {

    /* renamed from: a, reason: collision with root package name */
    public String f42812a;

    /* renamed from: b, reason: collision with root package name */
    public String f42813b;

    /* renamed from: c, reason: collision with root package name */
    public Map f42814c;

    /* renamed from: d, reason: collision with root package name */
    public List f42815d;

    /* renamed from: e, reason: collision with root package name */
    public List f42816e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f42817f;

    public /* synthetic */ vb0(int i13) {
        this();
    }

    private vb0() {
        this.f42817f = new boolean[5];
    }

    private vb0(@NonNull yb0 yb0Var) {
        String str;
        String str2;
        Map map;
        List list;
        List list2;
        str = yb0Var.f43995a;
        this.f42812a = str;
        str2 = yb0Var.f43996b;
        this.f42813b = str2;
        map = yb0Var.f43997c;
        this.f42814c = map;
        list = yb0Var.f43998d;
        this.f42815d = list;
        list2 = yb0Var.f43999e;
        this.f42816e = list2;
        boolean[] zArr = yb0Var.f44000f;
        this.f42817f = Arrays.copyOf(zArr, zArr.length);
    }
}
