package xr0;

import com.pinterest.api.model.kz0;
import com.pinterest.api.model.wy0;
import h32.e3;
import kotlin.jvm.internal.Intrinsics;
import pb0.g;

/* loaded from: classes5.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f135671a;

    /* renamed from: b, reason: collision with root package name */
    public final String f135672b;

    /* renamed from: c, reason: collision with root package name */
    public final Short f135673c;

    /* renamed from: d, reason: collision with root package name */
    public final Short f135674d;

    /* renamed from: e, reason: collision with root package name */
    public final pb0.a f135675e;

    /* renamed from: f, reason: collision with root package name */
    public e3 f135676f;

    public a(wy0 wy0Var, String str, Short sh3, int i13) {
        g clock = g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f135671a = wy0Var;
        this.f135672b = str;
        this.f135673c = sh3;
        this.f135674d = null;
        this.f135675e = clock;
    }

    @Override // xr0.b
    public final e3 d0() {
        e3 e3Var = new e3(null, null, null, Long.valueOf(((g) this.f135675e).a()), null, null, null, null, null, null, null, null, null);
        this.f135676f = e3Var;
        return e3Var;
    }

    @Override // xr0.b
    public final e3 i1() {
        wy0 wy0Var;
        Short sh3;
        String str;
        String str2;
        String d2;
        String e13;
        e3 source = this.f135676f;
        if (source == null || (wy0Var = this.f135671a) == null) {
            return null;
        }
        this.f135676f = null;
        Intrinsics.checkNotNullParameter(source, "source");
        Long valueOf = Long.valueOf(((g) this.f135675e).a());
        String id3 = wy0Var.getId();
        kz0 y43 = wy0Var.y4();
        Short sh4 = source.f66974k;
        String str3 = source.f66975l;
        String str4 = source.f66976m;
        if (y43 != null) {
            Intrinsics.checkNotNullParameter(y43, "<this>");
            if (y43.f().intValue() != 0 || (((d2 = y43.d()) != null && d2.length() > 0) || ((e13 = y43.e()) != null && e13.length() > 0))) {
                Short valueOf2 = Short.valueOf((short) y43.f().intValue());
                String d13 = y43.d();
                str2 = y43.e();
                sh3 = valueOf2;
                str = d13;
                return new e3(id3, source.f66965b, source.f66966c, source.f66967d, valueOf, source.f66969f, this.f135674d, source.f66971h, this.f135673c, this.f135672b, sh3, str, str2);
            }
        }
        sh3 = sh4;
        str = str3;
        str2 = str4;
        return new e3(id3, source.f66965b, source.f66966c, source.f66967d, valueOf, source.f66969f, this.f135674d, source.f66971h, this.f135673c, this.f135672b, sh3, str, str2);
    }
}
