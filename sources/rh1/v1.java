package rh1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.activity.pin.view.unifiedcomments.CommentsQuickReplies;
import com.pinterest.activity.pin.view.unifiedcomments.NewCommentTextEdit;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.unifiedcomments.CommentsFeatureLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.ui.imageview.WebImageView;
import h32.a4;
import h32.d4;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import so.u6;
import x02.l2;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrh1/v1;", "Lyk1/k;", "Lcom/pinterest/feature/unifiedcomments/g;", "Lzp0/h;", "<init>", "()V", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class v1 extends b1 implements com.pinterest.feature.unifiedcomments.g, zp0.h {
    public static final /* synthetic */ int S0 = 0;
    public GestaltDivider A0;
    public GestaltText B0;
    public HorizontalScrollView C0;
    public GestaltButton D0;
    public GestaltText E0;
    public boolean F0;
    public int G0;
    public float H0;
    public int K0;
    public com.pinterest.feature.unifiedcomments.f N0;
    public String P0;
    public String Q0;
    public Integer R0;

    /* renamed from: j0, reason: collision with root package name */
    public u6 f108307j0;

    /* renamed from: k0, reason: collision with root package name */
    public nx.f0 f108308k0;

    /* renamed from: l0, reason: collision with root package name */
    public uk1.e f108309l0;

    /* renamed from: m0, reason: collision with root package name */
    public l2 f108310m0;

    /* renamed from: n0, reason: collision with root package name */
    public up0.l f108311n0;

    /* renamed from: o0, reason: collision with root package name */
    public hf0.c f108312o0;

    /* renamed from: p0, reason: collision with root package name */
    public zp.j f108313p0;

    /* renamed from: q0, reason: collision with root package name */
    public lb0.r f108314q0;

    /* renamed from: r0, reason: collision with root package name */
    public View f108315r0;

    /* renamed from: s0, reason: collision with root package name */
    public ConstraintLayout f108316s0;

    /* renamed from: t0, reason: collision with root package name */
    public GestaltIconButton f108317t0;

    /* renamed from: u0, reason: collision with root package name */
    public GestaltText f108318u0;

    /* renamed from: v0, reason: collision with root package name */
    public NewCommentTextEdit f108319v0;

    /* renamed from: w0, reason: collision with root package name */
    public WebImageView f108320w0;

    /* renamed from: x0, reason: collision with root package name */
    public GestaltIconButton f108321x0;

    /* renamed from: y0, reason: collision with root package name */
    public GestaltIconButton f108322y0;

    /* renamed from: z0, reason: collision with root package name */
    public GestaltIconButton f108323z0;
    public final xk2.v I0 = xk2.m.b(new s1(this, 1));
    public final Handler J0 = new Handler(Looper.getMainLooper());
    public final xk2.v L0 = xk2.m.b(new s1(this, 2));
    public final t1 M0 = new t1(this);
    public final com.google.android.material.search.e O0 = new com.google.android.material.search.e(this, 4);

    public v1() {
        this.E = db0.d.new_comment_view;
    }

    @Override // yk1.k, nl1.d
    public final void K7() {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        super.K7();
        NewCommentTextEdit newCommentTextEdit = this.f108319v0;
        if (newCommentTextEdit == null) {
            Intrinsics.r("textEdit");
            throw null;
        }
        newCommentTextEdit.requestFocus();
        newCommentTextEdit.setSelection(0);
        this.J0.postDelayed(new p1(this, 0), 500L);
        View view = getView();
        if (view == null || (rootView = view.getRootView()) == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.L0.getValue());
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        View view = getView();
        if (view != null && (rootView = view.getRootView()) != null && (viewTreeObserver = rootView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.L0.getValue());
        }
        super.L7();
        NewCommentTextEdit newCommentTextEdit = this.f108319v0;
        if (newCommentTextEdit == null) {
            Intrinsics.r("textEdit");
            throw null;
        }
        newCommentTextEdit.clearFocus();
        NewCommentTextEdit newCommentTextEdit2 = this.f108319v0;
        if (newCommentTextEdit2 != null) {
            hf0.b.k(newCommentTextEdit2);
        } else {
            Intrinsics.r("textEdit");
            throw null;
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f108309l0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        g13.d(getB0(), getF143270o0(), null, getF50445f(), null);
        g13.f122380b = c8();
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_COMMENT_PARENT_PAIR_ID") : null;
        if (v03 != null) {
            g13.f122383e = v03;
        }
        u6 u6Var = this.f108307j0;
        if (u6Var == null) {
            Intrinsics.r("newCommentPresenterFactory");
            throw null;
        }
        String c83 = c8();
        Navigation navigation2 = this.I;
        String v04 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_COMMENT_ID") : null;
        Navigation navigation3 = this.I;
        String v05 = navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_COMMENT_TYPE") : null;
        String e83 = e8();
        Navigation navigation4 = this.I;
        String v06 = navigation4 != null ? navigation4.v0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_COMMENT_TYPE") : null;
        Navigation navigation5 = this.I;
        boolean S = navigation5 != null ? navigation5.S("com.pinterest.EXTRA_COMPOSE_SHOW_BLANK_ONLY", false) : false;
        Navigation navigation6 = this.I;
        return u6Var.a(g13, c83, v04, v05, e83, v06, S, navigation6 != null ? navigation6.S("com.pinterest.EXTRA_COMMENT_GO_TO_THREAD_ON_POST", false) : false, new yk1.a(getResources(), requireContext().getTheme()));
    }

    @Override // zp0.h
    public final void Y(SpannableStringBuilder updated) {
        Intrinsics.checkNotNullParameter(updated, "updated");
        NewCommentTextEdit newCommentTextEdit = this.f108319v0;
        if (newCommentTextEdit == null) {
            Intrinsics.r("textEdit");
            throw null;
        }
        newCommentTextEdit.setText(updated);
        newCommentTextEdit.post(new r1(newCommentTextEdit, 0));
        j8();
    }

    public final ca2.e b8() {
        return (ca2.e) this.I0.getValue();
    }

    public final String c8() {
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        return f49940b == null ? "" : f49940b;
    }

    public final lb0.r d8() {
        lb0.r rVar = this.f108314q0;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.r("prefsManagerUser");
        throw null;
    }

    public final String e8() {
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.v0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_COMMENT_ID");
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r1.length() != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f8(boolean r4) {
        /*
            r3 = this;
            com.pinterest.gestalt.iconbutton.GestaltIconButton r0 = r3.f108322y0
            r1 = 0
            if (r0 == 0) goto L28
            r2 = 1
            r4 = r4 ^ r2
            if (r4 == 0) goto L1c
            com.pinterest.navigation.Navigation r4 = r3.I
            if (r4 == 0) goto L13
            java.lang.String r1 = "com.pinterest.EXTRA_COMMENT_TYPE"
            java.lang.String r1 = r4.v0(r1)
        L13:
            if (r1 == 0) goto L1d
            int r4 = r1.length()
            if (r4 != 0) goto L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            fd1.h r4 = new fd1.h
            r1 = 24
            r4.<init>(r2, r1)
            r0.t(r4)
            return
        L28:
            java.lang.String r4 = "addPhotoButton"
            kotlin.jvm.internal.Intrinsics.r(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rh1.v1.f8(boolean):void");
    }

    public final void g8(fm1.c cVar) {
        GestaltText gestaltText = this.B0;
        if (gestaltText == null) {
            Intrinsics.r("characterCountText");
            throw null;
        }
        gestaltText.i(new qp.j(1, cVar));
        GestaltButton gestaltButton = this.D0;
        if (gestaltButton != null) {
            gestaltButton.setVisibility(cVar.getVisibility());
        } else {
            Intrinsics.r("postButton");
            throw null;
        }
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final h32.g0 getF50445f() {
        String v03;
        h32.g0 valueOf;
        Navigation navigation = this.I;
        return (navigation == null || (v03 = navigation.v0("com.pinterest.EXTRA_COMMENT_COMPONENT")) == null || (valueOf = h32.g0.valueOf(v03)) == null) ? h32.g0.COMMENT_COMPOSER : valueOf;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF143270o0() {
        String v03;
        Navigation navigation = this.I;
        if (navigation == null || (v03 = navigation.v0("com.pinterest.EXTRA_COMMENT_VIEW_PARAMETER")) == null) {
            return null;
        }
        return a4.valueOf(v03);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getB0() {
        String v03;
        d4 valueOf;
        Navigation navigation = this.I;
        return (navigation == null || (v03 = navigation.v0("com.pinterest.EXTRA_COMMENT_VIEW_TYPE")) == null || (valueOf = d4.valueOf(v03)) == null) ? d4.PIN_COMMENTS : valueOf;
    }

    public final void h8(String text, List list) {
        SpannableStringBuilder spannableStringBuilder;
        Intrinsics.checkNotNullParameter(text, "text");
        if (list != null) {
            up0.l lVar = this.f108311n0;
            if (lVar == null) {
                Intrinsics.r("typeaheadTextUtility");
                throw null;
            }
            NewCommentTextEdit newCommentTextEdit = this.f108319v0;
            if (newCommentTextEdit == null) {
                Intrinsics.r("textEdit");
                throw null;
            }
            Context context = newCommentTextEdit.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            spannableStringBuilder = up0.l.c(lVar, context, text + " ", list);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(text);
        }
        Y(spannableStringBuilder);
    }

    public final void i8() {
        if (this.f108312o0 == null) {
            Intrinsics.r("deviceInfoProvider");
            throw null;
        }
        int f13 = (int) (((hf0.b.f69003c - b8().f()) - this.K0) * this.H0);
        ConstraintLayout constraintLayout = this.f108316s0;
        if (constraintLayout == null) {
            Intrinsics.r("newCommentLayout");
            throw null;
        }
        int X = bs1.c.X(this, eo1.c.space_200) + ((constraintLayout.getHeight() - b8().f()) - f13);
        GestaltButton gestaltButton = this.D0;
        if (gestaltButton == null) {
            Intrinsics.r("postButton");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = gestaltButton.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = X;
        gestaltButton.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j8() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rh1.v1.j8():void");
    }

    @Override // zp0.h
    public final void n6() {
    }

    @Override // yk1.k, androidx.fragment.app.Fragment
    public final void onActivityResult(int i13, int i14, Intent intent) {
        Context context;
        ContentResolver contentResolver;
        super.onActivityResult(i13, i14, intent);
        if (i13 == 970) {
            nx.d0 s73 = s7();
            if (i14 == 0) {
                s73.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.PHOTO_COMMENT_PICKER_CANCELED, (r18 & 2) != 0 ? null : h32.u0.CANCEL_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : c8(), (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                return;
            }
            if (intent != null) {
                try {
                    Uri data = intent.getData();
                    if (data == null || (context = getContext()) == null || (contentResolver = context.getContentResolver()) == null) {
                        return;
                    }
                    Cursor query = contentResolver.query(data, null, null, null, null);
                    if (query != null) {
                        query.moveToFirst();
                        String string = query.getString(query.getColumnIndex("_data"));
                        com.pinterest.feature.unifiedcomments.g.u4(this, false, new File(string), null, 4);
                        this.P0 = string;
                    }
                    nx.d0.v(s73, h32.f1.PHOTO_COMMENT_PICKER_PHOTO_SELECTED, c8(), false, 12);
                } catch (Exception e13) {
                    h32.f1 f1Var = h32.f1.PHOTO_COMMENT_PICKER_PHOTO_SELECTION_FAILED;
                    String c83 = c8();
                    HashMap hashMap = new HashMap();
                    String localizedMessage = e13.getLocalizedMessage();
                    if (localizedMessage == null) {
                        localizedMessage = "";
                    }
                    hashMap.put("error_message", localizedMessage);
                    Unit unit = Unit.f80348a;
                    s73.g(f1Var, c83, hashMap, false);
                }
            }
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f7().h(this.M0);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        jk2.x g13;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Navigation navigation = this.I;
        this.P0 = navigation != null ? navigation.v0("com.pinterest.EXTRA_PHOTO_PATH") : null;
        Navigation navigation2 = this.I;
        this.Q0 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_COMMENT_STICKER_ID") : null;
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(db0.c.new_comment_background);
        bs1.c.U1(findViewById);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f108315r0 = findViewById;
        View findViewById2 = onCreateView.findViewById(db0.c.new_comment);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById2;
        Context requireContext = requireContext();
        int i13 = m60.s0.rounded_top_rect_radius_40;
        Object obj = d5.a.f53679a;
        constraintLayout.setBackground(requireContext.getDrawable(i13));
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((androidx.coordinatorlayout.widget.c) layoutParams).d(new BottomSheetBehavior());
        constraintLayout.addOnLayoutChangeListener(new androidx.media3.ui.h(this, 4));
        constraintLayout.requestLayout();
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f108316s0 = constraintLayout;
        View findViewById3 = onCreateView.findViewById(db0.c.half_sheet_close);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f108317t0 = (GestaltIconButton) findViewById3;
        View findViewById4 = onCreateView.findViewById(db0.c.half_sheet_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f108318u0 = (GestaltText) findViewById4;
        View findViewById5 = onCreateView.findViewById(db0.c.photo_preview);
        WebImageView webImageView = (WebImageView) findViewById5;
        final int i14 = 1;
        webImageView.f52569u = true;
        webImageView.Y(new oq.i(this, 15));
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        this.f108320w0 = webImageView;
        View findViewById6 = onCreateView.findViewById(db0.c.photo_preview_remove_button);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById6;
        final int i15 = 0;
        gestaltIconButton.u(new gm1.a(this) { // from class: rh1.m1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v1 f108254b;

            {
                this.f108254b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i16 = i15;
                v1 this$0 = this.f108254b;
                switch (i16) {
                    case 0:
                        int i17 = v1.S0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            GestaltIconButton gestaltIconButton2 = this$0.f108321x0;
                            if (gestaltIconButton2 == null) {
                                Intrinsics.r("photoPreviewRemoveButton");
                                throw null;
                            }
                            com.bumptech.glide.c.d0(gestaltIconButton2);
                            this$0.P0 = null;
                            this$0.Q0 = null;
                            com.pinterest.feature.unifiedcomments.g.u4(this$0, false, null, null, 6);
                            this$0.s7().X(h32.u0.COMMENT_COMPOSER_IMAGE_CLOSE_BUTTON);
                            return;
                        }
                        return;
                    case 1:
                        int i18 = v1.S0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.P7();
                            return;
                        }
                        return;
                    default:
                        int i19 = v1.S0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        nx.d0.v(this$0.s7(), h32.f1.AGGREGATED_COMMENT_COMMUNITY_GUIDELINE_BANNER_CLICK, null, false, 12);
                        this$0.f7().d(Navigation.z0(com.pinterest.screens.v0.a(), this$0.getString(fb0.f.url_community_guidelines)));
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        this.f108321x0 = gestaltIconButton;
        View findViewById7 = onCreateView.findViewById(db0.c.add_photo_button);
        GestaltIconButton gestaltIconButton2 = (GestaltIconButton) findViewById7;
        String e83 = e8();
        if (e83 == null || e83.length() == 0) {
            Intrinsics.f(gestaltIconButton2);
            com.bumptech.glide.c.u1(gestaltIconButton2);
            gestaltIconButton2.setOnClickListener(new fd1.e(12, this, gestaltIconButton2));
        }
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        this.f108322y0 = gestaltIconButton2;
        View findViewById8 = onCreateView.findViewById(db0.c.add_sticker_button);
        GestaltIconButton gestaltIconButton3 = (GestaltIconButton) findViewById8;
        String e84 = e8();
        if (e84 == null || e84.length() == 0) {
            Intrinsics.f(gestaltIconButton3);
            com.bumptech.glide.c.u1(gestaltIconButton3);
            gestaltIconButton3.setOnClickListener(new View.OnClickListener(this) { // from class: rh1.n1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v1 f108259b;

                {
                    this.f108259b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i16 = i15;
                    v1 this$0 = this.f108259b;
                    switch (i16) {
                        case 0:
                            int i17 = v1.S0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            m60.w f73 = this$0.f7();
                            NavigationImpl z03 = Navigation.z0(CommentsFeatureLocation.COMMENT_STICKERS, this$0.c8());
                            Navigation navigation3 = this$0.I;
                            String v03 = navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_AGGREGATED_UID") : null;
                            if (v03 == null) {
                                v03 = "";
                            }
                            z03.m0("com.pinterest.EXTRA_AGGREGATED_UID", v03);
                            f73.d(z03);
                            this$0.s7().F(h32.g0.COMMENT_COMPOSER, h32.u0.STICKER_COMMENT_BUTTON);
                            return;
                        default:
                            int i18 = v1.S0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            View view2 = this$0.f108315r0;
                            if (view2 == null) {
                                Intrinsics.r("backgroundOverlay");
                                throw null;
                            }
                            bs1.c.X0(view2);
                            ca2.e b83 = this$0.b8();
                            if (this$0.f108312o0 != null) {
                                ca2.e.i(b83, "navigation", hf0.b.f69003c - this$0.b8().g(), null, 4);
                                return;
                            } else {
                                Intrinsics.r("deviceInfoProvider");
                                throw null;
                            }
                    }
                }
            });
        }
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        this.f108323z0 = gestaltIconButton3;
        View findViewById9 = onCreateView.findViewById(db0.c.add_photo_button_divider);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.A0 = (GestaltDivider) findViewById9;
        View findViewById10 = onCreateView.findViewById(db0.c.character_count);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.B0 = (GestaltText) findViewById10;
        View findViewById11 = onCreateView.findViewById(db0.c.post_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById11;
        gestaltButton.e(new la1.k(10, this, gestaltButton));
        Intrinsics.checkNotNullExpressionValue(findViewById11, "apply(...)");
        this.D0 = gestaltButton;
        View findViewById12 = onCreateView.findViewById(db0.c.text_edit);
        final NewCommentTextEdit newCommentTextEdit = (NewCommentTextEdit) findViewById12;
        newCommentTextEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: rh1.o1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z13) {
                int i16 = v1.S0;
                v1 this$0 = v1.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (z13) {
                    this$0.J0.post(new r1(newCommentTextEdit, 1));
                }
            }
        });
        newCommentTextEdit.setMovementMethod(LinkMovementMethod.getInstance());
        newCommentTextEdit.addTextChangedListener(new up0.a(newCommentTextEdit, new s1(this, 3)));
        newCommentTextEdit.addTextChangedListener(this.O0);
        ViewGroup.LayoutParams layoutParams2 = newCommentTextEdit.getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.topMargin = bs1.c.W(newCommentTextEdit, eo1.c.space_600);
        newCommentTextEdit.setLayoutParams(marginLayoutParams);
        newCommentTextEdit.j(new gv0.b(this, 26));
        Navigation navigation3 = this.I;
        if ((navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_COMMENT_HINT_TEXT") : null) != null) {
            Navigation navigation4 = this.I;
            newCommentTextEdit.setHint(navigation4 != null ? navigation4.v0("com.pinterest.EXTRA_COMMENT_HINT_TEXT") : null);
        }
        this.R0 = Integer.valueOf(newCommentTextEdit.getLineCount());
        Intrinsics.checkNotNullExpressionValue(findViewById12, "apply(...)");
        this.f108319v0 = newCommentTextEdit;
        View findViewById13 = onCreateView.findViewById(db0.c.comments_quick_replies_hscroll_view);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.C0 = (HorizontalScrollView) findViewById13;
        View findViewById14 = onCreateView.findViewById(db0.c.comments_quick_replies);
        CommentsQuickReplies commentsQuickReplies = (CommentsQuickReplies) findViewById14;
        final int i16 = 2;
        commentsQuickReplies.k(new u1(this, i16));
        commentsQuickReplies.l(getF143270o0());
        commentsQuickReplies.m(getB0());
        nx.f0 f0Var = this.f108308k0;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        commentsQuickReplies.i(f0Var, c8());
        Intrinsics.checkNotNullExpressionValue(findViewById14, "apply(...)");
        GestaltIconButton gestaltIconButton4 = this.f108317t0;
        if (gestaltIconButton4 == null) {
            Intrinsics.r("closeButton");
            throw null;
        }
        gestaltIconButton4.u(new gm1.a(this) { // from class: rh1.m1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v1 f108254b;

            {
                this.f108254b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i162 = i14;
                v1 this$0 = this.f108254b;
                switch (i162) {
                    case 0:
                        int i17 = v1.S0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            GestaltIconButton gestaltIconButton22 = this$0.f108321x0;
                            if (gestaltIconButton22 == null) {
                                Intrinsics.r("photoPreviewRemoveButton");
                                throw null;
                            }
                            com.bumptech.glide.c.d0(gestaltIconButton22);
                            this$0.P0 = null;
                            this$0.Q0 = null;
                            com.pinterest.feature.unifiedcomments.g.u4(this$0, false, null, null, 6);
                            this$0.s7().X(h32.u0.COMMENT_COMPOSER_IMAGE_CLOSE_BUTTON);
                            return;
                        }
                        return;
                    case 1:
                        int i18 = v1.S0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.P7();
                            return;
                        }
                        return;
                    default:
                        int i19 = v1.S0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        nx.d0.v(this$0.s7(), h32.f1.AGGREGATED_COMMENT_COMMUNITY_GUIDELINE_BANNER_CLICK, null, false, 12);
                        this$0.f7().d(Navigation.z0(com.pinterest.screens.v0.a(), this$0.getString(fb0.f.url_community_guidelines)));
                        return;
                }
            }
        });
        GestaltText gestaltText = this.f108318u0;
        if (gestaltText == null) {
            Intrinsics.r("titleTextView");
            throw null;
        }
        Navigation navigation5 = this.I;
        if ((navigation5 != null ? navigation5.v0("com.pinterest.EXTRA_COMMENT_ID") : null) != null) {
            gestaltText.i(j.f108184v);
        }
        gestaltText.i(j.f108185w);
        if (e8() != null) {
            NewCommentTextEdit newCommentTextEdit2 = this.f108319v0;
            if (newCommentTextEdit2 == null) {
                Intrinsics.r("textEdit");
                throw null;
            }
            newCommentTextEdit2.setHint(getString(rf0.c.unified_comments_reply_composer_hint));
        }
        Navigation navigation6 = this.I;
        if (navigation6 != null && navigation6.S("com.pinterest.EXTRA_COMPOSE_SHOW_BLANK_ONLY", false)) {
            NewCommentTextEdit newCommentTextEdit3 = this.f108319v0;
            if (newCommentTextEdit3 == null) {
                Intrinsics.r("textEdit");
                throw null;
            }
            newCommentTextEdit3.setEnabled(false);
        }
        if (this.f108311n0 == null) {
            Intrinsics.r("typeaheadTextUtility");
            throw null;
        }
        NewCommentTextEdit newCommentTextEdit4 = this.f108319v0;
        if (newCommentTextEdit4 == null) {
            Intrinsics.r("textEdit");
            throw null;
        }
        g13 = up0.l.g(newCommentTextEdit4, null, null);
        xj2.c F = g13.o().F(new oh1.a(29, new u1(this, i15)), new q1(0, j.f108183u), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        R6(F);
        View findViewById15 = onCreateView.findViewById(db0.c.community_guidelines_banner);
        GestaltText gestaltText2 = (GestaltText) findViewById15;
        if (!d8().f("PREF_COMMENT_WARNING_BANNER_SEEN", false) && !d8().f("PREF_COMMENT_CODE_MODAL_IS_ACCEPTED", false)) {
            gestaltText2.j(new gm1.a(this) { // from class: rh1.m1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v1 f108254b;

                {
                    this.f108254b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i162 = i16;
                    v1 this$0 = this.f108254b;
                    switch (i162) {
                        case 0:
                            int i17 = v1.S0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                GestaltIconButton gestaltIconButton22 = this$0.f108321x0;
                                if (gestaltIconButton22 == null) {
                                    Intrinsics.r("photoPreviewRemoveButton");
                                    throw null;
                                }
                                com.bumptech.glide.c.d0(gestaltIconButton22);
                                this$0.P0 = null;
                                this$0.Q0 = null;
                                com.pinterest.feature.unifiedcomments.g.u4(this$0, false, null, null, 6);
                                this$0.s7().X(h32.u0.COMMENT_COMPOSER_IMAGE_CLOSE_BUTTON);
                                return;
                            }
                            return;
                        case 1:
                            int i18 = v1.S0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.P7();
                                return;
                            }
                            return;
                        default:
                            int i19 = v1.S0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            nx.d0.v(this$0.s7(), h32.f1.AGGREGATED_COMMENT_COMMUNITY_GUIDELINE_BANNER_CLICK, null, false, 12);
                            this$0.f7().d(Navigation.z0(com.pinterest.screens.v0.a(), this$0.getString(fb0.f.url_community_guidelines)));
                            return;
                    }
                }
            });
            gestaltText2.i(j.f108186x);
            d8().i("PREF_COMMENT_WARNING_BANNER_SEEN", true);
        }
        Intrinsics.checkNotNullExpressionValue(findViewById15, "apply(...)");
        this.E0 = gestaltText2;
        if (gestaltText2 == null) {
            Intrinsics.r("communityGuidelineBanner");
            throw null;
        }
        this.G0 = bs1.c.W(onCreateView, gestaltText2.getVisibility() == 0 ? db0.a.new_comment_half_sheet_height_difference_with_community_guideline_banner : db0.a.new_comment_half_sheet_height_difference);
        onCreateView.setOnClickListener(new View.OnClickListener(this) { // from class: rh1.n1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v1 f108259b;

            {
                this.f108259b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i162 = i14;
                v1 this$0 = this.f108259b;
                switch (i162) {
                    case 0:
                        int i17 = v1.S0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        m60.w f73 = this$0.f7();
                        NavigationImpl z03 = Navigation.z0(CommentsFeatureLocation.COMMENT_STICKERS, this$0.c8());
                        Navigation navigation32 = this$0.I;
                        String v03 = navigation32 != null ? navigation32.v0("com.pinterest.EXTRA_AGGREGATED_UID") : null;
                        if (v03 == null) {
                            v03 = "";
                        }
                        z03.m0("com.pinterest.EXTRA_AGGREGATED_UID", v03);
                        f73.d(z03);
                        this$0.s7().F(h32.g0.COMMENT_COMPOSER, h32.u0.STICKER_COMMENT_BUTTON);
                        return;
                    default:
                        int i18 = v1.S0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        View view2 = this$0.f108315r0;
                        if (view2 == null) {
                            Intrinsics.r("backgroundOverlay");
                            throw null;
                        }
                        bs1.c.X0(view2);
                        ca2.e b83 = this$0.b8();
                        if (this$0.f108312o0 != null) {
                            ca2.e.i(b83, "navigation", hf0.b.f69003c - this$0.b8().g(), null, 4);
                            return;
                        } else {
                            Intrinsics.r("deviceInfoProvider");
                            throw null;
                        }
                }
            }
        });
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f7().j(this.M0);
        super.onDestroy();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        b8().l();
        f7().d(new fd1.a());
        super.onDestroyView();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        ca2.e b83 = b8();
        ConstraintLayout constraintLayout = this.f108316s0;
        if (constraintLayout == null) {
            Intrinsics.r("newCommentLayout");
            throw null;
        }
        b83.m(constraintLayout);
        b83.n(bs1.c.X(this, db0.a.new_comment_half_sheet_icon_button_size) + bs1.c.X(this, db0.a.photo_comment_preview_height) + this.G0);
        b83.o(0);
        if (this.N0 != null) {
            this.F0 = true;
            Navigation navigation = this.I;
            String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_COMMENT_TEXT") : null;
            if (v03 == null && (v03 = d8().d("PREF_COMMENT_COMPOSER_DRAFT", null)) == null) {
                v03 = "";
            }
            h8(StringsKt.i0(v03).toString(), null);
            this.F0 = false;
            String str = this.P0;
            if (str != null) {
                if (this.Q0 == null) {
                    com.pinterest.feature.unifiedcomments.g.u4(this, false, new File(str), null, 4);
                } else {
                    com.pinterest.feature.unifiedcomments.g.u4(this, true, null, str, 2);
                }
            }
        }
    }
}
