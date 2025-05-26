package com.pinterest.feature.board.detail.header.view.lego;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.c2;
import ap.o;
import b10.z;
import com.pinterest.feature.board.detail.header.view.lego.LegoBoardDetailHeader;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import com.pinterest.ui.view.NoticeView;
import d70.g;
import ga2.f;
import gg0.n0;
import gi.m;
import java.util.ArrayList;
import java.util.List;
import kh2.g3;
import kh2.m0;
import kk0.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lh0.r;
import m60.w;
import mk0.e;
import nx.d0;
import nx.f0;
import org.jetbrains.annotations.NotNull;
import r41.k;
import uk0.a;
import x02.u2;
import x02.x0;
import x92.b;
import xk0.d;
import yk1.j;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\rB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/pinterest/feature/board/detail/header/view/lego/LegoBoardDetailHeader;", "Landroid/widget/RelativeLayout;", "Luk0/a;", "Lkk0/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LegoBoardDetailHeader extends n0 implements a, c {
    public static final /* synthetic */ int Q = 0;
    public f0 A;
    public oc.c B;
    public b C;
    public r D;
    public c2 E;
    public d0 F;
    public d G;
    public e H;
    public final String I;

    /* renamed from: J, reason: collision with root package name */
    public final String f45203J;
    public dl0.a K;
    public String L;
    public List M;
    public int N;
    public final int O;
    public boolean P;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f45204d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f45205e;

    /* renamed from: f, reason: collision with root package name */
    public final View f45206f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltPreviewTextView f45207g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f45208h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f45209i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f45210j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f45211k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltText f45212l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltText f45213m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f45214n;

    /* renamed from: o, reason: collision with root package name */
    public final ViewGroup f45215o;

    /* renamed from: p, reason: collision with root package name */
    public final NoticeView f45216p;

    /* renamed from: q, reason: collision with root package name */
    public final ViewStub f45217q;

    /* renamed from: r, reason: collision with root package name */
    public BoardSponsoredCuratorView f45218r;

    /* renamed from: s, reason: collision with root package name */
    public x0 f45219s;

    /* renamed from: t, reason: collision with root package name */
    public b60.b f45220t;

    /* renamed from: u, reason: collision with root package name */
    public u2 f45221u;

    /* renamed from: v, reason: collision with root package name */
    public w f45222v;

    /* renamed from: w, reason: collision with root package name */
    public o f45223w;

    /* renamed from: x, reason: collision with root package name */
    public j f45224x;

    /* renamed from: y, reason: collision with root package name */
    public m f45225y;

    /* renamed from: z, reason: collision with root package name */
    public uk1.e f45226z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoBoardDetailHeader(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        String string = getResources().getString(f.lego_board_rep_archived_label);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.I = string;
        String string2 = getResources().getString(g.secret_board_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f45203J = string2;
        this.O = 1024;
        View.inflate(getContext(), y60.d.view_board_header, this);
        View findViewById = findViewById(y60.c.board_status_secret);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45210j = (GestaltText) findViewById;
        View findViewById2 = findViewById(y60.c.board_status_archived);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45211k = (GestaltText) findViewById2;
        View findViewById3 = findViewById(y60.c.board_status_pin_section_count);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45212l = (GestaltText) findViewById3;
        View findViewById4 = findViewById(y60.c.board_update_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45214n = (GestaltText) findViewById4;
        this.f45206f = findViewById(y60.c.board_contributors);
        View findViewById5 = findViewById(y60.c.board_contributors_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45205e = (ViewGroup) findViewById5;
        View findViewById6 = findViewById(y60.c.board_contributors_text);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f45209i = (GestaltText) findViewById6;
        View findViewById7 = findViewById(y60.c.board_tag);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f45213m = (GestaltText) findViewById7;
        View findViewById8 = findViewById(y60.c.board_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f45208h = (GestaltText) findViewById8;
        View findViewById9 = findViewById(y60.c.board_title);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f45204d = (GestaltText) findViewById9;
        View findViewById10 = findViewById(y60.c.board_contributors_and_description);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        GestaltPreviewTextView gestaltPreviewTextView = (GestaltPreviewTextView) findViewById10;
        this.f45207g = gestaltPreviewTextView;
        View findViewById11 = findViewById(y60.c.board_info_container);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        View findViewById12 = findViewById(y60.c.board_advisory_container);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f45215o = (ViewGroup) findViewById12;
        View findViewById13 = findViewById(y60.c.board_advisory_notice);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        NoticeView noticeView = (NoticeView) findViewById13;
        this.f45216p = noticeView;
        View findViewById14 = findViewById(y60.c.board_sponsored_curator_stub);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.f45217q = (ViewStub) findViewById14;
        final int i13 = 0;
        gestaltPreviewTextView.i(new xk0.b(this, i13)).j(new gm1.a(this) { // from class: xk0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoBoardDetailHeader f135174b;

            {
                this.f135174b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                c cVar = c.f135177i;
                int i14 = i13;
                LegoBoardDetailHeader this$0 = this.f135174b;
                switch (i14) {
                    case 0:
                        int i15 = LegoBoardDetailHeader.Q;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof rn1.f) {
                            m0.g(this$0.f45207g, cVar);
                            break;
                        }
                        break;
                    default:
                        int i16 = LegoBoardDetailHeader.Q;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof rn1.f) {
                            m0.g(this$0.f45207g, cVar);
                            break;
                        }
                        break;
                }
            }
        });
        noticeView.getClass();
    }

    @Override // kk0.c
    public final void S3(dl0.a model, ArrayList collaborators) {
        Intrinsics.checkNotNullParameter(collaborators, "collaborators");
        Intrinsics.checkNotNullParameter(model, "model");
        this.N = model.f55188p;
        this.M = collaborators;
        n();
    }

    public final void i(dl0.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.K = model;
        if (model.f55182j) {
            return;
        }
        bs1.c.U1(this.f45206f);
        k(model.f55173a, model.f55175c || ((!model.f55179g || this.P) && model.f55186n != null));
        this.M = this.M;
        n();
    }

    /* renamed from: j, reason: from getter */
    public final GestaltText getF45204d() {
        return this.f45204d;
    }

    public final void k(String str, boolean z13) {
        if (z13) {
            bs1.c.X0(this.f45205e);
            return;
        }
        View view = this.f45206f;
        if (view == null) {
            return;
        }
        if (this.f45224x == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        yk1.m c13 = j.c(view);
        if (c13 instanceof kk0.a) {
            ((e) ((kk0.a) c13)).s3(str);
            return;
        }
        x0 x0Var = this.f45219s;
        if (x0Var == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        u2 u2Var = this.f45221u;
        if (u2Var == null) {
            Intrinsics.r("userFeedRepository");
            throw null;
        }
        b60.b bVar = this.f45220t;
        if (bVar == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        o oVar = this.f45223w;
        if (oVar == null) {
            Intrinsics.r("uploadContactsUtil");
            throw null;
        }
        w wVar = this.f45222v;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        uk1.e eVar = this.f45226z;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        d0 d0Var = this.F;
        if (d0Var == null) {
            Intrinsics.r("pinalytics");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(d0Var, str);
        k kVar = k.f106176a;
        m mVar = this.f45225y;
        if (mVar == null) {
            Intrinsics.r("boardInviteUtils");
            throw null;
        }
        f0 f0Var = this.A;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        oc.c cVar = this.B;
        if (cVar == null) {
            Intrinsics.r("apolloClient");
            throw null;
        }
        b bVar2 = this.C;
        if (bVar2 == null) {
            Intrinsics.r("graphQLBoardCollaboratorRemoteDataSource");
            throw null;
        }
        c2 c2Var = this.E;
        if (c2Var == null) {
            Intrinsics.r("sharesheetUtils");
            throw null;
        }
        e eVar2 = new e(str, false, x0Var, u2Var, bVar, oVar, wVar, f13, mVar, this, f0Var, cVar, bVar2, c2Var);
        j jVar = this.f45224x;
        if (jVar == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        jVar.d(view, eVar2);
        this.H = eVar2;
    }

    public final void l(wk0.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.G = listener;
    }

    public final void m(boolean z13) {
        this.P = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    public final void n() {
        ?? r13;
        int i13 = this.N;
        List list = this.M;
        int size = list != null ? list.size() : 0;
        if (i13 < size) {
            i13 = size;
        }
        if (i13 > 0) {
            dl0.a aVar = this.K;
            List list2 = this.M;
            List y03 = list2 != null ? CollectionsKt.y0(list2, 2) : null;
            if (aVar == null) {
                r13 = q0.f80391a;
            } else if (y03 == null) {
                r13 = q0.f80391a;
            } else if (aVar.f55178f) {
                r13 = q0.f80391a;
            } else {
                List<lk0.a> list3 = y03;
                r13 = new ArrayList(g0.q(list3, 10));
                for (lk0.a aVar2 : list3) {
                    r13.add(new nk0.a(new z(25, this, aVar2), aVar2.f83639d));
                }
            }
        } else {
            r13 = q0.f80391a;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i14 = 14;
        this.f45209i.i(new ip.d(i14, g3.z(context, r13, i13, new jh0.d(this, i14))));
        this.f45207g.i(new xk0.b(this, 1));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z13) {
        super.setEnabled(z13);
        View view = this.f45206f;
        if (view == null) {
            return;
        }
        view.setEnabled(z13);
    }

    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.F = pinalytics;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoBoardDetailHeader(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i14 = 1;
        String string = getResources().getString(f.lego_board_rep_archived_label);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.I = string;
        String string2 = getResources().getString(g.secret_board_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f45203J = string2;
        this.O = 1024;
        View.inflate(getContext(), y60.d.view_board_header, this);
        View findViewById = findViewById(y60.c.board_status_secret);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45210j = (GestaltText) findViewById;
        View findViewById2 = findViewById(y60.c.board_status_archived);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45211k = (GestaltText) findViewById2;
        View findViewById3 = findViewById(y60.c.board_status_pin_section_count);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45212l = (GestaltText) findViewById3;
        View findViewById4 = findViewById(y60.c.board_update_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45214n = (GestaltText) findViewById4;
        this.f45206f = findViewById(y60.c.board_contributors);
        View findViewById5 = findViewById(y60.c.board_contributors_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45205e = (ViewGroup) findViewById5;
        View findViewById6 = findViewById(y60.c.board_contributors_text);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f45209i = (GestaltText) findViewById6;
        View findViewById7 = findViewById(y60.c.board_tag);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f45213m = (GestaltText) findViewById7;
        View findViewById8 = findViewById(y60.c.board_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f45208h = (GestaltText) findViewById8;
        View findViewById9 = findViewById(y60.c.board_title);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f45204d = (GestaltText) findViewById9;
        View findViewById10 = findViewById(y60.c.board_contributors_and_description);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        GestaltPreviewTextView gestaltPreviewTextView = (GestaltPreviewTextView) findViewById10;
        this.f45207g = gestaltPreviewTextView;
        View findViewById11 = findViewById(y60.c.board_info_container);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        View findViewById12 = findViewById(y60.c.board_advisory_container);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f45215o = (ViewGroup) findViewById12;
        View findViewById13 = findViewById(y60.c.board_advisory_notice);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        NoticeView noticeView = (NoticeView) findViewById13;
        this.f45216p = noticeView;
        View findViewById14 = findViewById(y60.c.board_sponsored_curator_stub);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.f45217q = (ViewStub) findViewById14;
        gestaltPreviewTextView.i(new xk0.b(this, 0)).j(new gm1.a(this) { // from class: xk0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoBoardDetailHeader f135174b;

            {
                this.f135174b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                c cVar = c.f135177i;
                int i142 = i14;
                LegoBoardDetailHeader this$0 = this.f135174b;
                switch (i142) {
                    case 0:
                        int i15 = LegoBoardDetailHeader.Q;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof rn1.f) {
                            m0.g(this$0.f45207g, cVar);
                            break;
                        }
                        break;
                    default:
                        int i16 = LegoBoardDetailHeader.Q;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof rn1.f) {
                            m0.g(this$0.f45207g, cVar);
                            break;
                        }
                        break;
                }
            }
        });
        noticeView.getClass();
    }
}
