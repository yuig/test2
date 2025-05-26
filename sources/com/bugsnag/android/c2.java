package com.bugsnag.android;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class c2 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29176a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29177b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29178c;

    /* renamed from: d, reason: collision with root package name */
    public List f29179d = kotlin.collections.q0.f80391a;

    public c2(String str, String str2, String str3) {
        this.f29176a = str;
        this.f29177b = str2;
        this.f29178c = str3;
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        o1Var.d();
        o1Var.K("name");
        o1Var.z(this.f29176a);
        o1Var.K("version");
        o1Var.z(this.f29177b);
        o1Var.K("url");
        o1Var.z(this.f29178c);
        if (!this.f29179d.isEmpty()) {
            o1Var.K("dependencies");
            o1Var.c();
            Iterator it = this.f29179d.iterator();
            while (it.hasNext()) {
                o1Var.M((c2) it.next());
            }
            o1Var.f();
        }
        o1Var.g();
    }
}
