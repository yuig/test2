package w1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.pinterest.feature.settings.shared.view.GestaltSettingsPageItemView;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t3.s3;

/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127289i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f127290j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f127291k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f127292l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f127293m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f127294n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f127295o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ContentResolver contentResolver, Context context, InputStream inputStream, boolean z13, boolean z14, String str) {
        super(1);
        this.f127292l = contentResolver;
        this.f127293m = context;
        this.f127294n = inputStream;
        this.f127290j = z13;
        this.f127291k = z14;
        this.f127295o = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s3 s3Var;
        u50.i0 i0Var;
        String str;
        va1.k1 a13;
        String str2;
        int i13 = this.f127289i;
        boolean z13 = false;
        boolean z14 = this.f127291k;
        boolean z15 = this.f127290j;
        Object obj2 = this.f127295o;
        Object obj3 = this.f127294n;
        Object obj4 = this.f127293m;
        Object obj5 = this.f127292l;
        switch (i13) {
            case 0:
                long j13 = ((a3.c) obj).f482a;
                l1 l1Var = (l1) obj5;
                z2.s sVar = (z2.s) obj4;
                boolean z16 = !z15;
                if (!l1Var.b()) {
                    sVar.a(z2.m.f140632l);
                } else if (z16 && (s3Var = l1Var.f127357c) != null) {
                    ((t3.h2) s3Var).b();
                }
                if (l1Var.b() && z14) {
                    if (l1Var.a() != w0.Selection) {
                        r2 d2 = l1Var.d();
                        if (d2 != null) {
                            int a14 = ((h4.y) obj2).a(d2.b(j13, true));
                            l1Var.f127374t.invoke(h4.f0.a(l1Var.f127358d.f67570a, null, b7.c.h(a14, a14), 5));
                            if (l1Var.f127355a.f127567a.f21571a.length() > 0) {
                                l1Var.f127365k.setValue(w0.Cursor);
                            }
                        }
                    } else {
                        ((b2.t0) obj3).g(new a3.c(j13));
                    }
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                Intrinsics.checkNotNullParameter(uri, "uri");
                OutputStream openOutputStream = ((ContentResolver) obj5).openOutputStream(uri);
                Intrinsics.g(openOutputStream, "null cannot be cast to non-null type java.io.FileOutputStream");
                fk2.h hVar = new fk2.h(new gw0.b((Context) obj4, (FileOutputStream) openOutputStream, (InputStream) obj3, (String) obj2, this.f127290j, this.f127291k), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromCallable(...)");
                break;
            case 2:
                wm1.k0 bind = (wm1.k0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                String str3 = (String) obj5;
                u50.f0 x13 = ep.b.x(str3, "string", str3);
                if (!z15) {
                    i0Var = u50.h0.f120562a;
                } else if (z14) {
                    va1.f fVar = (va1.f1) obj4;
                    va1.c cVar = fVar instanceof va1.c ? (va1.c) fVar : null;
                    String e13 = cVar != null ? cVar.e() : null;
                    if (e13 == null) {
                        e13 = "";
                    }
                    i0Var = ep.b.x(e13, "string", e13);
                } else {
                    va1.f fVar2 = (va1.f1) obj4;
                    va1.b bVar = fVar2 instanceof va1.b ? (va1.b) fVar2 : null;
                    if (bVar == null || (a13 = bVar.a()) == null) {
                        str = null;
                    } else {
                        Context context = ((GestaltSettingsPageItemView) obj3).getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        str = a13.a(context);
                    }
                    if (str == null) {
                        str = "";
                    }
                    i0Var = ep.b.x(str, "string", str);
                }
                wm1.q middleItem = new wm1.q(x13, i0Var, z15 && !z14);
                bind.getClass();
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                bind.f130312c = middleItem;
                String str4 = ((va1.f1) obj4) instanceof wb1.j0 ? "" : (String) obj2;
                wm1.m endItem = new wm1.m(ep.b.x(str4, "string", str4), wm1.d.ARROW_FORWARD, false);
                Intrinsics.checkNotNullParameter(endItem, "endItem");
                bind.f130313d = endItem;
                break;
            default:
                sp0.d tapPosition = (sp0.d) obj;
                Intrinsics.checkNotNullParameter(tapPosition, "tapPosition");
                String boardId = (String) obj5;
                String str5 = (String) obj4;
                Intrinsics.checkNotNullParameter(boardId, "boardId");
                qf1.y d03 = kg.p.d0(h32.u0.IDEA_PIN_BOARD_STICKER_BUTTON, new uq.j(boardId, str5, 7));
                qf1.x xVar = new qf1.x(d03, qf1.y.a(d03, null, h32.u0.IDEA_PIN_BOARD_STICKER_TOOLTIP, 5));
                sf1.s sVar2 = (sf1.s) obj3;
                hh1.f fVar3 = hh1.l.f69186e;
                if (str5 == null) {
                    str2 = (((Integer) obj2) == null || !z15) ? sVar2.getResources().getString(uq1.b.idea_pin_tooltip_board_sticker_unknown_error) : z14 ? sVar2.getResources().getString(uq1.b.idea_pin_tooltip_board_sticker_group_title) : sVar2.getResources().getString(uq1.b.idea_pin_tooltip_board_sticker_title);
                    Intrinsics.f(str2);
                } else {
                    str2 = str5;
                }
                Integer num = (Integer) obj2;
                if (num != null && z15 && str5 == null) {
                    z13 = true;
                }
                hh1.o oVar = new hh1.o((num != null && z15 && str5 == null) ? vn1.c.DEFAULT : vn1.c.SUBTLE, z13, str2, num);
                sf1.o oVar2 = new sf1.o(this.f127290j, num, sVar2, xVar, boardId);
                int i14 = sf1.s.P;
                Context context2 = sVar2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                sVar2.m(tapPosition, fVar3, oVar, false, xVar, oVar2, hh1.l.a(context2));
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(String str, String str2, sf1.s sVar, Integer num, boolean z13, boolean z14) {
        super(1);
        this.f127292l = str;
        this.f127293m = str2;
        this.f127294n = sVar;
        this.f127295o = num;
        this.f127290j = z13;
        this.f127291k = z14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(String str, boolean z13, boolean z14, va1.f1 f1Var, GestaltSettingsPageItemView gestaltSettingsPageItemView, String str2) {
        super(1);
        this.f127292l = str;
        this.f127290j = z13;
        this.f127291k = z14;
        this.f127293m = f1Var;
        this.f127294n = gestaltSettingsPageItemView;
        this.f127295o = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l1 l1Var, z2.s sVar, boolean z13, boolean z14, b2.t0 t0Var, h4.y yVar) {
        super(1);
        this.f127292l = l1Var;
        this.f127293m = sVar;
        this.f127290j = z13;
        this.f127291k = z14;
        this.f127294n = t0Var;
        this.f127295o = yVar;
    }
}
