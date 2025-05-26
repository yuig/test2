package fn1;

import android.content.Context;
import com.pinterest.gestalt.selectList.GestaltSelectList;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.ui.view.descriptors.VisualSearchPill;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import java.io.OutputStream;
import java.lang.reflect.ParameterizedType;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.text.Charsets;
import rb2.t;
import u50.b0;
import u50.f0;
import u50.i0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62705i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f62706j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f62707k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f62708l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(VisualSearchPill visualSearchPill, i0 i0Var, vn1.c cVar) {
        super(1);
        this.f62705i = 18;
        this.f62706j = visualSearchPill;
        this.f62708l = i0Var;
        this.f62707k = cVar;
    }

    public final rn1.a b(rn1.a it) {
        CharSequence i03;
        int i13 = this.f62705i;
        Object obj = this.f62708l;
        Object obj2 = this.f62707k;
        Object obj3 = this.f62706j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltSelectList gestaltSelectList = (GestaltSelectList) obj3;
                Object obj4 = gestaltSelectList.f49559a.f33803a;
                int i14 = ((b) ((u50.o) obj4)).f62680e;
                vn1.g gVar = vn1.g.BODY_100;
                i0 i0Var = ((b) ((u50.o) obj4)).f62679d;
                Context context = gestaltSelectList.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return rn1.a.y(it, null, (vn1.c) obj2, null, null, gVar, i14, d7.b.Z(i0Var.a(context).toString().length() > 0), null, null, (rm1.d) obj, false, 0, null, null, null, new b0(eo1.c.space_100), null, false, null, null, 2063757);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = (String) obj3;
                f0 h23 = bs1.c.h2(str);
                yn1.e eVar = ((GestaltTextField) obj2).f49681l;
                if (eVar != null) {
                    return rn1.a.y(it, h23, null, null, null, eVar == yn1.e.UI_100 ? vn1.g.UI_100 : vn1.g.BODY_100, ((h0) obj).f80426a, d7.b.Z(str.length() > 0), rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096910);
                }
                Intrinsics.r("labelVariant");
                throw null;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltTextField gestaltTextField = (GestaltTextField) obj3;
                int i15 = gestaltTextField.k0().f20033d;
                vn1.g gVar2 = vn1.g.BODY_100;
                i0 i0Var2 = gestaltTextField.k0().f20032c;
                Context context2 = gestaltTextField.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return rn1.a.y(it, null, (vn1.c) obj2, null, null, gVar2, i15, d7.b.Z(i0Var2.a(context2).toString().length() > 0), null, null, (rm1.d) obj, false, 0, null, null, null, new b0(eo1.c.space_100), null, false, null, null, 2063757);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                Float f13 = (Float) obj3;
                return rn1.a.y(it, f13 != null ? bs1.c.h2(((f0.h) obj2).G(f13.floatValue()).toString()) : bs1.c.h2(((ow1.g) obj).getText(com.pinterest.partnerAnalytics.g.analytics_empty_value).toString()), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                jb2.f fVar = ((VisualSearchPill) obj3).f52731b;
                if (fVar != null) {
                    return rn1.a.y(it, (i0) obj, (vn1.c) obj2, null, null, fVar.getValue(), 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097068);
                }
                Intrinsics.r("textVariant");
                throw null;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                t tVar = (t) obj3;
                z40.h hVar = (z40.h) obj2;
                if (tVar.f107207d) {
                    oo1.j jVar = oo1.j.f96854a;
                    Date d2 = hVar.d();
                    pb0.d fuzzyDateFormatter = tVar.f107208e;
                    if (fuzzyDateFormatter == null) {
                        Intrinsics.r("fuzzyDateFormatter");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
                    if (d2 == null) {
                        d2 = new Date();
                    }
                    i03 = fuzzyDateFormatter.c(xa0.j.p(d2), pb0.b.STYLE_COMPACT, false);
                } else {
                    kp.n m03 = kp.n.m0();
                    Context context3 = tVar.f107218o.getContext();
                    Date d13 = hVar.d();
                    Locale locale = Locale.getDefault();
                    Boolean bool = Boolean.FALSE;
                    m03.getClass();
                    i03 = kp.n.i0(context3, d13, locale, bool);
                }
                Intrinsics.checkNotNullExpressionValue(i03, "access$getTimeStampFromMessage(...)");
                return rn1.a.y(it, bs1.c.h2(i03), kh2.d.K0((z40.n) obj) ? vn1.c.SUBTLE : vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
        }
    }

    public final void e(OutputStream stream) {
        rg2.a aVar;
        int i13 = this.f62705i;
        Object obj = this.f62707k;
        Object obj2 = this.f62708l;
        Object obj3 = this.f62706j;
        switch (i13) {
            case 22:
                Intrinsics.checkNotNullParameter(stream, "stream");
                aVar = new rg2.a(stream);
                try {
                    ((pg2.n) obj3).f100133b.e((Envelope) obj, (ParameterizedType) obj2, aVar);
                    Unit unit = Unit.f80348a;
                    dl2.b.J(aVar, null);
                    return;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 23:
                Intrinsics.checkNotNullParameter(stream, "stream");
                aVar = new rg2.a(stream);
                ParameterizedType parameterizedType = (ParameterizedType) obj3;
                pg2.n nVar = (pg2.n) obj;
                try {
                    if (parameterizedType != null) {
                        nVar.f100133b.e(obj2, parameterizedType, aVar);
                    } else {
                        nVar.f100133b.h(obj2, Envelope.class, aVar);
                    }
                    dl2.b.J(aVar, null);
                    return;
                } catch (Throwable th3) {
                }
            default:
                Intrinsics.checkNotNullParameter(stream, "stream");
                yg2.d dVar = (yg2.d) obj3;
                if (dVar.f139034d.getSerializedType() != null) {
                    ((bh2.b) obj).f22814e.e((Envelope) obj2, dVar.f139034d.getSerializedType(), stream);
                    return;
                }
                Object obj4 = ((Envelope) obj2).f73112e;
                Intrinsics.g(obj4, "null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.ByteArray>");
                Pair pair = (Pair) obj4;
                byte[] attachment = (byte[]) pair.f80347b;
                String id3 = (String) pair.f80346a;
                Intrinsics.checkNotNullParameter(stream, "stream");
                Intrinsics.checkNotNullParameter(attachment, "attachment");
                Intrinsics.checkNotNullParameter(id3, "id");
                try {
                    Charset charset = Charsets.UTF_8;
                    byte[] bytes = id3.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    stream.write(bytes);
                    byte[] bytes2 = "\n".getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                    stream.write(bytes2);
                    stream.write(attachment);
                    Unit unit2 = Unit.f80348a;
                    dl2.b.J(stream, null);
                    return;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        dl2.b.J(stream, th4);
                        throw th5;
                    }
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02e8, code lost:
    
        if (r4.equals("com.facebook.orca") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03f9, code lost:
    
        r0 = m60.s0.vr_messenger_share_icon;
        r1 = d5.a.f53679a;
        r6 = r7.getDrawable(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02f0, code lost:
    
        if (r4.equals("com.facebook.lite") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02fc, code lost:
    
        r0 = m60.s0.vr_facebook_share_icon;
        r1 = d5.a.f53679a;
        r6 = r7.getDrawable(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02f8, code lost:
    
        if (r4.equals("com.facebook.katana") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x031c, code lost:
    
        if (r4.equals("com.google.android.babel") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0397, code lost:
    
        r0 = m60.s0.vr_google_messages_share_icon;
        r1 = d5.a.f53679a;
        r6 = r7.getDrawable(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0324, code lost:
    
        if (r4.equals("com.google.android.gm") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x035a, code lost:
    
        if (r4.equals("com.android.mms") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x038a, code lost:
    
        if (r4.equals("com.google.android.apps.messaging") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0394, code lost:
    
        if (r4.equals("com.android.messaging") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03f3, code lost:
    
        if (r4.equals("com.facebook.mlite") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0429, code lost:
    
        if (r4.equals("com.android.email") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0483, code lost:
    
        r0 = m60.s0.gmail_share_icon;
        r1 = d5.a.f53679a;
        r6 = r7.getDrawable(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0443, code lost:
    
        if (r4.equals("com.facebook.orca") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x054b, code lost:
    
        r0 = m60.s0.messenger_share_icon;
        r1 = d5.a.f53679a;
        r6 = r7.getDrawable(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x044b, code lost:
    
        if (r4.equals("com.facebook.lite") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0457, code lost:
    
        r0 = m60.s0.facebook_share_icon;
        r1 = d5.a.f53679a;
        r6 = r7.getDrawable(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0453, code lost:
    
        if (r4.equals("com.facebook.katana") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0477, code lost:
    
        if (r4.equals("com.google.android.babel") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04f0, code lost:
    
        r0 = m60.s0.message_share_icon;
        r1 = d5.a.f53679a;
        r6 = r7.getDrawable(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x047f, code lost:
    
        if (r4.equals("com.google.android.gm") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04b5, code lost:
    
        if (r4.equals("com.android.mms") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04e3, code lost:
    
        if (r4.equals("com.google.android.apps.messaging") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x04ed, code lost:
    
        if (r4.equals("com.android.messaging") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0547, code lost:
    
        if (r4.equals("com.facebook.mlite") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02ce, code lost:
    
        if (r4.equals("com.android.email") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0328, code lost:
    
        r0 = m60.s0.vr_gmail_share_icon;
        r1 = d5.a.f53679a;
        r6 = r7.getDrawable(r0);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03f5  */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.view.View, com.pinterest.gestalt.button.view.GestaltButton] */
    /* JADX WARN: Type inference failed for: r1v86, types: [rl1.b] */
    /* JADX WARN: Type inference failed for: r4v33, types: [fk2.c] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 2298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fn1.k.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i13) {
        super(1);
        this.f62705i = i13;
        this.f62706j = obj;
        this.f62707k = obj2;
        this.f62708l = obj3;
    }
}
