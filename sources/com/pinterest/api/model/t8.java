package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class t8 {

    /* renamed from: a, reason: collision with root package name */
    public String f42113a;

    /* renamed from: b, reason: collision with root package name */
    public String f42114b;

    /* renamed from: c, reason: collision with root package name */
    public dk0 f42115c;

    /* renamed from: d, reason: collision with root package name */
    public String f42116d;

    /* renamed from: e, reason: collision with root package name */
    public String f42117e;

    /* renamed from: f, reason: collision with root package name */
    public String f42118f;

    /* renamed from: g, reason: collision with root package name */
    public List f42119g;

    /* renamed from: h, reason: collision with root package name */
    public Map f42120h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f42121i;

    public /* synthetic */ t8(int i13) {
        this();
    }

    private t8() {
        this.f42121i = new boolean[8];
    }

    private t8(@NonNull u8 u8Var) {
        String str;
        String str2;
        dk0 dk0Var;
        String str3;
        String str4;
        String str5;
        List list;
        Map map;
        str = u8Var.f42465a;
        this.f42113a = str;
        str2 = u8Var.f42466b;
        this.f42114b = str2;
        dk0Var = u8Var.f42467c;
        this.f42115c = dk0Var;
        str3 = u8Var.f42468d;
        this.f42116d = str3;
        str4 = u8Var.f42469e;
        this.f42117e = str4;
        str5 = u8Var.f42470f;
        this.f42118f = str5;
        list = u8Var.f42471g;
        this.f42119g = list;
        map = u8Var.f42472h;
        this.f42120h = map;
        boolean[] zArr = u8Var.f42473i;
        this.f42121i = Arrays.copyOf(zArr, zArr.length);
    }
}
