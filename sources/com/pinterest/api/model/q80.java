package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q80 {

    /* renamed from: a, reason: collision with root package name */
    public String f41231a;

    /* renamed from: b, reason: collision with root package name */
    public String f41232b;

    /* renamed from: c, reason: collision with root package name */
    public List f41233c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f41234d;

    /* renamed from: e, reason: collision with root package name */
    public String f41235e;

    /* renamed from: f, reason: collision with root package name */
    public Map f41236f;

    /* renamed from: g, reason: collision with root package name */
    public List f41237g;

    /* renamed from: h, reason: collision with root package name */
    public List f41238h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f41239i;

    public /* synthetic */ q80(int i13) {
        this();
    }

    private q80() {
        this.f41239i = new boolean[8];
    }

    private q80(@NonNull t80 t80Var) {
        String str;
        String str2;
        List list;
        Boolean bool;
        String str3;
        Map map;
        List list2;
        List list3;
        str = t80Var.f42122a;
        this.f41231a = str;
        str2 = t80Var.f42123b;
        this.f41232b = str2;
        list = t80Var.f42124c;
        this.f41233c = list;
        bool = t80Var.f42125d;
        this.f41234d = bool;
        str3 = t80Var.f42126e;
        this.f41235e = str3;
        map = t80Var.f42127f;
        this.f41236f = map;
        list2 = t80Var.f42128g;
        this.f41237g = list2;
        list3 = t80Var.f42129h;
        this.f41238h = list3;
        boolean[] zArr = t80Var.f42130i;
        this.f41239i = Arrays.copyOf(zArr, zArr.length);
    }
}
