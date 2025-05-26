package com.pinterest.feature.sharesheet.view;

import af2.c;
import android.content.Context;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.feature.sharesheet.view.ContactSearchListCell;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.components.users.LegoUserRep;
import com.pinterest.ui.imageview.WebImageView;
import d91.l;
import fd1.e;
import fd1.f;
import fd1.g;
import fd1.h;
import fd1.i;
import fd1.j;
import fd1.k;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.s0;
import m60.t0;
import oa2.t;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rl1.n;
import sm1.b;
import ye2.o;
import yk1.d;
import ze0.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/sharesheet/view/ContactSearchListCell;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "contactsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ContactSearchListCell extends LinearLayout implements d, c {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f48383m = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f48384a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48385b;

    /* renamed from: c, reason: collision with root package name */
    public TypeAheadItem f48386c;

    /* renamed from: d, reason: collision with root package name */
    public LegoUserRep f48387d;

    /* renamed from: e, reason: collision with root package name */
    public LinearLayout f48388e;

    /* renamed from: f, reason: collision with root package name */
    public WebImageView f48389f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltText f48390g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f48391h;

    /* renamed from: i, reason: collision with root package name */
    public j f48392i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f48393j;

    /* renamed from: k, reason: collision with root package name */
    public GestaltButton f48394k;

    /* renamed from: l, reason: collision with root package name */
    public s f48395l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactSearchListCell(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        if (!this.f48385b) {
            this.f48385b = true;
            ((k) generatedComponent()).getClass();
        }
        this.f48395l = g.f61911j;
    }

    public final void a(boolean z13) {
        GestaltButton gestaltButton = this.f48394k;
        if (gestaltButton != null) {
            gestaltButton.d(new h(z13, 0));
        } else {
            Intrinsics.r("sendGestaltButton");
            throw null;
        }
    }

    public final void b(TypeAheadItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f48386c = item;
        LegoUserRep legoUserRep = this.f48387d;
        if (legoUserRep == null) {
            Intrinsics.r("legoUserRep");
            throw null;
        }
        legoUserRep.setEnabled(true);
        LegoUserRep legoUserRep2 = this.f48387d;
        if (legoUserRep2 == null) {
            Intrinsics.r("legoUserRep");
            throw null;
        }
        legoUserRep2.y1(a.List);
        LegoUserRep legoUserRep3 = this.f48387d;
        if (legoUserRep3 == null) {
            Intrinsics.r("legoUserRep");
            throw null;
        }
        legoUserRep3.B0(true);
        LegoUserRep legoUserRep4 = this.f48387d;
        if (legoUserRep4 == null) {
            Intrinsics.r("legoUserRep");
            throw null;
        }
        String n13 = item.n();
        Intrinsics.checkNotNullExpressionValue(n13, "getTitle(...)");
        t.i4(legoUserRep4, n13, 0, null, 14);
        LegoUserRep legoUserRep5 = this.f48387d;
        if (legoUserRep5 == null) {
            Intrinsics.r("legoUserRep");
            throw null;
        }
        String description = getResources().getString(le0.h.content_description_user_avatar, item.n());
        Intrinsics.checkNotNullExpressionValue(description, "getString(...)");
        Intrinsics.checkNotNullParameter(description, "description");
        legoUserRep5.setContentDescription(description);
        LegoUserRep legoUserRep6 = this.f48387d;
        if (legoUserRep6 == null) {
            Intrinsics.r("legoUserRep");
            throw null;
        }
        legoUserRep6.t0(false);
        LegoUserRep legoUserRep7 = this.f48387d;
        if (legoUserRep7 == null) {
            Intrinsics.r("legoUserRep");
            throw null;
        }
        legoUserRep7.r0(false);
        TypeAheadItem typeAheadItem = this.f48386c;
        if (typeAheadItem == null) {
            Intrinsics.r("item");
            throw null;
        }
        er.c cVar = typeAheadItem.f35145f;
        String l13 = typeAheadItem.l();
        if (l13 == null || l13.length() == 0) {
            LegoUserRep legoUserRep8 = this.f48387d;
            if (legoUserRep8 == null) {
                Intrinsics.r("legoUserRep");
                throw null;
            }
            legoUserRep8.setVisibility(8);
            LinearLayout linearLayout = this.f48388e;
            if (linearLayout == null) {
                Intrinsics.r("placeHolderContainer");
                throw null;
            }
            linearLayout.setVisibility(0);
            GestaltText gestaltText = this.f48390g;
            if (gestaltText == null) {
                Intrinsics.r("placeholderText");
                throw null;
            }
            TypeAheadItem typeAheadItem2 = this.f48386c;
            if (typeAheadItem2 == null) {
                Intrinsics.r("item");
                throw null;
            }
            String n14 = typeAheadItem2.n();
            Intrinsics.checkNotNullExpressionValue(n14, "getTitle(...)");
            a0.p(gestaltText, n14);
            int i13 = cVar == null ? -1 : f.f61910a[cVar.ordinal()];
            if (i13 == 1) {
                WebImageView webImageView = this.f48389f;
                if (webImageView == null) {
                    Intrinsics.r("placeHolderAvatar");
                    throw null;
                }
                webImageView.setImageResource(s0.ic_cell_facebook_nonpds);
            } else if (i13 == 2) {
                WebImageView webImageView2 = this.f48389f;
                if (webImageView2 == null) {
                    Intrinsics.r("placeHolderAvatar");
                    throw null;
                }
                webImageView2.setImageResource(s0.ic_cell_email_nonpds);
            } else if (i13 == 3) {
                WebImageView webImageView3 = this.f48389f;
                if (webImageView3 == null) {
                    Intrinsics.r("placeHolderAvatar");
                    throw null;
                }
                webImageView3.setImageResource(s0.ic_cell_facebook_nonpds);
            } else if (i13 != 4) {
                LegoUserRep legoUserRep9 = this.f48387d;
                if (legoUserRep9 == null) {
                    Intrinsics.r("legoUserRep");
                    throw null;
                }
                legoUserRep9.setVisibility(0);
                LinearLayout linearLayout2 = this.f48388e;
                if (linearLayout2 == null) {
                    Intrinsics.r("placeHolderContainer");
                    throw null;
                }
                linearLayout2.setVisibility(8);
                LegoUserRep legoUserRep10 = this.f48387d;
                if (legoUserRep10 == null) {
                    Intrinsics.r("legoUserRep");
                    throw null;
                }
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                rl1.g f13 = n.f(context);
                TypeAheadItem typeAheadItem3 = this.f48386c;
                if (typeAheadItem3 == null) {
                    Intrinsics.r("item");
                    throw null;
                }
                String n15 = typeAheadItem3.n();
                Intrinsics.checkNotNullExpressionValue(n15, "getTitle(...)");
                legoUserRep10.H0(n.c(f13, "", n15, false));
            } else {
                int W = bs1.c.W(this, eo1.c.lego_icon_padding);
                InsetDrawable insetDrawable = new InsetDrawable(bs1.c.l2(this, b.ic_people_gestalt, eo1.b.color_white_0), W, W, W, W);
                WebImageView webImageView4 = this.f48389f;
                if (webImageView4 == null) {
                    Intrinsics.r("placeHolderAvatar");
                    throw null;
                }
                webImageView4.setBackgroundColor(bs1.c.B(this, eo1.b.color_themed_base_red_300));
                WebImageView webImageView5 = this.f48389f;
                if (webImageView5 == null) {
                    Intrinsics.r("placeHolderAvatar");
                    throw null;
                }
                webImageView5.setImageDrawable(insetDrawable);
            }
            WebImageView webImageView6 = this.f48389f;
            if (webImageView6 == null) {
                Intrinsics.r("placeHolderAvatar");
                throw null;
            }
            webImageView6.i2(true);
        } else {
            LegoUserRep legoUserRep11 = this.f48387d;
            if (legoUserRep11 == null) {
                Intrinsics.r("legoUserRep");
                throw null;
            }
            legoUserRep11.setVisibility(0);
            LinearLayout linearLayout3 = this.f48388e;
            if (linearLayout3 == null) {
                Intrinsics.r("placeHolderContainer");
                throw null;
            }
            linearLayout3.setVisibility(8);
            LegoUserRep legoUserRep12 = this.f48387d;
            if (legoUserRep12 == null) {
                Intrinsics.r("legoUserRep");
                throw null;
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            rl1.g f14 = n.f(context2);
            TypeAheadItem typeAheadItem4 = this.f48386c;
            if (typeAheadItem4 == null) {
                Intrinsics.r("item");
                throw null;
            }
            String l14 = typeAheadItem4.l();
            Intrinsics.g(l14, "null cannot be cast to non-null type kotlin.String");
            TypeAheadItem typeAheadItem5 = this.f48386c;
            if (typeAheadItem5 == null) {
                Intrinsics.r("item");
                throw null;
            }
            String n16 = typeAheadItem5.n();
            Intrinsics.checkNotNullExpressionValue(n16, "getTitle(...)");
            legoUserRep12.H0(n.c(f14, l14, n16, false));
        }
        View findViewById = findViewById(vc0.b.inline_send_gestalt_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        this.f48394k = gestaltButton;
        if (gestaltButton != null) {
            gestaltButton.g(new lc1.b(this, 11));
        } else {
            Intrinsics.r("sendGestaltButton");
            throw null;
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f48384a == null) {
            this.f48384a = new o(this);
        }
        return this.f48384a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(final int i13, String inlineButtonText, String inlineButtonPressedText, HashMap sentToIds, g91.c contactType) {
        boolean z13;
        Intrinsics.checkNotNullParameter(inlineButtonText, "inlineButtonText");
        Intrinsics.checkNotNullParameter(inlineButtonPressedText, "inlineButtonPressedText");
        Intrinsics.checkNotNullParameter(sentToIds, "sentToIds");
        Intrinsics.checkNotNullParameter(contactType, "contactType");
        LinearLayout linearLayout = (LinearLayout) findViewById(vc0.b.view_chat_button_container);
        ((GestaltText) findViewById(t0.lego_user_rep_metadata)).i(i.f61928k);
        ((GestaltButton) findViewById(t0.user_rep_action_button)).setVisibility(8);
        TypeAheadItem typeAheadItem = this.f48386c;
        if (typeAheadItem == null) {
            Intrinsics.r("item");
            throw null;
        }
        er.c cVar = typeAheadItem.f35145f;
        final int i14 = 1;
        final int i15 = 0;
        byte b13 = cVar == er.c.CONNECT_FB_PLACEHOLDER;
        byte b14 = cVar == er.c.SYNC_CONTACTS_PLACEHOLDER;
        a((b13 == true || b14 == true) ? false : true);
        linearLayout.setVisibility((b13 == true || b14 == true) ? 8 : 0);
        if (b13 == true) {
            setOnClickListener(new View.OnClickListener(this) { // from class: fd1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ContactSearchListCell f61882b;

                {
                    this.f61882b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i16 = i15;
                    int i17 = i13;
                    ContactSearchListCell this$0 = this.f61882b;
                    switch (i16) {
                        case 0:
                            int i18 = ContactSearchListCell.f48383m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            j jVar = this$0.f48392i;
                            if (jVar != null) {
                                dr.k kVar = (dr.k) jVar;
                                h32.f1 f1Var = h32.f1.TAP;
                                kVar.f56205t.w((FragmentActivity) bs1.c.k0(kVar.f56199n), e82.w.FACEBOOK);
                                HashMap hashMap = new HashMap();
                                hashMap.put("entered_query", "");
                                hashMap.put("result_index", String.valueOf(i17));
                                kVar.D.h0(f1Var, h32.u0.SEARCH_CONTACT_LIST_ITEM, h32.g0.SOCIAL_TYPEAHEAD_SUGGESTIONS, null, hashMap, null, null, false);
                                break;
                            }
                            break;
                        default:
                            int i19 = ContactSearchListCell.f48383m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            j jVar2 = this$0.f48392i;
                            if (jVar2 != null) {
                                dr.k kVar2 = (dr.k) jVar2;
                                kVar2.C.d(new of0.a(new ap.g(new dr.g(kVar2, i17))));
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (b14 == true) {
            setOnClickListener(new View.OnClickListener(this) { // from class: fd1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ContactSearchListCell f61882b;

                {
                    this.f61882b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i16 = i14;
                    int i17 = i13;
                    ContactSearchListCell this$0 = this.f61882b;
                    switch (i16) {
                        case 0:
                            int i18 = ContactSearchListCell.f48383m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            j jVar = this$0.f48392i;
                            if (jVar != null) {
                                dr.k kVar = (dr.k) jVar;
                                h32.f1 f1Var = h32.f1.TAP;
                                kVar.f56205t.w((FragmentActivity) bs1.c.k0(kVar.f56199n), e82.w.FACEBOOK);
                                HashMap hashMap = new HashMap();
                                hashMap.put("entered_query", "");
                                hashMap.put("result_index", String.valueOf(i17));
                                kVar.D.h0(f1Var, h32.u0.SEARCH_CONTACT_LIST_ITEM, h32.g0.SOCIAL_TYPEAHEAD_SUGGESTIONS, null, hashMap, null, null, false);
                                break;
                            }
                            break;
                        default:
                            int i19 = ContactSearchListCell.f48383m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            j jVar2 = this$0.f48392i;
                            if (jVar2 != null) {
                                dr.k kVar2 = (dr.k) jVar2;
                                kVar2.C.d(new of0.a(new ap.g(new dr.g(kVar2, i17))));
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        GestaltText gestaltText = (GestaltText) findViewById(vc0.b.inline_send_confirmation);
        TypeAheadItem typeAheadItem2 = this.f48386c;
        if (typeAheadItem2 == null) {
            Intrinsics.r("item");
            throw null;
        }
        byte b15 = typeAheadItem2.f35145f == er.c.EMAIL_PLACEHOLDER;
        LinearLayout linearLayout2 = (LinearLayout) findViewById(vc0.b.view_chat_button_container);
        Intrinsics.f(gestaltText);
        a0.k0(gestaltText);
        linearLayout2.setVisibility(8);
        GestaltButton gestaltButton = this.f48394k;
        if (gestaltButton == null) {
            Intrinsics.r("sendGestaltButton");
            throw null;
        }
        gestaltButton.d(new l(inlineButtonText, 11));
        if (this.f48393j) {
            this.f48395l = new h81.b(this, 21);
            return;
        }
        if (b15 == true) {
            TypeAheadItem typeAheadItem3 = this.f48386c;
            if (typeAheadItem3 == null) {
                Intrinsics.r("item");
                throw null;
            }
            boolean c13 = tr1.b.c(typeAheadItem3.k());
            GestaltButton gestaltButton2 = this.f48394k;
            if (gestaltButton2 == null) {
                Intrinsics.r("sendGestaltButton");
                throw null;
            }
            gestaltButton2.d(new h(c13, i14));
        } else {
            GestaltButton gestaltButton3 = this.f48394k;
            if (gestaltButton3 == null) {
                Intrinsics.r("sendGestaltButton");
                throw null;
            }
            gestaltButton3.d(i.f61927j);
        }
        TypeAheadItem typeAheadItem4 = this.f48386c;
        if (typeAheadItem4 == null) {
            Intrinsics.r("item");
            throw null;
        }
        String A = typeAheadItem4.A();
        if (A != null && sentToIds.containsKey(A)) {
            if (contactType != g91.c.RECIPIENT || sentToIds.get(A) == null) {
                z13 = false;
                gestaltText.i(new l(inlineButtonPressedText, 12));
            } else {
                String str = (String) sentToIds.get(A);
                z13 = false;
                linearLayout2.setVisibility(0);
                linearLayout2.setOnClickListener(new e(0 == true ? 1 : 0, str, this));
            }
            a(z13);
        }
        this.f48395l = new b2.t(this, i13, 8);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f48384a == null) {
            this.f48384a = new o(this);
        }
        return this.f48384a.generatedComponent();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(vc0.b.lego_user_list_rep);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48387d = (LegoUserRep) findViewById;
        View findViewById2 = findViewById(vc0.b.image_placeholder);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48389f = (WebImageView) findViewById2;
        View findViewById3 = findViewById(vc0.b.image_placeholder_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48388e = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(vc0.b.placeholder_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48390g = (GestaltText) findViewById4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactSearchListCell(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        if (!this.f48385b) {
            this.f48385b = true;
            ((k) generatedComponent()).getClass();
        }
        this.f48395l = g.f61911j;
    }
}
