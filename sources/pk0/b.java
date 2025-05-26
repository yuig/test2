package pk0;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Html;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import au0.f;
import bs1.c;
import com.pinterest.activity.newshub.view.content.NewsHubLibrofileView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h20;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.vx;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.PinterestEditText;
import com.pinterest.feature.board.detail.contenttab.view.BoardIdeasPreviewFooterView;
import com.pinterest.feature.dynamicgrid.view.viewholder.StoryBannerView;
import com.pinterest.feature.dynamicgrid.view.viewholder.StoryTextView;
import com.pinterest.feature.ideaPinCreation.metadata.view.MetadataEditText;
import com.pinterest.feature.ideaPinCreation.metadata.view.MetadataLegalDisclaimerView;
import com.pinterest.feature.newshub.detail.view.NewsHubDetailContentView;
import com.pinterest.feature.newshub.feed.view.NewsHubUnifiedInboxEmptyView;
import com.pinterest.feature.newshub.view.content.NewsHubColumnImageView;
import com.pinterest.feature.newshub.view.content.NewsHubLibrofileImageView;
import com.pinterest.feature.pin.edit.view.AttributeActionView;
import com.pinterest.feature.pin.edit.view.AttributeBasicsListView;
import com.pinterest.feature.pin.edit.view.AttributeCoverImagePreviewView;
import com.pinterest.feature.pin.edit.view.AttributeDividerView;
import com.pinterest.feature.pin.edit.view.AttributeInputTextView;
import com.pinterest.feature.pin.edit.view.AttributeInputTextViewLegacy;
import com.pinterest.feature.pin.edit.view.AttributeSectionHeaderView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.ui.imageview.GrayWebImageView;
import com.pinterest.ui.imageview.WebImageView;
import cv0.j;
import cv0.k;
import cv0.l;
import cv0.m;
import cv0.o;
import cv0.t;
import cv0.y;
import d70.g;
import dl1.s;
import ho0.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kh2.m0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.z;
import m60.u0;
import m60.w0;
import mv0.b0;
import pk.a0;
import qa2.x1;
import qv0.q;
import rq.l4;
import rq.t0;
import va1.j1;
import vq0.h;
import y11.d;
import y11.i;
import yk1.n;

/* loaded from: classes5.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100535a;

    public b(int i13) {
        this.f100535a = i13;
    }

    @Override // vq0.h
    public final void c(n view, Object obj, int i13) {
        String subtitle;
        String B0;
        String y03;
        int i14;
        int i15;
        Function0 function0;
        List J2;
        int i16 = 13;
        int i17 = 15;
        int i18 = 14;
        boolean z13 = true;
        boolean z14 = true;
        boolean z15 = true;
        subtitle = "";
        int i19 = 0;
        switch (this.f100535a) {
            case 0:
                BoardIdeasPreviewFooterView view2 = (BoardIdeasPreviewFooterView) view;
                vh story = (vh) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(story, "story");
                ArrayList imageUrls = new ArrayList();
                for (s sVar : story.f42865w) {
                    if ((sVar instanceof f30) && (B0 = c.B0((f30) sVar)) != null && B0.length() != 0) {
                        imageUrls.add(B0);
                    }
                }
                kj kjVar = story.f42855m;
                Intrinsics.f(kjVar);
                String title = kjVar.a();
                Intrinsics.checkNotNullExpressionValue(title, "getFormattedText(...)");
                view2.getClass();
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
                a0.p(view2.f45196a, title);
                List list = view2.f45197b;
                int size = list.size();
                for (int i23 = 0; i23 < size; i23++) {
                    if (i23 < 0 || i23 >= imageUrls.size()) {
                        ((WebImageView) list.get(i23)).setVisibility(8);
                    } else {
                        ((WebImageView) list.get(i23)).loadUrl((String) imageUrls.get(i23));
                        ((WebImageView) list.get(i23)).setVisibility(0);
                        ((WebImageView) list.get(i23)).setContentDescription(view2.getResources().getString(g.content_description_find_more_ideas_footer, title));
                    }
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter((String) obj, "model");
                return;
            case 2:
                return;
            case 3:
                e view3 = (e) view;
                go0.b model = (go0.b) obj;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                String text = model.f65825a;
                view3.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                view3.f69690a.i(new kl0.c(text, 10));
                return;
            case 4:
                kp0.c view4 = (kp0.c) view;
                f30 model2 = (f30) obj;
                Intrinsics.checkNotNullParameter(view4, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                view4.setPin(model2, i13);
                return;
            case 5:
                mp.n view5 = (mp.n) view;
                j1 item = (j1) obj;
                Intrinsics.checkNotNullParameter(view5, "view");
                Intrinsics.checkNotNullParameter(item, "model");
                view5.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                Integer num = item.f125194a;
                if (num != null) {
                    String string = view5.getResources().getString(num.intValue());
                    if (string != null) {
                        subtitle = string;
                        a0.p(view5.f87873a, subtitle);
                        return;
                    }
                }
                String str = item.f125195b;
                if (str != null) {
                    subtitle = str;
                }
                a0.p(view5.f87873a, subtitle);
                return;
            case 6:
                StoryBannerView view6 = (StoryBannerView) view;
                vh model3 = (vh) obj;
                Intrinsics.checkNotNullParameter(view6, "view");
                Intrinsics.checkNotNullParameter(model3, "model");
                List list2 = model3.f42865w;
                Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                Object U = CollectionsKt.U(0, list2);
                f30 f30Var = U instanceof f30 ? (f30) U : null;
                String str2 = (f30Var == null || (y03 = c.y0(f30Var)) == null) ? "" : y03;
                kj kjVar2 = model3.f42855m;
                String title2 = kjVar2 != null ? kjVar2.a() : null;
                if (title2 == null) {
                    title2 = "";
                }
                kj kjVar3 = model3.f42856n;
                String a13 = kjVar3 != null ? kjVar3.a() : null;
                subtitle = a13 != null ? a13 : "";
                view6.getClass();
                Intrinsics.checkNotNullParameter(title2, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                view6.f45672a.V1(str2, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : view6.f45675d, (r18 & 64) != 0 ? null : null, null);
                a0.p(view6.f45673b, title2);
                a0.p(view6.f45674c, subtitle);
                return;
            case 7:
                tr0.a view7 = (tr0.a) view;
                vh model4 = (vh) obj;
                Intrinsics.checkNotNullParameter(view7, "view");
                Intrinsics.checkNotNullParameter(model4, "model");
                String id3 = model4.getUid();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                view7.getClass();
                Intrinsics.checkNotNullParameter(id3, "id");
                view7.f119033e = id3;
                String type = model4.q();
                Intrinsics.checkNotNullExpressionValue(type, "getStoryType(...)");
                Intrinsics.checkNotNullParameter(type, "type");
                view7.f119034f = type;
                kj kjVar4 = model4.f42855m;
                String text2 = kjVar4 != null ? kjVar4.a() : null;
                if (text2 == null) {
                    text2 = "";
                }
                Intrinsics.checkNotNullParameter(text2, "text");
                a0.p(view7.f119032d, text2);
                ih ihVar = model4.f42857o;
                String text3 = ihVar != null ? ihVar.g() : null;
                if (text3 == null) {
                    text3 = "";
                }
                ih ihVar2 = model4.f42857o;
                String e13 = ihVar2 != null ? ihVar2.e() : null;
                subtitle = e13 != null ? e13 : "";
                Intrinsics.checkNotNullParameter(text3, "text");
                Intrinsics.checkNotNullParameter(subtitle, "deeplink");
                view7.f119031c.d(new kl0.c(text3, 21)).e(new np0.h(view7, 3));
                view7.f119036h = model4.u();
                return;
            case 8:
                vh vhVar = (vh) obj;
                cr.h hVar = (cr.h) ((x1) view);
                hVar.getClass();
                if (vhVar.f42864v) {
                    vhVar.f42864v = false;
                    hVar.setAlpha(0.1f);
                    hVar.animate().setDuration(hVar.getResources().getInteger(u0.anim_speed)).alpha(1.0f).start();
                }
                hVar.b(vhVar);
                return;
            case 9:
                StoryTextView view8 = (StoryTextView) view;
                vh model5 = (vh) obj;
                Intrinsics.checkNotNullParameter(view8, "view");
                Intrinsics.checkNotNullParameter(model5, "model");
                kj kjVar5 = model5.f42855m;
                String a14 = kjVar5 != null ? kjVar5.a() : null;
                subtitle = a14 != null ? a14 : "";
                view8.getClass();
                Intrinsics.checkNotNullParameter(subtitle, "text");
                a0.p(view8.f45676a, subtitle);
                return;
            case 10:
                AttributeInputTextView view9 = (AttributeInputTextView) view;
                cv0.a model6 = (cv0.a) obj;
                Intrinsics.checkNotNullParameter(view9, "view");
                Intrinsics.checkNotNullParameter(model6, "model");
                Integer valueOf = Integer.valueOf(zy1.b.alt_text_explanation);
                i14 = zy1.b.pin_editor_alt_text_hint;
                Integer valueOf2 = Integer.valueOf(zy1.b.alt_text_label);
                int i24 = zp1.a.pin_alt_text_max_length;
                Integer valueOf3 = Integer.valueOf(i24);
                String str3 = model6.f53258b;
                f fVar = new f(model6, i17);
                int i25 = AttributeInputTextView.f47195b;
                Context context = view9.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                i iVar = new i(valueOf3, valueOf, i14, valueOf2, null, str3, c.Z0(context, i24));
                GestaltTextField gestaltTextField = view9.f47196a;
                gestaltTextField.X(iVar);
                gestaltTextField.L(new t90.n(i17, fVar));
                return;
            case 11:
                AttributeCoverImagePreviewView view10 = (AttributeCoverImagePreviewView) view;
                j model7 = (j) obj;
                Intrinsics.checkNotNullParameter(view10, "view");
                Intrinsics.checkNotNullParameter(model7, "model");
                Integer num2 = model7.f53272b;
                view10.getClass();
                l4 l4Var = new l4(num2, 3);
                GestaltIconButton gestaltIconButton = view10.f47192d;
                gestaltIconButton.t(l4Var);
                String filePath = model7.f53274d;
                if (filePath != null) {
                    Intrinsics.checkNotNullParameter(filePath, "filePath");
                    int W = c.W(view10, dq1.a.idea_pin_cover_image_preview_container_size);
                    float f13 = model7.f53273c;
                    Integer[] numArr = f13 <= 1.0f ? new Integer[]{Integer.valueOf(ml2.c.c(f13 * W)), Integer.valueOf(W)} : new Integer[]{Integer.valueOf(W), Integer.valueOf(ml2.c.c(W / f13))};
                    int intValue = numArr[0].intValue();
                    int intValue2 = numArr[1].intValue();
                    View view11 = view10.f47190b;
                    ViewGroup.LayoutParams layoutParams = view11.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.width = intValue;
                    layoutParams.height = intValue2;
                    view11.setLayoutParams(layoutParams);
                    view10.f47189a.t2(new File(filePath));
                    view10.invalidate();
                }
                String text4 = model7.f53276f;
                Intrinsics.checkNotNullParameter(text4, "text");
                boolean z16 = !z.j(text4);
                FrameLayout frameLayout = view10.f47194f;
                GestaltText gestaltText = view10.f47193e;
                if (z16) {
                    gestaltText.i(new zu0.c(text4, 26));
                    frameLayout.setVisibility(0);
                    i15 = 8;
                } else {
                    gestaltText.i(y11.a.f136632t);
                    i15 = 8;
                    frameLayout.setVisibility(8);
                }
                if (model7.f53275e) {
                    au0.a tapHandler = new au0.a(model7, i15);
                    Intrinsics.checkNotNullParameter(tapHandler, "tapHandler");
                    t0 t0Var = new t0(20, tapHandler);
                    FrameLayout frameLayout2 = view10.f47191c;
                    frameLayout2.setOnClickListener(t0Var);
                    c.U1(frameLayout2);
                }
                Function0 listener = model7.f53278h;
                if (listener != null) {
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    gestaltIconButton.u(new defpackage.a(18, listener));
                    com.bumptech.glide.c.u1(gestaltIconButton);
                    return;
                }
                return;
            case 12:
                Intrinsics.checkNotNullParameter((AttributeDividerView) view, "view");
                Intrinsics.checkNotNullParameter((k) obj, "model");
                return;
            case 13:
                MetadataLegalDisclaimerView view12 = (MetadataLegalDisclaimerView) view;
                l model8 = (l) obj;
                Intrinsics.checkNotNullParameter(view12, "view");
                Intrinsics.checkNotNullParameter(model8, "model");
                String text5 = model8.f53279b;
                view12.getClass();
                Intrinsics.checkNotNullParameter(text5, "text");
                Object value = view12.f46545d.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                a0.p((GestaltText) value, text5);
                return;
            case 14:
                ev0.s view13 = (ev0.s) view;
                m model9 = (m) obj;
                Intrinsics.checkNotNullParameter(view13, "view");
                Intrinsics.checkNotNullParameter(model9, "model");
                String str4 = model9.f53280b;
                if (str4 == null) {
                    view13.getClass();
                } else {
                    view13.L().setText(str4);
                    view13.Z();
                }
                gv0.b action = new gv0.b(model9, 0);
                Intrinsics.checkNotNullParameter(action, "action");
                view13.f60279i = action;
                return;
            case 15:
                AttributeBasicsListView view14 = (AttributeBasicsListView) view;
                cv0.n model10 = (cv0.n) obj;
                Intrinsics.checkNotNullParameter(view14, "view");
                Intrinsics.checkNotNullParameter(model10, "model");
                TextWatcher textWatcher = view14.f47184q;
                MetadataEditText metadataEditText = view14.f47173f;
                if (textWatcher != null) {
                    metadataEditText.removeTextChangedListener(textWatcher);
                }
                view14.f47184q = null;
                view14.f47183p = null;
                view14.k(model10.f53282b, model10.f53283c);
                av0.h listener2 = model10.f53284d;
                Intrinsics.checkNotNullParameter(listener2, "listener");
                view14.f47183p = listener2;
                com.google.android.material.search.e eVar = new com.google.android.material.search.e(view14, 2);
                view14.f47184q = eVar;
                metadataEditText.addTextChangedListener(eVar);
                return;
            case 16:
                AttributeSectionHeaderView view15 = (AttributeSectionHeaderView) view;
                t model11 = (t) obj;
                Intrinsics.checkNotNullParameter(view15, "view");
                Intrinsics.checkNotNullParameter(model11, "model");
                a0.p(view15.f47204a, c.f2(view15, model11.f53292b));
                if (model11.f53293c) {
                    GestaltText gestaltText2 = view15.f47204a;
                    ViewGroup.LayoutParams layoutParams2 = gestaltText2.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.topMargin = c.Z(view15, eo1.c.space_200);
                    gestaltText2.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            case 17:
                AttributeActionView view16 = (AttributeActionView) view;
                y model12 = (y) obj;
                Intrinsics.checkNotNullParameter(view16, "view");
                Intrinsics.checkNotNullParameter(model12, "model");
                a0.p(view16.f47162d, "");
                GestaltText gestaltText3 = view16.f47164f;
                a0.p(gestaltText3, "");
                view16.f47169k = y11.b.f136637k;
                view16.f47166h.k(y11.a.f136623k);
                GestaltText gestaltText4 = view16.f47162d;
                a0.o(gestaltText4, model12.f53299b, new Object[0]);
                dv0.n nVar = new dv0.n(model12.f53304g, 19);
                GestaltSwitch gestaltSwitch = view16.f47168j;
                gestaltSwitch.i(nVar);
                boolean z17 = model12.f53305h;
                GestaltText gestaltText5 = view16.f47165g;
                if (z17) {
                    gestaltText4.i(y11.a.f136626n);
                    gestaltSwitch.i(y11.a.f136627o);
                    Integer num3 = model12.f53300c;
                    if (num3 == null || gestaltText3.i(new d(view16, num3, i19)) == null) {
                        a0.k0(gestaltText3);
                    }
                    a0.k0(gestaltText5);
                } else {
                    gestaltText4.i(y11.a.f136628p);
                    gestaltSwitch.i(y11.a.f136629q);
                    Integer num4 = model12.f53301d;
                    if (num4 == null || gestaltText3.i(new d(view16, num4, z14 ? 1 : 0)) == null) {
                        a0.k0(gestaltText3);
                    }
                    Integer num5 = model12.f53302e;
                    if (num5 == null || (function0 = model12.f53303f) == null) {
                        a0.k0(gestaltText5);
                    } else {
                        gestaltText5.i(new l4(num5, 2)).j(new defpackage.a(17, function0));
                    }
                }
                Function1 action2 = model12.f53306i;
                Intrinsics.checkNotNullParameter(action2, "action");
                gestaltSwitch.i(new dv0.n(z13, 20));
                view16.f47167i.g2(new dv0.n(z15 ? 1 : 0, 21));
                pe.i.i(gestaltSwitch, new t90.n(i18, action2));
                view16.L(model12.f53307j, false);
                vn1.g variant = model12.f53308k;
                Intrinsics.checkNotNullParameter(variant, "variant");
                gestaltText4.i(new mp.m(variant, 5));
                return;
            case 18:
                AttributeInputTextViewLegacy view17 = (AttributeInputTextViewLegacy) view;
                o model13 = (o) obj;
                Intrinsics.checkNotNullParameter(view17, "view");
                Intrinsics.checkNotNullParameter(model13, "model");
                TextWatcher textWatcher2 = view17.f47203f;
                PinterestEditText pinterestEditText = view17.f47198a;
                if (textWatcher2 != null) {
                    pinterestEditText.removeTextChangedListener(textWatcher2);
                }
                view17.f47203f = null;
                pinterestEditText.setOnFocusChangeListener(null);
                pinterestEditText.f44844p = null;
                pinterestEditText.setOnEditorActionListener(null);
                view17.f47202e.i(new l4(Integer.valueOf(zy1.b.pin_editor_title_header), 5));
                pinterestEditText.setHint(dq1.f.idea_pin_metadata_add_title_hint);
                String str5 = model13.f53285b;
                subtitle = str5 != null ? str5 : "";
                pinterestEditText.setText(subtitle, TextView.BufferType.EDITABLE);
                pinterestEditText.setTextAppearance(eo1.f.LegoText_Bold_Size200);
                pinterestEditText.setHintTextColor(c.B(view17, eo1.b.color_gray_500));
                int i26 = zp1.a.pin_max_title_length;
                int i27 = dq1.f.pin_edit_value_char_limit_reached;
                Context context2 = view17.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int Z0 = c.Z0(context2, i26);
                pinterestEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(Z0)});
                pinterestEditText.addTextChangedListener(new y11.k(view17, Z0, i27));
                f textListener = new f(model13, 16);
                Intrinsics.checkNotNullParameter(textListener, "textListener");
                y90.b bVar = new y90.b(1, textListener);
                pinterestEditText.addTextChangedListener(bVar);
                view17.f47203f = bVar;
                return;
            case 19:
                b0 view18 = (b0) view;
                Intrinsics.checkNotNullParameter(view18, "view");
                Intrinsics.checkNotNullParameter((kv0.z) obj, "model");
                String newTitle = view18.getResources().getString(aq1.h.idea_pins_product_creation_selected_pin_title);
                Intrinsics.checkNotNullExpressionValue(newTitle, "getString(...)");
                Intrinsics.checkNotNullParameter(newTitle, "newTitle");
                a0.p(view18.f88326a, newTitle);
                return;
            case 20:
                Intrinsics.checkNotNullParameter((qv0.n) view, "view");
                Intrinsics.checkNotNullParameter((vh) obj, "model");
                return;
            case 21:
                gu0.b view19 = (gu0.b) view;
                vx model14 = (vx) obj;
                Intrinsics.checkNotNullParameter(view19, "view");
                Intrinsics.checkNotNullParameter(model14, "model");
                vn1.b alignment = vn1.b.START;
                view19.getClass();
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                yb0.m mVar = new yb0.m(alignment, 6);
                GestaltText gestaltText6 = view19.f66125a;
                gestaltText6.i(mVar);
                view19.f66126b.i(new yb0.m(alignment, 7));
                String query = model14.f43014a;
                int i28 = aq1.h.idea_pin_sticker_search_no_results;
                Intrinsics.checkNotNullParameter(query, "query");
                Spanned fromHtml = Html.fromHtml(view19.getResources().getString(i28, query));
                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                a0.q(gestaltText6, c.p2(fromHtml));
                return;
            case 22:
                q view20 = (q) view;
                vh model15 = (vh) obj;
                Intrinsics.checkNotNullParameter(view20, "view");
                Intrinsics.checkNotNullParameter(model15, "model");
                kj kjVar6 = model15.f42855m;
                String b13 = kjVar6 != null ? kjVar6.b() : null;
                subtitle = b13 != null ? b13 : "";
                view20.getClass();
                Intrinsics.checkNotNullParameter(subtitle, "title");
                a0.p(view20.f105198a, subtitle);
                return;
            case 23:
                NewsHubDetailContentView view21 = (NewsHubDetailContentView) view;
                qx model16 = (qx) obj;
                Intrinsics.checkNotNullParameter(view21, "view");
                Intrinsics.checkNotNullParameter(model16, "model");
                view21.f46788a.b(model16);
                String q13 = model16.q();
                Map map = model16.f41417x;
                Pattern pattern = eq.b.f59905a;
                GestaltText gestaltText7 = view21.f46789b;
                gestaltText7.i(new eq.a(gestaltText7, q13, map, i19));
                String c13 = model16.c();
                Map map2 = model16.f41417x;
                GestaltText gestaltText8 = view21.f46790c;
                gestaltText8.i(new eq.a(gestaltText8, c13, map2, i19));
                return;
            case 24:
                cr.h view22 = (cr.h) view;
                vh model17 = (vh) obj;
                Intrinsics.checkNotNullParameter(view22, "view");
                Intrinsics.checkNotNullParameter(model17, "model");
                view22.b(model17);
                return;
            case 25:
                NewsHubLibrofileView view23 = (NewsHubLibrofileView) view;
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(view23, "view");
                Intrinsics.checkNotNullParameter(user, "model");
                view23.getClass();
                Intrinsics.checkNotNullParameter(user, "user");
                view23.f34960e = user;
                NewsHubLibrofileImageView newsHubLibrofileImageView = view23.f34957b;
                if (user == null) {
                    newsHubLibrofileImageView.getClass();
                } else {
                    m0.V0(newsHubLibrofileImageView.f46834b, user);
                    List Z02 = dl2.b.Z0(user);
                    NewsHubColumnImageView newsHubColumnImageView = newsHubLibrofileImageView.f46835c;
                    newsHubColumnImageView.getClass();
                    if (Z02 != null && !Z02.isEmpty()) {
                        ArrayList arrayList = newsHubColumnImageView.f46825d;
                        Iterator it = CollectionsKt.N0(arrayList, Z02).iterator();
                        while (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            ((GrayWebImageView) pair.f80346a).loadUrl((String) pair.f80347b);
                        }
                        int size2 = Z02.size();
                        int i29 = newsHubColumnImageView.f46826e;
                        if (size2 < i29) {
                            float f14 = newsHubColumnImageView.f46823b;
                            if (size2 == 1) {
                                ((GrayWebImageView) arrayList.get(size2 - 1)).g2(f14, f14, f14, f14);
                            } else {
                                ((GrayWebImageView) arrayList.get(size2 - 1)).g2(0.0f, f14, 0.0f, f14);
                            }
                            IntRange q14 = ql2.s.q(size2, i29);
                            ArrayList arrayList2 = new ArrayList(g0.q(q14, 10));
                            ql2.k it2 = q14.iterator();
                            while (it2.f104109c) {
                                c.R1((View) arrayList.get(it2.b()), false);
                                arrayList2.add(Unit.f80348a);
                            }
                        }
                    }
                }
                newsHubLibrofileImageView.f46835c.k();
                GestaltText gestaltText9 = view23.f34958c;
                fm1.c cVar = gestaltText9.l().f108855m;
                fm1.c cVar2 = fm1.c.VISIBLE;
                if (cVar == cVar2) {
                    gestaltText9.i(new ba.s(i16, view23, user));
                }
                GestaltText gestaltText10 = view23.f34959d;
                if (gestaltText10.l().f108855m == cVar2) {
                    Resources resources = view23.getResources();
                    wy0 wy0Var = view23.f34960e;
                    Intrinsics.f(wy0Var);
                    Integer b43 = wy0Var.b4();
                    Intrinsics.checkNotNullExpressionValue(b43, "getPinCount(...)");
                    int intValue3 = b43.intValue();
                    int i33 = w0.plural_pins_string;
                    Pattern pattern2 = eq.b.f59905a;
                    Spanned fromHtml2 = Html.fromHtml(resources.getQuantityString(i33, intValue3, qb0.j.b(intValue3)));
                    Intrinsics.checkNotNullExpressionValue(fromHtml2, "getFormattedHtmlQuantity(...)");
                    a0.q(gestaltText10, c.h2(fromHtml2));
                    return;
                }
                return;
            case 26:
                rx0.j view24 = (rx0.j) view;
                qx model18 = (qx) obj;
                Intrinsics.checkNotNullParameter(view24, "view");
                Intrinsics.checkNotNullParameter(model18, "model");
                String text6 = model18.q();
                Intrinsics.checkNotNullExpressionValue(text6, "getHeaderText(...)");
                view24.getClass();
                Intrinsics.checkNotNullParameter(text6, "text");
                a0.p(view24.f110197b, text6);
                return;
            case 27:
                Intrinsics.checkNotNullParameter((NewsHubUnifiedInboxEmptyView) view, "view");
                Intrinsics.checkNotNullParameter((qx) obj, "model");
                return;
            case 28:
                nz0.f view25 = (nz0.f) view;
                h20 insight = (h20) obj;
                Intrinsics.checkNotNullParameter(view25, "view");
                Intrinsics.checkNotNullParameter(insight, "model");
                view25.getClass();
                Intrinsics.checkNotNullParameter(insight, "insight");
                view25.f92726g.loadUrl(pe.i.z(insight));
                String L = insight.L();
                if (L == null) {
                    L = "";
                }
                a0.p(view25.f92727h, L);
                String M = insight.M();
                if (M == null) {
                    M = "";
                }
                a0.p(view25.f92728i, M);
                ArrayList arrayList3 = view25.f92732m;
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    ConstraintLayout constraintLayout = view25.f92725f;
                    Flow flow = view25.f92729j;
                    if (!hasNext) {
                        arrayList3.clear();
                        if (pe.i.I(insight) != f01.a.BRAND || (J2 = insight.J()) == null || J2.isEmpty()) {
                            c.X0(flow);
                        } else {
                            List<String> J3 = insight.J();
                            if (J3 != null) {
                                for (String str6 : J3) {
                                    Intrinsics.f(str6);
                                    Context context3 = view25.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    h01.h hVar2 = new h01.h(context3, str6, false, eo1.b.color_themed_text_default, eo1.b.color_gray_roboflow_200, 0, null, 100);
                                    constraintLayout.addView(hVar2);
                                    flow.e(hVar2);
                                    arrayList3.add(hVar2);
                                }
                            }
                            c.U1(flow);
                        }
                        String D = insight.D();
                        if (D == null) {
                            D = "";
                        }
                        a0.p(view25.f92730k, D);
                        String F = insight.F();
                        subtitle = F != null ? F : "";
                        int length = subtitle.length();
                        GestaltText gestaltText11 = view25.f92731l;
                        if (length == 0 || pe.i.I(insight) != f01.a.BRAND) {
                            a0.k0(gestaltText11);
                            return;
                        }
                        if (Uri.parse(subtitle).getScheme() == null) {
                            subtitle = "https://".concat(subtitle);
                        }
                        gestaltText11.i(new dx0.d(insight, 20)).j(new lq0.o(i18, view25, subtitle));
                        return;
                    }
                    View view26 = (View) it3.next();
                    flow.o(view26);
                    constraintLayout.removeView(view26);
                }
                break;
            default:
                c01.b view27 = (c01.b) view;
                pz0.a model19 = (pz0.a) obj;
                Intrinsics.checkNotNullParameter(view27, "view");
                Intrinsics.checkNotNullParameter(model19, "model");
                view27.getClass();
                Intrinsics.checkNotNullParameter(model19, "model");
                view27.f24413b.i(new zu0.c(subtitle, i17));
                view27.f24414c.i(new zu0.c(model19.f101739c, i18));
                view27.f24415d.i(new zu0.c(model19.f101740d, i16));
                ArrayList arrayList4 = view27.f24417f;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext2 = it4.hasNext();
                    Flow flow2 = view27.f24416e;
                    if (!hasNext2) {
                        arrayList4.clear();
                        List list3 = model19.f101741e;
                        boolean isEmpty = list3.isEmpty();
                        List list4 = model19.f101742f;
                        if (isEmpty && list4.isEmpty()) {
                            c.X0(flow2);
                            return;
                        }
                        Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            view27.L((String) it5.next(), true);
                        }
                        Iterator it6 = list4.iterator();
                        while (it6.hasNext()) {
                            view27.L((String) it6.next(), false);
                        }
                        c.U1(flow2);
                        return;
                    }
                    View view28 = (View) it4.next();
                    flow2.o(view28);
                    view27.removeView(view28);
                }
                break;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f100535a) {
            case 0:
                h((vh) obj);
                break;
            case 1:
                Intrinsics.checkNotNullParameter((String) obj, "model");
                break;
            case 2:
                break;
            case 3:
                go0.b model = (go0.b) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 4:
                Intrinsics.checkNotNullParameter((f30) obj, "model");
                break;
            case 5:
                j1 model2 = (j1) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                break;
            case 6:
                h((vh) obj);
                break;
            case 7:
                h((vh) obj);
                break;
            case 8:
                h((vh) obj);
                break;
            case 9:
                h((vh) obj);
                break;
            case 10:
                cv0.a model3 = (cv0.a) obj;
                Intrinsics.checkNotNullParameter(model3, "model");
                break;
            case 11:
                Intrinsics.checkNotNullParameter((j) obj, "model");
                break;
            case 12:
                Intrinsics.checkNotNullParameter((k) obj, "model");
                break;
            case 13:
                Intrinsics.checkNotNullParameter((l) obj, "model");
                break;
            case 14:
                Intrinsics.checkNotNullParameter((m) obj, "model");
                break;
            case 15:
                Intrinsics.checkNotNullParameter((cv0.n) obj, "model");
                break;
            case 16:
                Intrinsics.checkNotNullParameter((t) obj, "model");
                break;
            case 17:
                Intrinsics.checkNotNullParameter((y) obj, "model");
                break;
            case 18:
                o model4 = (o) obj;
                Intrinsics.checkNotNullParameter(model4, "model");
                break;
            case 19:
                Intrinsics.checkNotNullParameter((kv0.z) obj, "model");
                break;
            case 20:
                h((vh) obj);
                break;
            case 21:
                Intrinsics.checkNotNullParameter((vx) obj, "model");
                break;
            case 22:
                h((vh) obj);
                break;
            case 23:
                break;
            case 24:
                h((vh) obj);
                break;
            case 25:
                wy0 model5 = (wy0) obj;
                Intrinsics.checkNotNullParameter(model5, "model");
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                Intrinsics.checkNotNullParameter((h20) obj, "model");
                break;
            default:
                Intrinsics.checkNotNullParameter((pz0.a) obj, "model");
                break;
        }
        return null;
    }

    public final String h(vh model) {
        switch (this.f100535a) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                return null;
            case 6:
                Intrinsics.checkNotNullParameter(model, "model");
                return null;
            case 7:
                Intrinsics.checkNotNullParameter(model, "model");
                return null;
            case 9:
                Intrinsics.checkNotNullParameter(model, "model");
            case 8:
                return null;
            case 20:
                Intrinsics.checkNotNullParameter(model, "model");
                return null;
            case 22:
                Intrinsics.checkNotNullParameter(model, "model");
                return null;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                return null;
        }
    }

    public final String i(qx model) {
        switch (this.f100535a) {
            case 23:
                Intrinsics.checkNotNullParameter(model, "model");
                return model.q();
            case 26:
                Intrinsics.checkNotNullParameter(model, "model");
                return model.q();
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                return null;
        }
    }
}
