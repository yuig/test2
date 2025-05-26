package z3;

import a.cb;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f140671a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f140672b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f140673c;

    public h(Function0 function0, Function0 function02, boolean z13) {
        this.f140671a = function0;
        this.f140672b = function02;
        this.f140673c = z13;
    }

    public final Function0 a() {
        return this.f140672b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ScrollAxisRange(value=");
        sb3.append(((Number) this.f140671a.invoke()).floatValue());
        sb3.append(", maxValue=");
        sb3.append(((Number) this.f140672b.invoke()).floatValue());
        sb3.append(", reverseScrolling=");
        return cb.m(sb3, this.f140673c, ')');
    }
}
