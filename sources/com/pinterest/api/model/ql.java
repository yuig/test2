package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ql {

    /* renamed from: a, reason: collision with root package name */
    public String f41327a;

    /* renamed from: b, reason: collision with root package name */
    public String f41328b;

    /* renamed from: c, reason: collision with root package name */
    public String f41329c;

    /* renamed from: d, reason: collision with root package name */
    public String f41330d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f41331e;

    public /* synthetic */ ql(int i13) {
        this();
    }

    private ql() {
        this.f41331e = new boolean[4];
    }

    private ql(@NonNull tl tlVar) {
        String str;
        String str2;
        String str3;
        String str4;
        str = tlVar.f42231a;
        this.f41327a = str;
        str2 = tlVar.f42232b;
        this.f41328b = str2;
        str3 = tlVar.f42233c;
        this.f41329c = str3;
        str4 = tlVar.f42234d;
        this.f41330d = str4;
        boolean[] zArr = tlVar.f42235e;
        this.f41331e = Arrays.copyOf(zArr, zArr.length);
    }
}
