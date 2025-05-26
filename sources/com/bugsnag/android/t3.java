package com.bugsnag.android;

import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class t3 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29648a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29649b;

    /* renamed from: c, reason: collision with root package name */
    public final ErrorType f29650c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29651d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29652e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f29653f;

    public t3(String str, String str2, ErrorType errorType, boolean z13, String str3, s2 s2Var) {
        this.f29648a = str;
        this.f29649b = str2;
        this.f29650c = errorType;
        this.f29651d = z13;
        this.f29652e = str3;
        this.f29653f = CollectionsKt.H0(s2Var.f29636a);
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        o1Var.d();
        o1Var.K("id");
        o1Var.z(this.f29648a);
        o1Var.K("name");
        o1Var.z(this.f29649b);
        o1Var.K("type");
        o1Var.z(this.f29650c.getDesc());
        o1Var.K(AnimatedTarget.PROPERTY_STATE);
        o1Var.z(this.f29652e);
        o1Var.K("stacktrace");
        o1Var.c();
        Iterator it = this.f29653f.iterator();
        while (it.hasNext()) {
            o1Var.M((r2) it.next());
        }
        o1Var.f();
        if (this.f29651d) {
            o1Var.K("errorReportingThread");
            o1Var.A(true);
        }
        o1Var.g();
    }
}
