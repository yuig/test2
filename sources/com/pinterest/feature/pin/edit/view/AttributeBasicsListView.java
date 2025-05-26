package com.pinterest.feature.pin.edit.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bs1.c;
import ck2.i;
import com.pinterest.feature.ideaPinCreation.metadata.view.MetadataEditText;
import com.pinterest.gestalt.text.GestaltText;
import dq1.d;
import h32.d4;
import h32.i0;
import java.util.List;
import jk2.v;
import kg.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.a;
import nx.f0;
import nx.j0;
import nx.m;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import tp1.g;
import uk1.e;
import up0.l;
import x02.a2;
import x02.l2;
import xj2.b;
import xo.s;
import y11.f;
import yk1.n;
import zp0.h;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/pinterest/feature/pin/edit/view/AttributeBasicsListView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Lzp0/h;", "Ltp1/g;", "Lnx/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "y11/f", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AttributeBasicsListView extends s implements n, h, g, a {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f47170r = 0;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f47171d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f47172e;

    /* renamed from: f, reason: collision with root package name */
    public final MetadataEditText f47173f;

    /* renamed from: g, reason: collision with root package name */
    public final b f47174g;

    /* renamed from: h, reason: collision with root package name */
    public l f47175h;

    /* renamed from: i, reason: collision with root package name */
    public l2 f47176i;

    /* renamed from: j, reason: collision with root package name */
    public e f47177j;

    /* renamed from: k, reason: collision with root package name */
    public f0 f47178k;

    /* renamed from: l, reason: collision with root package name */
    public w f47179l;

    /* renamed from: m, reason: collision with root package name */
    public final j0 f47180m;

    /* renamed from: n, reason: collision with root package name */
    public final int f47181n;

    /* renamed from: o, reason: collision with root package name */
    public final String f47182o;

    /* renamed from: p, reason: collision with root package name */
    public f f47183p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.android.material.search.e f47184q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeBasicsListView(Context context) {
        super(context, 12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47174g = new b();
        this.f47180m = ((m) i()).a(this);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f47181n = c.Z0(context2, zp1.a.idea_pin_description_max_length);
        this.f47182o = c.f2(this, dq1.f.idea_pin_metadata_add_description_hint_hashtag);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), d.idea_pin_metadata_list_item_view, this);
        View findViewById = findViewById(dq1.c.error_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47171d = (GestaltText) findViewById;
        View findViewById2 = findViewById(dq1.c.error_tv_background);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47172e = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(dq1.c.description_edit_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47173f = (MetadataEditText) findViewById3;
        View findViewById4 = findViewById(dq1.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        l();
    }

    @Override // zp0.h
    public final void Y(SpannableStringBuilder updated) {
        Intrinsics.checkNotNullParameter(updated, "updated");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        p.s(updated, context, null, this.f47180m);
        this.f47173f.setText(updated);
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.STORY_PIN_METADATA, null, null, null, null, null);
    }

    public final f0 i() {
        f0 f0Var = this.f47178k;
        if (f0Var != null) {
            return f0Var;
        }
        Intrinsics.r("pinalyticsFactory");
        throw null;
    }

    public final l j() {
        l lVar = this.f47175h;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.r("typeaheadTextUtility");
        throw null;
    }

    public final void k(String str, List userMentionTags) {
        Intrinsics.checkNotNullParameter(userMentionTags, "userMentionTags");
        l j13 = j();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder c13 = l.c(j13, context, str, userMentionTags);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        p.s(c13, context2, null, this.f47180m);
        this.f47173f.setText(c13);
    }

    public final void l() {
        String str = this.f47182o;
        MetadataEditText metadataEditText = this.f47173f;
        metadataEditText.setHint(str);
        metadataEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.f47181n)});
        ve.h.f0(metadataEditText);
        c.U1(metadataEditText);
        a0.o(this.f47171d, dq1.f.description_max_character_limit_new, new Object[0]);
    }

    @Override // zp0.h
    public final void n6() {
        MetadataEditText metadataEditText = this.f47173f;
        Editable text = metadataEditText.getText();
        metadataEditText.setSelection(text != null ? text.length() : 0);
        Intrinsics.checkNotNullParameter(metadataEditText, "<this>");
        metadataEditText.requestFocus();
        c.V1(metadataEditText);
        if (metadataEditText.hasWindowFocus()) {
            return;
        }
        c.W1(metadataEditText);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        j();
        MetadataEditText metadataEditText = this.f47173f;
        v o13 = l.g(metadataEditText, null, null).o();
        i11.c cVar = new i11.c(24, new y11.g(this, 0));
        i11.c cVar2 = new i11.c(25, y11.a.f136630r);
        ck2.c cVar3 = i.f27923c;
        a2 a2Var = i.f27924d;
        xj2.c F = o13.F(cVar, cVar2, cVar3, a2Var);
        b bVar = this.f47174g;
        bVar.a(F);
        j();
        bVar.a(l.g(metadataEditText, "", "(#[\\p{L}_\\p{N}]+)|(^#$)|(\\s#$)|(\\s#[\\p{L}_\\p{N}]+)").o().F(new i11.c(26, new y11.g(this, 1)), new i11.c(27, y11.a.f136631s), cVar3, a2Var));
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f47174g.d();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeBasicsListView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47174g = new b();
        this.f47180m = ((m) i()).a(this);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f47181n = c.Z0(context2, zp1.a.idea_pin_description_max_length);
        this.f47182o = c.f2(this, dq1.f.idea_pin_metadata_add_description_hint_hashtag);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), d.idea_pin_metadata_list_item_view, this);
        View findViewById = findViewById(dq1.c.error_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47171d = (GestaltText) findViewById;
        View findViewById2 = findViewById(dq1.c.error_tv_background);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47172e = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(dq1.c.description_edit_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47173f = (MetadataEditText) findViewById3;
        View findViewById4 = findViewById(dq1.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeBasicsListView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47174g = new b();
        this.f47180m = ((m) i()).a(this);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f47181n = c.Z0(context2, zp1.a.idea_pin_description_max_length);
        this.f47182o = c.f2(this, dq1.f.idea_pin_metadata_add_description_hint_hashtag);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), d.idea_pin_metadata_list_item_view, this);
        View findViewById = findViewById(dq1.c.error_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47171d = (GestaltText) findViewById;
        View findViewById2 = findViewById(dq1.c.error_tv_background);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47172e = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(dq1.c.description_edit_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47173f = (MetadataEditText) findViewById3;
        View findViewById4 = findViewById(dq1.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        l();
    }
}
