package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class il {

    /* renamed from: a, reason: collision with root package name */
    public String f38807a;

    /* renamed from: b, reason: collision with root package name */
    public String f38808b;

    /* renamed from: c, reason: collision with root package name */
    public String f38809c;

    /* renamed from: d, reason: collision with root package name */
    public List f38810d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f38811e;

    public /* synthetic */ il(int i13) {
        this();
    }

    private il() {
        this.f38811e = new boolean[4];
    }

    private il(@NonNull ll llVar) {
        String str;
        String str2;
        String str3;
        List list;
        str = llVar.f39812a;
        this.f38807a = str;
        str2 = llVar.f39813b;
        this.f38808b = str2;
        str3 = llVar.f39814c;
        this.f38809c = str3;
        list = llVar.f39815d;
        this.f38810d = list;
        boolean[] zArr = llVar.f39816e;
        this.f38811e = Arrays.copyOf(zArr, zArr.length);
    }
}
