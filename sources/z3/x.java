package z3;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f140761a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f140762b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f140763c;

    public x(String str, Function2 function2) {
        this.f140761a = str;
        this.f140762b = function2;
    }

    public final void a(y yVar, Object obj) {
        ((j) yVar).e(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f140761a;
    }

    public /* synthetic */ x(String str) {
        this(str, s.f140730t);
    }

    public x(String str, boolean z13, Function2 function2) {
        this(str, function2);
        this.f140763c = z13;
    }
}
