package com.pinterest.feature.sendshare.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.appcompat.widget.x;
import ap.o;
import com.google.android.material.textfield.r;
import com.pinterest.activity.conversation.notifsupsell.view.NotifsOptInUpsellBannerView;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.text.GestaltText;
import dr.k;
import g91.c;
import hp.d;
import j91.g;
import j91.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import m60.r0;
import m60.u;
import m60.w0;
import m60.x0;
import nx.d0;
import r20.a;
import sh.f;
import xj2.b;
import xo.s;
import yk1.j;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/sendshare/view/ContactSearchAndSelectModalView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "kg/p", "shareLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ContactSearchAndSelectModalView extends s {
    public static final /* synthetic */ int G = 0;
    public boolean A;
    public boolean B;
    public final b C;
    public final d0 D;
    public final r E;
    public final h F;

    /* renamed from: d, reason: collision with root package name */
    public a f48064d;

    /* renamed from: e, reason: collision with root package name */
    public x f48065e;

    /* renamed from: f, reason: collision with root package name */
    public b60.b f48066f;

    /* renamed from: g, reason: collision with root package name */
    public o f48067g;

    /* renamed from: h, reason: collision with root package name */
    public rg0.s f48068h;

    /* renamed from: i, reason: collision with root package name */
    public j f48069i;

    /* renamed from: j, reason: collision with root package name */
    public q f48070j;

    /* renamed from: k, reason: collision with root package name */
    public SendableObject f48071k;

    /* renamed from: l, reason: collision with root package name */
    public BaseModalViewWrapper f48072l;

    /* renamed from: m, reason: collision with root package name */
    public c f48073m;

    /* renamed from: n, reason: collision with root package name */
    public k f48074n;

    /* renamed from: o, reason: collision with root package name */
    public GestaltSearchField f48075o;

    /* renamed from: p, reason: collision with root package name */
    public ListView f48076p;

    /* renamed from: q, reason: collision with root package name */
    public GestaltIconButton f48077q;

    /* renamed from: r, reason: collision with root package name */
    public GestaltIconButton f48078r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f48079s;

    /* renamed from: t, reason: collision with root package name */
    public GestaltText f48080t;

    /* renamed from: u, reason: collision with root package name */
    public NotifsOptInUpsellBannerView f48081u;

    /* renamed from: v, reason: collision with root package name */
    public d f48082v;

    /* renamed from: w, reason: collision with root package name */
    public int f48083w;

    /* renamed from: x, reason: collision with root package name */
    public int f48084x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f48085y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f48086z;

    public ContactSearchAndSelectModalView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 14);
        this.B = true;
        this.C = new b();
        d0 a13 = f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        this.D = a13;
        this.E = new r(this, 2);
        this.F = new h(this);
    }

    public final void i(boolean z13) {
        if (!z13) {
            LinearLayout linearLayout = this.f48079s;
            if (linearLayout != null) {
                linearLayout.setPaddingRelative(0, 0, 0, 0);
                return;
            }
            return;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(r0.share_sheet_header_y_padding);
        LinearLayout linearLayout2 = this.f48079s;
        if (linearLayout2 != null) {
            linearLayout2.setPaddingRelative(0, dimensionPixelSize, 0, dimensionPixelSize);
        }
    }

    public final void j() {
        h91.a aVar = h91.a.f68311d;
        int size = (aVar.f68313b.size() + aVar.f68312a.size()) - aVar.f68314c.size();
        if (size == 0) {
            BaseModalViewWrapper baseModalViewWrapper = this.f48072l;
            if (baseModalViewWrapper != null) {
                baseModalViewWrapper.l(this.f48083w);
                return;
            } else {
                Intrinsics.r("modalViewWrapper");
                throw null;
            }
        }
        BaseModalViewWrapper baseModalViewWrapper2 = this.f48072l;
        if (baseModalViewWrapper2 != null) {
            baseModalViewWrapper2.p(getResources().getQuantityString(this.f48084x, size, Integer.valueOf(size)));
        } else {
            Intrinsics.r("modalViewWrapper");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f48085y) {
            c cVar = this.f48073m;
            if (cVar == null) {
                Intrinsics.r("contactType");
                throw null;
            }
            int i13 = g.f75122a[cVar.ordinal()];
            if (i13 == 1) {
                this.f48083w = x0.invite_collaborators_literal;
                SendableObject sendableObject = this.f48071k;
                if (sendableObject == null) {
                    Intrinsics.r("sendableObject");
                    throw null;
                }
                this.f48084x = sendableObject.e() ? w0.board_collaborators_selected : w0.plural_collaborators;
            } else if (i13 != 2) {
                this.f48083w = x0.add_recipients;
                this.f48084x = w0.plural_recipient;
            } else {
                this.f48083w = x0.add_recipients;
                this.f48084x = w0.plural_recipient;
            }
            j();
        }
        u.f85943a.h(this.F);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        GestaltSearchField gestaltSearchField = this.f48075o;
        if (gestaltSearchField == null) {
            Intrinsics.r("searchEt");
            throw null;
        }
        hf0.b.k(gestaltSearchField);
        u.f85943a.j(this.F);
        k kVar = this.f48074n;
        if (kVar == null) {
            Intrinsics.r("adapter");
            throw null;
        }
        kVar.b();
        this.C.d();
        super.onDetachedFromWindow();
    }
}
