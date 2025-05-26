package w1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class j1 {

    /* renamed from: g, reason: collision with root package name */
    public static final j1 f127305g = new j1(null, null, 63);

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f127306a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f127307b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f127308c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f127309d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f127310e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f127311f;

    public j1(Function1 function1, Function1 function12, int i13) {
        function1 = (i13 & 4) != 0 ? null : function1;
        function12 = (i13 & 16) != 0 ? null : function12;
        this.f127306a = null;
        this.f127307b = null;
        this.f127308c = function1;
        this.f127309d = null;
        this.f127310e = function12;
        this.f127311f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.f127306a == j1Var.f127306a && this.f127307b == j1Var.f127307b && this.f127308c == j1Var.f127308c && this.f127309d == j1Var.f127309d && this.f127310e == j1Var.f127310e && this.f127311f == j1Var.f127311f;
    }

    public final int hashCode() {
        Function1 function1 = this.f127306a;
        int hashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.f127307b;
        int hashCode2 = (hashCode + (function12 != null ? function12.hashCode() : 0)) * 31;
        Function1 function13 = this.f127308c;
        int hashCode3 = (hashCode2 + (function13 != null ? function13.hashCode() : 0)) * 31;
        Function1 function14 = this.f127309d;
        int hashCode4 = (hashCode3 + (function14 != null ? function14.hashCode() : 0)) * 31;
        Function1 function15 = this.f127310e;
        int hashCode5 = (hashCode4 + (function15 != null ? function15.hashCode() : 0)) * 31;
        Function1 function16 = this.f127311f;
        return hashCode5 + (function16 != null ? function16.hashCode() : 0);
    }
}
