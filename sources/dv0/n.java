package dv0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.wn0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import o82.l0;
import y01.a0;
import y01.f0;
import y01.h0;

/* loaded from: classes5.dex */
public final class n extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56369i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f56370j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(boolean z13, int i13) {
        super(1);
        this.f56369i = i13;
        this.f56370j = z13;
    }

    public final om1.c b(om1.c it) {
        int i13 = this.f56369i;
        boolean z13 = this.f56370j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, null, null, this.f56370j, 0, 991);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, d7.b.Z(z13), null, false, 0, 1015);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, d7.b.Z(z13), null, false, 0, 1015);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, z13 ? om1.f.TRANSPARENT_ALWAYS_LIGHT : om1.f.TRANSPARENT_DARK_GRAY, null, null, false, 0, 1019);
        }
    }

    public final on1.b e(on1.b it) {
        switch (this.f56369i) {
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, this.f56370j, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, false, false, d7.b.Z(this.f56370j), 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
        }
    }

    public final rm1.d f(rm1.d it) {
        int i13 = this.f56369i;
        boolean z13 = this.f56370j;
        switch (i13) {
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, null, null, d7.b.Z(!z13), 0, null, 27);
            case 22:
                Intrinsics.checkNotNullParameter(it, "icon");
                return rm1.d.e(it, new rm1.f(rm1.q.PLAY, rm1.i.XXL), rm1.c.LIGHT, z13 ? fm1.c.VISIBLE : fm1.c.GONE, 0, null, 24);
            default:
                Intrinsics.checkNotNullParameter(it, "icon");
                return rm1.d.e(it, new rm1.f(rm1.q.PAUSE, rm1.i.XXL), rm1.c.LIGHT, z13 ? fm1.c.VISIBLE : fm1.c.GONE, 0, null, 24);
        }
    }

    public final rn1.a h(rn1.a it) {
        int i13 = this.f56369i;
        boolean z13 = this.f56370j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
    }

    public final h0 i(h0 it) {
        int i13 = this.f56369i;
        boolean z13 = this.f56370j;
        switch (i13) {
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return h0.e(it, null, new f0(z13), 1);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return h0.e(it, null, new a0(z13), 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f56369i;
        boolean z13 = this.f56370j;
        switch (i13) {
            case 0:
                ln0 data = (ln0) obj;
                Intrinsics.checkNotNullParameter(data, "data");
                return ln0.a(data, wn0.a(data.getMetadata(), null, null, null, null, this.f56370j, null, RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO), null, null, null, null, null, false, null, null, null, null, 16381);
            case 1:
                return j((yl1.b) obj);
            case 2:
                qm1.l bind = (qm1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f104407d = z13;
                return Unit.f80348a;
            case 3:
                return h((rn1.a) obj);
            case 4:
                return b((om1.c) obj);
            case 5:
                return j((yl1.b) obj);
            case 6:
                return b((om1.c) obj);
            case 7:
                return j((yl1.b) obj);
            case 8:
                zw0.b it = (zw0.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return zw0.b.e(it, null, z13, 63);
            case 9:
                dx0.f it2 = (dx0.f) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return dx0.f.e(it2, null, z13, 0, 1919);
            case 10:
                return b((om1.c) obj);
            case 11:
                return j((yl1.b) obj);
            case 12:
                return j((yl1.b) obj);
            case 13:
                return b((om1.c) obj);
            case 14:
                return h((rn1.a) obj);
            case 15:
                return i((h0) obj);
            case 16:
                return i((h0) obj);
            case 17:
                return j((yl1.b) obj);
            case 18:
                return j((yl1.b) obj);
            case 19:
                return e((on1.b) obj);
            case 20:
                return e((on1.b) obj);
            case 21:
                return f((rm1.d) obj);
            case 22:
                return f((rm1.d) obj);
            case 23:
                return f((rm1.d) obj);
            case 24:
                return h((rn1.a) obj);
            case 25:
                return j((yl1.b) obj);
            case 26:
                return h((rn1.a) obj);
            case 27:
                return h((rn1.a) obj);
            case 28:
                return h((rn1.a) obj);
            default:
                b22.d pinListWithBookmark = (b22.d) obj;
                Intrinsics.checkNotNullParameter(pinListWithBookmark, "pinListWithBookmark");
                List list = pinListWithBookmark.f21289a;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new h31.f((f30) it3.next(), z13));
                }
                return new l0(arrayList, pinListWithBookmark.f21290b);
        }
    }

    public final yl1.b j(yl1.b it) {
        int i13 = this.f56369i;
        boolean z13 = this.f56370j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f56370j, null, null, null, null, null, null, 0, null, 1021);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f56370j, null, null, null, null, null, null, 0, null, 1021);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f56370j, null, null, null, null, null, null, 0, null, 1021);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, !z13, null, null, z13 ? yl1.i.b() : yl1.i.a(), null, null, null, 0, null, 1005);
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f56370j, null, null, null, null, null, null, 0, null, 1021);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, d7.b.Z(z13), null, null, null, null, null, 0, null, 1019);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, d7.b.Z(z13), null, null, null, null, null, 0, null, 1019);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, z13 ? bs1.c.j2(new String[0], x0.following) : bs1.c.j2(new String[0], x0.follow), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }
}
