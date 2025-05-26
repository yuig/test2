package e72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import net.quikkly.android.utils.BitmapUtils;
import qo2.j1;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class d implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f57629a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f57630b;

    static {
        d dVar = new d();
        f57629a = dVar;
        y0 y0Var = new y0("com.pinterest.shuffles.data.entity.pinterest.PinEntity", dVar, 15);
        y0Var.k("id", false);
        y0Var.k("image_signature", true);
        y0Var.k("title", true);
        y0Var.k("link", true);
        y0Var.k("cacheable_id", true);
        y0Var.k("images", true);
        y0Var.k("pinner", true);
        y0Var.k("origin_pinner", true);
        y0Var.k("native_creator", true);
        y0Var.k("rich_summary", true);
        y0Var.k("rich_metadata", true);
        y0Var.k("product_pin_data", true);
        y0Var.k("link_domain", true);
        y0Var.k("grid_title", true);
        y0Var.k("shuffle_asset", true);
        f57630b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f57630b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        f value = (f) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f57630b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f57637a, y0Var);
        boolean j13 = b13.j(y0Var);
        String str = value.f57638b;
        if (j13 || str != null) {
            b13.A(y0Var, 1, j1.f104576a, str);
        }
        boolean j14 = b13.j(y0Var);
        String str2 = value.f57639c;
        if (j14 || str2 != null) {
            b13.A(y0Var, 2, j1.f104576a, str2);
        }
        boolean j15 = b13.j(y0Var);
        String str3 = value.f57640d;
        if (j15 || str3 != null) {
            b13.A(y0Var, 3, j1.f104576a, str3);
        }
        boolean j16 = b13.j(y0Var);
        String str4 = value.f57641e;
        if (j16 || str4 != null) {
            b13.A(y0Var, 4, j1.f104576a, str4);
        }
        boolean j17 = b13.j(y0Var);
        f72.i iVar = value.f57642f;
        if (j17 || iVar != null) {
            b13.A(y0Var, 5, f72.g.f61249a, iVar);
        }
        boolean j18 = b13.j(y0Var);
        i iVar2 = value.f57643g;
        if (j18 || iVar2 != null) {
            b13.A(y0Var, 6, g.f57652a, iVar2);
        }
        boolean j19 = b13.j(y0Var);
        i iVar3 = value.f57644h;
        if (j19 || iVar3 != null) {
            b13.A(y0Var, 7, g.f57652a, iVar3);
        }
        boolean j23 = b13.j(y0Var);
        i iVar4 = value.f57645i;
        if (j23 || iVar4 != null) {
            b13.A(y0Var, 8, g.f57652a, iVar4);
        }
        boolean j24 = b13.j(y0Var);
        u uVar = value.f57646j;
        if (j24 || uVar != null) {
            b13.A(y0Var, 9, s.f57686a, uVar);
        }
        boolean j25 = b13.j(y0Var);
        r rVar = value.f57647k;
        if (j25 || rVar != null) {
            b13.A(y0Var, 10, p.f57683a, rVar);
        }
        boolean j26 = b13.j(y0Var);
        o oVar = value.f57648l;
        if (j26 || oVar != null) {
            b13.A(y0Var, 11, m.f57678a, oVar);
        }
        boolean j27 = b13.j(y0Var);
        c cVar = value.f57649m;
        if (j27 || cVar != null) {
            b13.A(y0Var, 12, a.f57622a, cVar);
        }
        boolean j28 = b13.j(y0Var);
        String str5 = value.f57650n;
        if (j28 || str5 != null) {
            b13.A(y0Var, 13, j1.f104576a, str5);
        }
        boolean j29 = b13.j(y0Var);
        f72.r rVar2 = value.f57651o;
        if (j29 || rVar2 != null) {
            b13.A(y0Var, 14, f72.p.f61330a, rVar2);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        j1 j1Var = j1.f104576a;
        no2.b J2 = f0.h.J(j1Var);
        no2.b J3 = f0.h.J(j1Var);
        no2.b J4 = f0.h.J(j1Var);
        no2.b J5 = f0.h.J(j1Var);
        no2.b J6 = f0.h.J(f72.g.f61249a);
        g gVar = g.f57652a;
        return new no2.b[]{j1Var, J2, J3, J4, J5, J6, f0.h.J(gVar), f0.h.J(gVar), f0.h.J(gVar), f0.h.J(s.f57686a), f0.h.J(p.f57683a), f0.h.J(m.f57678a), f0.h.J(a.f57622a), f0.h.J(j1Var), f0.h.J(f72.p.f61330a)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        String str;
        c cVar;
        o oVar;
        f72.r rVar;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f57630b;
        po2.a b13 = decoder.b(y0Var);
        u uVar = null;
        c cVar2 = null;
        o oVar2 = null;
        r rVar2 = null;
        String str4 = null;
        f72.r rVar3 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        f72.i iVar = null;
        i iVar2 = null;
        i iVar3 = null;
        i iVar4 = null;
        String str8 = null;
        String str9 = null;
        int i13 = 0;
        boolean z13 = true;
        while (z13) {
            String str10 = str5;
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    str6 = str6;
                    z13 = false;
                    rVar3 = rVar3;
                    cVar2 = cVar2;
                    str5 = str10;
                    oVar2 = oVar2;
                case 0:
                    cVar = cVar2;
                    oVar = oVar2;
                    rVar = rVar3;
                    str2 = str6;
                    str3 = str10;
                    str8 = b13.k(y0Var, 0);
                    i13 |= 1;
                    str6 = str2;
                    str5 = str3;
                    rVar3 = rVar;
                    oVar2 = oVar;
                    cVar2 = cVar;
                case 1:
                    cVar = cVar2;
                    oVar = oVar2;
                    str2 = str6;
                    str3 = str10;
                    rVar = rVar3;
                    str9 = (String) b13.v(y0Var, 1, j1.f104576a, str9);
                    i13 |= 2;
                    str6 = str2;
                    str5 = str3;
                    rVar3 = rVar;
                    oVar2 = oVar;
                    cVar2 = cVar;
                case 2:
                    cVar = cVar2;
                    oVar = oVar2;
                    str5 = (String) b13.v(y0Var, 2, j1.f104576a, str10);
                    i13 |= 4;
                    str6 = str6;
                    oVar2 = oVar;
                    cVar2 = cVar;
                case 3:
                    cVar = cVar2;
                    str6 = (String) b13.v(y0Var, 3, j1.f104576a, str6);
                    i13 |= 8;
                    str5 = str10;
                    cVar2 = cVar;
                case 4:
                    str = str6;
                    str7 = (String) b13.v(y0Var, 4, j1.f104576a, str7);
                    i13 |= 16;
                    str5 = str10;
                    str6 = str;
                case 5:
                    str = str6;
                    iVar = (f72.i) b13.v(y0Var, 5, f72.g.f61249a, iVar);
                    i13 |= 32;
                    str5 = str10;
                    str6 = str;
                case 6:
                    str = str6;
                    iVar2 = (i) b13.v(y0Var, 6, g.f57652a, iVar2);
                    i13 |= 64;
                    str5 = str10;
                    str6 = str;
                case 7:
                    str = str6;
                    iVar3 = (i) b13.v(y0Var, 7, g.f57652a, iVar3);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    str5 = str10;
                    str6 = str;
                case 8:
                    str = str6;
                    iVar4 = (i) b13.v(y0Var, 8, g.f57652a, iVar4);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                    str5 = str10;
                    str6 = str;
                case 9:
                    str = str6;
                    uVar = (u) b13.v(y0Var, 9, s.f57686a, uVar);
                    i13 |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                    str5 = str10;
                    str6 = str;
                case 10:
                    str = str6;
                    rVar2 = (r) b13.v(y0Var, 10, p.f57683a, rVar2);
                    i13 |= 1024;
                    str5 = str10;
                    str6 = str;
                case 11:
                    str = str6;
                    oVar2 = (o) b13.v(y0Var, 11, m.f57678a, oVar2);
                    i13 |= 2048;
                    str5 = str10;
                    str6 = str;
                case 12:
                    str = str6;
                    cVar2 = (c) b13.v(y0Var, 12, a.f57622a, cVar2);
                    i13 |= 4096;
                    str5 = str10;
                    str6 = str;
                case 13:
                    str = str6;
                    str4 = (String) b13.v(y0Var, 13, j1.f104576a, str4);
                    i13 |= 8192;
                    str5 = str10;
                    str6 = str;
                case 14:
                    str = str6;
                    rVar3 = (f72.r) b13.v(y0Var, 14, f72.p.f61330a, rVar3);
                    i13 |= 16384;
                    str5 = str10;
                    str6 = str;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        o oVar3 = oVar2;
        f72.r rVar4 = rVar3;
        String str11 = str9;
        b13.a(y0Var);
        return new f(i13, str8, str11, str5, str6, str7, iVar, iVar2, iVar3, iVar4, uVar, rVar2, oVar3, cVar2, str4, rVar4);
    }
}
