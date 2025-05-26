package tc;

import com.apollographql.apollo3.exception.JsonDataException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import e0.t;
import java.io.IOException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final bk.f f117169g = new bk.f();

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f117170h;

    /* renamed from: a, reason: collision with root package name */
    public final wo2.k f117171a;

    /* renamed from: b, reason: collision with root package name */
    public int f117172b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f117173c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f117174d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f117175e;

    /* renamed from: f, reason: collision with root package name */
    public String f117176f;

    static {
        String[] strArr = new String[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
        for (int i13 = 0; i13 < 32; i13++) {
            StringBuilder sb3 = new StringBuilder("\\u00");
            byte b13 = (byte) i13;
            f117169g.getClass();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("0123456789abcdef".charAt(b13 >>> 4));
            sb4.append("0123456789abcdef".charAt(b13 & 15));
            sb3.append(sb4.toString());
            strArr[i13] = sb3.toString();
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        f117170h = strArr;
    }

    public b(wo2.j sink, String str) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f117171a = sink;
        this.f117173c = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        this.f117174d = new String[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        this.f117175e = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        g(6);
    }

    @Override // tc.g
    public final g C(long j13) {
        e(String.valueOf(j13));
        return this;
    }

    @Override // tc.g
    public final g D(int i13) {
        e(String.valueOf(i13));
        return this;
    }

    @Override // tc.g
    public final g H(double d2) {
        if (!Double.isNaN(d2) && !Double.isInfinite(d2)) {
            e(String.valueOf(d2));
            return this;
        }
        throw new IllegalArgumentException(("Numeric values must be finite, but was " + d2).toString());
    }

    @Override // tc.g
    public final g M0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i13 = this.f117172b;
        if (i13 == 0) {
            throw new IllegalStateException("JsonWriter is closed.".toString());
        }
        if (this.f117176f != null) {
            throw new IllegalStateException("Nesting problem.".toString());
        }
        this.f117176f = name;
        this.f117174d[i13 - 1] = name;
        return this;
    }

    public final void a() {
        int f13 = f();
        int[] iArr = this.f117173c;
        if (f13 == 1) {
            iArr[this.f117172b - 1] = 2;
            return;
        }
        wo2.k kVar = this.f117171a;
        if (f13 == 2) {
            kVar.p1(44);
            return;
        }
        if (f13 == 4) {
            kVar.l0(":");
            iArr[this.f117172b - 1] = 5;
        } else if (f13 == 6) {
            iArr[this.f117172b - 1] = 7;
        } else {
            if (f13 == 7) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            throw new IllegalStateException("Nesting problem.");
        }
    }

    @Override // tc.g
    public final g a2() {
        e("null");
        return this;
    }

    public final void c(int i13, int i14, String str) {
        int f13 = f();
        if (f13 != i14 && f13 != i13) {
            throw new IllegalStateException("Nesting problem.".toString());
        }
        if (this.f117176f != null) {
            throw new IllegalStateException(("Dangling name: " + this.f117176f).toString());
        }
        int i15 = this.f117172b;
        int i16 = i15 - 1;
        this.f117172b = i16;
        this.f117174d[i16] = null;
        int i17 = i15 - 2;
        int[] iArr = this.f117175e;
        iArr[i17] = iArr[i17] + 1;
        this.f117171a.l0(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f117171a.close();
        int i13 = this.f117172b;
        if (i13 > 1 || (i13 == 1 && this.f117173c[i13 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f117172b = 0;
    }

    public final String d() {
        return CollectionsKt.Z(t.t(this.f117172b, this.f117173c, this.f117174d, this.f117175e), ".", null, null, 0, null, null, 62);
    }

    public final void e(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        h();
        a();
        this.f117171a.l0(value);
        int i13 = this.f117172b - 1;
        int[] iArr = this.f117175e;
        iArr[i13] = iArr[i13] + 1;
    }

    public final int f() {
        int i13 = this.f117172b;
        if (i13 == 0) {
            throw new IllegalStateException("JsonWriter is closed.".toString());
        }
        return this.f117173c[i13 - 1];
    }

    public final void g(int i13) {
        int i14 = this.f117172b;
        int[] iArr = this.f117173c;
        if (i14 != iArr.length) {
            this.f117172b = i14 + 1;
            iArr[i14] = i13;
        } else {
            throw new JsonDataException("Nesting too deep at " + d() + ": circular reference?");
        }
    }

    public final void h() {
        if (this.f117176f != null) {
            int f13 = f();
            wo2.k kVar = this.f117171a;
            if (f13 == 5) {
                kVar.p1(44);
            } else if (f13 != 3) {
                throw new IllegalStateException("Nesting problem.".toString());
            }
            this.f117173c[this.f117172b - 1] = 4;
            String str = this.f117176f;
            Intrinsics.f(str);
            bk.f.d0(kVar, str);
            this.f117176f = null;
        }
    }

    @Override // tc.g
    public final g h0(boolean z13) {
        e(z13 ? "true" : "false");
        return this;
    }

    @Override // tc.g
    public final g n1(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        h();
        a();
        bk.f.d0(this.f117171a, value);
        int i13 = this.f117172b - 1;
        int[] iArr = this.f117175e;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // tc.g
    public final g s() {
        h();
        a();
        g(3);
        this.f117175e[this.f117172b - 1] = 0;
        this.f117171a.l0("{");
        return this;
    }

    @Override // tc.g
    public final g t() {
        c(1, 2, "]");
        return this;
    }

    @Override // tc.g
    public final g u() {
        h();
        a();
        g(1);
        this.f117175e[this.f117172b - 1] = 0;
        this.f117171a.l0("[");
        return this;
    }

    @Override // tc.g
    public final g v() {
        c(3, 5, "}");
        return this;
    }

    @Override // tc.g
    public final g y(d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        e(value.f117192a);
        return this;
    }
}
