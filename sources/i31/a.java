package i31;

import an1.r;
import bm1.m;
import cn1.d0;
import cn1.n;
import cn1.y;
import com.pinterest.navigation.Navigation;
import java.util.ArrayList;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.f;
import rm1.i;
import rm1.q;
import u50.k0;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71464i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f71465j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(boolean z13, int i13) {
        super(1);
        this.f71464i = i13;
        this.f71465j = z13;
    }

    public final om1.c b(om1.c it) {
        int i13 = this.f71464i;
        boolean z13 = this.f71465j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, d7.b.Z(z13), null, false, 0, 1015);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, d7.b.Z(z13), null, false, 0, 1015);
            case 27:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, z13 ? q.ARROW_BACK : q.CANCEL, null, null, null, null, false, 0, 1022);
            case 28:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, d7.b.Z(z13), null, false, 0, 1015);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, null, null, this.f71465j, 0, 991);
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f71464i;
        boolean z13 = this.f71465j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, e0.b(vn1.b.START), null, null, 0, d7.b.Z(!z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097083);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, e0.b(z13 ? vn1.b.CENTER : vn1.b.START), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097147);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, z13 ? new rm1.d(new f(q.CHECK_CIRCLE_FILL, i.XS), rm1.c.BRAND, null, 0, null, 28) : null, null, false, 0, null, null, null, null, null, false, null, null, 2096895);
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, z13 ? new rm1.d(new f(q.CHECK_CIRCLE_FILL, i.XS), rm1.c.INFO, null, 0, null, 28) : null, null, false, 0, null, null, null, null, null, false, null, null, 2096895);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, z13 ? rn1.b.START : rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2097023);
        }
    }

    public final yl1.b f(yl1.b it) {
        int i13 = this.f71464i;
        boolean z13 = this.f71465j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f71465j, null, null, null, null, null, null, 0, null, 1021);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z14 = this.f71465j;
                return yl1.b.f(it, null, z14, null, null, (z14 ? yl1.d.PRIMARY : yl1.d.SECONDARY).getColorPalette(), null, null, null, 0, null, 1005);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, d7.b.Z(z13), null, null, null, null, null, 0, null, 1019);
            case 4:
            case 5:
            case 6:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z15 = this.f71465j;
                return yl1.b.f(it, null, z15, null, null, (z15 ? yl1.d.PRIMARY : yl1.d.SECONDARY).getColorPalette(), null, null, null, 0, null, 1005);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, d7.b.Z(z13), null, null, null, null, null, 0, null, 1019);
        }
    }

    public final void h(d0 bind) {
        int i13 = this.f71464i;
        boolean z13 = this.f71465j;
        switch (i13) {
            case 17:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                fm1.c visibility = d7.b.Z(z13);
                bind.getClass();
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                bind.f28178h = visibility;
                break;
            case 18:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                q qVar = q.MICROPHONE;
                int i14 = k42.f.content_description_button_voice_search;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                bind.f28174d = z13 ? new cn1.f(new k0(i14, new ArrayList(0)), qVar) : null;
                break;
            case 19:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                fm1.c visibility2 = d7.b.Z(z13);
                bind.getClass();
                Intrinsics.checkNotNullParameter(visibility2, "visibility");
                bind.f28178h = visibility2;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                q qVar2 = q.MICROPHONE;
                int i15 = k42.f.content_description_button_voice_search;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                bind.f28174d = z13 ? new cn1.f(new k0(i15, new ArrayList(0)), qVar2) : null;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cn1.f fVar;
        int i13 = this.f71464i;
        boolean z13 = this.f71465j;
        switch (i13) {
            case 4:
                y it = (y) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 11:
                rm1.d it2 = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 13:
                Navigation navigateToBoard = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                navigateToBoard.Y1("com.pinterest.EXTRA_BOARD_SHOW_SENSITIVITY_SCREEN", z13);
                break;
            case 14:
                r bind = (r) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f15760b = z13;
                bind.f15759a = true;
                break;
            case 15:
                m it3 = (m) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                break;
            case 17:
                h((d0) obj);
                break;
            case 18:
                h((d0) obj);
                break;
            case 19:
                h((d0) obj);
                break;
            case 20:
                h((d0) obj);
                break;
            case 26:
                n bind2 = (n) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                if (z13) {
                    q qVar = q.CAMERA;
                    int i14 = k42.f.content_description_camera_visual_search;
                    String[] formatArgs = new String[0];
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    fVar = new cn1.f(new k0(i14, new ArrayList(0)), qVar);
                } else {
                    fVar = null;
                }
                bind2.f28214f = fVar;
                break;
        }
        return b((om1.c) obj);
    }
}
