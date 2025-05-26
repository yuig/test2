package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ah0 {

    /* renamed from: a, reason: collision with root package name */
    public String f35742a;

    /* renamed from: b, reason: collision with root package name */
    public String f35743b;

    /* renamed from: c, reason: collision with root package name */
    public String f35744c;

    /* renamed from: d, reason: collision with root package name */
    public List f35745d;

    /* renamed from: e, reason: collision with root package name */
    public List f35746e;

    /* renamed from: f, reason: collision with root package name */
    public String f35747f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f35748g;

    public /* synthetic */ ah0(int i13) {
        this();
    }

    private ah0() {
        this.f35748g = new boolean[6];
    }

    private ah0(@NonNull dh0 dh0Var) {
        String str;
        String str2;
        String str3;
        List list;
        List list2;
        String str4;
        str = dh0Var.f36822a;
        this.f35742a = str;
        str2 = dh0Var.f36823b;
        this.f35743b = str2;
        str3 = dh0Var.f36824c;
        this.f35744c = str3;
        list = dh0Var.f36825d;
        this.f35745d = list;
        list2 = dh0Var.f36826e;
        this.f35746e = list2;
        str4 = dh0Var.f36827f;
        this.f35747f = str4;
        boolean[] zArr = dh0Var.f36828g;
        this.f35748g = Arrays.copyOf(zArr, zArr.length);
    }
}
