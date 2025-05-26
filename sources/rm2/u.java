package rm2;

import am2.x0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class u implements nn2.l {

    /* renamed from: b, reason: collision with root package name */
    public final gn2.b f108793b;

    /* renamed from: c, reason: collision with root package name */
    public final gn2.b f108794c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f108795d;

    public u(f0 kotlinClass, tm2.e0 packageProto, xm2.h nameResolver, nn2.k abiStability) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        fm2.c cVar = (fm2.c) kotlinClass;
        gn2.b className = gn2.b.b(gm2.d.a(cVar.f62576a));
        Intrinsics.checkNotNullExpressionValue(className, "byClassId(...)");
        sm2.c cVar2 = cVar.f62577b;
        gn2.b bVar = null;
        String str = cVar2.f113274a == sm2.b.MULTIFILE_CLASS_PART ? cVar2.f113279f : null;
        if (str != null && str.length() > 0) {
            bVar = gn2.b.d(str);
        }
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.f108793b = className;
        this.f108794c = bVar;
        this.f108795d = kotlinClass;
        zm2.s packageModuleName = wm2.l.f130426m;
        Intrinsics.checkNotNullExpressionValue(packageModuleName, "packageModuleName");
        Integer num = (Integer) ao2.m0.w(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.c(num.intValue());
        }
    }

    @Override // nn2.l
    public final String a() {
        return "Class '" + c().b().b() + '\'';
    }

    @Override // am2.w0
    public final void b() {
        org.chromium.net.y NO_SOURCE_FILE = x0.Tm;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
    }

    public final ym2.b c() {
        ym2.c cVar;
        String str = this.f108793b.f65812a;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            cVar = ym2.c.f139466c;
            if (cVar == null) {
                gn2.b.a(7);
                throw null;
            }
        } else {
            cVar = new ym2.c(str.substring(0, lastIndexOf).replace('/', '.'));
        }
        return new ym2.b(cVar, e());
    }

    public final gn2.b d() {
        return this.f108794c;
    }

    public final ym2.g e() {
        String f13 = this.f108793b.f();
        Intrinsics.checkNotNullExpressionValue(f13, "getInternalName(...)");
        ym2.g e13 = ym2.g.e(StringsKt.b0('/', f13, f13));
        Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
        return e13;
    }

    public final String toString() {
        return u.class.getSimpleName() + ": " + this.f108793b;
    }
}
