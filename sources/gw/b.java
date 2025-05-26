package gw;

import bj.l;
import h32.i0;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pb0.g;
import wi.r;

/* loaded from: classes3.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f66179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f66180c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f66181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f66182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f66183f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f66184g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function0 f66185h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f66186i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kl2.l f66187j;

    public /* synthetic */ b(f fVar, ew.e eVar, yv.b bVar, long j13, i0 i0Var, yv.d dVar, yv.d dVar2, yv.a aVar, yv.c cVar, int i13) {
        this.f66178a = i13;
        this.f66179b = fVar;
        this.f66180c = eVar;
        this.f66181d = bVar;
        this.f66182e = j13;
        this.f66183f = i0Var;
        this.f66184g = dVar;
        this.f66185h = dVar2;
        this.f66186i = aVar;
        this.f66187j = cVar;
    }

    public final void a(r adError) {
        int i13 = this.f66178a;
        kl2.l lVar = this.f66187j;
        i0 i0Var = this.f66183f;
        long j13 = this.f66182e;
        f fVar = this.f66179b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(adError, "adError");
                Objects.toString(adError);
                fVar.getClass();
                String str = adError.f129982b;
                ((g) fVar.f66197a).getClass();
                lVar.invoke(str, Long.valueOf(System.currentTimeMillis() - j13), i0Var);
                Intrinsics.checkNotNullParameter(adError, "adError");
                break;
            default:
                Intrinsics.checkNotNullParameter(adError, "adError");
                Objects.toString(adError);
                fVar.getClass();
                String str2 = adError.f129982b;
                ((g) fVar.f66197a).getClass();
                lVar.invoke(str2, Long.valueOf(System.currentTimeMillis() - j13), i0Var);
                break;
        }
    }
}
