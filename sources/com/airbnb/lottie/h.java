package com.airbnb.lottie;

import android.graphics.Rect;
import g1.p0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c */
    public Map f28398c;

    /* renamed from: d */
    public Map f28399d;

    /* renamed from: e */
    public float f28400e;

    /* renamed from: f */
    public Map f28401f;

    /* renamed from: g */
    public List f28402g;

    /* renamed from: h */
    public p0 f28403h;

    /* renamed from: i */
    public g1.p f28404i;

    /* renamed from: j */
    public List f28405j;

    /* renamed from: k */
    public Rect f28406k;

    /* renamed from: l */
    public float f28407l;

    /* renamed from: m */
    public float f28408m;

    /* renamed from: n */
    public float f28409n;

    /* renamed from: o */
    public boolean f28410o;

    /* renamed from: a */
    public final m7.c f28396a = new m7.c();

    /* renamed from: b */
    public final HashSet f28397b = new HashSet();

    /* renamed from: p */
    public int f28411p = 0;

    public final void a(String str) {
        jc.b.c(str);
        this.f28397b.add(str);
    }

    public final float b() {
        return (long) (((this.f28408m - this.f28407l) / this.f28409n) * 1000.0f);
    }

    public final Map c() {
        float c13 = jc.g.c();
        if (c13 != this.f28400e) {
            for (Map.Entry entry : this.f28399d.entrySet()) {
                this.f28399d.put((String) entry.getKey(), ((w) entry.getValue()).a(this.f28400e / c13));
            }
        }
        this.f28400e = c13;
        return this.f28399d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f28405j.iterator();
        while (it.hasNext()) {
            sb3.append(((fc.i) it.next()).b("\t"));
        }
        return sb3.toString();
    }
}
