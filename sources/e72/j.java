package e72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import net.quikkly.android.utils.BitmapUtils;
import qo2.f0;
import qo2.j1;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class j implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j f57662a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f57663b;

    static {
        j jVar = new j();
        f57662a = jVar;
        y0 y0Var = new y0("com.pinterest.shuffles.data.entity.pinterest.ProductDataEntity", jVar, 14);
        y0Var.k("currency", false);
        y0Var.k("display_price", false);
        y0Var.k("type", false);
        y0Var.k("display_sale_price", false);
        y0Var.k("display_active_price", false);
        y0Var.k("active_price", false);
        y0Var.k("swatch_image", false);
        y0Var.k("max_quantity", false);
        y0Var.k("additional_images_length", false);
        y0Var.k("discount_percent", false);
        y0Var.k("sale_price", false);
        y0Var.k("price", false);
        y0Var.k("availability", false);
        y0Var.k("item_id", false);
        f57663b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f57663b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        l value = (l) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f57663b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f57664a, y0Var);
        b13.m(1, value.f57665b, y0Var);
        b13.m(2, value.f57666c, y0Var);
        j1 j1Var = j1.f104576a;
        b13.A(y0Var, 3, j1Var, value.f57667d);
        b13.m(4, value.f57668e, y0Var);
        b13.m(5, value.f57669f, y0Var);
        b13.A(y0Var, 6, j1Var, value.f57670g);
        b13.D(7, value.f57671h, y0Var);
        b13.D(8, value.f57672i, y0Var);
        b13.A(y0Var, 9, j1Var, value.f57673j);
        b13.A(y0Var, 10, j1Var, value.f57674k);
        b13.m(11, value.f57675l, y0Var);
        b13.D(12, value.f57676m, y0Var);
        b13.m(13, value.f57677n, y0Var);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        j1 j1Var = j1.f104576a;
        no2.b J2 = f0.h.J(j1Var);
        no2.b J3 = f0.h.J(j1Var);
        no2.b J4 = f0.h.J(j1Var);
        no2.b J5 = f0.h.J(j1Var);
        f0 f0Var = f0.f104550a;
        return new no2.b[]{j1Var, j1Var, j1Var, J2, j1Var, j1Var, J3, f0Var, f0Var, J4, J5, j1Var, f0Var, j1Var};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f57663b;
        po2.a b13 = decoder.b(y0Var);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z13 = true;
        int i16 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    z13 = false;
                    break;
                case 0:
                    str3 = b13.k(y0Var, 0);
                    i13 |= 1;
                    break;
                case 1:
                    str4 = b13.k(y0Var, 1);
                    i13 |= 2;
                    break;
                case 2:
                    str5 = b13.k(y0Var, 2);
                    i13 |= 4;
                    break;
                case 3:
                    str6 = (String) b13.v(y0Var, 3, j1.f104576a, str6);
                    i13 |= 8;
                    break;
                case 4:
                    str7 = b13.k(y0Var, 4);
                    i13 |= 16;
                    break;
                case 5:
                    str8 = b13.k(y0Var, 5);
                    i13 |= 32;
                    break;
                case 6:
                    str9 = (String) b13.v(y0Var, 6, j1.f104576a, str9);
                    i13 |= 64;
                    break;
                case 7:
                    i14 = b13.D(y0Var, 7);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    break;
                case 8:
                    i15 = b13.D(y0Var, 8);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                    break;
                case 9:
                    str = (String) b13.v(y0Var, 9, j1.f104576a, str);
                    i13 |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                    break;
                case 10:
                    str2 = (String) b13.v(y0Var, 10, j1.f104576a, str2);
                    i13 |= 1024;
                    break;
                case 11:
                    str10 = b13.k(y0Var, 11);
                    i13 |= 2048;
                    break;
                case 12:
                    i16 = b13.D(y0Var, 12);
                    i13 |= 4096;
                    break;
                case 13:
                    str11 = b13.k(y0Var, 13);
                    i13 |= 8192;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new l(i13, str3, str4, str5, str6, str7, str8, str9, i14, i15, str, str2, str10, i16, str11);
    }
}
