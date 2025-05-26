package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class wq {

    /* renamed from: a, reason: collision with root package name */
    public String f43330a;

    /* renamed from: b, reason: collision with root package name */
    public String f43331b;

    /* renamed from: c, reason: collision with root package name */
    public String f43332c;

    /* renamed from: d, reason: collision with root package name */
    public String f43333d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f43334e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f43335f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f43336g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f43337h;

    /* renamed from: i, reason: collision with root package name */
    public String f43338i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f43339j;

    public /* synthetic */ wq(int i13) {
        this();
    }

    private wq() {
        this.f43339j = new boolean[9];
    }

    private wq(@NonNull zq zqVar) {
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Integer num;
        String str5;
        str = zqVar.f44403a;
        this.f43330a = str;
        str2 = zqVar.f44404b;
        this.f43331b = str2;
        str3 = zqVar.f44405c;
        this.f43332c = str3;
        str4 = zqVar.f44406d;
        this.f43333d = str4;
        bool = zqVar.f44407e;
        this.f43334e = bool;
        bool2 = zqVar.f44408f;
        this.f43335f = bool2;
        bool3 = zqVar.f44409g;
        this.f43336g = bool3;
        num = zqVar.f44410h;
        this.f43337h = num;
        str5 = zqVar.f44411i;
        this.f43338i = str5;
        boolean[] zArr = zqVar.f44412j;
        this.f43339j = Arrays.copyOf(zArr, zArr.length);
    }
}
