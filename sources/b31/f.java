package b31;

import cn1.d0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import u50.f0;
import u50.h0;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21436i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f21437j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(String str, int i13) {
        super(1);
        this.f21436i = i13;
        this.f21437j = str;
    }

    public final rn1.a b(rn1.a it) {
        i0 i0Var = h0.f120562a;
        int i13 = this.f21436i;
        String str = this.f21437j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 1:
            case 5:
            case 6:
            case 10:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
            default:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 2:
                f0 p13 = jq.b.p(it, "it", str, "string", str);
                fm1.c Z = d7.b.Z(!z.j(str));
                int i14 = nz1.f.content_description_header_fullname;
                String[] formatArgs = {str};
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(new f0(formatArgs[0]));
                return rn1.a.y(it, p13, null, null, null, null, 0, Z, null, null, null, false, 0, new k0(i14, arrayList), null, null, null, null, false, null, null, 2092990);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, d7.b.Z(str.length() > 0), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                if (str.length() > 0) {
                    i0Var = bs1.c.h2(str);
                }
                return rn1.a.y(it, i0Var, null, null, null, null, 0, str.length() > 0 ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                if (str != null) {
                    i0Var = bs1.c.p2(str);
                }
                return rn1.a.y(it, i0Var, null, null, null, null, 0, d7.b.Z(!(str == null || z.j(str))), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, bs1.c.j2(new String[]{str}, i42.c.content_description_search_box_with_query), null, null, null, null, false, null, null, 2093052);
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, null, null, null, null, false, 0, bs1.c.j2(new String[]{str}, n42.e.content_description_search_typeahead), null, null, null, null, false, null, null, 2093054);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, z.j(str) ^ true ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, ep.b.x(str, "string", str), null, null, e0.b(vn1.e.REGULAR), vn1.g.HEADING_200, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097126);
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, ep.b.x(str, "string", str), null, null, e0.b(vn1.e.REGULAR), vn1.g.HEADING_200, 2, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097094);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, ep.b.x(str, "string", str), null, null, e0.b(vn1.e.REGULAR), vn1.g.HEADING_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097126);
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                if (str != null) {
                    i0Var = new f0(str);
                }
                return rn1.a.y(it, i0Var, null, null, null, null, 0, (str == null || z.j(str)) ? fm1.c.GONE : fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 26:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 27:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, vn1.g.BODY_300, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097070);
        }
    }

    public final yl1.b e(yl1.b it) {
        int i13 = this.f21436i;
        String string = this.f21437j;
        switch (i13) {
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(string), false, null, null, null, null, null, null, 0, null, 1022);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(string), false, null, null, null, null, null, null, 0, null, 1022);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(string, "string");
                return yl1.b.f(it, new f0(string), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(string == null ? "" : string), false, d7.b.Z(true ^ (string == null || string.length() == 0)), null, null, null, null, null, 0, null, 1018);
        }
    }

    public final void f(d0 bind) {
        int i13 = this.f21436i;
        String string = this.f21437j;
        switch (i13) {
            case 14:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(string);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                Intrinsics.checkNotNullParameter(string, "string");
                f0 text = new f0(string);
                bind.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                bind.f28171a = text;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f21436i;
        String str = this.f21437j;
        switch (i13) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                ao1.b it = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(str), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, Integer.valueOf(str.length()), null, null, null, null, 0, 4161534);
            case 2:
                return b((rn1.a) obj);
            case 3:
                return b((rn1.a) obj);
            case 4:
                return b((rn1.a) obj);
            case 5:
                un1.c it2 = (un1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (str == null) {
                    str = "";
                }
                return un1.c.y(it2, bs1.c.p2(str), null, 0, fm1.c.VISIBLE, false, null, null, 0, null, false, 524222);
            case 6:
                rm1.d it3 = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return rm1.d.e(it3, null, null, d7.b.Z(str.length() > 0), 0, null, 27);
            case 7:
                return b((rn1.a) obj);
            case 8:
                return b((rn1.a) obj);
            case 9:
                return b((rn1.a) obj);
            case 10:
                return e((yl1.b) obj);
            case 11:
                return b((rn1.a) obj);
            case 12:
                return b((rn1.a) obj);
            case 13:
                return e((yl1.b) obj);
            case 14:
                f((d0) obj);
                return Unit.f80348a;
            case 15:
                f((d0) obj);
                return Unit.f80348a;
            case 16:
                return b((rn1.a) obj);
            case 17:
                return b((rn1.a) obj);
            case 18:
                return Unit.f80348a;
            case 19:
                return e((yl1.b) obj);
            case 20:
                return b((rn1.a) obj);
            case 21:
                return b((rn1.a) obj);
            case 22:
                return b((rn1.a) obj);
            case 23:
                return b((rn1.a) obj);
            case 24:
                return b((rn1.a) obj);
            case 25:
                return b((rn1.a) obj);
            case 26:
                return b((rn1.a) obj);
            case 27:
                return b((rn1.a) obj);
            case 28:
                return b((rn1.a) obj);
            default:
                return e((yl1.b) obj);
        }
    }
}
