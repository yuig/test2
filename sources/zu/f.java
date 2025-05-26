package zu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import h32.q2;
import kotlin.jvm.internal.Intrinsics;
import m60.q0;
import m60.u;
import m60.w;
import nx.d0;
import nx.v;
import ps.p;
import ps.q;
import rq.n0;
import tq.j;
import yk1.n;

/* loaded from: classes3.dex */
public final class f extends ConstraintLayout implements n, v {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f142796k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final w f142797a;

    /* renamed from: b, reason: collision with root package name */
    public f30 f142798b;

    /* renamed from: c, reason: collision with root package name */
    public xt.f f142799c;

    /* renamed from: d, reason: collision with root package name */
    public q2 f142800d;

    /* renamed from: e, reason: collision with root package name */
    public final int f142801e;

    /* renamed from: f, reason: collision with root package name */
    public final View f142802f;

    /* renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f142803g;

    /* renamed from: h, reason: collision with root package name */
    public final WebImageView f142804h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f142805i;

    /* renamed from: j, reason: collision with root package name */
    public au.b f142806j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, d0 pinalytics) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        w wVar = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f142797a = wVar;
        this.f142801e = q0.contextual_bg;
        View inflate = LayoutInflater.from(context).inflate(q.ads_showcase_subpin_item, this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.f142802f = inflate;
        View findViewById = inflate.findViewById(p.subpin_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f142803g = (ConstraintLayout) findViewById;
        View findViewById2 = inflate.findViewById(p.subpin_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f142804h = (WebImageView) findViewById2;
        View findViewById3 = inflate.findViewById(p.subpin_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f142805i = (GestaltText) findViewById3;
        setOnClickListener(new j(this, 14));
        setOnLongClickListener(new n0(this, 3));
        wVar.h(new e(this));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        q2 source = this.f142800d;
        if (source == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        return new q2(source.f67189a, source.f67190b, source.f67191c, source.f67192d, Long.valueOf(System.currentTimeMillis() * 1000000), source.f67194f, source.f67195g, source.f67196h);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    @Override // nx.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object markImpressionStart() {
        /*
            r19 = this;
            r0 = r19
            h32.q2 r1 = r0.f142800d
            if (r1 == 0) goto L8
            goto Ld4
        L8:
            xt.f r1 = r0.f142799c
            if (r1 == 0) goto Ld2
            com.pinterest.api.model.f30 r2 = r0.f142798b
            if (r2 == 0) goto Ld2
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r5
            java.lang.String r5 = "subpin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            com.pinterest.api.model.f30 r5 = r1.f135861d
            com.pinterest.api.model.f30 r1 = r1.f135860c
            java.lang.String r6 = "getUid(...)"
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L52
            java.lang.String r9 = r5.getId()
            if (r9 == 0) goto L52
            boolean r9 = android.text.TextUtils.isDigitsOnly(r9)
            if (r9 != r7) goto L52
            java.lang.String r9 = r5.getId()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            boolean r9 = kotlin.text.z.j(r9)
            r9 = r9 ^ r7
            if (r9 == 0) goto L52
            java.lang.String r9 = r5.getId()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            long r9 = java.lang.Long.parseLong(r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r12 = r9
            goto L53
        L52:
            r12 = r8
        L53:
            if (r1 == 0) goto L81
            java.lang.String r9 = r1.getId()
            if (r9 == 0) goto L81
            boolean r9 = android.text.TextUtils.isDigitsOnly(r9)
            if (r9 != r7) goto L81
            java.lang.String r9 = r1.getId()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            boolean r9 = kotlin.text.z.j(r9)
            r9 = r9 ^ r7
            if (r9 == 0) goto L81
            java.lang.String r1 = r1.getId()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            long r9 = java.lang.Long.parseLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r16 = r1
            goto L83
        L81:
            r16 = r8
        L83:
            java.lang.String r1 = r2.getId()
            if (r1 == 0) goto Laf
            boolean r1 = android.text.TextUtils.isDigitsOnly(r1)
            if (r1 != r7) goto Laf
            java.lang.String r1 = r2.getId()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            boolean r1 = kotlin.text.z.j(r1)
            r1 = r1 ^ r7
            if (r1 == 0) goto Laf
            java.lang.String r1 = r2.getId()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            long r6 = java.lang.Long.parseLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r17 = r1
            goto Lb1
        Laf:
            r17 = r8
        Lb1:
            if (r5 == 0) goto Lb9
            java.lang.String r1 = r5.getId()
            r11 = r1
            goto Lba
        Lb9:
            r11 = r8
        Lba:
            if (r5 == 0) goto Lc0
            java.lang.String r8 = r5.B4()
        Lc0:
            r13 = r8
            java.lang.Long r14 = java.lang.Long.valueOf(r3)
            java.lang.String r18 = r2.z4()
            h32.q2 r1 = new h32.q2
            r15 = 0
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r0.f142800d = r1
        Ld2:
            h32.q2 r1 = r0.f142800d
        Ld4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zu.f.markImpressionStart():java.lang.Object");
    }
}
