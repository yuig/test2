package f72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public final class y implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y f61413a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61414b;

    static {
        y yVar = new y();
        f61413a = yVar;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.ShuffleFontEntity", yVar, 10);
        y0Var.k("id", false);
        y0Var.k("letter_spacing", false);
        y0Var.k("name", false);
        y0Var.k("min_size", false);
        y0Var.k("max_size", false);
        y0Var.k("line_height", false);
        y0Var.k("url", false);
        y0Var.k("offset", false);
        y0Var.k("default_size", false);
        y0Var.k("key", false);
        f61414b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61414b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        a0 value = (a0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f61414b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f61222a, y0Var);
        b13.v(y0Var, 1, value.f61223b);
        b13.m(2, value.f61224c, y0Var);
        b13.v(y0Var, 3, value.f61225d);
        b13.v(y0Var, 4, value.f61226e);
        b13.v(y0Var, 5, value.f61227f);
        b13.m(6, value.f61228g, y0Var);
        b13.v(y0Var, 7, value.f61229h);
        b13.v(y0Var, 8, value.f61230i);
        b13.m(9, value.f61231j, y0Var);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        qo2.j1 j1Var = qo2.j1.f104576a;
        qo2.z zVar = qo2.z.f104669a;
        return new no2.b[]{j1Var, zVar, j1Var, zVar, zVar, zVar, j1Var, zVar, zVar, j1Var};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61414b;
        po2.a b13 = decoder.b(y0Var);
        int i13 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        boolean z13 = true;
        while (z13) {
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    z13 = false;
                    break;
                case 0:
                    str = b13.k(y0Var, 0);
                    i13 |= 1;
                    break;
                case 1:
                    f13 = b13.n(y0Var, 1);
                    i13 |= 2;
                    break;
                case 2:
                    str2 = b13.k(y0Var, 2);
                    i13 |= 4;
                    break;
                case 3:
                    f14 = b13.n(y0Var, 3);
                    i13 |= 8;
                    break;
                case 4:
                    f15 = b13.n(y0Var, 4);
                    i13 |= 16;
                    break;
                case 5:
                    f16 = b13.n(y0Var, 5);
                    i13 |= 32;
                    break;
                case 6:
                    str3 = b13.k(y0Var, 6);
                    i13 |= 64;
                    break;
                case 7:
                    f17 = b13.n(y0Var, 7);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    break;
                case 8:
                    f18 = b13.n(y0Var, 8);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                    break;
                case 9:
                    str4 = b13.k(y0Var, 9);
                    i13 |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new a0(i13, str, f13, str2, f14, f15, f16, str3, f17, f18, str4);
    }
}
