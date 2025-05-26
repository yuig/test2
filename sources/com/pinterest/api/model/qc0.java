package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qc0 {

    /* renamed from: a, reason: collision with root package name */
    public String f41262a;

    /* renamed from: b, reason: collision with root package name */
    public String f41263b;

    /* renamed from: c, reason: collision with root package name */
    public Map f41264c;

    /* renamed from: d, reason: collision with root package name */
    public String f41265d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f41266e;

    /* renamed from: f, reason: collision with root package name */
    public String f41267f;

    /* renamed from: g, reason: collision with root package name */
    public List f41268g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f41269h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f41270i;

    public /* synthetic */ qc0(int i13) {
        this();
    }

    private qc0() {
        this.f41270i = new boolean[8];
    }

    private qc0(@NonNull tc0 tc0Var) {
        String str;
        String str2;
        Map map;
        String str3;
        Integer num;
        String str4;
        List list;
        Integer num2;
        str = tc0Var.f42157a;
        this.f41262a = str;
        str2 = tc0Var.f42158b;
        this.f41263b = str2;
        map = tc0Var.f42159c;
        this.f41264c = map;
        str3 = tc0Var.f42160d;
        this.f41265d = str3;
        num = tc0Var.f42161e;
        this.f41266e = num;
        str4 = tc0Var.f42162f;
        this.f41267f = str4;
        list = tc0Var.f42163g;
        this.f41268g = list;
        num2 = tc0Var.f42164h;
        this.f41269h = num2;
        boolean[] zArr = tc0Var.f42165i;
        this.f41270i = Arrays.copyOf(zArr, zArr.length);
    }
}
