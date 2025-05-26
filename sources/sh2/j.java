package sh2;

import ei2.x;
import g72.c0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mh2.n;
import nf2.o;
import xk2.v;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f112976a;

    /* renamed from: b, reason: collision with root package name */
    public final mj2.a f112977b;

    /* renamed from: c, reason: collision with root package name */
    public final v f112978c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f112979d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f112980e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f112981f;

    /* renamed from: g, reason: collision with root package name */
    public final i f112982g;

    /* renamed from: h, reason: collision with root package name */
    public final v f112983h;

    /* renamed from: i, reason: collision with root package name */
    public final v f112984i;

    public j(x spanSink, n logSink, o systemInfo, Function0 processIdentifierProvider) {
        Intrinsics.checkNotNullParameter(spanSink, "spanSink");
        Intrinsics.checkNotNullParameter(logSink, "logSink");
        Intrinsics.checkNotNullParameter(systemInfo, "systemInfo");
        Intrinsics.checkNotNullParameter(processIdentifierProvider, "processIdentifierProvider");
        this.f112976a = processIdentifierProvider;
        mj2.a aVar = mj2.a.f87281e;
        aVar.getClass();
        mc2.k kVar = new mc2.k();
        qi2.b bVar = (qi2.b) kVar.f86944a;
        bVar.getClass();
        int i13 = 1;
        qi2.d dVar = aVar.f87283b;
        if (dVar != null) {
            dVar.forEach(new c0(bVar, 1));
        }
        String str = aVar.f87282a;
        if (str != null) {
            kVar.f86945b = str;
        }
        kVar.c(sj2.e.f113034a, "io.embrace.android.embracesdk.core");
        kVar.c(sj2.e.f113035b, "7.1.0");
        kVar.c(tj2.e.f117931b, systemInfo.f90508a);
        kVar.c(tj2.e.f117933d, systemInfo.f90511d);
        kVar.c(tj2.e.f117932c, systemInfo.f90509b);
        kVar.c(tj2.e.f117930a, systemInfo.f90510c);
        kVar.c(tj2.a.f117923a, systemInfo.f90512e);
        kVar.c(tj2.b.f117924a, systemInfo.f90513f);
        ri2.e eVar = tj2.b.f117925b;
        String str2 = systemInfo.f90514g;
        kVar.c(eVar, str2);
        kVar.c(tj2.b.f117926c, str2);
        kVar.c(tj2.g.f117935a, "io.embrace.android.embracesdk.core");
        kVar.c(tj2.g.f117936b, "7.1.0");
        mj2.a a13 = mj2.a.a(bVar.a(), (String) kVar.f86945b);
        Intrinsics.checkNotNullExpressionValue(a13, "getDefault().toBuilder()…Version)\n        .build()");
        this.f112977b = a13;
        this.f112978c = xk2.m.b(new i(this, i13));
        this.f112979d = new ArrayList();
        this.f112980e = new ArrayList();
        this.f112981f = true;
        this.f112982g = new i(this, 0);
        this.f112983h = xk2.m.b(new fe2.a(29, spanSink, this));
        this.f112984i = xk2.m.b(new fe2.a(28, logSink, this));
    }
}
