package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.y40;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class x40 {

    /* renamed from: a, reason: collision with root package name */
    public String f43580a;

    /* renamed from: b, reason: collision with root package name */
    public String f43581b;

    /* renamed from: c, reason: collision with root package name */
    public e50 f43582c;

    /* renamed from: d, reason: collision with root package name */
    public y40.a f43583d;

    /* renamed from: e, reason: collision with root package name */
    public m50 f43584e;

    /* renamed from: f, reason: collision with root package name */
    public List f43585f;

    /* renamed from: g, reason: collision with root package name */
    public String f43586g;

    /* renamed from: h, reason: collision with root package name */
    public String f43587h;

    /* renamed from: i, reason: collision with root package name */
    public String f43588i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f43589j;

    public /* synthetic */ x40(int i13) {
        this();
    }

    private x40() {
        this.f43589j = new boolean[9];
    }

    private x40(@NonNull y40 y40Var) {
        String str;
        String str2;
        e50 e50Var;
        y40.a aVar;
        m50 m50Var;
        List list;
        String str3;
        String str4;
        String str5;
        str = y40Var.f43939a;
        this.f43580a = str;
        str2 = y40Var.f43940b;
        this.f43581b = str2;
        e50Var = y40Var.f43941c;
        this.f43582c = e50Var;
        aVar = y40Var.f43942d;
        this.f43583d = aVar;
        m50Var = y40Var.f43943e;
        this.f43584e = m50Var;
        list = y40Var.f43944f;
        this.f43585f = list;
        str3 = y40Var.f43945g;
        this.f43586g = str3;
        str4 = y40Var.f43946h;
        this.f43587h = str4;
        str5 = y40Var.f43947i;
        this.f43588i = str5;
        boolean[] zArr = y40Var.f43948j;
        this.f43589j = Arrays.copyOf(zArr, zArr.length);
    }
}
