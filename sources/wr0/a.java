package wr0;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fw0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z2;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f130855a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f130856b;

    /* renamed from: c, reason: collision with root package name */
    public final String f130857c;

    /* renamed from: d, reason: collision with root package name */
    public final String f130858d;

    /* renamed from: e, reason: collision with root package name */
    public final String f130859e;

    /* renamed from: f, reason: collision with root package name */
    public final String f130860f;

    /* renamed from: g, reason: collision with root package name */
    public final String f130861g;

    /* renamed from: h, reason: collision with root package name */
    public final String f130862h;

    /* renamed from: i, reason: collision with root package name */
    public final String f130863i;

    /* renamed from: j, reason: collision with root package name */
    public final fw0.a f130864j;

    /* renamed from: k, reason: collision with root package name */
    public final int f130865k;

    /* renamed from: l, reason: collision with root package name */
    public final az0 f130866l;

    /* renamed from: m, reason: collision with root package name */
    public final z2 f130867m;

    public a(pb0.d fuzzyDateFormatter, fw0 trackedComment, int i13) {
        Map A4;
        sr srVar;
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(trackedComment, "trackedComment");
        f30 z13 = trackedComment.z();
        this.f130855a = z13 == null ? new f30() : z13;
        Boolean A = trackedComment.A();
        Intrinsics.checkNotNullExpressionValue(A, "getSeen(...)");
        this.f130856b = A.booleanValue();
        String y13 = trackedComment.y();
        this.f130857c = y13 == null ? "" : y13;
        String x13 = trackedComment.x();
        this.f130858d = x13 == null ? "" : x13;
        String x14 = trackedComment.x();
        this.f130859e = x14 == null ? "" : x14;
        f30 z14 = trackedComment.z();
        String j13 = (z14 == null || (A4 = z14.A4()) == null || (srVar = (sr) A4.get("736x")) == null) ? null : srVar.j();
        this.f130860f = j13 == null ? "" : j13;
        wy0 E = trackedComment.E();
        String z43 = E != null ? E.z4() : null;
        this.f130861g = z43 == null ? "" : z43;
        String B = trackedComment.B();
        this.f130862h = B != null ? B : "";
        this.f130863i = fuzzyDateFormatter.a(new Date(trackedComment.D().intValue() * 1000), pb0.b.STYLE_COMPACT).toString();
        fw0.a C = trackedComment.C();
        this.f130864j = C == null ? fw0.a.UNKNOWN : C;
        this.f130865k = i13;
        az0 F = trackedComment.F();
        this.f130866l = F == null ? new az0() : F;
        z2 w13 = trackedComment.w();
        this.f130867m = w13 == null ? new z2() : w13;
    }
}
