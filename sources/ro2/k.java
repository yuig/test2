package ro2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f109012a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f109013b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f109014c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f109015d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f109016e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f109017f;

    /* renamed from: g, reason: collision with root package name */
    public final String f109018g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f109019h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f109020i;

    /* renamed from: j, reason: collision with root package name */
    public final String f109021j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f109022k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f109023l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f109024m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f109025n;

    /* renamed from: o, reason: collision with root package name */
    public final a f109026o;

    public k(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String prettyPrintIndent, boolean z19, boolean z23, String classDiscriminator, boolean z24, boolean z25, boolean z26, boolean z27, a classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f109012a = z13;
        this.f109013b = z14;
        this.f109014c = z15;
        this.f109015d = z16;
        this.f109016e = z17;
        this.f109017f = z18;
        this.f109018g = prettyPrintIndent;
        this.f109019h = z19;
        this.f109020i = z23;
        this.f109021j = classDiscriminator;
        this.f109022k = z24;
        this.f109023l = z25;
        this.f109024m = z26;
        this.f109025n = z27;
        this.f109026o = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f109012a + ", ignoreUnknownKeys=" + this.f109013b + ", isLenient=" + this.f109014c + ", allowStructuredMapKeys=" + this.f109015d + ", prettyPrint=" + this.f109016e + ", explicitNulls=" + this.f109017f + ", prettyPrintIndent='" + this.f109018g + "', coerceInputValues=" + this.f109019h + ", useArrayPolymorphism=" + this.f109020i + ", classDiscriminator='" + this.f109021j + "', allowSpecialFloatingPointValues=" + this.f109022k + ", useAlternativeNames=" + this.f109023l + ", namingStrategy=null, decodeEnumsCaseInsensitive=" + this.f109024m + ", allowTrailingComma=" + this.f109025n + ", classDiscriminatorMode=" + this.f109026o + ')';
    }
}
