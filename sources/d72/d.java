package d72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import f0.h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import net.quikkly.android.utils.BitmapUtils;
import oo2.g;
import qo2.a0;
import qo2.f0;
import qo2.j1;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class d implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f53917a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f53918b;

    static {
        d dVar = new d();
        f53917a = dVar;
        y0 y0Var = new y0("com.pinterest.shuffles.data.entity.UserEntity", dVar, 22);
        y0Var.k("id", false);
        y0Var.k("username", false);
        y0Var.k("first_name", true);
        y0Var.k("last_name", true);
        y0Var.k("full_name", true);
        y0Var.k("email", true);
        y0Var.k("image_medium_url", true);
        y0Var.k("image_large_url", true);
        y0Var.k("image_xlarge_url", true);
        y0Var.k("is_employee", true);
        y0Var.k("shuffles_followed_by_me", true);
        y0Var.k("shuffles_following_me", true);
        y0Var.k("blocked_by_me", true);
        y0Var.k("shuffles_count", true);
        y0Var.k("shuffles_public_count", true);
        y0Var.k("shuffles_follower_count", true);
        y0Var.k("shuffles_followee_count", true);
        y0Var.k("about", true);
        y0Var.k("gender", true);
        y0Var.k("custom_gender", true);
        y0Var.k("age_in_years", true);
        y0Var.k("is_shuffles_private_profile", true);
        f53918b = y0Var;
    }

    @Override // no2.h, no2.a
    public final g a() {
        return f53918b;
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
        y0 y0Var = f53918b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f53919a, y0Var);
        b13.m(1, value.f53920b, y0Var);
        boolean j13 = b13.j(y0Var);
        String str = value.f53921c;
        if (j13 || str != null) {
            b13.A(y0Var, 2, j1.f104576a, str);
        }
        boolean j14 = b13.j(y0Var);
        String str2 = value.f53922d;
        if (j14 || str2 != null) {
            b13.A(y0Var, 3, j1.f104576a, str2);
        }
        boolean j15 = b13.j(y0Var);
        String str3 = value.f53923e;
        if (j15 || str3 != null) {
            b13.A(y0Var, 4, j1.f104576a, str3);
        }
        boolean j16 = b13.j(y0Var);
        String str4 = value.f53924f;
        if (j16 || str4 != null) {
            b13.A(y0Var, 5, j1.f104576a, str4);
        }
        boolean j17 = b13.j(y0Var);
        String str5 = value.f53925g;
        if (j17 || str5 != null) {
            b13.A(y0Var, 6, j1.f104576a, str5);
        }
        boolean j18 = b13.j(y0Var);
        String str6 = value.f53926h;
        if (j18 || str6 != null) {
            b13.A(y0Var, 7, j1.f104576a, str6);
        }
        boolean j19 = b13.j(y0Var);
        String str7 = value.f53927i;
        if (j19 || str7 != null) {
            b13.A(y0Var, 8, j1.f104576a, str7);
        }
        boolean j23 = b13.j(y0Var);
        boolean z13 = value.f53928j;
        if (j23 || z13) {
            b13.E(y0Var, 9, z13);
        }
        boolean j24 = b13.j(y0Var);
        boolean z14 = value.f53929k;
        if (j24 || z14) {
            b13.E(y0Var, 10, z14);
        }
        boolean j25 = b13.j(y0Var);
        boolean z15 = value.f53930l;
        if (j25 || z15) {
            b13.E(y0Var, 11, z15);
        }
        boolean j26 = b13.j(y0Var);
        boolean z16 = value.f53931m;
        if (j26 || z16) {
            b13.E(y0Var, 12, z16);
        }
        boolean j27 = b13.j(y0Var);
        Integer num = value.f53932n;
        if (j27 || num == null || num.intValue() != 0) {
            b13.A(y0Var, 13, f0.f104550a, num);
        }
        boolean j28 = b13.j(y0Var);
        Integer num2 = value.f53933o;
        if (j28 || num2 == null || num2.intValue() != 0) {
            b13.A(y0Var, 14, f0.f104550a, num2);
        }
        boolean j29 = b13.j(y0Var);
        Integer num3 = value.f53934p;
        if (j29 || num3 == null || num3.intValue() != 0) {
            b13.A(y0Var, 15, f0.f104550a, num3);
        }
        boolean j33 = b13.j(y0Var);
        Integer num4 = value.f53935q;
        if (j33 || num4 == null || num4.intValue() != 0) {
            b13.A(y0Var, 16, f0.f104550a, num4);
        }
        boolean j34 = b13.j(y0Var);
        String str8 = value.f53936r;
        if (j34 || str8 != null) {
            b13.A(y0Var, 17, j1.f104576a, str8);
        }
        boolean j35 = b13.j(y0Var);
        String str9 = value.f53937s;
        if (j35 || str9 != null) {
            b13.A(y0Var, 18, j1.f104576a, str9);
        }
        boolean j36 = b13.j(y0Var);
        String str10 = value.f53938t;
        if (j36 || str10 != null) {
            b13.A(y0Var, 19, j1.f104576a, str10);
        }
        boolean j37 = b13.j(y0Var);
        Integer num5 = value.f53939u;
        if (j37 || num5 == null || num5.intValue() != 0) {
            b13.A(y0Var, 20, f0.f104550a, num5);
        }
        boolean j38 = b13.j(y0Var);
        boolean z17 = value.f53940v;
        if (j38 || z17) {
            b13.E(y0Var, 21, z17);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        j1 j1Var = j1.f104576a;
        no2.b J2 = h.J(j1Var);
        no2.b J3 = h.J(j1Var);
        no2.b J4 = h.J(j1Var);
        no2.b J5 = h.J(j1Var);
        no2.b J6 = h.J(j1Var);
        no2.b J7 = h.J(j1Var);
        no2.b J8 = h.J(j1Var);
        f0 f0Var = f0.f104550a;
        no2.b J9 = h.J(f0Var);
        no2.b J10 = h.J(f0Var);
        no2.b J11 = h.J(f0Var);
        no2.b J12 = h.J(f0Var);
        no2.b J13 = h.J(j1Var);
        no2.b J14 = h.J(j1Var);
        no2.b J15 = h.J(j1Var);
        no2.b J16 = h.J(f0Var);
        qo2.g gVar = qo2.g.f104555a;
        return new no2.b[]{j1Var, j1Var, J2, J3, J4, J5, J6, J7, J8, gVar, gVar, gVar, gVar, J9, J10, J11, J12, J13, J14, J15, J16, gVar};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Integer num;
        Integer num2;
        Integer num3;
        String str;
        String str2;
        Integer num4;
        String str3;
        String str4;
        Integer num5;
        String str5;
        int i13;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f53918b;
        po2.a b13 = decoder.b(y0Var);
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Integer num10 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        int i14 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = true;
        boolean z18 = false;
        while (z17) {
            String str18 = str9;
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    num = num7;
                    str9 = str18;
                    z17 = false;
                    str8 = str8;
                    num8 = num8;
                    str10 = str10;
                    str17 = str17;
                    num10 = num10;
                    num7 = num;
                case 0:
                    num2 = num7;
                    num3 = num8;
                    str = str10;
                    str2 = str18;
                    num4 = num10;
                    str3 = str17;
                    str4 = str8;
                    str15 = b13.k(y0Var, 0);
                    i14 |= 1;
                    str10 = str;
                    str9 = str2;
                    str8 = str4;
                    num8 = num3;
                    num7 = num2;
                    str17 = str3;
                    num10 = num4;
                case 1:
                    num2 = num7;
                    num3 = num8;
                    str2 = str18;
                    num4 = num10;
                    str3 = str17;
                    str4 = str8;
                    str14 = b13.k(y0Var, 1);
                    i14 |= 2;
                    str9 = str2;
                    str8 = str4;
                    num8 = num3;
                    num7 = num2;
                    str17 = str3;
                    num10 = num4;
                case 2:
                    num2 = num7;
                    num3 = num8;
                    str = str10;
                    str2 = str18;
                    num4 = num10;
                    str3 = str17;
                    str4 = str8;
                    str16 = (String) b13.v(y0Var, 2, j1.f104576a, str16);
                    i14 |= 4;
                    str10 = str;
                    str9 = str2;
                    str8 = str4;
                    num8 = num3;
                    num7 = num2;
                    str17 = str3;
                    num10 = num4;
                case 3:
                    num = num7;
                    num5 = num8;
                    str17 = (String) b13.v(y0Var, 3, j1.f104576a, str17);
                    i14 |= 8;
                    str10 = str10;
                    str9 = str18;
                    num10 = num10;
                    num8 = num5;
                    num7 = num;
                case 4:
                    num = num7;
                    num5 = num8;
                    str9 = (String) b13.v(y0Var, 4, j1.f104576a, str18);
                    i14 |= 16;
                    str10 = str10;
                    num8 = num5;
                    num7 = num;
                case 5:
                    num = num7;
                    str10 = (String) b13.v(y0Var, 5, j1.f104576a, str10);
                    i14 |= 32;
                    str9 = str18;
                    num7 = num;
                case 6:
                    str5 = str10;
                    str11 = (String) b13.v(y0Var, 6, j1.f104576a, str11);
                    i14 |= 64;
                    str9 = str18;
                    str10 = str5;
                case 7:
                    str5 = str10;
                    str12 = (String) b13.v(y0Var, 7, j1.f104576a, str12);
                    i14 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    str9 = str18;
                    str10 = str5;
                case 8:
                    str5 = str10;
                    str13 = (String) b13.v(y0Var, 8, j1.f104576a, str13);
                    i14 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                    str9 = str18;
                    str10 = str5;
                case 9:
                    z13 = b13.h(y0Var, 9);
                    i14 |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                    str9 = str18;
                case 10:
                    z14 = b13.h(y0Var, 10);
                    i14 |= 1024;
                    str9 = str18;
                case 11:
                    z15 = b13.h(y0Var, 11);
                    i14 |= 2048;
                    str9 = str18;
                case 12:
                    z16 = b13.h(y0Var, 12);
                    i14 |= 4096;
                    str9 = str18;
                case 13:
                    str5 = str10;
                    num6 = (Integer) b13.v(y0Var, 13, f0.f104550a, num6);
                    i14 |= 8192;
                    str9 = str18;
                    str10 = str5;
                case 14:
                    str5 = str10;
                    num9 = (Integer) b13.v(y0Var, 14, f0.f104550a, num9);
                    i14 |= 16384;
                    str9 = str18;
                    str10 = str5;
                case 15:
                    str5 = str10;
                    num8 = (Integer) b13.v(y0Var, 15, f0.f104550a, num8);
                    i13 = 32768;
                    i14 |= i13;
                    str9 = str18;
                    str10 = str5;
                case 16:
                    str5 = str10;
                    num7 = (Integer) b13.v(y0Var, 16, f0.f104550a, num7);
                    i13 = 65536;
                    i14 |= i13;
                    str9 = str18;
                    str10 = str5;
                case 17:
                    str5 = str10;
                    str7 = (String) b13.v(y0Var, 17, j1.f104576a, str7);
                    i13 = 131072;
                    i14 |= i13;
                    str9 = str18;
                    str10 = str5;
                case 18:
                    str5 = str10;
                    str6 = (String) b13.v(y0Var, 18, j1.f104576a, str6);
                    i13 = 262144;
                    i14 |= i13;
                    str9 = str18;
                    str10 = str5;
                case 19:
                    str5 = str10;
                    str8 = (String) b13.v(y0Var, 19, j1.f104576a, str8);
                    i13 = 524288;
                    i14 |= i13;
                    str9 = str18;
                    str10 = str5;
                case 20:
                    str5 = str10;
                    num10 = (Integer) b13.v(y0Var, 20, f0.f104550a, num10);
                    i13 = 1048576;
                    i14 |= i13;
                    str9 = str18;
                    str10 = str5;
                case 21:
                    z18 = b13.h(y0Var, 21);
                    i14 |= 2097152;
                    str9 = str18;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        Integer num11 = num8;
        Integer num12 = num10;
        String str19 = str17;
        String str20 = str8;
        String str21 = str16;
        b13.a(y0Var);
        return new f(i14, str15, str14, str21, str19, str9, str10, str11, str12, str13, z13, z14, z15, z16, num6, num9, num11, num7, str7, str6, str20, num12, z18);
    }
}
