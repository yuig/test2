package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.qv;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class pv {

    /* renamed from: a, reason: collision with root package name */
    public String f41115a;

    /* renamed from: b, reason: collision with root package name */
    public String f41116b;

    /* renamed from: c, reason: collision with root package name */
    public List f41117c;

    /* renamed from: d, reason: collision with root package name */
    public qv.a f41118d;

    /* renamed from: e, reason: collision with root package name */
    public qv.b f41119e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41120f;

    public /* synthetic */ pv(int i13) {
        this();
    }

    private pv() {
        this.f41120f = new boolean[5];
    }

    private pv(@NonNull qv qvVar) {
        String str;
        String str2;
        List list;
        qv.a aVar;
        qv.b bVar;
        str = qvVar.f41387a;
        this.f41115a = str;
        str2 = qvVar.f41388b;
        this.f41116b = str2;
        list = qvVar.f41389c;
        this.f41117c = list;
        aVar = qvVar.f41390d;
        this.f41118d = aVar;
        bVar = qvVar.f41391e;
        this.f41119e = bVar;
        boolean[] zArr = qvVar.f41392f;
        this.f41120f = Arrays.copyOf(zArr, zArr.length);
    }
}
