package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public String f42380a;

    /* renamed from: b, reason: collision with root package name */
    public String f42381b;

    /* renamed from: c, reason: collision with root package name */
    public List f42382c;

    /* renamed from: d, reason: collision with root package name */
    public Map f42383d;

    /* renamed from: e, reason: collision with root package name */
    public Map f42384e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f42385f;

    public /* synthetic */ u1(int i13) {
        this();
    }

    private u1() {
        this.f42385f = new boolean[5];
    }

    private u1(@NonNull v1 v1Var) {
        String str;
        String str2;
        List list;
        Map map;
        Map map2;
        str = v1Var.f42693a;
        this.f42380a = str;
        str2 = v1Var.f42694b;
        this.f42381b = str2;
        list = v1Var.f42695c;
        this.f42382c = list;
        map = v1Var.f42696d;
        this.f42383d = map;
        map2 = v1Var.f42697e;
        this.f42384e = map2;
        boolean[] zArr = v1Var.f42698f;
        this.f42385f = Arrays.copyOf(zArr, zArr.length);
    }
}
