package rb2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.k8;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.u0;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import nx.f0;
import nx.j0;
import rq.m1;
import so.jb;
import so.oa;
import so.s8;
import x02.x0;
import x02.x2;
import x40.oc;
import x40.tc;
import x40.uc;

/* loaded from: classes4.dex */
public final class d extends LinearLayout implements nx.a, yk1.n, af2.c {
    public static final /* synthetic */ int C = 0;
    public String A;
    public Integer B;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f107128a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f107129b;

    /* renamed from: c, reason: collision with root package name */
    public final WebImageView f107130c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f107131d;

    /* renamed from: e, reason: collision with root package name */
    public final WebImageView f107132e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f107133f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f107134g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f107135h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f107136i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltButton f107137j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltButton f107138k;

    /* renamed from: l, reason: collision with root package name */
    public final Regex f107139l;

    /* renamed from: m, reason: collision with root package name */
    public final kp.m f107140m;

    /* renamed from: n, reason: collision with root package name */
    public final gi.m f107141n;

    /* renamed from: o, reason: collision with root package name */
    public final x2 f107142o;

    /* renamed from: p, reason: collision with root package name */
    public final x0 f107143p;

    /* renamed from: q, reason: collision with root package name */
    public final f0 f107144q;

    /* renamed from: r, reason: collision with root package name */
    public final g70.h f107145r;

    /* renamed from: s, reason: collision with root package name */
    public final j0 f107146s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f107147t;

    /* renamed from: u, reason: collision with root package name */
    public String f107148u;

    /* renamed from: v, reason: collision with root package name */
    public String f107149v;

    /* renamed from: w, reason: collision with root package name */
    public String f107150w;

    /* renamed from: x, reason: collision with root package name */
    public String f107151x;

    /* renamed from: y, reason: collision with root package name */
    public String f107152y;

    /* renamed from: z, reason: collision with root package name */
    public String f107153z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f107129b) {
            this.f107129b = true;
            jb jbVar = (jb) ((e) generatedComponent());
            oa oaVar = jbVar.f113483a;
            s8 s8Var = jbVar.f113485c;
            this.f107140m = (kp.m) s8Var.V0.get();
            this.f107141n = s8Var.x5();
            this.f107142o = (x2) oaVar.f113800m3.get();
            this.f107143p = (x0) oaVar.f113765k3.get();
            this.f107144q = (f0) oaVar.f113747j2.get();
            s8Var.p5();
            this.f107145r = s8Var.e5();
        }
        LayoutInflater.from(context).inflate(nb2.c.list_cell_conversation_lego_inbox_board_invite_row, (ViewGroup) this, true);
        if (z13) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(eo1.c.space_400);
            setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        View findViewById = findViewById(nb2.b.board_image_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f107130c = (WebImageView) findViewById;
        View findViewById2 = findViewById(nb2.b.board_avatar_cover_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f107131d = (ConstraintLayout) findViewById2;
        View findViewById3 = findViewById(nb2.b.board_image_avatar_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f107132e = (WebImageView) findViewById3;
        View findViewById4 = findViewById(nb2.b.conversation_title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f107133f = (GestaltText) findViewById4;
        View findViewById5 = findViewById(nb2.b.subtitle_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f107134g = (GestaltText) findViewById5;
        View findViewById6 = findViewById(nb2.b.timestamp_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f107135h = (GestaltText) findViewById6;
        View findViewById7 = findViewById(nb2.b.badge_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById7;
        this.f107136i = imageView;
        View findViewById8 = findViewById(nb2.b.positive_btn);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f107137j = (GestaltButton) findViewById8;
        View findViewById9 = findViewById(nb2.b.negative_btn);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f107138k = (GestaltButton) findViewById9;
        this.f107139l = new Regex("default_\\d+.png");
        f0 f0Var = this.f107144q;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        this.f107146s = ((nx.m) f0Var).a(this);
        this.A = "";
        imageView.setVisibility(8);
    }

    public final void a(k8 k8Var) {
        if (k8Var == null) {
            return;
        }
        x2 x2Var = this.f107142o;
        if (x2Var == null) {
            Intrinsics.r("userRepository");
            throw null;
        }
        wy0 wy0Var = (wy0) x2Var.O(k8Var.f39331a);
        x0 x0Var = this.f107143p;
        if (x0Var == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        String str = k8Var.f39332b;
        v7 v7Var = (v7) x0Var.O(str);
        if (wy0Var == null || v7Var == null || pk.a0.x0(wy0Var.Z2()) || pk.a0.x0(v7Var.j1())) {
            return;
        }
        this.f107148u = wy0Var.U2();
        this.f107149v = wy0Var.Z2();
        this.f107150w = wy0Var.z4();
        this.f107151x = wy0Var.l3();
        this.f107152y = wy0Var.k3();
        this.f107153z = wy0Var.m3();
        String uid = wy0Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        this.A = uid;
        this.B = wy0Var.q2();
        setTag(str);
        String uid2 = v7Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        setOnClickListener(new a(this, uid2, 0));
        this.f107137j.e(new b(this, uid2, 0));
        this.f107138k.e(new b(this, uid2, 1));
        String uid3 = v7Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
        i(uid3, v7Var.a1(), v7Var.b1());
        Date date = k8Var.createdAt;
        String j13 = v7Var.j1();
        Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
        j(date, j13, wy0Var.Z2(), wy0Var.z4(), false);
    }

    public final void b(z40.f fVar) {
        uc ucVar;
        tc tcVar;
        oc ocVar;
        if (fVar == null || (tcVar = (ucVar = (uc) fVar).f133472i) == null || (ocVar = ucVar.f133470g) == null) {
            return;
        }
        String str = tcVar.f133373n;
        if (pk.a0.x0(str)) {
            return;
        }
        String str2 = ocVar.f132965f;
        if (pk.a0.x0(str2)) {
            return;
        }
        this.f107148u = tcVar.f133371l;
        this.f107149v = str;
        this.f107150w = tcVar.f133374o;
        this.f107151x = tcVar.f133369j;
        this.f107152y = tcVar.f133368i;
        this.f107153z = tcVar.f133370k;
        this.A = tcVar.f133362c;
        this.B = tcVar.f133379t;
        String str3 = ocVar.f132962c;
        setOnClickListener(new a(this, str3, 2));
        this.f107137j.e(new b(this, str3, 2));
        this.f107138k.e(new m1(this, str3, ucVar.f133465b, 15));
        i(str3, ocVar.f132968i, ocVar.f132970k);
        if (str2 == null) {
            str2 = "";
        }
        String str4 = str2;
        Date date = ucVar.f133469f;
        if (date != null) {
            j(date, str4, this.f107149v, this.f107150w, true);
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f107128a == null) {
            this.f107128a = new ye2.o(this);
        }
        return this.f107128a;
    }

    public final void g(String str) {
        this.f107146s.b0(u0.NEWS_FEED_BOARD, g0.NEWS_FEED, str, false);
        g70.h hVar = this.f107145r;
        if (hVar != null) {
            g70.h.g(hVar, str, null, null, 6);
        } else {
            Intrinsics.r("boardNavigator");
            throw null;
        }
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.BOARD, null, null, null, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f107128a == null) {
            this.f107128a = new ye2.o(this);
        }
        return this.f107128a.generatedComponent();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r12 = this;
            com.pinterest.ui.imageview.WebImageView r0 = r12.f107130c
            r1 = 1
            r0.k2(r1)
            android.content.Context r2 = r12.getContext()
            int r3 = m60.s0.dimming_layer_light
            java.lang.Object r4 = d5.a.f53679a
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r0.setForeground(r2)
            android.content.Context r2 = r12.getContext()
            int r3 = eo1.b.color_themed_light_gray
            int r2 = r2.getColor(r3)
            r0.setBackgroundColor(r2)
            if (r14 != 0) goto L25
            r14 = r15
        L25:
            r15 = 8
            r0.setVisibility(r15)
            rb2.a r15 = new rb2.a
            r15.<init>(r12, r13, r1)
            com.pinterest.ui.imageview.WebImageView r13 = r12.f107132e
            r13.setOnClickListener(r15)
            java.lang.String r1 = r12.f107148u
            java.lang.String r2 = r12.f107149v
            java.lang.String r3 = r12.f107150w
            java.lang.String r15 = r12.f107151x
            java.lang.String r0 = r12.f107152y
            java.lang.String r4 = r12.f107153z
            java.lang.String r7 = r12.A
            java.lang.Integer r9 = r12.B
            int r5 = nb2.b.board_cover_image_avatars
            android.view.View r5 = r12.findViewById(r5)
            java.lang.String r6 = "findViewById(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r11 = r5
            com.pinterest.gestalt.avatar.GestaltAvatar r11 = (com.pinterest.gestalt.avatar.GestaltAvatar) r11
            if (r15 != 0) goto L5a
            if (r0 != 0) goto L5e
            if (r4 != 0) goto L5c
            java.lang.String r15 = ""
        L5a:
            r6 = r15
            goto L5f
        L5c:
            r6 = r4
            goto L5f
        L5e:
            r6 = r0
        L5f:
            kotlin.text.Regex r15 = r12.f107139l
            boolean r15 = r15.a(r6)
            if (r15 != 0) goto L6d
            int r15 = r6.length()
            if (r15 != 0) goto L78
        L6d:
            et1.t0 r15 = new et1.t0
            r5 = 6
            r0 = r15
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r11.H2(r15)
        L78:
            et1.t0 r15 = new et1.t0
            r10 = 7
            r5 = r15
            r8 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            e0.t.g(r11, r15)
            androidx.constraintlayout.widget.ConstraintLayout r15 = r12.f107131d
            r0 = 0
            r15.setVisibility(r0)
            if (r14 != 0) goto L91
            int r14 = nb2.a.ic_board_no_cover_nonpds
            r13.setImageResource(r14)
            goto L94
        L91:
            r13.loadUrl(r14)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rb2.d.i(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void j(Date date, String str, String str2, String str3, boolean z13) {
        boolean z14 = this.f107147t;
        GestaltText gestaltText = this.f107133f;
        GestaltText gestaltText2 = this.f107134g;
        if (z14) {
            if (str2 == null) {
                str2 = str3 == null ? "" : str3;
            }
            pk.a0.p(gestaltText, str2);
            pk.a0.p(gestaltText2, str);
        } else {
            String string = getResources().getString(m60.x0.board_invite);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            pk.a0.p(gestaltText, string);
            pk.a0.p(gestaltText2, str);
        }
        GestaltButton gestaltButton = this.f107138k;
        GestaltButton gestaltButton2 = this.f107137j;
        if (z13) {
            gestaltButton2.d(c.f107110j);
            gestaltButton.d(c.f107111k);
        } else {
            gestaltButton2.d(c.f107112l);
            gestaltButton.d(c.f107113m);
        }
        setContentDescription(str);
        this.f107136i.setVisibility(8);
        c cVar = c.f107114n;
        GestaltText gestaltText3 = this.f107135h;
        gestaltText3.i(cVar);
        gestaltText2.i(c.f107115o);
        kp.n m03 = kp.n.m0();
        Context context = getContext();
        Locale locale = Locale.getDefault();
        Boolean bool = Boolean.FALSE;
        m03.getClass();
        String i03 = kp.n.i0(context, date, locale, bool);
        Intrinsics.checkNotNullExpressionValue(i03, "formatTimestamp(...)");
        pk.a0.p(gestaltText3, i03);
    }
}
