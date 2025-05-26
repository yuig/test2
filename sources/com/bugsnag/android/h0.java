package com.bugsnag.android;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class h0 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f29248a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f29249b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29250c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29251d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f29252e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29253f;

    /* renamed from: g, reason: collision with root package name */
    public final String f29254g;

    /* renamed from: h, reason: collision with root package name */
    public final String f29255h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f29256i;

    public h0(i0 i0Var, String[] strArr, Boolean bool, String str, String str2, Long l13, LinkedHashMap linkedHashMap) {
        this.f29248a = strArr;
        this.f29249b = bool;
        this.f29250c = str;
        this.f29251d = str2;
        this.f29252e = l13;
        this.f29253f = i0Var.f29262a;
        this.f29254g = i0Var.f29263b;
        this.f29255h = i0Var.f29264c;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
        }
        this.f29256i = linkedHashMap2;
    }

    public void a(o1 o1Var) {
        o1Var.K("cpuAbi");
        o1Var.M(this.f29248a);
        o1Var.K("jailbroken");
        o1Var.q(this.f29249b);
        o1Var.K("id");
        o1Var.z(this.f29250c);
        o1Var.K("locale");
        o1Var.z(this.f29251d);
        o1Var.K("manufacturer");
        o1Var.z(this.f29253f);
        o1Var.K("model");
        o1Var.z(this.f29254g);
        o1Var.K("osName");
        o1Var.z("android");
        o1Var.K("osVersion");
        o1Var.z(this.f29255h);
        o1Var.K("runtimeVersions");
        o1Var.M(this.f29256i);
        o1Var.K("totalMemory");
        o1Var.w(this.f29252e);
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        o1Var.d();
        a(o1Var);
        o1Var.g();
    }
}
