package xy;

import androidx.recyclerview.widget.RecyclerView;
import ar0.y;
import com.pinterest.api.model.wy0;
import df.j1;
import ey.j3;
import ey.s1;
import h32.a4;
import h32.d4;
import i2.a2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import so.oa;
import uj2.a0;
import wo2.m;
import xk2.v;

/* loaded from: classes.dex */
public final class c implements y {

    /* renamed from: a, reason: collision with root package name */
    public final g f136142a;

    public c(g gVar) {
        this.f136142a = gVar;
    }

    @Override // ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }

    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // ar0.y
    public final void d(RecyclerView recyclerView, int i13) {
        final g gVar;
        ?? r13;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        g gVar2 = this.f136142a;
        if (i13 != 0) {
            if (i13 == 1) {
                if (gVar2 != null) {
                    gVar2.a();
                    return;
                }
                return;
            } else {
                if (ff0.j.b() && i13 == 2 && gVar2 != null) {
                    gVar2.a();
                    return;
                }
                return;
            }
        }
        if (gVar2 != null) {
            boolean z13 = gVar2.f136170j;
            j jVar = gVar2.f136168h;
            if (z13) {
                y9.g gVar3 = jVar.f136191l;
                if (gVar3.f138101c) {
                    gVar3.f138100b.f(false);
                    gVar3.f138101c = false;
                    int n03 = j1.n0(jVar.f136180a);
                    int i14 = jVar.f136189j;
                    if (i14 > 0) {
                        int i15 = jVar.f136185f;
                        int i16 = jVar.f136186g;
                        int i17 = jVar.f136187h;
                        int i18 = jVar.f136188i;
                        g gVar4 = (g) jVar.f136182c;
                        gVar4.f136165e += i15;
                        gVar4.f136166f += i16;
                        gVar4.f136167g += i17;
                        gVar4.f136171k = i18;
                        gVar4.f136172l = n03;
                        gVar4.f136173m = i14;
                    }
                }
                gVar2.f136170j = false;
            }
            if (!gVar2.f136169i) {
                final long j13 = jVar.f136190k;
                if (j13 != -1 && (gVar2.f136173m != 0 || gVar2.f136167g != 0)) {
                    gVar2.f136169i = true;
                    final long currentTimeMillis = System.currentTimeMillis() * 1000;
                    List list = gVar2.f136163c;
                    if (list == null) {
                        list = q0.f80391a;
                    }
                    final List list2 = list;
                    wy0 f13 = ((b60.d) gVar2.f136164d).f();
                    String uid = f13 != null ? f13.getUid() : null;
                    final long parseLong = (uid == null || uid.length() == 0) ? 0L : Long.parseLong(uid);
                    final int i19 = gVar2.f136165e;
                    final int i23 = gVar2.f136166f;
                    final int i24 = gVar2.f136167g;
                    final int i25 = gVar2.f136173m;
                    final int i26 = gVar2.f136171k;
                    final int i27 = gVar2.f136172l;
                    a0 a0Var = tk2.e.f118017c;
                    final d4 d4Var = gVar2.f136162b;
                    final a4 a4Var = gVar2.f136161a;
                    gVar = gVar2;
                    r13 = 0;
                    a0Var.b(new Runnable() { // from class: xy.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            Integer num;
                            m mVar;
                            d4 viewType = d4Var;
                            Intrinsics.checkNotNullParameter(viewType, "$viewType");
                            List extraAnnotations = list2;
                            Intrinsics.checkNotNullParameter(extraAnnotations, "$extraAnnotations");
                            g this$0 = gVar;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            v vVar = g.f136159o;
                            qb0.e eVar = qb0.d.f103396a;
                            m mVar2 = eVar.f103398b;
                            if (mVar2 != null) {
                                mVar = mVar2;
                                num = null;
                            } else {
                                num = eVar.f103397a;
                                if (num != null) {
                                    mVar = null;
                                } else {
                                    num = null;
                                    mVar = null;
                                }
                            }
                            re2.i iVar = new re2.i(num, (short) 0, "android", mVar);
                            String str = this$0.f136174n;
                            re2.e eVar2 = new re2.e();
                            wo2.j jVar2 = new wo2.j();
                            eVar2.f107695b = null;
                            eVar2.f107696c = null;
                            eVar2.f107694a = "user.id";
                            jVar2.i0(parseLong);
                            eVar2.f107695b = jVar2.a1(jVar2.f130711b);
                            eVar2.f107696c = re2.d.I64;
                            re2.g a13 = eVar2.a();
                            j3 j3Var = j3.f60510a;
                            String str2 = eVar.f103399c;
                            Intrinsics.checkNotNullExpressionValue(str2, "getNetworkClass(...)");
                            String b13 = eVar.b();
                            Intrinsics.checkNotNullExpressionValue(b13, "getCarrierName(...)");
                            int value = j3.d(b13, str2).getValue();
                            eVar2.f107694a = null;
                            eVar2.f107695b = null;
                            eVar2.f107696c = null;
                            re2.g t13 = bk.f.t("net.type", value, eVar2, jVar2);
                            int value2 = viewType.getValue();
                            eVar2.f107694a = null;
                            eVar2.f107695b = null;
                            eVar2.f107696c = null;
                            re2.g u13 = bk.f.u("view.type", value2, eVar2, jVar2);
                            eVar2.f107694a = null;
                            eVar2.f107695b = null;
                            eVar2.f107696c = null;
                            re2.g t14 = bk.f.t("total_frames_dropped", i24, eVar2, jVar2);
                            eVar2.f107694a = null;
                            eVar2.f107695b = null;
                            eVar2.f107696c = null;
                            re2.g t15 = bk.f.t("small_frame_drop_count", i19, eVar2, jVar2);
                            eVar2.f107694a = null;
                            eVar2.f107695b = null;
                            eVar2.f107696c = null;
                            re2.g t16 = bk.f.t("large_frame_drop_count", i23, eVar2, jVar2);
                            eVar2.f107694a = null;
                            eVar2.f107695b = null;
                            eVar2.f107696c = null;
                            re2.g u14 = bk.f.u("total_frames_rendered", i25, eVar2, jVar2);
                            eVar2.f107694a = null;
                            eVar2.f107695b = null;
                            eVar2.f107696c = null;
                            re2.g t17 = bk.f.t("pin.start_scroll_index", i26, eVar2, jVar2);
                            eVar2.f107694a = null;
                            eVar2.f107695b = null;
                            eVar2.f107696c = null;
                            re2.g t18 = bk.f.t("pin.end_scroll_index", i27, eVar2, jVar2);
                            eVar2.f107694a = null;
                            eVar2.f107695b = null;
                            eVar2.f107696c = null;
                            ArrayList l13 = f0.l(a13, t13, u13, t14, t15, t16, u14, t17, t18, bk.f.w("session.id", str, eVar2, jVar2));
                            l13.addAll((List) g.f136160p.getValue());
                            long j14 = currentTimeMillis;
                            long j15 = j13;
                            long j16 = j14 - j15;
                            ArrayDeque arrayDeque = s1.f60573a;
                            a4 a4Var2 = a4Var;
                            if (a4Var2 != null) {
                                int value3 = a4Var2.getValue();
                                eVar2.f107694a = null;
                                eVar2.f107695b = null;
                                eVar2.f107696c = null;
                                l13.add(bk.f.u("view.parameter", value3, eVar2, jVar2));
                            }
                            l13.addAll(extraAnnotations);
                            re2.j span = new re2.j(Long.valueOf(j3.a()), "pwt/scroll_session", Long.valueOf(j3.a()), null, f0.j(new re2.a(Long.valueOf(j15), "cs", iVar), new re2.a(Long.valueOf(j14), "cr", iVar)), l13, Boolean.FALSE, Long.valueOf(j15), Long.valueOf(j16), null);
                            if (ff0.j.b()) {
                                u.f85943a.d(new a2(f0.l(span), 10));
                            } else {
                                ((vy.m) ((oa) ((f) g.f136159o.getValue())).M1.get()).j(e0.b(span));
                            }
                            Intrinsics.checkNotNullParameter(span, "span");
                            Intrinsics.checkNotNullParameter(span, "span");
                        }
                    });
                    gVar.f136165e = r13;
                    gVar.f136166f = r13;
                    gVar.f136167g = r13;
                    gVar.f136173m = r13;
                    gVar.f136169i = r13;
                    gVar.f136170j = r13;
                }
            }
            gVar = gVar2;
            r13 = 0;
            gVar.f136165e = r13;
            gVar.f136166f = r13;
            gVar.f136167g = r13;
            gVar.f136173m = r13;
            gVar.f136169i = r13;
            gVar.f136170j = r13;
        }
    }

    @Override // ar0.y
    public final void g(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }
}
