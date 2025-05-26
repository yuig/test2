package com.pinterest.api.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public class kj {

    /* renamed from: a, reason: collision with root package name */
    @om.b("format")
    private String f39479a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f39480b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public String f39481c;

    private kj() {
    }

    public static kj c(vd0.c cVar) {
        if (cVar == null) {
            return null;
        }
        kj kjVar = (kj) vd0.c.f125622b.e(cVar.f125623a, kj.class);
        vd0.a k13 = cVar.k("args");
        for (int i13 = 0; i13 < k13.d(); i13++) {
            vd0.c b13 = k13.b(i13);
            if (b13 instanceof vd0.c) {
                kjVar.f39480b.add((jh) vd0.c.f125622b.e(b13.f125623a, jh.class));
            } else {
                kjVar.d(k13.l(i13));
            }
        }
        kjVar.a();
        return kjVar;
    }

    public final String a() {
        String str = this.f39481c;
        if (str != null) {
            return str;
        }
        this.f39481c = this.f39479a;
        Iterator it = this.f39480b.iterator();
        while (it.hasNext()) {
            String b13 = ((jh) it.next()).b();
            if (!pk.a0.x0(b13)) {
                this.f39481c = this.f39481c.replaceFirst("\\{\\d\\}", Matcher.quoteReplacement(b13));
            }
        }
        return this.f39481c;
    }

    public final String b() {
        return this.f39479a;
    }

    public final void d(String str) {
        this.f39479a = str;
    }

    public kj(String str) {
        this.f39479a = str;
    }
}
