package gh2;

import android.os.Build;
import gg2.f;
import gg2.h;
import io.embrace.android.embracesdk.internal.payload.EnvelopeResource;
import kh2.t2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nf2.o;
import th2.g;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final fh2.c f65033a;

    /* renamed from: b, reason: collision with root package name */
    public final gg2.a f65034b;

    /* renamed from: c, reason: collision with root package name */
    public final yf2.a f65035c;

    /* renamed from: d, reason: collision with root package name */
    public final t2 f65036d;

    /* renamed from: e, reason: collision with root package name */
    public final g f65037e;

    /* renamed from: f, reason: collision with root package name */
    public final nf2.b f65038f;

    /* renamed from: g, reason: collision with root package name */
    public final c f65039g;

    /* renamed from: h, reason: collision with root package name */
    public final f f65040h;

    public d(fh2.c hosted, gg2.a environment, yf2.a buildInfo, t2 packageVersionInfo, g appFramework, nf2.b deviceArchitecture, c device, f rnBundleIdTracker) {
        Intrinsics.checkNotNullParameter(hosted, "hosted");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        Intrinsics.checkNotNullParameter(packageVersionInfo, "packageVersionInfo");
        Intrinsics.checkNotNullParameter(appFramework, "appFramework");
        Intrinsics.checkNotNullParameter(deviceArchitecture, "deviceArchitecture");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(rnBundleIdTracker, "rnBundleIdTracker");
        this.f65033a = hosted;
        this.f65034b = environment;
        this.f65035c = buildInfo;
        this.f65036d = packageVersionInfo;
        this.f65037e = appFramework;
        this.f65038f = deviceArchitecture;
        this.f65039g = device;
        this.f65040h = rnBundleIdTracker;
    }

    public final EnvelopeResource a() {
        t2 t2Var = this.f65036d;
        String str = t2Var.f79707a;
        yf2.a aVar = this.f65035c;
        String str2 = aVar.f138996a;
        String value = this.f65034b.getValue();
        Integer intOrNull = StringsKt.toIntOrNull("53");
        fh2.c cVar = this.f65033a;
        String str3 = cVar.f62174d;
        uh2.b bVar = cVar.f62171a;
        if (str3 == null) {
            str3 = cVar.f62172b.k0(bVar);
        }
        String str4 = str3;
        String str5 = cVar.f62173c;
        if (str5 == null) {
            str5 = cVar.f62172b.l0(bVar);
        }
        String str6 = str5;
        h hVar = (h) this.f65040h;
        String str7 = (((sg2.b) hVar.f64990c).f112890o == g.REACT_NATIVE && hVar.f64993f.isDone()) ? (String) hVar.f64993f.get() : null;
        String str8 = cVar.f62176f;
        if (str8 == null) {
            str8 = cVar.f62172b.n0(bVar);
        }
        String str9 = str8;
        String str10 = cVar.f62175e;
        String o03 = str10 == null ? cVar.f62172b.o0(bVar) : str10;
        c cVar2 = this.f65039g;
        o oVar = cVar2.f65026c;
        String str11 = oVar.f90513f;
        this.f65038f.getClass();
        String str12 = Build.SUPPORTED_ABIS[0];
        Intrinsics.checkNotNullExpressionValue(str12, "Build.SUPPORTED_ABIS[0]");
        Boolean bool = cVar2.f65028e;
        long longValue = ((Number) cVar2.f65032i.getValue()).longValue();
        o oVar2 = cVar2.f65026c;
        return new EnvelopeResource(str, this.f65037e, str2, t2Var.f79709c, aVar.f138997b, aVar.f138998c, value, t2Var.f79708b, "7.1.0", intOrNull, str7, null, str9, str4, str6, o03, str11, oVar.f90514g, str12, bool, Long.valueOf(longValue), oVar2.f90509b, oVar2.f90508a, oVar2.f90511d, oVar2.f90512e, cVar2.f65029f, Integer.valueOf(cVar2.f65031h), 2048, null);
    }
}
